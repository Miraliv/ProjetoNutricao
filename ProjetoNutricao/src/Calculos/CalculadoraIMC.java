/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculos;

/**
 *
 * @author USUARIO
 */
public class CalculadoraIMC {
    private double peso;
    private double altura;

    public CalculadoraIMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / Math.pow(altura, 2);
    }

    public String interpretarIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Magreza";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Normal";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc <= 39.9) {
            return "Obesidade";
        } else {
            return "Obesidade grave";
        }
    }
}
