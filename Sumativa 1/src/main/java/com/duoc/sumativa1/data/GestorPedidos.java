package com.duoc.sumativa1.data;

import com.duoc.sumativa1.model.Pedido;
import com.duoc.sumativa1.model.Rastreable;

import java.util.ArrayList;
import java.util.List;

public class GestorPedidos implements Rastreable {
    private List<Pedido> historial;

    public GestorPedidos() {
        this.historial = new ArrayList<>();
    }

    public void agregarAlHistorial(Pedido pedido) {
        if (pedido.isDespachado() && !pedido.isCancelado()) {
            this.historial.add(pedido);
        }
    }

    @Override
    public void verHistorial() {
        System.out.println("Historial:");
        for (Pedido p : historial) {
            System.out.println("- " + p.getClass().getSimpleName() + " #" + p.getId() + " - entregado por " + p.getRepartidor());
        }
    }
}