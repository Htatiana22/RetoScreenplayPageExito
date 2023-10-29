package com.exito.tasks;

import com.exito.utils.EnterData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.exito.userinterfaces.ModalEmailUI.BTN_CONFIRM;
import static com.exito.userinterfaces.ModalEmailUI.LBL_INPUT_EMAIL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ModalEmailTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(EnterData.extractTo().get(0).get("Email")).into(LBL_INPUT_EMAIL),
                Click.on(BTN_CONFIRM)
        );
    }
    public static ModalEmailTask confirm(){
        return instrumented(ModalEmailTask.class);
    }
}
