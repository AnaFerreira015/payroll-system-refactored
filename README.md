# Payrooll System Refactored

## Long Method
M�todos muito longos s�o dif�ceis de ler e torna-se dif�cil acomodar novas altera��es nele.
Classes encontradas:
1. Commissioned
O m�todo `calculateCommission` multiplicava a porcentagem diretamente no c�lculo. Como solu��o, criei o m�todo `multipliesCommissionPercentage` e ele � chamado dentro do m�todo `calculateCommission`.