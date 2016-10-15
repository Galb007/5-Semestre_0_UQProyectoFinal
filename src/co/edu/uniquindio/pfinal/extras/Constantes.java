/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniquindio.pfinal.extras;

import java.io.File;

public class Constantes {

    public static final String DIRECTORIO_IMAGENES = "/co/edu/uniquindio/pfinal/imagenes/";
    public static final String FONDOPPAL = "FondoPpal.jpg";
    public static final String FONDO1 = "Fondo1.jpg";
    public static final String FONDO2 = "Fondo2.jpg";
    public static final String FONDO3 = "Fondo3.jpg";
    public static final String ICONOVENTANA = "LogoMB.png";

    public static final String DIRECTORIO_DATOS = "C:/";
    public static final String IMAGEN_ARBOL = "arbol";
    public static final String ARCHIVO_PRODUCTO = "productos.dat";
    public static final String ARCHIVO_ARBOL = "arbol.dat";
    public static final String ARCHIVO_COMPRA = "compras.dat";

    private String DIRECTORIO_ABSOLUTO = "C://";
    private File PRODUCTO = new File(DIRECTORIO_ABSOLUTO + "productos.dat");
    private File ARBOL = new File(DIRECTORIO_ABSOLUTO + "arbol.dat");
    private File COMPRAS = new File(DIRECTORIO_ABSOLUTO + "compras.dat");

    /**
     * constructor Vacio
     */
    public Constantes() {
    }

    public File getPRODUCTO() {
        return PRODUCTO;
    }

    public File getARBOL() {
        return ARBOL;
    }

    public File getCOMPRAS() {
        return COMPRAS;
    }

}
