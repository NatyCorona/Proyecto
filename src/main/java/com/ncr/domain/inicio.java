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
public class inicio {
    private String carrusel1;
    private String carrusel2;
    private String carrusel3;
    private String categoria1;
    private String catDesp1;
    private String catImagen1;
    private String categoria2;
    private String catDesp2;
    private String catImagen2;
    private String categoria3;
    private String catDesp3;
    private String catImagen3;
    private String categoria4;
    private String catDesp4;
    private String catImagen4;

    public inicio() {
        this.carrusel1 = "imagen1.jpeg";
        this.carrusel2 = "imagen2.jpeg";
        this.carrusel3 = "imagen3.jpeg";
        
        this.catImagen1 = "Anillos.jpeg";
        this.categoria1 = "Anillos";
        this.catDesp1 = "Un anillo es el símbolo de un amor eterno, donde cada diseño captura la esencia de una promesa"
                + " y un compromiso. Ya sea para sellar una unión o para expresar tu estilo personal, nuestros anillos "
                + "están hechos para brillar tanto en momentos especiales como en tu día a día, transformando cada gesto "
                + "en un recuerdo invaluable.";
        
        this.catImagen2 = "Pulsera.jpeg";
        this.categoria2 = "Pulseras";
        this.catDesp2 = "Las pulseras son más que un accesorio; son el toque perfecto que acompaña tu elegancia y estilo"
                + " único. Desde los diseños más delicados hasta los más audaces, nuestras pulseras se ajustan a cada "
                + "ocasión, envolviendo tu muñeca con la belleza que solo una joya puede ofrecer.";
        
        this.catImagen3 = "Collar.jpeg";
        this.categoria3 = "Collares";
        this.catDesp3 = "Un collar es la expresión de la belleza que emana de tu ser, enmarcando tu rostro con elegancia"
                + " y sofisticación. Cada uno de nuestros collares está diseñado para capturar miradas y complementar tu"
                + " estilo, añadiendo un toque de brillo que ilumina tu presencia.";
        
        this.catImagen4 = "Aretes.jpeg";
        this.categoria4 = "Aretes";
        this.catDesp4 = "Los aretes son detalles que hablan sin palabras, adornando tu rostro con un destello de gracia"
                + " y distinción. Desde los diseños más clásicos hasta los más vanguardistas, nuestros aretes realzan "
                + "tu belleza natural, brindando ese toque final que eleva cualquier look con sofisticación y glamour.";
        
    }

    public String getCarrusel1() {
        return carrusel1;
    }

    public void setCarrusel1(String carrusel1) {
        this.carrusel1 = carrusel1;
    }

    public String getCarrusel2() {
        return carrusel2;
    }

    public void setCarrusel2(String carrusel2) {
        this.carrusel2 = carrusel2;
    }

    public String getCarrusel3() {
        return carrusel3;
    }

    public void setCarrusel3(String carrusel3) {
        this.carrusel3 = carrusel3;
    }

    public String getCategoria1() {
        return categoria1;
    }

    public void setCategoria1(String categoria1) {
        this.categoria1 = categoria1;
    }

    public String getCatDesp1() {
        return catDesp1;
    }

    public void setCatDesp1(String catDesp1) {
        this.catDesp1 = catDesp1;
    }

    public String getCatImagen1() {
        return catImagen1;
    }

    public void setCatImagen1(String catImagen1) {
        this.catImagen1 = catImagen1;
    }

    public String getCategoria2() {
        return categoria2;
    }

    public void setCategoria2(String categoria2) {
        this.categoria2 = categoria2;
    }

    public String getCatDesp2() {
        return catDesp2;
    }

    public void setCatDesp2(String catDesp2) {
        this.catDesp2 = catDesp2;
    }

    public String getCatImagen2() {
        return catImagen2;
    }

    public void setCatImagen2(String catImagen2) {
        this.catImagen2 = catImagen2;
    }

    public String getCategoria3() {
        return categoria3;
    }

    public void setCategoria3(String categoria3) {
        this.categoria3 = categoria3;
    }

    public String getCatDesp3() {
        return catDesp3;
    }

    public void setCatDesp3(String catDesp3) {
        this.catDesp3 = catDesp3;
    }

    public String getCatImagen3() {
        return catImagen3;
    }

    public void setCatImagen3(String catImagen3) {
        this.catImagen3 = catImagen3;
    }

    public String getCategoria4() {
        return categoria4;
    }

    public void setCategoria4(String categoria4) {
        this.categoria4 = categoria4;
    }

    public String getCatDesp4() {
        return catDesp4;
    }

    public void setCatDesp4(String catDesp4) {
        this.catDesp4 = catDesp4;
    }

    public String getCatImagen4() {
        return catImagen4;
    }

    public void setCatImagen4(String catImagen4) {
        this.catImagen4 = catImagen4;
    }
 
}
