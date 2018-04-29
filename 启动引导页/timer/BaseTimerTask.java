package com.jxaummd.fragmentation.until.timer;

import java.util.TimerTask;

public class BaseTimerTask extends TimerTask{
    private ITimerListener  iTimerListener;

    /**
     * 通过回调的方法将每次run的内容，抛给BaseTimerTask
     * @param iTimerListener
     */

    public BaseTimerTask(ITimerListener iTimerListener) {
        this.iTimerListener = iTimerListener;
    }

    @Override
    public void run() {
        iTimerListener.onTimer();
    }
}
