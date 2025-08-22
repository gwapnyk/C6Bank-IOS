package aula04_introducao;

import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {     

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu email: ");
        String email = scanner.nextLine();
        System.out.println("Digite a sua senha: ");
        String senha = scanner.nextLine();

        if (email.equals("admin") && senha.equals("teste123*")) {
        
            System.out.println("-------------------------------------------------------");
            System.out.println("-------------------------------------------------------");
            System.out.println("Entre e seja Bem vindo ao sistema de cadastro de filmes.");
            System.out.println("-------------------------------------------------------");
            System.out.println("-------------------------------------------------------");
            System.out.println("Vou te explicar como funciona o sistema.");
            System.out.println("-------------------------------------------------------");
            System.out.println("-------------------------------------------------------");
            System.out.println("Primeiro você vai cadastrar o Título, Ano e Gênero de 5 filmes.");
            System.out.println("Segundo ira aparecer um menu com os filmes cadastrados.");
            System.out.println("Terceiro voce podera selecionar o filme pelo codigo.");
            System.out.println("-------------------------------------------------------");
            System.out.println("-------------------------------------------------------");
            System.out.println("Vamos começar.");
            System.out.println("Insira o Título.");
            String titulo = scanner.nextLine();
            System.out.println("Insira o Ano.");
            String ano = scanner.nextLine();
            System.out.println("Insira o Gênero.");
            String genero = scanner.nextLine();
            System.out.println("-------------------------------------------------------");
            System.out.println("Insira o segundo Título.");
            String titulo2 = scanner.nextLine();
            System.out.println("Insira o segundo Ano.");
            String ano2 = scanner.nextLine();
            System.out.println("Insira o segundo Gênero.");
            String genero2 = scanner.nextLine();
            System.out.println("-------------------------------------------------------");
            System.out.println("Insira o terceiro Título.");
            String titulo3 = scanner.nextLine();
            System.out.println("Insira o terceiro Ano.");
            String ano3 = scanner.nextLine();
            System.out.println("Insira o terceiro Gênero.");
            String genero3 = scanner.nextLine();
            System.out.println("-------------------------------------------------------");
            System.out.println("Insira o quarto Título.");
            String titulo4 = scanner.nextLine();
            System.out.println("Insira o quarto Ano.");
            String ano4 = scanner.nextLine();
            System.out.println("Insira o quarto Gênero.");
            String genero4 = scanner.nextLine();
            System.out.println("-------------------------------------------------------");
            System.out.println("Insira o quinto Título.");
            String titulo5 = scanner.nextLine();
            System.out.println("Insira o quinto Ano.");
            String ano5 = scanner.nextLine();
            System.out.println("Insira o quinto Gênero.");
            String genero5 = scanner.nextLine();
            System.out.println("-------------------------------------------------------");

            System.out.println("Digite o codigo do filme: ");
            int cod = scanner.nextInt();


            if (cod == 1) {
                System.out.println("O codigo selecionado tem o seguinte resultado:  " + " " + titulo + " " + ano + " " + genero);
            } else if (cod == 2) {
                System.out.println("O codigo selecionado tem o seguinte resultado:  " + " " + titulo2 + " " + ano2 + " " + genero2);
            } else if (cod == 3) {
                System.out.println("O codigo selecionado tem o seguinte resultado:  " + " " + titulo3 + " " + ano3 + " " + genero3);
            } else if (cod == 4) {
                System.out.println("O codigo selecionado tem o seguinte resultado:  " + " " + titulo4 + " " + ano4 + " " + genero4);
            } else if (cod == 5) {
                System.out.println("O codigo selecionado tem o seguinte resultado:  " + " " + titulo5 + " " + ano5 + " " + genero5);
            } else {
                System.out.println("Insira um codigo valido: As opções são: 1- " + titulo + " 2- " + titulo2 + " 3- " + titulo3 + " 4- " + titulo4 + " 5- " + titulo5);
            }

        } else {
            System.out.println("Você errou o login");
        }
    }
}
