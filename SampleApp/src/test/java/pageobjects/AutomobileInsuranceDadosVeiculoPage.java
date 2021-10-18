package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class AutomobileInsuranceDadosVeiculoPage extends MetodosUteis{

	protected WebDriver driver;
	
	public AutomobileInsuranceDadosVeiculoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how = How.ID, using = "make")
	private WebElement campoMake;
	
	@FindBy (how = How.ID, using = "engineperformance")
	private WebElement campoEnginePerformance;
	
	@FindBy (how = How.ID, using = "dateofmanufacture")
	private WebElement campoDateOfManufacture;
	
	@FindBy (how = How.ID, using = "numberofseats")
	private WebElement campoNumberOfSeats;
	
	@FindBy (how = How.ID, using = "fuel")
	private WebElement campoFuelType;
	
	@FindBy (how = How.ID, using = "listprice")
	private WebElement campoListPrice;
	
	@FindBy (how = How.ID, using = "licenseplatenumber")
	private WebElement campoLicensePlateNumber;
	
	@FindBy (how = How.ID, using = "annualmileage")
	private WebElement campoAnnualMileage;
	
	@FindBy (how = How.ID, using = "nextenterinsurantdata")
	private WebElement btnNextEnterInsurantData;

	@FindBy (how = How.ID, using = "firstname")
	private WebElement campoFirstName;
	
	public void preencherCampoMake(String marca) {
		esperarElemento(campoMake);
		selecionarDropDown(campoMake,marca);
	}
	
	public void preencherCampoEnginePerformance(String quilometragem) {
		esperarElemento(campoEnginePerformance);
		campoEnginePerformance.clear();
		campoEnginePerformance.sendKeys(quilometragem);
	}
	
	public void preencherCampoDateOfManufacture(String dataDeFabricacao) {
		esperarElemento(campoDateOfManufacture);
		campoDateOfManufacture.clear();
		campoDateOfManufacture.sendKeys(dataDeFabricacao);
	}
	
	public void preencherCampoNumberOfSeats(String numeroDeLugares) {
		esperarElemento(campoNumberOfSeats);
		selecionarDropDown(campoNumberOfSeats,numeroDeLugares);
	}
	
	public void preencherCampoFuelType(String tipoDeCombustivel) {
		esperarElemento(campoFuelType);
		selecionarDropDown(campoFuelType,tipoDeCombustivel);
	}
	
	public void preencherCampoListPrice(String listaDePreco) {
		esperarElemento(campoListPrice);
		campoListPrice.clear();
		campoListPrice.sendKeys(listaDePreco);
	}
	
	public void preencherCampoLicensePlateNumber(String placaDoCarro) {
		esperarElemento(campoLicensePlateNumber);
		campoLicensePlateNumber.clear();
		campoLicensePlateNumber.sendKeys(placaDoCarro);
	}
	
	public void preencherCampoAnnualMileage(String quilometragemAnual) {
		esperarElemento(campoAnnualMileage);
		campoAnnualMileage.clear();
		campoAnnualMileage.sendKeys(quilometragemAnual);
	}
	
	public void clicarNextEnterInsurantData() {
		esperarElemento(btnNextEnterInsurantData);
		btnNextEnterInsurantData.click();
	}

	public void validarCampoFirstName() {
		esperarElemento(campoFirstName);
		assertTrue(campoFirstName.isEnabled());
	}
}
