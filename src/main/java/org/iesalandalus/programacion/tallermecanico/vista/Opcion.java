package org.iesalandalus.programacion.tallermecanico.vista;
import org.iesalandalus.programacion.tallermecanico.modelo.TallerMecanicoExcepcion;
import java.util.HashMap;
import java.util.Map;

public enum Opcion {
    INSERTAR_CLIENTE(1, "insertar cliente"),
    BUSCAR_CLIENTE(2,"buscar cliente"),
    BORRAR_CLIENTE(3, "borrar cliente"),
    LISTAR_CLIENTES(4, "listar clientes"),
    MODIFICAR_CLIENTE(5, "mostrar cliente"),
    INSERTAR_VEHICULO(6, "insertar vehículo"),
    BUSCAR_VEHICULO(7, "buscar vehículo"),
    BORRAR_VEHICULO(8, "borrar vehículo"),
    LISTAR_VEHICULOS(9,"listar vehículos"),
    INSERTAR_REVISION(10, "insertar revisión"),
    BUSCAR_REVISION(11, "buscar revisión"),
    BORRAR_REVISION(12, "borrar revisión"),
    LISTAR_REVISIONES(13, "listar revisiones"),
    LISTAR_REVISIONES_CLIENTE(14, "listar revisiones clientes"),
    LISTAR_REVISIONES_VEHICULO(15, "listar revisiones vehículos"),
    ANADIR_HORAS_REVISION(16, "añadir horas revisión"),
    ANADIR_PRECIO_MATERIAL_REVISION(17, "añadir precio material revisión"),
    CERRAR_REVISION(18, "cerrar revisión"),
    SALIR(19, "salir");

    private final int numeroOpcion;
    private final String mensaje;

    private static final Map<Integer, Opcion> opciones = new HashMap<>();

    static {
        for (Opcion opcion : values()) {
            opciones.put(opcion.numeroOpcion, opcion);
        }
    }

    Opcion(int numeroOpcion, String mensaje) {
        this.numeroOpcion = numeroOpcion;
        this.mensaje = mensaje;
    }

    public static boolean esValida(int numeroOpcion) {
        return opciones.containsKey(numeroOpcion);
    }

    public static Opcion get(int numeroOpcion) throws TallerMecanicoExcepcion {
        if (!esValida(numeroOpcion)) {
            throw new TallerMecanicoExcepcion("Opción no válida.");
        }
        return opciones.get(numeroOpcion);
    }

    @Override
    public String toString() {
        return String.format("%d.- %s", numeroOpcion, mensaje);
    }

}
