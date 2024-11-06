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
public class aretes {
    private String arete1;
    private String imagenArete1;
    private String descArete1;
    private String precioArete1;
    private String arete2;
    private String imagenArete2;
    private String descArete2;
    private String precioArete2;
    private String arete3;
    private String imagenArete3;
    private String descArete3;
    private String precioArete3;

    public aretes() {
        this.arete1 = "Pendiente de mujer Nutpila";
        this.imagenArete1 = "aretes1.jpeg";
        this.descArete1 = "14k Oro Blanco & Diamentes";
        this.precioArete1 = "MXN 11,597.00";
        this.arete2 = "Pendiente de mujer Habriel";
        this.imagenArete2 = "aretes2.png";
        this.descArete2 = "18k Oro Amarillo& Diamentes";
        this.precioArete2 = "MXN 24,647.00";
        this.arete3 = "Pendiente de mujer Brezza";
        this.imagenArete3 = "aretes3.png";
        this.descArete3 = "18k Oro Amarillo & Esmeralda";
        this.precioArete3 = "MXN 5,666.00";
    }

    public String getArete1() {
        return arete1;
    }

    public void setArete1(String arete1) {
        this.arete1 = arete1;
    }

    public String getImagenArete1() {
        return imagenArete1;
    }

    public void setImagenArete1(String imagenArete1) {
        this.imagenArete1 = imagenArete1;
    }

    public String getDescArete1() {
        return descArete1;
    }

    public void setDescArete1(String descArete1) {
        this.descArete1 = descArete1;
    }

    public String getPrecioArete1() {
        return precioArete1;
    }

    public void setPrecioArete1(String precioArete1) {
        this.precioArete1 = precioArete1;
    }

    public String getArete2() {
        return arete2;
    }

    public void setArete2(String arete2) {
        this.arete2 = arete2;
    }

    public String getImagenArete2() {
        return imagenArete2;
    }

    public void setImagenArete2(String imagenArete2) {
        this.imagenArete2 = imagenArete2;
    }

    public String getDescArete2() {
        return descArete2;
    }

    public void setDescArete2(String descArete2) {
        this.descArete2 = descArete2;
    }

    public String getPrecioArete2() {
        return precioArete2;
    }

    public void setPrecioArete2(String precioArete2) {
        this.precioArete2 = precioArete2;
    }

    public String getArete3() {
        return arete3;
    }

    public void setArete3(String arete3) {
        this.arete3 = arete3;
    }

    public String getImagenArete3() {
        return imagenArete3;
    }

    public void setImagenArete3(String imagenArete3) {
        this.imagenArete3 = imagenArete3;
    }

    public String getDescArete3() {
        return descArete3;
    }

    public void setDescArete3(String descArete3) {
        this.descArete3 = descArete3;
    }

    public String getPrecioArete3() {
        return precioArete3;
    }

    public void setPrecioArete3(String precioArete3) {
        this.precioArete3 = precioArete3;
    }
    
    
}
