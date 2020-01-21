package com.example.myanimationch32;

import androidx.fragment.app.Fragment;

public class SunsetActivity extends SingleFragmentActivity {
    @Override
    public Fragment creatFragment() {
        return SunsetFragment.newInstance();
    }
}
