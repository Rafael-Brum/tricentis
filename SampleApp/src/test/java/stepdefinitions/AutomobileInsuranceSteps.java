package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageobjects.AutomobileInsuranceDadosVeiculoPage;

public class AutomobileInsuranceSteps {
	WebDriver driver;

	@Dado("que o usuario deseja fazer a cotacao do seguro de seu veiculo")
	public void que_o_usuario_deseja_fazer_a_cota_o_do_seguro_de_seu_veiculo() {
		Hooks.abrirUrl("http://sampleapp.tricentis.com/101/app.php");
		driver = Hooks.getDriver();
	}

	@Quando("informar o campo Make como {string}")
	public void informar_o_campo_make_como(String string) {
		AutomobileInsuranceDadosVeiculoPage aip = new AutomobileInsuranceDadosVeiculoPage(driver);
		aip.preencherCampoMake(string);
	}
	@Quando("informar o campo Engine Performance [kW] como {string}")
	public void informar_o_campo_engine_performance_k_w_como(String string) {
		AutomobileInsuranceDadosVeiculoPage aip = new AutomobileInsuranceDadosVeiculoPage(driver);
		aip.preencherCampoEnginePerformance(string);
	}
	@Quando("informar o campo Date of Manufacture como {string}")
	public void informar_o_campo_date_of_manufacture_como(String string) {
		AutomobileInsuranceDadosVeiculoPage aip = new AutomobileInsuranceDadosVeiculoPage(driver);
		aip.preencherCampoDateOfManufacture(string);
	}
	@Quando("informar o campo Number of Seats como {string}")
	public void informar_o_campo_number_of_seats_como(String string) {
		AutomobileInsuranceDadosVeiculoPage aip = new AutomobileInsuranceDadosVeiculoPage(driver);
		aip.preencherCampoNumberOfSeats(string);
	}
	@Quando("informar o campo Fuel Type como {string}")
	public void informar_o_campo_fuel_type_como(String string) {
		AutomobileInsuranceDadosVeiculoPage aip = new AutomobileInsuranceDadosVeiculoPage(driver);
		aip.preencherCampoFuelType(string);
	}
	@Quando("informar o campo List Price [$] como {string}")
	public void informar_o_campo_list_price_$_como(String string) {
		AutomobileInsuranceDadosVeiculoPage aip = new AutomobileInsuranceDadosVeiculoPage(driver);
		aip.preencherCampoListPrice(string);
	}
	@Quando("informar o campo License Plate Number como {string}")
	public void informar_o_campo_license_plate_number_como(String string) {
		AutomobileInsuranceDadosVeiculoPage aip = new AutomobileInsuranceDadosVeiculoPage(driver);
		aip.preencherCampoLicensePlateNumber(string);
	}
	@Quando("informar o campo Annual Mileage [mi] como {string}")
	public void informar_o_campo_annual_mileage_mi_como(String string) {
		AutomobileInsuranceDadosVeiculoPage aip = new AutomobileInsuranceDadosVeiculoPage(driver);
		aip.preencherCampoAnnualMileage(string);
	}
	@Quando("clicar no botao Next para entrar na pagina de dados do segurado")
	public void clicar_no_botao_next_para_entrar_na_pagina_de_dados_do_segurado() {
		AutomobileInsuranceDadosVeiculoPage aip = new AutomobileInsuranceDadosVeiculoPage(driver);
		aip.clicarNextEnterInsurantData();
	}
	@Entao("o sistema devera cadastrar o veiculo, exibindo pagina de dados do segurado.")
	public void o_sistema_devera_cadastrar_o_veiculo_exibindo_pagina_de_dados_do_segurado() {
		AutomobileInsuranceDadosVeiculoPage aip = new AutomobileInsuranceDadosVeiculoPage(driver);
		aip.validarCampoFirstName();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	//CENÁRIO DE DADOS DO SEGURADO
	
	@Quando("informar o campo First Name como {string}")
	public void informar_o_campo_first_name_como(String string) {
		AutomobileInsuranceDadosVeiculoPage aip = new AutomobileInsuranceDadosVeiculoPage(driver);
		aip.preencherCampoFirstName(string);
	}

	@Quando("informar o campo Last Name como {string}")
	public void informar_o_campo_last_name_como(String string) {
		AutomobileInsuranceDadosVeiculoPage aip = new AutomobileInsuranceDadosVeiculoPage(driver);
		aip.preencherCampoLastName(string);
	}

	@Quando("informar o campo Date of Birth como {string}")
	public void informar_o_campo_date_of_birth_como(String string) {
		AutomobileInsuranceDadosVeiculoPage aip = new AutomobileInsuranceDadosVeiculoPage(driver);
		aip.preencherCampoDateOfBirth(string);
	}

	@Quando("informar o campo Gender como {string}")
	public void informar_o_campo_gender_como(String string) {
		AutomobileInsuranceDadosVeiculoPage aip = new AutomobileInsuranceDadosVeiculoPage(driver);
		aip.preencherCampoGender(string);
	}

	@Quando("informar o campo Street Address como {string}")
	public void informar_o_campo_street_address_como(String string) {
		AutomobileInsuranceDadosVeiculoPage aip = new AutomobileInsuranceDadosVeiculoPage(driver);
		aip.preencherCampoStreetAddress(string);
	}

	@Quando("informar o campo Country como {string}")
	public void informar_o_campo_country_como(String string) {
		AutomobileInsuranceDadosVeiculoPage aip = new AutomobileInsuranceDadosVeiculoPage(driver);
		aip.preencherCampoCountry(string);
	}

	@Quando("informar o campo Zip Code como {string}")
	public void informar_o_campo_zip_code_como(String string) {
		AutomobileInsuranceDadosVeiculoPage aip = new AutomobileInsuranceDadosVeiculoPage(driver);
		aip.preencherCampoZipCode(string);
	}

	@Quando("informar o campo City como {string}")
	public void informar_o_campo_city_como(String string) {
		AutomobileInsuranceDadosVeiculoPage aip = new AutomobileInsuranceDadosVeiculoPage(driver);
		aip.preencherCampoCity(string);
	}

	@Quando("clicar no botao Next para entrar na pagina de produto")
	public void clicar_no_botao_next_para_entrar_na_pagina_de_produto() {
		AutomobileInsuranceDadosVeiculoPage aip = new AutomobileInsuranceDadosVeiculoPage(driver);
		aip.clicarNextEnterProductData();
	}

	@Entao("o sistema devera cadastrar o dado do segurado, exibindo pagina de produtos do seguro.")
	public void o_sistema_devera_cadastrar_o_dado_do_segurado_exibindo_pagina_de_produtos_do_seguro() {
		AutomobileInsuranceDadosVeiculoPage aip = new AutomobileInsuranceDadosVeiculoPage(driver);
		aip.validarCampoStartDate();
	}


}
