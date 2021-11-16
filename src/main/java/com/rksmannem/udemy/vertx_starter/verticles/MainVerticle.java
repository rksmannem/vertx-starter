package com.rksmannem.udemy.vertx_starter.verticles;

import com.rksmannem.udemy.vertx_starter.verticles.VerticleA.VerticleA;
import com.rksmannem.udemy.vertx_starter.verticles.VerticleB.VerticleB;
import com.rksmannem.udemy.vertx_starter.verticles.VerticleN.VerticleN;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.UUID;

public class MainVerticle extends AbstractVerticle {

  private static final Logger logger = LogManager.getLogger(MainVerticle.class);

  public static void main(String[] args) {
    final Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(new MainVerticle());
  }

  @Override
  public void start(Promise<Void> startPromise) {
    logger.info("start {}", getClass().getName());
    vertx.deployVerticle(new VerticleA());
    vertx.deployVerticle(new VerticleB());
    vertx.deployVerticle(VerticleN.class.getName(),
      new DeploymentOptions().setInstances(4).
        setConfig(new JsonObject().
          put("id", UUID.randomUUID().toString()).
          put("name", VerticleN.class.getSimpleName())
        )
    );
    startPromise.complete();
  }
}
