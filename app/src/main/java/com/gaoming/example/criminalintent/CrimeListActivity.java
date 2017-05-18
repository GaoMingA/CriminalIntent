package com.gaoming.example.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by gaoming on 2017/5/17.
 */

public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
