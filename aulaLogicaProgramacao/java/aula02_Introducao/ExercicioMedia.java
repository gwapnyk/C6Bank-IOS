package aula02_Introducao;

import java.util.Scanner;

public class ExercicioMedia {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a primeira nota: ");
        int nota1 = scanner.nextInt();

        System.out.println("Digite a primeira nota: ");
        int nota2 = scanner.nextInt();
        
        int media = (nota1 + nota2) / 2; 

        if (media > 6) {
            System.out.println("Ola " + nome + " você teve média: " + media + " e foi APROVADO");
        } else {
            System.out.println("Ola " + nome + " você teve média: " + media + " e foi REPROVADO");
        }
    }
}
