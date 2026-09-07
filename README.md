# Atividade 06 - Qualidade e Manutenção de Software

### 1. Qual era o principal problema do código original?

O código original concentrava toda a lógica dentro do método main, sem separação de responsabilidades. No mesmo bloco estavam misturados o cálculo da média, a regra de negócio da aprovação e a exibição dos resultados. Além disso, os nomes de variáveis não eram significativos, prejudicando a leitura. Não havia validação das notas informadas. O código não permitia reaproveitamento, qualquer necessidade de utilização futura implicaria em copiar e colar todo o código definido.

### 2. Quais melhorias você realizou?

- Separação de responsabilidades: cada tarefa encontra-se em sua class/função especializada, liberado a main de regras de negócio e validações.
- Criação do pacote servicos para agrupar as classes de serviço.
- FuncoesMedia.calcularMediaAluno(notaN1, notaN2): isola o cálculo da média e inclui uma validação básica, avisando quando são informadas notas negativas.
- FuncoesMedia.calcularAprovacao(mediaAluno): isola a regra de negócio que define se o aluno está "Aprovado" ou "Reprovado".
- IOUtils.exibirAlunoEAprovacao(): centraliza a formatação e a exibição do resultado, montando a saída.
- Nomes descritivos: n, a, b, c foram renomeadas respectivamente para nomeAluno, notaN1, notaN2 e mediaAluno. Além da inclusão da statusAprovacao, deixando o código mais claro.

### 3. Como a modularização facilitou a organização do código?

Ao quebrar o programa em unidades menores FuncoesMedia cuida de cálculo e regra de aprovação, IOUtils cuida da apresentação dos dados e Main apenas consome as funções. Isso propricia o reaproveitamento simples de código, facilita testes, futuras alterações afetam apenas a parte impactada e facilita navegação no projeto.

### 4. Como o Git ajudou a controlar as alterações realizadas no sistema?

- O primeiro commit registrou o código inicial exatamente como foi recebido, servindo de ponto de referência para comparação.
- A refatoração foi feita na branch melhoria-boas-praticas, isolando as mudanças da main até que estivessem prontas.
- O commit da refatoração possui mensagem descritiva indicando seu objetivo.
- O histórico registra a evolução do projeto passo a passo, permitindo reverter para uma versão anterior caso alguma mudança gerasse bug.
- O uso de Pull Request possibilitou revisar as alterações da branch antes de integrá-las à main.
