package com.rksmannem.udemy.vertx_starter.verticles.VerticleA;

import com.rksmannem.udemy.vertx_starter.verticles.VerticleAA.VerticleAA;
import com.rksmannem.udemy.vertx_starter.verticles.VerticleAB.VerticleAB;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VerticleA extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) {
    System.out.println("start " + getClass().getName());
    vertx.deployVerticle(new VerticleAA());
    vertx.deployVerticle(new VerticleAB());
    startPromise.complete();
  }
}
