Algoritmo "medias"

Var
notaUm : real
notaDois : real
notaTres : real
media : real


Inicio
      escreval ("Escreva a nota 1")
      leia (notaUm)
      escreval ("Escreva a nota 2")
      leia (notaDois)
      escreval ("Escreva a nota 3")
      leia (notaTres)
      media <- (notaUm + notaDois + notaTres) / 3
      escreval ("A media do aluno é: ", media )
      
      se media >= 5 entao
           escreval ("o Aluno foi aprovado")
      senao
           escreval ("o Aluno foi reprovado")
      fimse


Fimalgoritmo