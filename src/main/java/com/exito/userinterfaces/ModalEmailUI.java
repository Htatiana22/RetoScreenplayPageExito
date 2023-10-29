package com.exito.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ModalEmailUI {
    public static final Target LBL_INPUT_EMAIL = Target.the("Enter email")
            .located(By.name("email"));
    public static final Target BTN_CONFIRM = Target.the("Select confirm button")
            .located(By.className("exito-checkout-io-0-x-preLoginActiveButton"));
}
