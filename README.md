# Payrooll System Refactored

## Long method
Métodos muito longos são difíceis de ler e torna-se difícil acomodar novas alterações nele.
Classes encontradas:
1. Commissioned

O método `calculateCommission` multiplicava a porcentagem diretamente no cálculo. Como solução, criei o método `multipliesCommissionPercentage` e ele é chamado dentro do método `calculateCommission`.

## Repeated code and extensive class
Classes encontradas:
1. Main

Criei uma classe Menu e nela coloquei as opções disponíveis, reservando a classe Main apenas para execução. Ainda dentro da classe Menu, separei as opções em métodos.

## Generative Speculation
Classes encontradas:
1. Commissioned
2. Hourly
3. Salaried
4. Sale
5. Schedule

Haviam métodos getters e setters que nunca eram utilizados, portanto, removi-os.