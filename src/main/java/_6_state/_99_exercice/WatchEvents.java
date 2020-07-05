package _6_state._99_exercice;

import _6_state._99_exercice.state.ShowState;

public class WatchEvents implements Button {
    private Watch watch;
    private ClickEvent ClickEvent;

    public WatchEvents(Watch watch) {
        this.watch = watch;
    }

    @Override
    public void onClickA(String typeClick) {
        if(isDoubleclick(typeClick)) {
            watch.clickA(ClickEvent);
        }
    }

    @Override
    public void onClickB(String typeClick) {
        if(isDoubleclick(typeClick)) {
            watch.clickB(ClickEvent);
        }
    }

    @Override
    public boolean isDoubleclick(String typeClick) {
        if(typeClick.equals("doubleClick")) {
            return true;
        }
        return false;
    }
}