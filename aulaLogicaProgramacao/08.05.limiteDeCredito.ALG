Algoritmo "limiteDeCredito"

Var
      a : real
      b : real
      c : real
      valor : real

Inicio
      a <- 10000
      b <- 5000
      c <- 1000

      escreval ("Insira o valor desejado:")
      leia (valor)
      
      se valor > 5000 entao
      escreval ("Você é um cliente nivel A, e seu limite de crédito é: R$", a)
      senao
           se valor >= 1000 entao
           escreval ("Você é um cliente nivel B, e seu limite de crédito é: R$", b)
           senao
                escreval("Você é um cliente nivel C, e seu limite de crédito é: R$", c)
           fimse
      fimse
Fimalgoritmo