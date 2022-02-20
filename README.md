# Payrooll System Refactored

## Long Method
Métodos muito longos são difíceis de ler e torna-se difícil acomodar novas alterações nele.
Classes encontradas:
1. Commissioned
O método `calculateCommission` multiplicava a porcentagem diretamente no cálculo. Como solução, criei o método `multipliesCommissionPercentage` e ele é chamado dentro do método `calculateCommission`.