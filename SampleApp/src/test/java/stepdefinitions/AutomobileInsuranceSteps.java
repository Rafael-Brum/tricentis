package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageobjects.AutomobileInsurancePage;

public class AutomobileInsuranceSteps {
	WebDriver driver;

	@Dado("que o usuario deseja fazer a cotacao do seguro de seu veiculo")
	public void que_o_usuario_deseja_fazer_a_cota_o_do_seguro_de_seu_veiculo() {
		Hooks.abrirUrl("http://sampleapp.tricentis.com/101/app.php");
		driver = Hooks.getDriver();
	}

	@Quando("informar o campo Make como {string}")
	public void informar_o_campo_make_como(String string) {
		AutomobileInsurancePage aip = new AutomobileInsurancePage(driver);
		aip.preencherCampoMake(string);
	}
	@Quando("informar o campo Engine Performance [kW] como {string}")
	public void informar_o_campo_engine_performance_k_w_como(String string) {
		AutomobileInsurancePage aip = new AutomobileInsurancePage(driver);
		aip.preencherCampoEnginePerformance(string);
	}
	@Quando("informar o campo Date of Manufacture como {string}")
	public void informar_o_campo_date_of_manufacture_como(String string) {
		AutomobileInsurancePage aip = new AutomobileInsurancePage(driver);
		aip.preencherCampoDateOfManufacture(string);
	}
	@Quando("informar o campo Number of Seats como {string}")
	public void informar_o_campo_number_of_seats_como(String string) {
		AutomobileInsurancePage aip = new AutomobileInsurancePage(driver);
		aip.preencherCampoNumberOfSeats(string);
	}
	@Quando("informar o campo Fuel Type como {string}")
	public void informar_o_campo_fuel_type_como(String string) {
		AutomobileInsurancePage aip = new AutomobileInsurancePage(driver);
		aip.preencherCampoFuelType(string);
	}
	@Quando("informar o campo List Price [$] como {string}")
	public void informar_o_campo_list_price_$_como(String string) {
		AutomobileInsurancePage aip = new AutomobileInsurancePage(driver);
		aip.preencherCampoListPrice(string);
	}
	@Quando("informar o campo License Plate Number como {string}")
	public void informar_o_campo_license_plate_number_como(String string) {
		AutomobileInsurancePage aip = new AutomobileInsurancePage(driver);
		aip.preencherCampoLicensePlateNumber(string);
	}
	@Quando("informar o campo Annual Mileage [mi] como {string}")
	public void informar_o_campo_annual_mileage_mi_como(String string) {
		AutomobileInsurancePage aip = new AutomobileInsurancePage(driver);
		aip.preencherCampoAnnualMileage(string);
	}
	@Quando("clicar no botao Next")
	public void clicar_no_botao_next() {
		AutomobileInsurancePage aip = new AutomobileInsurancePage(driver);
		aip.clicarNextEnterInsurantData();
	}
	@Entao("o sistema devera cadastrar o veiculo, exibindo pagina de dados do seguro.")
	public void o_sistema_devera_cadastrar_o_veiculo_exibindo_pagina_de_dados_do_seguro() {
		AutomobileInsurancePage aip = new AutomobileInsurancePage(driver);
		aip.validarCampoFirstName();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}



}
