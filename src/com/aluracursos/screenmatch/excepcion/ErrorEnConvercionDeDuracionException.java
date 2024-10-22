package com.aluracursos.screenmatch.excepcion;

public class ErrorEnConvercionDeDuracionException extends RuntimeException {
    private String mensaje;


    public ErrorEnConvercionDeDuracionException(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return  this.mensaje;
    }
}
