/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.observer.modelo.flow;

import java.util.concurrent.Flow;

/**
 *
 * @author Luis Valenzuela
 */
public class Fanatico implements Flow.Subscriber<String> {

    private String nombre;
    private Flow.Subscription subscription;

    public Fanatico(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1); // Solicita el primer elemento
    }

    @Override
    public void onNext(String item) {
        System.out.println(nombre + " recibió el evento: " + item);
        subscription.request(1); // Solicita el siguiente elemento
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println(nombre + " ha finalizado la recepción de eventos.");
    }
}
