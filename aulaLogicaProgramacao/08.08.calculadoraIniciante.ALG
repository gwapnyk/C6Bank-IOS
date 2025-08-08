Algoritmo "calculadoraIniciante"

Var
   sinal : inteiro
   primeiroValor : real
   segundoValor : real

Inicio
   escreval ("Insira o primeiro valor:")
   leia (primeiroValor)

   escreval
   escreval ("Escolha qual operação matematica você quer realizar:")
   escreval ("1 - +")
   escreval ("2 - -")
   escreval ("3 - *")
   escreval ("4 - /")
   escreval
   leia (sinal)

   escreval
   escreval ("Insira o segundo valor:")
   leia (segundoValor)
   escreval
   
   escolha (sinal)
   caso 1
   escreval ("O resultado foi: ", primeiroValor + segundoValor)
   caso 2
   escreval ("O resultado foi: ", primeiroValor - segundoValor)
   caso 3
   escreval ("O resultado foi: ", primeiroValor * segundoValor)
   caso 4
   escreval ("O resultado foi: ", primeiroValor / segundoValor)
   outrocaso
   escreval ("O resultado foi invalido")
   fimescolha



Fimalgoritmo