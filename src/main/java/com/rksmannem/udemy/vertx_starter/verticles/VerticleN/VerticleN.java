package com.rksmannem.udemy.vertx_starter.verticles.VerticleN;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VerticleN extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) {
    System.out.println("start " + getClass().getName() + " on thread " +
      Thread.currentThread().getName() + " with config " + config().toString());
    startPromise.complete();
  }
}
