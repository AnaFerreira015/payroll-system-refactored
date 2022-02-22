# Payrooll System Refactored

## Long method
M�todos muito longos s�o dif�ceis de ler e torna-se dif�cil acomodar novas altera��es nele.
Classes encontradas:
1. Commissioned

O m�todo `calculateCommission` multiplicava a porcentagem diretamente no c�lculo. Como solu��o, criei o m�todo `multipliesCommissionPercentage` e ele � chamado dentro do m�todo `calculateCommission`.

## Repeated code and extensive class
Classes encontradas:
1. Main

Criei uma classe Menu e nela coloquei as op��es dispon�veis, reservando a classe Main apenas para execu��o. Ainda dentro da classe Menu, separei as op��es em m�todos.

## Generative Speculation
Classes encontradas:
1. Commissioned
2. Hourly
3. Salaried
4. Sale
5. Schedule

Haviam m�todos getters e setters que nunca eram utilizados, portanto, removi-os.