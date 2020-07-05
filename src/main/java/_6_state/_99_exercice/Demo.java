package _6_state._99_exercice;

public class Demo {
    private static ClickEvent ClickEvent;

    public static void main(String[] args) {
        Watch watch = new Watch();

        WatchEvents watchEvents = new WatchEvents(watch);

        watchEvents.onClickA("doubleClick");
        watchEvents.onClickB("doubleClick");

        watchEvents.onClickA("doubleClick");
        watchEvents.onClickB("doubleClick");
        watchEvents.onClickB("doubleClick");

        watchEvents.onClickA("doubleClick");
        watchEvents.onClickB("doubleClick");
    }
}