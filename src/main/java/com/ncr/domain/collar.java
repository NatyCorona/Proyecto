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
public class collar {
    private String collar1;
    private String imagenCollar1;
    private String descCollar1;
    private String precioCollar1;
    private String collar2;
    private String imagenCollar2;
    private String descCollar2;
    private String precioCollar2;
    private String collar3;
    private String imagenCollar3;
    private String descCollar3;
    private String precioCollar3;

    public collar() {
        this.collar1 = "Colgante De Mujer Kanvika 06 Mm";
        this.imagenCollar1 = "collar1.jpeg";
        this.descCollar1 = "14k Oro Rosa & Diamante & Perla Rosa";
        this.precioCollar1 = "MXN 12,821.00";
        
        this.collar2 = "Colgante De Mujer Bria";
        this.imagenCollar2 = "collar2.png";
        this.descCollar2 = "14k Oro Blanco & Opalo";
        this.precioCollar2 = "MXN 10,637.00";
        
        this.collar3= "Colar De Mujer Shugaman";
        this.imagenCollar3 = "collar3.png";
        this.descCollar3 = "14k Oro Blanco & Diamante";
        this.precioCollar3 = "MXN 17,800.00";
    }

    public String getCollar1() {
        return collar1;
    }

    public void setCollar1(String collar1) {
        this.collar1 = collar1;
    }

    public String getImagenCollar1() {
        return imagenCollar1;
    }

    public void setImagenCollar1(String imagenCollar1) {
        this.imagenCollar1 = imagenCollar1;
    }

    public String getDescCollar1() {
        return descCollar1;
    }

    public void setDescCollar1(String descCollar1) {
        this.descCollar1 = descCollar1;
    }

    public String getPrecioCollar1() {
        return precioCollar1;
    }

    public void setPrecioCollar1(String precioCollar1) {
        this.precioCollar1 = precioCollar1;
    }

    public String getCollar2() {
        return collar2;
    }

    public void setCollar2(String collar2) {
        this.collar2 = collar2;
    }

    public String getImagenCollar2() {
        return imagenCollar2;
    }

    public void setImagenCollar2(String imagenCollar2) {
        this.imagenCollar2 = imagenCollar2;
    }

    public String getDescCollar2() {
        return descCollar2;
    }

    public void setDescCollar2(String descCollar2) {
        this.descCollar2 = descCollar2;
    }

    public String getPrecioCollar2() {
        return precioCollar2;
    }

    public void setPrecioCollar2(String precioCollar2) {
        this.precioCollar2 = precioCollar2;
    }

    public String getCollar3() {
        return collar3;
    }

    public void setCollar3(String collar3) {
        this.collar3 = collar3;
    }

    public String getImagenCollar3() {
        return imagenCollar3;
    }

    public void setImagenCollar3(String imagenCollar3) {
        this.imagenCollar3 = imagenCollar3;
    }

    public String getDescCollar3() {
        return descCollar3;
    }

    public void setDescCollar3(String descCollar3) {
        this.descCollar3 = descCollar3;
    }

    public String getPrecioCollar3() {
        return precioCollar3;
    }

    public void setPrecioCollar3(String precioCollar3) {
        this.precioCollar3 = precioCollar3;
    }
    
    
}
