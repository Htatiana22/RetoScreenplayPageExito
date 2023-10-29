package com.exito.stepdefinitions;

import com.exito.questions.ValidateProduct;
import com.exito.tasks.HomeTask;
import com.exito.tasks.ModalEmailTask;
import com.exito.tasks.ProductsPageTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AddProductStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;

    @Before
    public void setStage(){
        setTheStage( new OnlineCast());
    }
    @Given("The user opens the Success page and searches for any product.")
    public void theUserOpensTheSuccessPageAndSearchesForAnyProduct() {
        theActorCalled("Usuario").wasAbleTo(
                Open.url("https://www.exito.com/"),
                HomeTask.search()
        );

    }
    @When("The user clicks the Add to Cart button.")
    public void theUserClicksTheAddToCartButton() {
        theActorInTheSpotlight().attemptsTo(
                ProductsPageTask.select(),
                ModalEmailTask.confirm()
        );
    }
    @Then("The user validates that the selected product has been successfully added")
    public void theUserValidatesThatTheSelectedProductHasBeenSuccessfullyAdded() {
        theActorInTheSpotlight().should(
                seeThat(
                    ValidateProduct.productName(), Matchers.equalTo(true)
                )
        );
    }
}
