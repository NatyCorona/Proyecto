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
public class pulseras {
    private String pulsera1;
    private String imagenPulsera1;
    private String descPulsera1;
    private String precioPulsera1;
    
    private String pulsera2;
    private String imagenPulsera2;
    private String descPulsera2;
    private String precioPulsera2;
    
    private String pulsera3;
    private String imagenPulsera3;
    private String descPulsera3;
    private String precioPulsera3;

    public pulseras() {
        this.pulsera1 = "Pulsera de Mujer Chomac";
        this.imagenPulsera1 = "pulsera1.jpeg";
        this.descPulsera1 = "14k Oro Blanco & Topacio Azul";
        this.precioPulsera1 = "MXN 6,577.00"; 
        
        this.pulsera2 = "Pulsera de Mujer Moscovi";
        this.imagenPulsera2 = "pulsera2.png";
        this.descPulsera2 = "14k Oro Blanco & Moissanita";
        this.precioPulsera2 = "MXN 13,336.00"; 
        
        this.pulsera3 = "Pulsera de Mujer Fionnuala 4.5 mm";
        this.imagenPulsera3 = "pulsera3.png";
        this.descPulsera3 = "14k Oro Amarrillo & Rubí";
        this.precioPulsera3 = "MXN 15,080.00"; 
    }

    public String getPulsera1() {
        return pulsera1;
    }

    public void setPulsera1(String pulsera1) {
        this.pulsera1 = pulsera1;
    }

    public String getImagenPulsera1() {
        return imagenPulsera1;
    }

    public void setImagenPulsera1(String imagenPulsera1) {
        this.imagenPulsera1 = imagenPulsera1;
    }

    public String getDescPulsera1() {
        return descPulsera1;
    }

    public void setDescPulsera1(String descPulsera1) {
        this.descPulsera1 = descPulsera1;
    }

    public String getPrecioPulsera1() {
        return precioPulsera1;
    }

    public void setPrecioPulsera1(String precioPulsera1) {
        this.precioPulsera1 = precioPulsera1;
    }

    public String getPulsera2() {
        return pulsera2;
    }

    public void setPulsera2(String pulsera2) {
        this.pulsera2 = pulsera2;
    }

    public String getImagenPulsera2() {
        return imagenPulsera2;
    }

    public void setImagenPulsera2(String imagenPulsera2) {
        this.imagenPulsera2 = imagenPulsera2;
    }

    public String getDescPulsera2() {
        return descPulsera2;
    }

    public void setDescPulsera2(String descPulsera2) {
        this.descPulsera2 = descPulsera2;
    }

    public String getPrecioPulsera2() {
        return precioPulsera2;
    }

    public void setPrecioPulsera2(String precioPulsera2) {
        this.precioPulsera2 = precioPulsera2;
    }

    public String getPulsera3() {
        return pulsera3;
    }

    public void setPulsera3(String pulsera3) {
        this.pulsera3 = pulsera3;
    }

    public String getImagenPulsera3() {
        return imagenPulsera3;
    }

    public void setImagenPulsera3(String imagenPulsera3) {
        this.imagenPulsera3 = imagenPulsera3;
    }

    public String getDescPulsera3() {
        return descPulsera3;
    }

    public void setDescPulsera3(String descPulsera3) {
        this.descPulsera3 = descPulsera3;
    }

    public String getPrecioPulsera3() {
        return precioPulsera3;
    }

    public void setPrecioPulsera3(String precioPulsera3) {
        this.precioPulsera3 = precioPulsera3;
    }
    
    
}
