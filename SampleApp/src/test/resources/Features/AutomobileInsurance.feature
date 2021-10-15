#language:pt
Funcionalidade: Automobile Insurance

  Contexto: 
    Dado que o usuario deseja fazer a cotacao do seguro de seu veiculo

  Esquema do Cenario: Cadastrar Veiculo com Sucesso
    Quando informar o campo Make como "<marca>"
    E informar o campo Engine Performance [kW] como "<quilometragem>"
    E informar o campo Date of Manufacture como "<dataDaFabricacao>"
    E informar o campo Number of Seats como "<numeroDeLugares>"
    E informar o campo Fuel Type como "<tipoDeCombustivel>"
    E informar o campo List Price [$] como "<listaDePreco>"
    E informar o campo License Plate Number como "<placaDoCarro>"
    E informar o campo Annual Mileage [mi] como "<quilometragemAnual>"
    E clicar no botao Next
    Entao o sistema devera cadastrar o veiculo, exibindo pagina de dados do seguro.

    Exemplos: 
      | marca | quilometragem | dataDaFabricacao | numeroDeLugares | tipoDeCombustivel | listaDePreco | placaDoCarro | quilometragemAnual |
      | Audi  |           500 | 10/13/2021       |               5 | Gas               |          500 | PAA 7978     |                244 |

