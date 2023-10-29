package com.exito.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static com.exito.userinterfaces.ProductsPageUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class ProductsPageTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LBL_PRODUCT_NAME),
                Click.on(BTN_BUY_NOW)
        );
    }
    public static ProductsPageTask select(){
        return instrumented(ProductsPageTask.class);
    }
}
