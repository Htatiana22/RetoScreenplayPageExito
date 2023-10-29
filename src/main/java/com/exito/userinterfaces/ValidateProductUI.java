package com.exito.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidateProductUI {

    public static final Target LBL_PRODUCT_NAME = Target.the("Validate Product Name")
            .located(By.xpath("//span[text()=\"Audifonos Gamer Bluetooth Lenovo Livepods Lp6 Tws Inalámbricos\"]"));
}
