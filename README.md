# SpeedFast – Sistema de Gestión de Pedidos

Proyecto de la **Semana 3** del curso *Desarrollo Orientado a Objetos II* (Duoc UC).
Diseño e implementación de un sistema de reparto para la empresa **SpeedFast**, aplicando en conjunto **abstracción, polimorfismo e interfaces**.

## 📋 Descripción

El sistema gestiona tres tipos de pedidos (Comida, Encomienda y Express), cada uno con su propia lógica de asignación de repartidor y cálculo del tiempo de entrega. Además, desacopla las operaciones funcionales (despachar, cancelar, ver historial) mediante interfaces.

## 🏗️ Estructura del sistema

### Abstracción
- **`Pedido`** (clase abstracta): atributos comunes + `mostrarResumen()` implementado + `calcularTiempoEntrega()` abstracto.

### Polimorfismo
- Subclases de `Pedido`: **`PedidoComida`**, **`PedidoEncomienda`**, **`PedidoExpress`**, cada una con su propia lógica de `calcularTiempoEntrega()`.
- Método **sobrescrito** `asignarRepartidor()` en cada subclase.
- Método **sobrecargado** `asignarRepartidor(String nombre)` para asignación manual.

### Interfaces
- **`Despachable`** → `despachar()`
- **`Cancelable`** → `cancelar()`
- **`Rastreable`** → `verHistorial()`

Implementadas en las clases de pedido y en `GestorPedidos`, que centraliza la lógica de despacho, cancelación e historial.

## ⚙️ Funcionalidades demostradas en `Main`

- Asignación de repartidores (automática y manual)
- Cálculo y visualización del tiempo estimado de entrega
- Despacho de un pedido
- Cancelación de un pedido
- Visualización del historial de entregas (`ArrayList`)

## 💻 Ejemplo de salida por consola

```
[Pedido Encomienda]
Pedido #102
Dirección: Av. Santa Rosa 567
Distancia: 7 km
Repartidor asignado: Daniela Tapia
Tiempo estimado: 30 minutos
Pedido despachado correctamente.

Cancelando Pedido Express #103...
→ Pedido cancelado exitosamente.

Historial:
- PedidoComida #101 – entregado por Luis Díaz
- PedidoEncomienda #102 – entregado por Daniela Tapia
```

## ▶️ Cómo ejecutar

1. Clonar el repositorio:
   ```
   git clone https://github.com/pablo-psr/Semana-3.git
   ```
2. Abrir el proyecto en IntelliJ IDEA (como proyecto Maven).
3. Ejecutar la clase `Main` (`src/main/java/com/duoc/sumativa1/ui/Main.java`).

## 📁 Estructura del repositorio

```
Semana-3/
├── .idea/
├── .mvn/
├── src/
│   └── main/
│       └── java/
│           └── com/duoc/sumativa1/
│               ├── data/
│               │   └── GestorPedidos.java
│               ├── model/
│               │   ├── Cancelable.java
│               │   ├── Despachable.java
│               │   ├── Pedido.java
│               │   ├── PedidoComida.java
│               │   ├── PedidoEncomienda.java
│               │   ├── PedidoExpress.java
│               │   └── Rastreable.java
│               └── ui/
│                   └── Main.java
└── README.md
```

## 👤 Autor

Pablo Sepulveda – Desarrollo Orientado a Objetos II
