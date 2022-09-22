import java.util.Date;

public class EjemploOrdenes {

    public static void main(String[] args) {

        OrdenCompra orden1 = new OrdenCompra("Orden de compra artículos gamer");
        orden1.setFecha(new Date());
        orden1.setCliente(new Cliente("Franco", "Romeo"));
        orden1.addProducto(new Producto("HyperX", "Silla Gamer", 49000));
        orden1.addProducto(new Producto("Sony", "Auriculares", 12000));
        orden1.addProducto(new Producto("Nova", "Teclado Mecánico", 5000));
        orden1.addProducto(new Producto("Genius", "Mouse Gamer", 3000));

        OrdenCompra orden2 = new OrdenCompra("Orden de compra artículos de cocina");
        orden2.setFecha(new Date());
        orden2.setCliente(new Cliente("Cristian", "Cardozo"));
        orden2.addProducto(new Producto("El Nogal", "Servilletero", 600));
        orden2.addProducto(new Producto("Sanyo", "Balanza de Cocina", 2500));
        orden2.addProducto(new Producto("Ultracomb", "Horno Eléctrico", 25000));
        orden2.addProducto(new Producto("Ferrum", "Asadera", 7800));

        OrdenCompra orden3 = new OrdenCompra("Orden de compra artículos accesorios automovil");
        orden3.setFecha(new Date());
        orden3.setCliente(new Cliente("Santiago", "Altamirano"));
        orden3.addProducto(new Producto("Goodyear", "Neumático", 65000));
        orden3.addProducto(new Producto("Bosch", "Lámpara", 1717));
        orden3.addProducto(new Producto("Total Tools", "Compresor de Aire", 65000));
        orden3.addProducto(new Producto("Konnwei", "Scanner Automotriz", 19049));

        OrdenCompra[] totalOrdenes = {orden1, orden2, orden3};

        for(OrdenCompra o: totalOrdenes){
            System.out.println("ID: " + o.getIdentificador());
            System.out.println("Cliente: " + o.getCliente());
            System.out.println("Descripción: " + o.getDescripcion());
            System.out.println("Fecha: " + o.getFecha());
            System.out.println("Total: " + o.granTotal());

            int i = 1;
            for (Producto p: o.getProducto()){
                System.out.println(i + " - " + p.getNombre() + " " + p.getFabricante() + " " + p.getPrecio());
                i++;
            }
        }

    }

}