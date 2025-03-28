package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    public double base, lado2, lado3, area, perimetro, altura;
    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo() {
        System.out.println("/************************/");
        System.out.println("/*   Cadastro Triângulo */");
        System.out.println("/************************/");
        System.out.print("/* Informe a Base:     */");
        base = scanner.nextDouble();
        System.out.print("/* Informe o lado 2:   */");
        lado2 = scanner.nextDouble();
        System.out.print("/* Informe o lado 3:   */");
        lado3 = scanner.nextDouble();
        System.out.print("Informe a Altura: ");
        altura = scanner.nextDouble();
        System.out.println("/* Triângulo Cadastrado com Sucesso ! */");
        System.out.println("/***********************************/");
        return true;
    }

    public void calcularArea() {
        System.out.println("/*********************************/");
        System.out.println("/*        Calculando Área        */");
        System.out.println("/*********************************/");
        area = (base * altura) / 2;
        System.out.println("A área é: " + area);
        System.out.println("/*********************************/");
    }

    public void calcularPerimetro() {
        System.out.println("/*********************************/");
        System.out.println("/*      Calculando Perímetro     */");
        System.out.println("/*********************************/");
        perimetro = base + lado2 + lado3;
        System.out.println("O perímetro é: " + perimetro);
        System.out.println("/*********************************/");
    }

    // Isosceles / Escaleno / Equilatero
    public void definirTipo() {
        System.out.println("/*********************************/");
        System.out.println("/*        Definindo Tipo         */");
        System.out.println("/*********************************/");
        if (base == lado2 && base == lado3) {
            System.out.println("Este Triângulo é Equilátero ...");
        } else if (base != lado2 && base != lado3 && lado2 != lado3) {
            System.out.println("Este Triângulo é Escaleno ...");
        } else {
            System.out.println("Este Triângulo é Isósceles ...");
        }
        System.out.println("/***************************************/");
    }

    public void definirRetangulo() {
        System.out.println("/*********************************/");
        System.out.println("/*        Definindo Retângulo    */");
        System.out.println("/*********************************/");
        // define as variaveis ao quadrado
        double baseq = Math.pow(base, 2);
        double lado2q = Math.pow(lado2, 2);
        double lado3q = Math.pow(lado3, 2);
        if (baseq == (lado2q + lado3q) || lado2q == (baseq + lado3q) || lado3q == (lado2q + baseq)) {
            System.out.println("Este Triângulo é Retângulo ...");
        } else {
            System.out.println("Este Triângulo não é Retângulo ...");
        }
    }

    // definir se e 3 4 5
    public void definir345() {



        System.out.println("/*********************************/");
        System.out.println("/*        Definindo 3-4-5         */");
        System.out.println("/*********************************/");
        double[] lados = { base, lado2, lado3 };
        java.util.Arrays.sort(lados); // maior lado por ultimo
        if (lados[0] % 3 == 0 && lados[1] % 4 == 0 && lados[2] % 5 == 0) { // ve se e divisivel por 3,4 e 5 ai se o resto for 0 ele e divisivel
            System.out.println("Este Triângulo é 3-4-5 ...");
        } else {
            System.out.println("Este Triângulo não é 3-4-5 ...");
        }
    }
}
