package State.answer3of19;

import State.answer3of19.Context;

public interface State {
    void doClock(Context context, int hour);
    void doUse(Context context);
    void doAlarm(Context context);
    void doPhone(Context context);
}
