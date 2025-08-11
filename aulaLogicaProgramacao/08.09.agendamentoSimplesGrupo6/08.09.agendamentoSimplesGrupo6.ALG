// Declara o nome (rótulo) do algoritmo que aparece no VisualG
Algoritmo "Agendamento_Simples_Grupo6"

// Bloco de declarações de variáveis
Var
   nome          : caractere     // guarda o nome digitado do paciente (texto)
   esp           : inteiro       // guarda a especialidade escolhida (número 1..5)
   dia, mes      : inteiro       // guardam a data (dia e mês) como números inteiros
   hora          : inteiro       // guarda a hora escolhida (8..18)
   esp_txt       : caractere     // guarda o nome da especialidade em texto (ex.: "Cardiologia")

// Início do fluxo do programa
Inicio
   escreval("=== AGENDAMENTO SIMPLES ===")     // exibe um título com quebra de linha

   escreva("Nome do paciente: ")               // mostra o rótulo sem quebrar a linha
   leia(nome)                                  // lê do teclado e armazena em 'nome'

   // Apresenta o menu de especialidades
   escreval("Especialidade (1..5):")           // explica o intervalo permitido
   escreval("1-Clinico  2-Pediatria  3-Ginecologia  4-Cardiologia  5-Ortopedia") // opções

   // Laço de validação: repete até o usuário digitar de 1 a 5
   repita                                      // entra no laço pelo menos uma vez
      escreva("Escolha (1 a 5): ")             // pede a escolha
      leia(esp)                                // lê a especialidade (número)
      se (esp < 1) ou (esp > 5) entao          // testa se está fora do intervalo 1..5
         escreval("Número inválido. Digite um valor de 1 a 5.") // feedback de erro
      fimse
   ate (esp >= 1) e (esp <= 5)                 // condição de saída: valor válido (1..5)

   // Laço de validação do dia (1..31)
   repita                                      // repete até o dia ser válido
      escreva("Dia (1 a 31): ")                // pede o dia
      leia(dia)                                // lê o dia
      se (dia < 1) ou (dia > 31) entao         // verifica intervalo permitido
         escreval("Dia inválido. Digite um valor entre 1 e 31.") // mensagem de erro
      fimse
   ate (dia >= 1) e (dia <= 31)                // só sai quando for 1..31

   // Laço de validação do mês (1..12)
   repita
      escreva("Mês (1 a 12): ")                // pede o mês
      leia(mes)                                // lê o mês
      se (mes < 1) ou (mes > 12) entao         // valida 1..12
         escreval("Mês inválido. Digite um valor entre 1 e 12.") // erro e repete
      fimse
   ate (mes >= 1) e (mes <= 12)                // condição de saída válida

   // Laço de validação da hora (8..18)
   repita
      escreva("Hora (8 a 18): ")               // pede a hora
      leia(hora)                               // lê a hora
      se (hora < 8) ou (hora > 18) entao       // valida horário de funcionamento
         escreval("Hora inválida. Funcionamos das 8 às 18.")     // informa regra
      fimse
   ate (hora >= 8) e (hora <= 18)              // sai só quando a hora estiver ok

   // Converte o número da especialidade para texto (apenas para exibir bonito)
   se esp = 1 entao
      esp_txt <- "Clinico"                     // mapeia 1 -> "Clinico"
   senao
      se esp = 2 entao
         esp_txt <- "Pediatria"                // mapeia 2 -> "Pediatria"
      senao
         se esp = 3 entao
            esp_txt <- "Ginecologia"           // mapeia 3 -> "Ginecologia"
         senao
            se esp = 4 entao
               esp_txt <- "Cardiologia"        // mapeia 4 -> "Cardiologia"
            senao
               esp_txt <- "Ortopedia"          // se não foi 1..4, só pode ser 5 -> "Ortopedia"
            fimse
         fimse
      fimse
   fimse

   escreval()                                   // imprime uma linha em branco (espaçamento)
   escreval("=== RESUMO DO AGENDAMENTO ===")    // título do resumo
   escreval("Paciente: ", nome)                 // mostra o nome digitado
   escreval("Especialidade: ", esp, " - ", esp_txt) // mostra código e nome da especialidade
   escreval("Data: ", dia, "/", mes, " às ", hora, "h") // mostra data e hora formatadas
   escreval("Status: AGENDADO com sucesso.")    // mensagem final de confirmação


   //repita ... ate garante que não prossegue sem dado válido
   //validação sempre checa intervalo (ex.: 1..5, 1..31, etc.)
   //mapeamento esp -> esp_txt é só pra exibição amigável no resumo
   
// Fim do algoritmo (marca de encerramento do programa)
Fimalgoritmo