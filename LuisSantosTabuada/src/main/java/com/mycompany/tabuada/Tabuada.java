/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        // Cria um objeto Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número
        System.out.print("Digite um número para a tabuada: ");
        int numero = scanner.nextInt();

        // Exibe a tabuada do número inserido pelo usuário
        exibirTabuada(numero);

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }

    // Método para exibir a tabuada de um número dado
    private static void exibirTabuada(int numero) {
        System.out.println("Tabuada do " + numero + ":");

        // Loop de 1 a 10 para exibir a tabuada
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
