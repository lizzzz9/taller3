package uce.edu.pa2.api.bodega;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped

public class PagoEfectivo implements PagoEstrategia {

    @Override
    public void realizar(double valor) {
        System.err.println("Presenta una pantalla ");
        System.out.println("Realizando cobro");
    }

}
