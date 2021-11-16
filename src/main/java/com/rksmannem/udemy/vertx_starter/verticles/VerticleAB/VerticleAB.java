package com.rksmannem.udemy.vertx_starter.verticles.VerticleAB;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VerticleAB extends AbstractVerticle {
  private static final Logger logger = LogManager.getLogger(VerticleAB.class);

  @Override
  public void start(Promise<Void> startPromise) {
    logger.info("start {}", getClass().getName());
    startPromise.complete();
  }
}
