# Cybertron 
# 📝Desafio 1 

# 📑Sobre VCS (Sistema de controle de versão)

# ✔ Definição :

Os **sistemas de controle de versão** são ferramentas de software que ajudam
as equipes de software a gerenciar as alterações ao código-fonte ao longo
do tempo. Como os ambientes de desenvolvimento aceleraram, os sistemas de 
controle de versão ajudam as equipes de software a trabalhar de forma mais
rápida, inteligente e eficaz de organizar seu projeto, pois é possível
acompanhar um histórico de desenvolvimento, desenvolver paralelamente e 
ainda te oferecer outras vantagens, como exemplo, customizar uma versão, 
incluir outros requisitos, finalidades especificas, layout e afins sem 
mexer no projeto principal ou resgatar o sistema em um ponto que estava 
estável, isso tudo sem mexer na versão principal.

# ✔ Vantagens :

**Controle do histórico**: facilidade em desfazer e possibilidade de analisar
o histórico do desenvolvimento, como também facilidade no resgate de 
versões mais antigas e estáveis. A maioria das implementações permitem 
analisar as alterações com detalhes, desde a primeira versão até a última.

**Ramificação de projeto**: a maioria das implementações possibilita a divisão
do projeto em várias linhas de desenvolvimento, que podem ser trabalhadas 
paralelamente, sem que uma interfira na outra.

**Segurança**: Cada software de controle de versão usa mecanismos para evitar
qualquer tipo de invasão de agentes infecciosos nos arquivos. Além do mais,
somente usuários com permissão poderão mexer no código.

**Rastreabilidade**: Com a necessidade de sabermos o local, o estado e a qualidade
de um arquivo; o controle de versão traz todos esses requisitos de forma que o
usuário possa se embasar do arquivo que deseja utilizar.

**Organização**: Alguns softwares disponibilizam uma interface visual onde podem
ser vistos todos os arquivos controlados, desde a origem até o projeto por completo.

# ✔ Exemplos (VCS) :

A **CVS** é uma das ferramentas de controle de software mais antigas no mercado.
A primeira versão dela foi desenvolvida em 1968. Essa ferramenta possui como maior
desvantagem o fato de ser considerada como uma tecnologia antiga. Porém, ainda é
bastante utilizada por equipes de desenvolvedores.

O **TFS** — **sigla para Team Foundation Server** — é uma outra ferramenta de
controle de versão de software que pode ser utilizada na sua empresa. Ele traz uma
série de características interessantes, principalmente se você utiliza metodologias
agile no setor de TI da sua empresa.Isso porque ele possibilita a gestão de projetos
por meio de SCRUM ou CMMI.

O **GIT** é uma das ferramentas de controle de versão de software mais populares, 
principalmente em projetos open source. Isso se deve, principalmente, pela popularidade
do GitHub, uma plataforma para hospedagem de códigos. Apesar de ela poder ser utilizada
em outras ferramentas, o GIT é a que ganhou mais repercussão nesse aspecto. 📝Desafio 2 

# 📑Sobre Programação orientada a objeto (POO)

# ✔ Definição :
A **programação orientada a objeto** e uma essência do java. A metodologia orientada a
objeto é inseparavel da linguagem, e todos os programas de java são pelo meno ate um
certo ponto, orientados a objeto devido a importacia do oop para o java.
Os programas orientados ao objeto funcionam ao contrário. são organizados a partir
dos dados, com o seguinte  princípio-chave :"dados contralado o acesso ao codigo" .
Em uma linguagem orientada a objeto, você define os dados e as rotinas que podem 
atuar sobre eles. Logo, um tipo de dado define precisamente que tipo de operação 
pode ser aplicado a esses dados. Para dar suporte aos principios da programação 
orientada objeto, todas as linguagens oop, inclusive java, têm três características
em comum : abstração, encapsulamento, polimorfismo e herança.

# **Pilares**

# ✔ Abstração :
O processo de abstração em java é usado para ocultar detalhes e mostrar apenas recursos 
essenciais do objeto. tranyando de uma visão externa de um objeto(interface).Tudo que não
sabemos como funciona por baixo dos panos pode ser consideradouma abstração.
       
                    Exemplo de uma classe de abstração :   

                      public class Conta {
                       int numero;
                       double saldo;
                       double limite;

                       void depositar(double valor){
                       this.saldo += valor;
                          }

                     void sacar(double valor){
                     this.saldo -= valor;
                         }

                     void imprimeExtrato(){
                     System.out.println("Saldo: "+this.saldo);
                     }

# ✔ Encapsulamento : 
O encapsulamento é o mecanismo de programação que vincula o codigo e os dados que ele
trata, e isso mantém os dois seguros contra a interferencia e ma utilização externa.Em
uma linguagem orientada a objetos, o código e os dados podem ser vinculados de tal forma
que uma caixa preta autônoma seja criada.Dentro das caixas estão todo o código e os dados 
necessarios.
                    Exemplo de uma classe de encapsulamento:

                        public class Funcionario {
                          private double salario;
                          private String nome;

                         public String getNome() {
                                return nome;
                          }

                          public void setNome(String nome) {
                          this.nome = nome;
                            }

                         public void setSalario(double salario) {
                         this.salario = salario;
                         }

                         public double getSalario() {
                                 return salario;
                          }
                        }


# ✔ Polimorfismo :
É a qualidade que permite que uma interface acesse uma classe geral de ações. A ação 
especifica é determinada pela natureza exata da situação.classes e seus objetos encapsulam,
isto é, contêm seus atributos e métodos. Os atributos e metódos de uma classe (e de seus
objetos) estão intuitamente relacionados. Os objetos podem se comunicar entre si, mas eles
em geral não sabem como outros objetos são implementados. 

                Exemplo de aplicação do polimorfismo :

                public decimal CalcularVendas()

               {

                  decimal valorUnitario = 150;

                  decimal produtosVendidos = 3800;

                  decimal taxaAdicional = 100;

                 return taxaAdicional + (valorUnitario * produtosVendidos);

             }


# ✔ Herança :
É o processo pela qual um objeto pode adquirir as prioridades de outro objetivo. Isso é importante
porque dá suporte ao conceito de classificação hierárquica.se voce pensar bem, grande parte 
do conhecimento pode ser gerenciada por classificação hierarquica. O objeto pode ser criada
convenientemente por meio de herança, chamada subclasse começa com as caracteristicas de uma
classe existente (chamada superclasse), possivelmente personalizando-as e adicionando aspectos
próprios.
               Exemplo de uma hierarquia de classes simples :

                   class twoDShaper{
                    double width;
                    double heigth;

                    void showDim(){
                        system.out.println("width and heigth are" + width + "and" + heiht);
                      }
                   }

                  class Triangule Extends TwoDShaper{
                    String style;

                    double area(){
                        return width * height / 2;
                    }
                    void showStyle(){
                        System.out.println("Triangule is " + style);
                      }
                   }

# ✔ 5 vantagens de Poo :

  ##   ✔ **POO permite que você represente melhor o mundo real em seus programas**.tudo no mundo pode ser descrito como um conjuntode propriedade e ações.

  ##   ✔ **Os programas POO são fáceis de ler e entender**. como você não precisa escrever as propriedadese ações para cada personagem ou sprite.

  ##  ✔ **Pode se mais rápido programar com POO**. POO facilita a reutilização de objetos em outros programas.

  ##  ✔ **É mais facil criar programas**. como a POO te ajuda a eliminar o código desnecessário, é mais fácil criar programas maiores e complexos.

  ##   ✔ **Como os objetivos são autônomos, os programas em POO são mais fáceis de depurar**.