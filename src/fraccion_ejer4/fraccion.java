/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraccion_ejer4;

/**
 *
 * @author Usuario DAM 1
 */
public class fraccion {
    private double numerador;
    private double denominador;
    private double invierte;
    private double multiplica;
    private double divide;
    
    public fraccion() {
    }

    public fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public double getInvierte() {
        return invierte;
    }

    public void setInvierte(int invierte) {
        this.invierte = invierte;
    }

    public double getMultiplica() {
        return multiplica;
    }

    public void setMultiplica(int multiplica) {
        this.multiplica = multiplica;
    }

    public double getDivide() {
        return divide;
    }

    public void setDivide(double divide) {
        this.divide = divide;
    }
    public static double invierte(double numerador, double denominador){
        return numerador * 1/2;
    }
    public static double multiplica(double numerador, double denominador){
        return numerador * denominador;
    }
    public static double divide(double numerador, double denominador){
        return numerador / denominador;
    }
    public String toString(){
        String fraccion;
        fraccion = "Invierte: " + this.invierte + "\tMultiplica: " + this.multiplica + "\tDivide: " + this.divide;
        return fraccion;
}
}
