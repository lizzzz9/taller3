package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

//import jakarta.inject.Inject;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String... args) {

        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        // modelos IoC
        // 1. DI (inyeccion de dependencias )
        /*
         * @Inject
         * private PedidoService pedidoService;
         */
        // 2.Service Locator(lookup)
        // private PedidoService pedidoService =
        // CDI.current().select(PedidoService.class).get();

        @Inject
        private PedidoService pedidoService;

        @Inject
        private  PagoTarjetaCredito pagoTc;

        @Inject
        private PagoEfectivo pagoE;


    

        @Override
        public int run(String... args) {
        
            // caso 1
            Pedido pedido = new Pedido("Ximena  Pulupa", "coca cola", 1200.0, "xlpulupa@example.com");
            this.pedidoService.registrar(pedido,pagoE);

            // caso 2
            Pedido pedido2 = new Pedido("Ximena  Pulupa", "coca cola", 80.0, null);
            this.pedidoService.registrar(pedido2,pagoTc);
        return 0;
    
        }
    }

}
