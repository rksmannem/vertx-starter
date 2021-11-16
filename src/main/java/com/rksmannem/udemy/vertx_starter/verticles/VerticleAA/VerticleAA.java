package com.rksmannem.udemy.vertx_starter.verticles.VerticleAA;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VerticleAA extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) {
    System.out.println("start " + getClass().getName());
    startPromise.complete();
  }
}
