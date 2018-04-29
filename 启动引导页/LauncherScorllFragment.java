package com.jxaummd.fragmentation.showfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.listener.OnItemClickListener;
import com.jxaummd.fragmentation.R;
import com.jxaummd.fragmentation.fragments.DirectFragment;
import com.jxaummd.fragmentation.until.ui.LauncherHoderCreator;

import java.util.ArrayList;

public class LauncherScorllFragment extends DirectFragment implements OnItemClickListener {
    private ConvenientBanner<Integer>  mConvenientBanner = null;
    private static final ArrayList<Integer>  INTEGERS = new ArrayList<>();

    private  void  initBanner(){
        INTEGERS.add(R.mipmap.luncher_img_00);
        INTEGERS.add(R.mipmap.luncher_img_00);
        INTEGERS.add(R.mipmap.luncher_img_00);
        INTEGERS.add(R.mipmap.luncher_img_00);
        INTEGERS.add(R.mipmap.luncher_img_00);
        mConvenientBanner.setPages(new LauncherHoderCreator(),INTEGERS)
                .setPageIndicator(new int[]{R.drawable.dot_focus,R.drawable.dot_normal})
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.CENTER_HORIZONTAL)
                .setOnItemClickListener(this)
                .startTurning(1000)
                .setCanLoop(false);

    }



    @Override
    public Object setLayout() {
        mConvenientBanner = new ConvenientBanner<>(getContext());
        return mConvenientBanner;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
            initBanner();
    }

    @Override
    public void onItemClick(int position) {

    }
}
