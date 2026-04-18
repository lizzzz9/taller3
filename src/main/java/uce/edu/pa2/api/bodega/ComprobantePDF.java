package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComprobantePDF  implements TipoComprobante{

    @Override
    public void imprimir(String destino) {
       System.out.println("Se imprime comprobante en pdf");
    }


}
