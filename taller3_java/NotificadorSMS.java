package com.edu.uce.negocio;

public class NotificadorSMS {

    public NotificadorSMS() throws Exception{
        throw new Exception();

    }
    public void enviar (String numero,String mensaje ){
        System.out.println("Se envia sms al numero: "+numero);
        System.out.println("Con el mensaje: "+mensaje);
    }

}
