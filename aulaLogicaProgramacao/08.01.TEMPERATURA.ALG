Algoritmo "temperatura"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 

Var
diaUm : real
diaDois : real
diaTres : real
media : real


Inicio
      escreval ("Escreva a temperatura do primeiro dia")
      leia (diaUm)
      escreval ("Escreva a temperatura do segundo dia")
      leia (diaDois)
      escreval ("Escreva a temperatura do terceiro dia")
      leia (diaTres)
      media <- (diaUm + diaDois + diaTres) / 3
      escreval
      escreval ("A termperatura média do ambiente é: ", media )
      escreval
      
      se media < 15 entao
           escreval ("O Clima está frio")
      senao
           se media <= 25 entao
                escreval ("O Clima está agradavel")
           senao
                escreval ("O Clima está quente")
           fimse
      fimse


Fimalgoritmo