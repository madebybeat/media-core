package com.beatstreaming.core.fragment;

import androidx.fragment.app.FragmentTransaction;

import com.beatstreaming.core.R;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AnimatedFragmentTransaction extends FragmentTransaction {
    private final FragmentTransaction fragmentTransaction;

    @Override
    public int commit() {
        this.fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right);

        return this.fragmentTransaction.commit();
    }

    @Override
    public int commitAllowingStateLoss() {
        return this.fragmentTransaction.commitAllowingStateLoss();
    }

    @Override
    public void commitNow() {
        this.fragmentTransaction.commitNow();
    }

    @Override
    public void commitNowAllowingStateLoss() {
        this.fragmentTransaction.commitNowAllowingStateLoss();
    }
}
