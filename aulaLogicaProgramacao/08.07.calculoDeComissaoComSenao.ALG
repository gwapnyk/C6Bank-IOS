Algoritmo "calculoDeComissaoComSenao"

Var
   totalDeVendas : real
   totalDaComissao : real

Inicio
   escreval ("Escreva qual foi o total das suas vendas")
   leia (totalDeVendas)

   se totalDeVendas > 5000 entao
      totalDaComissao <- totalDeVendas * 0.15
      escreval ("O total das suas vendas foi superior a R$5.000,00")
      escreval ("Você receba 15% de comissão no próximo pagamento que é: R$", totalDaComissao)
   senao
      totalDaComissao <- totalDeVendas * 0.03
      escreval ("Voce recebera 3% de comissão no próximo pagamento que é: R$", totalDaComissao)
   fimse
Fimalgoritmo