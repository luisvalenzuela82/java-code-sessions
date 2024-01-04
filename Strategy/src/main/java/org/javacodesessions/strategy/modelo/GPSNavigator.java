/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.strategy.modelo;

/**
 *
 * @author Luis Valenzuela
 */
public class GPSNavigator {

    private RouteStrategy routeStrategy;

    public GPSNavigator(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void buildRoute(String pointA, String pointB) {
        routeStrategy.buildRoute(pointA, pointB);
    }
}
