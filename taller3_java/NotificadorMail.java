package com.edu.uce.negocio;

public class NotificadorMail {

    public NotificadorMail() throws Exception{
        throw new Exception();

    }
    public void enviar (String correo,String mensaje ){
        System.out.println("Se envia el email al correo: "+correo);
        System.out.println("Con el mensaje: "+mensaje);
    }

}
