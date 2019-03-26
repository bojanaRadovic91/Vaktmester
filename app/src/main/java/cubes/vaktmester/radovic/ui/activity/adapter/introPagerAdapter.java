package cubes.vaktmester.radovic.ui.activity.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import cubes.vaktmester.radovic.ui.activity.fragment.IntroFragment;

public class introPagerAdapter extends FragmentPagerAdapter {

    public introPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int positition) {

        if (positition == 0){




        }
        else if (positition == 1){



        }
        else {

        }

        return new IntroFragment();
    }

    @Override
    public int getCount() {

        return 3;
    }
}
