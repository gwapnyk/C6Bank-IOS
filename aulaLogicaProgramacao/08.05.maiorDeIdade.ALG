Algoritmo "maiorDeIdade"

Var
   nomeDoUsuario : caracter
   diaDeNascimento, mesDeNascimento, anoDeNascimento : inteiro
   diaAtual, mesAtual, anoAtual : inteiro
   idade : inteiro

Inicio
   diaAtual <- 05
   mesAtual <- 08
   anoAtual <- 2025
   
   escreval ("Ola qual o seu nome?")
   leia (nomeDoUsuario)
   escreval ("Ola ", nomeDoUsuario, " por favor insira seu dia de nascimento")
   leia (diaDeNascimento)
   escreval ("Por favor insira seu mes de nascimento")
   leia (mesDeNascimento)
   escreval ("Por favor insira seu ano de nascimento")
   leia (anoDeNascimento)
   escreval
   
   idade <- anoAtual - anoDeNascimento
   
   se (mesAtual < mesDeNascimento) ou ((mesAtual = mesDeNascimento) e (diaAtual < diaDeNascimento)) entao
      idade <- idade - 1
   fimse

   se idade >= 18 entao
      escreval ("Bem-vind* ao sistema")
   senao
      escreval ("Você não é maior de idade")
   fimse

Fimalgoritmo