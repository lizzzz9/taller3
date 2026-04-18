package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ComprobanteSelector {
    @Inject
    private ComprobantePDF pdf;

    @Inject
    private ComprobanteFisico cf;

    public TipoComprobante seleccionarTipo(String destino){
        if (destino ==null){
            return cf;
        }else{
            return pdf; 
        }
        
    }
 
}
