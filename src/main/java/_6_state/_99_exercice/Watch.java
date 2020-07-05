package _6_state._99_exercice;

import _6_state._2_audiioplayer.ClickEvent;
import _6_state._99_exercice.state.ShowState;

public class Watch {
    private int hours = 0;
    private int minutes = 0;

    private StateInterface state = new ShowState(this);

    /**
     * opérations élémentaires
     */
    public void clickLock(_6_state._99_exercice.ClickEvent clickEvent) {
        state.clickLock(clickEvent);
    }

    public void clickPlay(_6_state._99_exercice.ClickEvent clickEvent) {
        state.clickPlay(clickEvent);
    }

    public void clickNext(_6_state._99_exercice.ClickEvent clickEvent) {
        state.clickNext(clickEvent);
    }

    public void clickPrevious(ClickEvent clickEvent) {
        state.clickPrevious(clickEvent);
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

    public void clickButton1() {
        switch (state) {
            case SHOW:
                state = State.EDIT_HOURS;
                break;
            case EDIT_HOURS:
                state = State.EDITS_MINUTES;
                break;
            case EDITS_MINUTES:
                state = State.SHOW;
                break;
        }
    }

    public void clickButton2() {
        switch (state) {
            case SHOW:
                // nothing
                break;
            case EDIT_HOURS:
                incrementHours();
                break;
            case EDITS_MINUTES:
                incrementMinutes();
                break;
        }
    }
}
