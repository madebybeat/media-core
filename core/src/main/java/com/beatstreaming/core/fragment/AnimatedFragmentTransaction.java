package com.beatstreaming.core.fragment;

import androidx.fragment.app.FragmentTransaction;

import com.beatstreaming.core.R;

public class AnimatedFragmentTransaction extends FragmentTransaction {
    @Override
    public int commit() {
        this.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right);

        return this.commit();
    }

    @Override
    public int commitAllowingStateLoss() {
        return this.commitAllowingStateLoss();
    }

    @Override
    public void commitNow() {
        this.commitNow();
    }

    @Override
    public void commitNowAllowingStateLoss() {
        this.commitNowAllowingStateLoss();
    }
}
