package com.exito.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI {
    public static final Target TXT_SEARCH = Target.the("Enter product name")
            .located(By.id("downshift-0-input"));
}
