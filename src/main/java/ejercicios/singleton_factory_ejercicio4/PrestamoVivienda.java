package ejercicios.singleton_factory_ejercicio4;

public class PrestamoVivienda extends Prestamo {
    @Override
    public void operation(Cajero cajero,int canrtidad) {
        CuentaPrincipal.getUniqueInstance(10000).getPrestamo(canrtidad);
    }
}
