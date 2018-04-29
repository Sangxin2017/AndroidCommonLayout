package com.jxaummd.fragmentation.until.ui;


import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;

public class LauncherHoderCreator implements CBViewHolderCreator{

    @Override
    public Object createHolder() {
        return new LauncherHolder();
    }
}
