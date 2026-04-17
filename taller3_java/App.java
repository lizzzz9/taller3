package com.edu.uce.negocio;
import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {

        Pedido pedido = new Pedido("Ximena Pulupa","Coca Cola",1200,"xlpulupa@example.com");
        PedidoService service = new PedidoService();
        service.registrar(pedido);
    }
}
