package _6_state._99_exercice.state;

import _6_state._99_exercice.StateInterface;
import _6_state._99_exercice.Watch;

public class ShowState implements StateInterface {
    private Watch watch;

    public ShowState(Watch watch) {
        this.watch = watch;
    }

    @Override
    public void clickA(_6_state._99_exercice.ClickEvent clickEvent) {
        this.watch.changeState(new EditHourState(this.watch));
    }

    @Override
    public void clickB(_6_state._99_exercice.ClickEvent clickEvent) {
        watch.showTime();
    }
}
