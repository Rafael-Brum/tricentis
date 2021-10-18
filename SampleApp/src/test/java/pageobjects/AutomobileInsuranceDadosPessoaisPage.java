package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class AutomobileInsuranceDadosPessoaisPage extends MetodosUteis{

	protected WebDriver driver;
	
	public AutomobileInsuranceDadosPessoaisPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how = How.ID, using = "primeiroNome")
	private WebElement campoFirstName;
	
	@FindBy (how = How.ID, using = "ultimoNome")
	private WebElement campoLastName;
	
	@FindBy (how = How.ID, using = "dataDoAniversario")
	private WebElement campoDateOfBirth;
	
	@FindBy (how = How.ID, using = "genero")
	private WebElement campoGender;
	
	@FindBy (how = How.ID, using = "endereco")
	private WebElement campoStreetAdress;
	
	@FindBy (how = How.ID, using = "pais")
	private WebElement campoCountry;
	
	@FindBy (how = How.ID, using = "cep")
	private WebElement campoZipCode;
	
	@FindBy (how = How.ID, using = "cidade")
	private WebElement campoCity;
	
	@FindBy (how = How.ID, using = "ocupacao")
	private WebElement campoOccupation;
	
	@FindBy (how = How.ID, using = "hobbie")
	private WebElement campoHobbies;
	
	@FindBy (how = How.ID, using = "site")
	private WebElement campoWebSite;
	
	@FindBy (how = How.ID, using = "foto")
	private WebElement campoPicture;
	
	@FindBy (how = How.ID, using = "nextenterinsurantdata")
	private WebElement btnNextEnterInsurantData;

	public void validarCampoFirstName() {
		esperarElemento(campoFirstName);
		assertTrue(campoFirstName.isEnabled());
	}
	
	public void preencherCampoFirstName(String marca) {
		esperarElemento(campoFirstName);
		selecionarDropDown(campoFirstName,marca);
	}
	
	public void preencherCampoLastName(String marca) {
		esperarElemento(campoLastName);
		selecionarDropDown(campoLastName,marca);
	}
	
	public void preencherCampoDateOfBirth(String quilometragem) {
		esperarElemento(campoDateOfBirth);
		campoDateOfBirth.clear();
		campoDateOfBirth.sendKeys(quilometragem);
	}
	
	public void preencherCampoGender(String dataDeFabricacao) {
		esperarElemento(campoGender);
		campoGender.clear();
		campoGender.sendKeys(dataDeFabricacao);
	}
	
	public void preencherCampoStreetAdress(String numeroDeLugares) {
		esperarElemento(campoStreetAdress);
		selecionarDropDown(campoStreetAdress,numeroDeLugares);
	}
	
	public void preencherCampoFuelType(String tipoDeCombustivel) {
		esperarElemento(campoCountry);
		selecionarDropDown(campoCountry,tipoDeCombustivel);
	}
	
	public void preencherCampoListPrice(String listaDePreco) {
		esperarElemento(campoZipCode);
		campoZipCode.clear();
		campoZipCode.sendKeys(listaDePreco);
	}
	
	public void preencherCampoLicensePlateNumber(String placaDoCarro) {
		esperarElemento(campoCity);
		campoCity.clear();
		campoCity.sendKeys(placaDoCarro);
	}
	
	public void preencherCampoAnnualMileage(String quilometragemAnual) {
		esperarElemento(campoOccupation);
		campoOccupation.clear();
		campoOccupation.sendKeys(quilometragemAnual);
	}
	
	public void clicarNextEnterInsurantData() {
		esperarElemento(btnNextEnterInsurantData);
		btnNextEnterInsurantData.click();
	}
}
