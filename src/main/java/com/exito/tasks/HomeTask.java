package com.exito.tasks;

import com.exito.utils.EnterData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.exito.userinterfaces.HomeUI.TXT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class HomeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(EnterData.extractTo().get(0).get("ProductName")).into(TXT_SEARCH).thenHit(Keys.ENTER)
        );
    }
    public static HomeTask search(){
        return instrumented(HomeTask.class);
    }
}
