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
public class anillos {
    private String anillo1;
    private String imagenAnillo1;
    private String DescAnillo1;
    private String precioAnillo1;
    private String anillo2;
    private String imagenAnillo2;
    private String DescAnillo2;
    private String precioAnillo2;
    private String anillo3;
    private String imagenAnillo3;
    private String DescAnillo3;
    private String precioAnillo3;

    public anillos() {
        this.anillo1 = "Anillo Tegea";
        this.imagenAnillo1 = "Anillo1.jpeg";
        this.DescAnillo1 = "14k Oro Amarillo & Diamante";
        this.precioAnillo1 = "MXN 26,005.00";
        
        this.anillo2 = "Anillo Sremska";
        this.imagenAnillo2 = "Anillo2.jpeg";
        this.DescAnillo2 = "14k Oro Blanco & Diamante";
        this.precioAnillo2 = "MXN 23,325.00";
        
        this.anillo3 = "Anillo de compromiso Gobabis";
        this.imagenAnillo3 = "Anillo3.png";
        this.DescAnillo3 = "14k Oro Amarillo & Tsavorita";
        this.precioAnillo3 = "MXN 9,812.00";
    }

    public String getAnillo1() {
        return anillo1;
    }

    public void setAnillo1(String anillo1) {
        this.anillo1 = anillo1;
    }

    public String getImagenAnillo1() {
        return imagenAnillo1;
    }

    public void setImagenAnillo1(String imagenAnillo1) {
        this.imagenAnillo1 = imagenAnillo1;
    }

    public String getDescAnillo1() {
        return DescAnillo1;
    }

    public void setDescAnillo1(String DescAnillo1) {
        this.DescAnillo1 = DescAnillo1;
    }

    public String getPrecioAnillo1() {
        return precioAnillo1;
    }

    public void setPrecioAnillo1(String precioAnillo1) {
        this.precioAnillo1 = precioAnillo1;
    }

    public String getAnillo2() {
        return anillo2;
    }

    public void setAnillo2(String anillo2) {
        this.anillo2 = anillo2;
    }

    public String getImagenAnillo2() {
        return imagenAnillo2;
    }

    public void setImagenAnillo2(String imagenAnillo2) {
        this.imagenAnillo2 = imagenAnillo2;
    }

    public String getDescAnillo2() {
        return DescAnillo2;
    }

    public void setDescAnillo2(String DescAnillo2) {
        this.DescAnillo2 = DescAnillo2;
    }

    public String getPrecioAnillo2() {
        return precioAnillo2;
    }

    public void setPrecioAnillo2(String precioAnillo2) {
        this.precioAnillo2 = precioAnillo2;
    }

    public String getAnillo3() {
        return anillo3;
    }

    public void setAnillo3(String anillo3) {
        this.anillo3 = anillo3;
    }

    public String getImagenAnillo3() {
        return imagenAnillo3;
    }

    public void setImagenAnillo3(String imagenAnillo3) {
        this.imagenAnillo3 = imagenAnillo3;
    }

    public String getDescAnillo3() {
        return DescAnillo3;
    }

    public void setDescAnillo3(String DescAnillo3) {
        this.DescAnillo3 = DescAnillo3;
    }

    public String getPrecioAnillo3() {
        return precioAnillo3;
    }

    public void setPrecioAnillo3(String precioAnillo3) {
        this.precioAnillo3 = precioAnillo3;
    }
    
    
    
}
