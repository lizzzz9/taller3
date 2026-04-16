package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class NotificadorSelector {

    @Inject
    private NotificadorMail mail;

    @Inject
    private NotificadorSMS sms;
    @Inject
    private NotificadorWhatsapp ws;

    public Notificador seleccionar(double total) {
        if (total > 100) {
            // Mail
            return mail;
        } 
        if (total <= 50) {
            // whatsapp
            return ws;
        } else {

            // SMS
            return sms;
        }

    }
}
