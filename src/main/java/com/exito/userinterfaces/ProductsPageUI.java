package com.exito.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsPageUI {
    public static final Target LBL_PRODUCT_NAME = Target.the("Select product")
            .located(By.cssSelector("a[href='/audifonos-lenovo-gamer-lp6-lp7-tws-inalambricos-101452810-mp/p']"));
    public static final Target BTN_BUY_NOW = Target.the("Select buy now")
            .located(By.cssSelector(".exito-product-details-3-x-classForMainOffer .exito-vtex-components-4-x-mainBuyButtonNow button"));
}



