package _6_state._99_exercice;

import _6_state._2_audiioplayer.ClickEvent;
import _6_state._99_exercice.ClickListener;
import _6_state._99_exercice.state.ShowState;

public class Watch implements ClickListener {
    private int hours = 0;
    private int minutes = 0;

    private StateInterface state = new ShowState(this);

    /**
     * opérations élémentaires
     */
    @Override
    public void clickA(_6_state._99_exercice.ClickEvent clickEvent) {
        state.clickA(clickEvent);
    }

    @Override
    public void clickB(_6_state._99_exercice.ClickEvent clickEvent) {
        state.clickB(clickEvent);
    }

    public void incrementHours() {
        hours++;
    }

    public void incrementMinutes() {
        minutes++;
    }

    public void showTime() {
        System.out.println(hours + ":" + minutes);
    }

    public void changeState(StateInterface state){
        this.state = state;
    }
}