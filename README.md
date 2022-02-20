# Payrooll System Refactored

## Long method
M√©todos muito longos s√£o dif√≠ceis de ler e torna-se dif√≠cil acomodar novas altera√ß√µes nele.
Classes encontradas:
1. Commissioned

O m√©todo `calculateCommission` multiplicava a porcentagem diretamente no c√°lculo. Como solu√ß√£o, criei o m√©todo `multipliesCommissionPercentage` e ele √© chamado dentro do m√©todo `calculateCommission`.

## Repeated code and extensive class
Classes encontradas:
1. Main

Criei uma classe Menu e nela coloquei as opÁıes disponÌveis, reservando a classe Main apenas para execuÁ„o. Ainda dentro da classe Menu, separei as opÁıes em mÈtodos.