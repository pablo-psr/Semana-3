package com.duoc.sumativa1.ui;

import com.duoc.sumativa1.data.GestorPedidos;
import com.duoc.sumativa1.model.*;

public class Main {

    public static void main(String[] args) {
        // Instancia del gestor de datos/historial
        GestorPedidos gestor = new GestorPedidos();

        // Instanciación de Pedidos
        PedidoComida p101 = new PedidoComida(101, "Av. Providencia 1234", 3.5, 15);
        PedidoEncomienda p102 = new PedidoEncomienda(102, "Av. Santa Rosa 567", 7.0, 1.0);
        PedidoExpress p103 = new PedidoExpress(103, "Calle Las Condes 890", 5.0);

        // Asignación de repartidores (Manual y Automática)
        p101.asignarRepartidor("Luis Díaz");
        p102.asignarRepartidor("Daniela Tapia");
        p103.asignarRepartidor();

        // 1. Mostrar Pedido Encomienda y Despachar
        System.out.println("[Pedido Encomienda]");
        p102.mostrarResumen();
        p102.despachar();
        gestor.agregarAlHistorial(p102);

        System.out.println();

        // 2. Cancelar Pedido Express
        p103.cancelar();

        System.out.println();

        // 3. Despachar Pedido Comida
        p101.despachar();
        gestor.agregarAlHistorial(p101);

        System.out.println();

        // 4. Mostrar Historial mediante la interfaz Rastreable del gestor
        gestor.verHistorial();
    }
}