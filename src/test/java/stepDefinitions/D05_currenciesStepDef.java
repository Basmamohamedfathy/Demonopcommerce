package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.P03_homePage;


public class D05_currenciesStepDef {
    P03_homePage home =new P03_homePage();
    @Given("Navigate to Home and Select “Euro” from currency dropdown list")
    public void select()
    {
         home.currencies_list() .click();

      }


}
