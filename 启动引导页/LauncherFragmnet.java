package com.jxaummd.fragmentation.showfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import com.jxaummd.fragmentation.R;
import com.jxaummd.fragmentation.fragments.DirectFragment;
import com.jxaummd.fragmentation.until.timer.BaseTimerTask;
import com.jxaummd.fragmentation.until.timer.ITimerListener;

import java.text.MessageFormat;
import java.util.Timer;

import butterknife.BindView;

import butterknife.OnClick;


public class LauncherFragmnet extends DirectFragment implements ITimerListener{

    // 定时任务
    private BaseTimerTask  mBaseTimerTask;

    //定时者
    private Timer  mTimer ;

    private int mCountr=5;


    @BindView(R.id.tv_luncher_timer)
    AppCompatTextView tvLuncherTimer;

    @OnClick(R.id.tv_luncher_timer)
    public void onViewClicked() {
    }

    @Override
    public Object setLayout() {
        return R.layout.app_launcher;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        initTimer();
    }

    /**
     * 初始化定时器
     */
    private void initTimer() {
        mTimer = new Timer();
        mBaseTimerTask=new BaseTimerTask(this);
        mTimer.schedule(mBaseTimerTask,0,1000);
    }


    @Override
    public void onTimer() {
        getProxyActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                tvLuncherTimer.setText(MessageFormat.format("跳过\n{1}",mCountr,mCountr));
                mCountr--;
                if(mCountr<0){
                    mTimer.cancel();
                    mTimer = null;
                }
            }
        });

    }
}
