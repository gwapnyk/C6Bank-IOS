package aula03_Introducao;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        
        boolean validadeConvite = true;        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite o nivel do seu convite: ");
        int nivelConvite = scanner.nextInt();

        if (idade >= 18 && validadeConvite == true) {
        
            System.out.println();
            System.out.println("Pode entrar");

            if (nivelConvite == 100) {
                System.out.println("Seu nivel de Vip é: 100");
            } else if (nivelConvite == 200) {
                System.out.println("Seu nivel de Vip é: 200");
            } else {
                System.out.println("Seu nivel é normal: 10");
            }

        } else {
            System.out.println("Não pode entrar");
        }

    }
}
