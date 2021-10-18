package utils;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepdefinitions.Hooks;

public class MetodosUteis {
	
	protected WebDriver driver;
	
	public void esperarElemento(WebElement elemento) {
		driver = Hooks.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(elemento));
	}
	
	public void selecionarDropDown(WebElement elemento, String texto) {
		driver = Hooks.getDriver();
		Select dropDown = new Select(elemento);
		dropDown.selectByVisibleText(texto);
	}
	
	public void selecionarRadioButton(WebElement elemento, String texto) {
		driver = Hooks.getDriver();
		assertTrue(elemento.getAttribute("value").equals(texto));
		elemento.click();
	}
	
}
