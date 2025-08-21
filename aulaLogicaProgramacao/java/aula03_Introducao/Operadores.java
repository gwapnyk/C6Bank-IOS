package aula03_Introducao;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {     

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite o nivel do seu convite: ");
        int nivelConvite = scanner.nextInt();

        if (idade >= 18) {
        
            System.out.println();
            System.out.println("Entre e seja Bem vindo");

            if (nivelConvite == 100) {
                System.out.println("Por ter 100 pontos de convite seu nivel é: VIP Soft");
            } else if (nivelConvite == 200) {
                System.out.println("Por ter 200 pontos de convite seu nivel é: VIP Premium");
            } else {
                System.out.println("Você tem um nivel normal de convite");                
            }

        } else {
            System.out.println("Você não pode entrar, você é menor de idade");
        }
    }
}
