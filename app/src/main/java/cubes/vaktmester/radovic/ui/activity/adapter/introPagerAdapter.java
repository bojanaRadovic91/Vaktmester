package cubes.vaktmester.radovic.ui.activity.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

import cubes.vaktmester.radovic.ui.activity.fragment.introFragment;

public class introPagerAdapter extends FragmentPagerAdapter {
    public introPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return new introFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
