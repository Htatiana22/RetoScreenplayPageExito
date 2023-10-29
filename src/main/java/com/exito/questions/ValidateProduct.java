package com.exito.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.exito.userinterfaces.ValidateProductUI.LBL_PRODUCT_NAME;

public class ValidateProduct implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade productName = LBL_PRODUCT_NAME.resolveFor(actor);
        return productName.isDisplayed();
    }
    public static ValidateProduct productName(){
        return new ValidateProduct();
    }
}
