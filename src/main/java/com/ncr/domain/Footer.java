/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ncr.domain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 *
 * @author natal
 */

@Named
@RequestScoped
public class Footer {
    private String iconEnvio;
    private String iconDevolucion;
    private String iconContacto;
    private String iconFacebook;
    private String iconInstagram;
    private String envio;
    private String devolucion;
    private String contacto;
    private String copy;
    private String nosotros;
    private String condiciones;

    public Footer() {
        this.iconEnvio = "Envio.png";
        this.iconDevolucion = "Devolucion.png";
        this.iconContacto = "Contacto.png";
        this.iconFacebook = "Facebook.png";
        this.iconInstagram = "Instagram.png";
        this.envio = "Envios estándar gratuitos";
        this.devolucion = "Devoluciones";
        this.contacto = "¿Necesitas ayuda?";
        this.copy = " 2024 Frijol S.A de C.V";
        this.nosotros = "Acerca de nosotros";
        this.condiciones = "Condiciones legales";
    }

    public String getIconEnvio() {
        return iconEnvio;
    }

    public void setIconEnvio(String iconEnvio) {
        this.iconEnvio = iconEnvio;
    }

    public String getIconDevolucion() {
        return iconDevolucion;
    }

    public void setIconDevolucion(String iconDevolucion) {
        this.iconDevolucion = iconDevolucion;
    }

    public String getIconContacto() {
        return iconContacto;
    }

    public void setIconContacto(String iconContacto) {
        this.iconContacto = iconContacto;
    }

    public String getIconFacebook() {
        return iconFacebook;
    }

    public void setIconFacebook(String iconFacebook) {
        this.iconFacebook = iconFacebook;
    }

    public String getIconInstagram() {
        return iconInstagram;
    }

    public void setIconInstagram(String iconInstagram) {
        this.iconInstagram = iconInstagram;
    }

    public String getEnvio() {
        return envio;
    }

    public void setEnvio(String envio) {
        this.envio = envio;
    }

    public String getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(String devolucion) {
        this.devolucion = devolucion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getCopy() {
        return copy;
    }

    public void setCopy(String copy) {
        this.copy = copy;
    }

    public String getNosotros() {
        return nosotros;
    }

    public void setNosotros(String nosotros) {
        this.nosotros = nosotros;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }
    
    
}
