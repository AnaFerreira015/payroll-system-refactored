# Payrooll System Refactored

## Long method
Métodos muito longos são difíceis de ler e torna-se difícil acomodar novas alterações nele.
Classes encontradas:
1. Commissioned

O método `calculateCommission` multiplicava a porcentagem diretamente no cálculo. Como solução, criei o método `multipliesCommissionPercentage` e ele é chamado dentro do método `calculateCommission`.

## Repeated code and extensive class
Classes encontradas:
1. Main

Criei uma classe Menu e nela coloquei as op��es dispon�veis, reservando a classe Main apenas para execu��o. Ainda dentro da classe Menu, separei as op��es em m�todos.