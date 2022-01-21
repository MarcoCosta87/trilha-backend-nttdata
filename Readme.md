#  Desafio 6

## Data Transfer Object(DTO) responsavel por tranferir objetos é um padrão usado para transporte de dados entre diferentes componentes do sistema, com ideia de agrupar conjuntos de atributos numa classe de maneira agil que possa otimizar a comunicação. O DTO não possui nenhum tipo de comportamento a não ser de armazenamento dos proprios dados, não contem regra de negocios que necessitem de teste. São importantes no proposito de contorna problamas de serealização do EJB, apresentam os dados usados de forma ordenada antes de ir para a camada de apresentação. Facilita atualização do banco de dados refatorando ou migrando o branco sem que alteração impacte no cliente.
## Importante no versionamento e retrocompatibilidade principalemnete quando se tem uma api de uso publico e varios clientes .

