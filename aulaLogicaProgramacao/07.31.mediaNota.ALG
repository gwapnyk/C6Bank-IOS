Algoritmo "medias"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 

Var
notaUm : real
notaDois : real
notaTres : real
media : real


Inicio
      escreval ("Escreva a primeira nota")
      leia (notaUm)
      escreval ("Escreva a segunda nota")
      leia (notaDois)
      escreval ("Escreva a terceira nota")
      leia (notaTres)
      media <- (notaUm + notaDois + notaTres) / 3
      escreval
      escreval ("A media do aluno é: ", media )
      escreval
      
      se media >= 5 entao
           escreval ("Congratulations!! Você foi aprovado :)")
      senao
           escreval ("Você foi reprovado ;-;")
           escreval ("Estude mais na próxima")
      fimse


Fimalgoritmo