package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;
import java.util.Scanner;

public class Menu {

    // Instancia Teclado
    Scanner scanner = new Scanner(System.in);

    public void executarMenu () {


        boolean exit = false;

        while (!exit) {
            System.out.println("/*******************/");
            System.out.println("/*    Geometria    */");
            System.out.println("/*******************/");
            System.out.println("/* 1 - Circulo     */");
            System.out.println("/* 2 - Retângulo   */");
            System.out.println("/* 3 - Triângulo   */");
            System.out.println("/* 4 - Sair        */");
            System.out.println("/*******************/");

            System.out.print("Informe a opção desejada: ");
            int optionUser = scanner.nextInt();


            // switch central do menu
            switch (optionUser) {
                case 1:

                    boolean exitCirculo = false;

                    Circulo circulo = new Circulo();
                    boolean validaCadastro = false;

                    while (!exitCirculo) {

                        System.out.println("/**************************/");
                        System.out.println("/****     Circulo      ****/");
                        System.out.println("/**************************/");
                        System.out.println("/* 1 - Cadastrar Circulo  */");
                        System.out.println("/* 2 - Calcular Area      */");
                        System.out.println("/* 3 - Calcular Perimetro */");
                        System.out.println("/* 4 - Sair               */");
                        System.out.println("/**************************/");
                        System.out.print("Informe a opção desejada: ");

                        int optionCirculo = scanner.nextInt();

                        // switch do circulo
                        switch (optionCirculo) {
                            case 1:
                               validaCadastro = circulo.cadastrarCirculo();
                                break;
                            case 2:
                                if (validaCadastro) {
                                    circulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Circulo");
                                }
                                break;
                            case 3:
                                if (validaCadastro) {
                                    circulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Circulo");
                                }
                                break;
                            case 4:
                                System.out.println("Saindo do Circulo ...");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Escolha uma Opção Válida !");
                        }

                    }
                    break;

                    // switch do Retangulo
                case 2:

                    boolean exitRetangulo = false;

                    Retangulo retangulo = new Retangulo();

                    boolean validaRetangulo = false;

                    while (!exitRetangulo) {
                        System.out.println("/****************************/");
                        System.out.println("/*****     Retangulo    *****/");
                        System.out.println("/****************************/");
                        System.out.println("/* 1 - Cadastrar Retangulo  */");
                        System.out.println("/* 2 - Calcular Area        */");
                        System.out.println("/* 3 - Calcular Perimetro   */");
                        System.out.println("/* 4 - Sair                 */");
                        System.out.println("/****************************/");
                        System.out.print("/* Informe a opção desejada:    ");

                        int optionRetangulo = scanner.nextInt();

                        switch (optionRetangulo) {
                            case 1:
                                validaRetangulo = retangulo.cadastrarRetangulo();
                                break;
                            case 2:
                                if (validaRetangulo) {
                                    retangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Retangulo !");
                                }
                                break;
                            case 3:
                                if (validaRetangulo) {
                                    retangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Retangulo !");
                                }
                                break;
                            case 4:
                                System.out.println("Saindo Retângulo...");
                                exitRetangulo = true;
                                 break;
                            default:
                                System.out.println("Escolha uma opção valida...");
                        }

                    }
                    break;

                    // switch do Triangulo
                case 3:
                    boolean exitTriangulo = false;
                    Triangulo triangulo = new Triangulo();
                    boolean validaTriangulo = false;

                    while (!exitTriangulo) {
                        System.out.println("/*****************************/");
                        System.out.println("/*****     Triângulo     *****/");
                        System.out.println("/*****************************/");
                        System.out.println("/* 1 - Cadastrar Triângulo   */");
                        System.out.println("/* 2 - Calcular Area         */");
                        System.out.println("/* 3 - Calcular Perimetro    */");
                        System.out.println("/* 4 - Definir Tipo          */");
                        System.out.println("/* 5 - Definir 3-4-5         */");
                        System.out.println("/* 6 - Definir T. Retângulo  */");
                        System.out.println("/* 7 - Sair                  */");
                        System.out.println("/*****************************/");
                        System.out.print("Informe a opção desejada: ");
                        int optionTriangulo = scanner.nextInt();

                        switch (optionTriangulo) {
                            case 1:
                                validaTriangulo = triangulo.cadastrarTriangulo();
                                break;
                            case 2:
                                if (validaTriangulo) {
                                    triangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Triângulo");
                                }
                                break;
                            case 3:
                                if (validaTriangulo) {
                                    triangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Triângulo");
                                }
                                break;
                            case 4:
                                triangulo.definirTipo();
                                break;
                            case 5:
                                triangulo.definir345();
                                break;
                            case 6:
                                triangulo.definirRetangulo();
                                break;
                            case 7:
                                System.out.println("Saindo Triângulo ...");
                                exitTriangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma Opção Válida !");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Escolheu 4");
                    exit = true;
                    break;
                default:
                    System.out.println("Escolha uma Opção Válida");

            }

        }

    }

}
