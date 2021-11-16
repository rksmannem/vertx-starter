package com.rksmannem.udemy.vertx_starter.verticles.VerticleA;

import com.rksmannem.udemy.vertx_starter.verticles.VerticleAA.VerticleAA;
import com.rksmannem.udemy.vertx_starter.verticles.VerticleAB.VerticleAB;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VerticleA extends AbstractVerticle {

  private static final Logger logger = LogManager.getLogger(VerticleA.class);

  @Override
  public void start(Promise<Void> startPromise) {
    logger.info("start {}", getClass().getName());
    vertx.deployVerticle(new VerticleAA());
    vertx.deployVerticle(new VerticleAB());
    startPromise.complete();
  }
}
