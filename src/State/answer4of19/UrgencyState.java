package State.answer4of19;

/**
 * 增加新的"紧急情况"状态
 */
public class UrgencyState implements State {
    private static UrgencyState state = new UrgencyState();
    private UrgencyState(){}
    public synchronized static State getInstance(){
        return state;
    }

    @Override
    public void doClock(Context context, int hour) {

    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("紧急,紧急状况下使用金库！");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("紧急，紧急状况下按下警铃");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("紧急状况下的通话记录");
    }
}
