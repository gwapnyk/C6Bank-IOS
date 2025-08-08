// Algoritmo: Agendamento Simples – Grupo 6
Algoritmo "Agendamento_Simples_Grupo6"
Var
   nome : caracter
   esp  : inteiro     // 1..5
   dia, mes, hora : inteiro

Inicio
   escreval("=== AGENDAMENTO SIMPLES ===")

   escreva("Nome do paciente: ")
   leia(nome)

   escreval("Especialidade (1..5):")
   escreval("1-Clinico  2-Pediatria  3-Ginecologia  4-Cardiologia  5-Ortopedia")
   escreva("Escolha: ")
   leia(esp)

   escreva("Dia (1..31): ")
   leia(dia)
   escreva("Mes (1..12): ")
   leia(mes)
   escreva("Hora (8..18): ")
   leia(hora)

   // Validações simples
   se (esp<1) ou (esp>5) entao
      escreval("Especialidade invalida.")
   senao
      se (dia<1) ou (dia>31) entao
         escreval("Dia invalido.")
      senao
         se (mes<1) ou (mes>12) entao
            escreval("Mes invalido.")
         senao
            se (hora<8) ou (hora>18) entao
               escreval("Hora invalida (funcionamos 8..18).")
            senao
               escreval()
               escreval("=== RESUMO DO AGENDAMENTO ===")
               escreval("Paciente: ", nome)
               escreval("Especialidade: ", esp)
               escreval("Data: ", dia, "/", mes, " às ", hora, "h")
               escreval("Status: AGENDADO com sucesso.")
            fimse
         fimse
      fimse
   fimse

Fimalgoritmo