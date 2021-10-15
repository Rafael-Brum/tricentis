package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class AutomobileInsurancePage extends MetodosUteis{

	public AutomobileInsurancePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how = How.ID, using = "make")
	private WebElement make;
	
	@FindBy (how = How.ID, using = "engineperformance")
	private WebElement engineperformance;
	
	@FindBy (how = How.ID, using = "dateofmanufacture")
	private WebElement dateofmanufacture;
	
	@FindBy (how = How.ID, using = "numberofseats")
	private WebElement numberofseats;
	
	@FindBy (how = How.ID, using = "fuel")
	private WebElement fuelType;
	
	@FindBy (how = How.ID, using = "listprice")
	private WebElement listprice;
	
	@FindBy (how = How.ID, using = "licenseplatenumber")
	private WebElement licenseplatenumber;
	
	@FindBy (how = How.ID, using = "annualmileage")
	private WebElement annualmileage;
	
	@FindBy (how = How.ID, using = "nextenterinsurantdata")
	private WebElement nextenterinsurantdata;

	@FindBy (how = How.ID, using = "firstname")
	private WebElement firstname;
	
	public void clicarNextEnterInsurantData() {
		nextenterinsurantdata.click();
	}
	
	public void preencherCampoMake(String marca) {
		selecionar(make,marca);
	}
	
	public void preencherCampoEnginePerformance(String quilometragem) {
		engineperformance.sendKeys(quilometragem);
	}
	
	public void preencherCampoDateOfManufacture(String dataDeFabricacao) {
		dateofmanufacture.sendKeys(dataDeFabricacao);
	}
	
	public void preencherCampoNumberOfSeats(String numeroDeLugares) {
		selecionar(numberofseats,numeroDeLugares);
	}
	
	public void preencherCampoFuelType(String tipoDeCombustivel) {
		selecionar(fuelType,tipoDeCombustivel);
	}
	
	public void preencherCampoListPrice(String listaDePreco) {
		listprice.sendKeys(listaDePreco);
	}
	
	public void preencherCampoLicensePlateNumber(String placaDoCarro) {
		licenseplatenumber.sendKeys(placaDoCarro);
	}
	
	public void preencherCampoAnnualMileage(String quilometragemAnual) {
		annualmileage.sendKeys(quilometragemAnual);
	}

	public void validarNextEnterInsurantData() {
		assertTrue(firstname.isEnabled());
	}
	
	
}
