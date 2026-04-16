package uce.edu.pa2.api.bodega;
 
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String... args) {

        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private PedidoService pedidoService;

        @Override
        public int run(String... args) {
            // caso 1
            Pedido pedido = new Pedido("Ximena  Pulupa", "coca cola", 1200.0, "xlpulupa@example.com");
            pedidoService.registrar(pedido);

            // caso 2
            Pedido pedido2 = new Pedido("Ximena  Pulupa", "coca cola", 80.0, "xlpulupa@example.com");
            pedidoService.registrar(pedido2);

         
        }
    }

}
