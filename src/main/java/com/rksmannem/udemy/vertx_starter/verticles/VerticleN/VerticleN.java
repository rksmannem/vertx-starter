package com.rksmannem.udemy.vertx_starter.verticles.VerticleN;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VerticleN extends AbstractVerticle {
  private static final Logger logger = LogManager.getLogger(VerticleN.class);

  @Override
  public void start(Promise<Void> startPromise) {
    logger.info("start {} {} {} {} {} ",
      getClass().getName(), "on thread", Thread.currentThread().getName(), "with config", config().toString());
    startPromise.complete();
  }
}
