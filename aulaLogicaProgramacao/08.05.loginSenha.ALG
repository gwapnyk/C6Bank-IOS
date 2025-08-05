Algoritmo "loginSenha"

Var
   login : caracter
   senha : caracter
   a : caracter
   b : caracter

Inicio
   login <- "gabryelwapnyk"
   senha <- "gabryel123"
   
   escreval ("Primeiro insira o Login")
   leia (a)
   escreval ("Agora insira a senha")
   leia (b)
   
   se (a = login) e (b = senha) entao
   escreval ("Bem-vind*s ao sistema")
   senao
   escreval ("Você errou a senha")
   fimse

Fimalgoritmo