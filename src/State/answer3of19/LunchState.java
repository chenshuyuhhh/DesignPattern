package State.answer3of19;

/**
 * 增加新的"午餐时间（12：00-12：59）状态"
 */

public class LunchState implements State {
    private static State lunchState = new LunchState();
    private LunchState(){}
    public synchronized static State getInstance(){
        return lunchState;
    }

    @Override
    public void doClock(Context context, int hour) {
        if ((hour<12&&8<hour)||(hour>12&&hour<17)) context.changeState(DayState.getInstance());
        else if (hour<9 || hour > 17) context.changeState(NightState.getInstance());
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("紧急，中午使用金库！");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（中午）");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("中午的通话记录");
    }

    public String toString(){
        return "[中午]";
    }
}
