package com.rksmannem.udemy.vertx_starter.verticles.VerticleB;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VerticleB extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) {
    System.out.println("start " + getClass().getName());
    startPromise.complete();
  }
}
