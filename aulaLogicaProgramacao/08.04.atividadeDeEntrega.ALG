Algoritmo "media"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Jhonatan

Var
nomeDoAluno : caracter
primeiraNota : real
segundaNota : real
media : real


Inicio
      escreval ("Escreva o seu nome")
      leia (nomeDoAluno)
      escreval ("Escreva a primeira nota")
      leia (primeiraNota)
      escreval ("Escreva a segunda nota")
      leia (segundaNota)
      media <- (primeiraNota + segundaNota) / 2
      escreval
      
      se media >= 7 entao
           escreval (nomeDoAluno, " a sua media é:", media, " Congratulations!! Você foi aprovado :)")
      senao
           escreval (nomeDoAluno, " a sua media é:", media, " Você foi reprovado ;-;")
           escreval ("Estude mais na próxima")
      fimse


Fimalgoritmo