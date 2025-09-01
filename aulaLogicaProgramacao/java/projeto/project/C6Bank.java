package project;

import java.util.Scanner;

public class C6Bank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Configurações fixas (constantes)
        final String emailCorreto = "admin";
        final String senhaCorreta = "123";
        final String nomeDoCliente = "Rodolfo Astolfo";
        final String contaDoCliente = "0001-5 / Ag. 0001 / CC 12345-6";

        // Estado do "banco"
        double saldo = 1000.00;
        String[] historico = new String[200];
        int qtdTransacoes = 0;

        // 1) Login (até 3 tentativas)
        int tentativas = 0;
        boolean autenticado = false;

        while (tentativas < 3 && !autenticado) {
            System.out.print("\n=== LOGIN C6 (Simulado) ===\nUsuário: ");
            String user = in.nextLine().trim();
            System.out.print("Senha: ");
            String pass = in.nextLine().trim();

            if (emailCorreto.equals(user) && senhaCorreta.equals(pass)) {
                autenticado = true;
                System.out.println("\nLogin efetuado com sucesso. Bem-vindo, " + nomeDoCliente + "!");
            } else {
                tentativas++;
                System.out.println("Usuário ou senha inválidos. Tentativa " + tentativas + " de 3.");
            }
        }

        if (!autenticado) {
            System.out.println("\nUsuário bloqueado. Contate o administrador.");
            in.close();
            return;
        }

        // 2) Menu principal (do/while + switch)
        int opcao;
        do {
            System.out.println("\n================== MENU PRINCIPAL ==================");
            System.out.println("1) Consultar saldo");
            System.out.println("2) Histórico de transações");
            System.out.println("3) Depósito");
            System.out.println("4) Saque");
            System.out.println("0) Sair");
            System.out.print("Escolha uma opção: ");

            String entrada = in.nextLine().trim();
            while (!entrada.matches("-?\\d+")) {
                System.out.print("Entrada inválida. Digite o número da opção: ");
                entrada = in.nextLine().trim();
            }
            opcao = Integer.parseInt(entrada);

            switch (opcao) {
                case 1: {
                    // Consulta de saldo (com "referência" em ms, sem data/hora formatada)
                    System.out.println("\n────────── COMPROVANTE DE CONSULTA DE SALDO ──────────");
                    System.out.println("Cliente : " + nomeDoCliente);
                    System.out.println("Conta   : " + contaDoCliente);
                    System.out.println("Ref     : " + System.currentTimeMillis() + " ms");
                    System.out.printf ("Saldo   : R$ %,.2f%n", saldo);
                    System.out.println("──────────────────────────────────────────────────────");
                    break;
                }
                case 2: {
                    // Histórico
                    System.out.println("\n──────────── HISTÓRICO DE TRANSAÇÕES (MÊS) ───────────");
                    if (qtdTransacoes == 0) {
                        System.out.println("Nenhuma transação registrada.");
                    } else {
                        System.out.println(" # | Registro                           ");
                        System.out.println("----------------------------------------");
                        for (int i = 0; i < qtdTransacoes; i++) {
                            System.out.printf("%2d | %s%n", (i + 1), historico[i]);
                        }
                    }
                    System.out.println("──────────────────────────────────────────────────────");
                    break;
                }
                case 3: {
                    // Depósito
                    System.out.print("\nDigite o valor do depósito: R$ ");
                    String txt = in.nextLine().replace(",", ".").trim();
                    double valor;
                    try {
                        valor = Double.parseDouble(txt);
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido.");
                        break;
                    }
                    if (valor <= 0) {
                        System.out.println("O valor deve ser positivo.");
                        break;
                    }

                    saldo += valor;

                    // Registro (sem data/hora; com referência ms e formatação de valores)
                    String registro = String.format(
                        "Ref %d | %-9s | R$ %,.2f | Saldo: R$ %,.2f",
                        System.currentTimeMillis(), "DEPÓSITO", valor, saldo
                    );
                    if (qtdTransacoes < historico.length) {
                        historico[qtdTransacoes++] = registro;
                    }

                    // Comprovante
                    System.out.println("\n────────────── COMPROVANTE DE DEPÓSITO ──────────────");
                    System.out.println("Cliente : " + nomeDoCliente);
                    System.out.println("Conta   : " + contaDoCliente);
                    System.out.println("Ref     : " + System.currentTimeMillis() + " ms");
                    System.out.printf ("Valor   : R$ %,.2f%n", valor);
                    System.out.printf ("Saldo   : R$ %,.2f%n", saldo);
                    System.out.println("──────────────────────────────────────────────────────");
                    break;
                }
                case 4: {
                    // Saque
                    System.out.print("\nDigite o valor do saque: R$ ");
                    String txt = in.nextLine().replace(",", ".").trim();
                    double valor;
                    try {
                        valor = Double.parseDouble(txt);
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido.");
                        break;
                    }
                    if (valor <= 0) {
                        System.out.println("O valor deve ser positivo.");
                        break;
                    }
                    if (valor > saldo) {
                        System.out.printf("Saldo insuficiente. Saldo atual: R$ %,.2f%n", saldo);
                        break;
                    }

                    saldo -= valor;

                    // Registro (sem data/hora; com referência ms e formatação de valores)
                    String registro = String.format(
                        "Ref %d | %-9s | R$ %,.2f | Saldo: R$ %,.2f",
                        System.currentTimeMillis(), "SAQUE", valor, saldo
                    );
                    if (qtdTransacoes < historico.length) {
                        historico[qtdTransacoes++] = registro;
                    }

                    // Comprovante
                    System.out.println("\n─────────────── COMPROVANTE DE SAQUE ────────────────");
                    System.out.println("Cliente : " + nomeDoCliente);
                    System.out.println("Conta   : " + contaDoCliente);
                    System.out.println("Ref     : " + System.currentTimeMillis() + " ms");
                    System.out.printf ("Valor   : R$ %,.2f%n", valor);
                    System.out.printf ("Saldo   : R$ %,.2f%n", saldo);
                    System.out.println("──────────────────────────────────────────────────────");
                    break;
                }
                case 0: {
                    System.out.println("\nEncerrando o sistema. Obrigado por utilizar o C6 (simulado).");
                    break;
                }
                default: {
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
                }
            }
        } while (opcao != 0);

        in.close();
    }
}
