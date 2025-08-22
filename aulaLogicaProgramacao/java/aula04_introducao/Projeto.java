package aula04_introducao;

import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {     

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu email: ");
        String email = scanner.nextLine();
        System.out.println("Digite a sua senha: ");
        String senha = scanner.nextLine();

        String titulo[] = new String[6];
        String ano[] = new String[6];
        String genero[] = new String[6];


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
            System.out.println("-------------------------------------------------------");
            System.out.println("-------------------------------------------------------");
            
            System.out.println("Insira o Título.");
            titulo[1] = scanner.nextLine();
            System.out.println("Insira o Ano.");
            ano[1] = scanner.nextLine();
            System.out.println("Insira o Gênero.");
            genero[1] = scanner.nextLine();
            System.out.println("-------------------------------------------------------");
            System.out.println("-------------------------------------------------------");
            
            System.out.println("Insira o segundo Título.");
            titulo[2] = scanner.nextLine();
            System.out.println("Insira o segundo Ano.");
            ano[2] = scanner.nextLine();
            System.out.println("Insira o segundo Gênero.");
            genero[2] = scanner.nextLine();
            System.out.println("-------------------------------------------------------");
            System.out.println("-------------------------------------------------------");
            
            System.out.println("Insira o terceiro Título.");
            titulo[3] = scanner.nextLine();
            System.out.println("Insira o terceiro Ano.");
            ano[3] = scanner.nextLine();
            System.out.println("Insira o terceiro Gênero.");
            genero[3] = scanner.nextLine();
            System.out.println("-------------------------------------------------------");
            System.out.println("-------------------------------------------------------");
            
            System.out.println("Insira o quarto Título.");
            titulo[4] = scanner.nextLine();
            System.out.println("Insira o quarto Ano.");
            ano[4] = scanner.nextLine();
            System.out.println("Insira o quarto Gênero.");
            genero[4] = scanner.nextLine();
            System.out.println("-------------------------------------------------------");
            System.out.println("-------------------------------------------------------");
            
            System.out.println("Insira o quinto Título.");
            titulo[5] = scanner.nextLine();
            System.out.println("Insira o quinto Ano.");
            ano[5] = scanner.nextLine();
            System.out.println("Insira o quinto Gênero.");
            genero[5] = scanner.nextLine();
            System.out.println("-------------------------------------------------------");
            System.out.println("-------------------------------------------------------");

            System.out.println("Os filmes cadastrados são: ");
            System.out.println("1 -" + titulo[1]);
            System.out.println("2 -" + titulo[2]);
            System.out.println("3 -" + titulo[3]);
            System.out.println("4 -" + titulo[4]);
            System.out.println("5 -" + titulo[5]);
            System.out.println("-------------------------------------------------------");
            System.out.println("-------------------------------------------------------");

            System.out.println("Digite o codigo do filme, que você queira exibir o Título, Ano e Gênero: ");
            System.out.println("-------------------------------------------------------");
            System.out.println("-------------------------------------------------------");
            
            int cod = scanner.nextInt();

            switch (cod) {
                case 1:
                    System.out.println("O codigo selecionado tem o seguinte resultado:  " );
                    System.out.println(titulo[1]);
                    System.out.println(ano[1]);
                    System.out.println(genero[1]);

                    break;
                case 2:
                    System.out.println("O codigo selecionado tem o seguinte resultado:  " );
                    System.out.println(titulo[2]);
                    System.out.println(ano[2]);
                    System.out.println(genero[2]);
                    break;
                case 3:
                    System.out.println("O codigo selecionado tem o seguinte resultado:  " );
                    System.out.println(titulo[3]);
                    System.out.println(ano[3]);
                    System.out.println(genero[3]);
                    break;
                case 4:
                    System.out.println("O codigo selecionado tem o seguinte resultado:  " );
                    System.out.println(titulo[4]);
                    System.out.println(ano[4]);
                    System.out.println(genero[4]);
                    break;
                case 5:
                    System.out.println("O codigo selecionado tem o seguinte resultado:  " );
                    System.out.println(titulo[5]);
                    System.out.println(ano[5]);
                    System.out.println(genero[5]);
                    break;
                default:
                    System.out.println("Insira um codigo valido: As opções são: \n1- " + titulo[1] + "\n2- " + titulo[2] + "\n3- " + titulo[3] + "\n4- " + titulo[4] + "\n5- " + titulo[5]);
                    break;
            }

        } else {
            System.out.println("Você errou o login");
        }
    }
}
