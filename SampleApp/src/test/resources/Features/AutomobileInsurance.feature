#language:pt
@AutomobileInsurance @End2End
Funcionalidade: Automobile Insurance

  Contexto: 
    Dado que o usuario deseja fazer a cotacao do seguro de seu veiculo

  @CadastrarVeiculoSucesso
  Esquema do Cenario: Cadastrar Veiculo com Sucesso
    Quando informar o campo Make como "<marca>"
    E informar o campo Engine Performance [kW] como "<quilometragem>"
    E informar o campo Date of Manufacture como "<dataDaFabricacao>"
    E informar o campo Number of Seats como "<numeroDeLugares>"
    E informar o campo Fuel Type como "<tipoDeCombustivel>"
    E informar o campo List Price [$] como "<listaDePreco>"
    E informar o campo License Plate Number como "<placaDoCarro>"
    E informar o campo Annual Mileage [mi] como "<quilometragemAnual>"
    E clicar no botao Next para entrar na pagina de dados do segurado
    Entao o sistema devera cadastrar o veiculo, exibindo pagina de dados do segurado.

    Exemplos: 
      | marca | quilometragem | dataDaFabricacao | numeroDeLugares | tipoDeCombustivel | listaDePreco | placaDoCarro | quilometragemAnual |
      | Audi  |           500 | 10/13/2021       |               5 | Gas               |          500 | PAA 7978     |                244 |

  @CadastrarDadosSeguroSucesso
  Esquema do Cenario: Cadastrar Dados do Seguro com Sucesso
    Quando informar o campo First Name como "<primeiroNome>"
    E informar o campo Last Name como "<ultimoNome>"
    E informar o campo Date of Birth como "<dataDoAniversário>"
    E informar o campo Gender como "<genero>"
    E informar o campo Street Address como "<endereco>"
    E informar o campo Country como "<pais>"
    E informar o campo Zip Code como "<cep>"
    E informar o campo City como "<cidade>"
    E clicar no botao Next para entrar na pagina de produto
    Entao o sistema devera cadastrar o dado do segurado, exibindo pagina de produtos do seguro.

    Exemplos: 
      | primeiroNome | ultimoNome | dataDoAniversario | genero | endereco         | pais   | cep      | cidade   |
      | Lionel       | Messi      | 10/13/1989        | Male   | Rua 500 Lote 800 | Brazil | 71100100 | Brasilia |
