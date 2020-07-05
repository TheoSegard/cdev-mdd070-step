package _6_state._99_exercice.state;

import _6_state._2_audiioplayer.AudioPlayer;
import _6_state._2_audiioplayer.ClickEvent;
import _6_state._2_audiioplayer.State;
import _6_state._99_exercice.StateInterface;
import _6_state._99_exercice.Watch;

public class ShowState implements StateInterface {
    private Watch watch;

    public ShowState(Watch watch) {
        this.watch = watch;
    }

    @Override
    public void clickLock(ClickEvent clickEvent) {

    }

    @Override
    public void clickPlay(ClickEvent clickEvent) {

    }

    @Override
    public void clickNext(ClickEvent clickEvent) {

    }

    @Override
    public void clickPrevious(ClickEvent clickEvent) {

    }
}
