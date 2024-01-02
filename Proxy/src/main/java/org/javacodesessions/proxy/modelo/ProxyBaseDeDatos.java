/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.proxy.modelo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Luis Valenzuela
 */
// Proxy que implementa registro y caché
public class ProxyBaseDeDatos implements BaseDeDatos {
    private BaseDeDatosReal baseDeDatosReal;
    private Map<String, String> cache;

    public ProxyBaseDeDatos() {
        this.baseDeDatosReal = new BaseDeDatosReal();
        this.cache = new HashMap<>();
    }

    @Override
    public String consultar(String consulta) {
        if (cache.containsKey(consulta)) {
            registrar("Consulta en caché: " + consulta);
            return cache.get(consulta);
        }

        registrar("Consulta realizada: " + consulta);
        String resultado = baseDeDatosReal.consultar(consulta);
        cache.put(consulta, resultado);
        return resultado;
    }

    private void registrar(String mensaje) {
        System.out.println("Registro del Proxy: " + mensaje);
    }
}
