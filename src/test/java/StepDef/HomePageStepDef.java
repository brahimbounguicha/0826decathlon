package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageStepDef {

@Given("utilisateur est sur home page")
public void utilisateur_est_sur_home_page() throws Exception {
Config.driver = new ChromeDriver();
Config.maximizeWindow();
Config.driver.get(Utils.getProperty("homeDecathlon"));
}
@When("utilisateur clique sur {string} & le sous menu {string}")
public void utilisateur_clique_sur_le_sous_menu(String menuName, String subMenuName) {
	HomePage page = new HomePage();
	page.clickOnMenu(menuName, subMenuName);
   
}
@Then("utilisateur est sur la page de {string}")
public void utilisateur_est_sur_la_page_de(String subMenuName) {
	HomePage page = new HomePage();
	page.verifProd(subMenuName);
	Config.driver.quit();
}

}
