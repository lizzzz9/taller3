package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;
 
@ApplicationScoped
@Default
public class NotificadorMail implements Notificador {

    public void enviar(String destino, String mensaje) {

        System.out.println("se envia el mail al correo: " + destino);
        System.out.println("con el mensaje: " + mensaje);
    }

}
