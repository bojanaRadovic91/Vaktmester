package cubes.vaktmester.radovic.ui.activity.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import cubes.vaktmester.radovic.R;
import cubes.vaktmester.radovic.ui.activity.fragment.IntroFragment;

public class introPagerAdapter extends FragmentPagerAdapter {

    public introPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int positition) {

        if (positition == 0){

            IntroFragment fragment1 = new IntroFragment();
            fragment1.titleString = "Welcome to";
            fragment1.descriptionString = "";
            fragment1.imageResource = R.drawable.vakt;

            return fragment1;

        }
        else if (positition == 1){

            IntroFragment fragment2 = new IntroFragment();
            fragment2.titleString = "Title one";
            fragment2.descriptionString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
            fragment2.imageResource = R.drawable.title_one;

            return fragment2;
        }
        else {
            IntroFragment fragment3 = new IntroFragment();
            fragment3.titleString = "Title two";
            fragment3.descriptionString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
            fragment3.imageResource = R.drawable.title_two;

            return fragment3;

        }
    }

    @Override
    public int getCount() {

        return 3;
    }
}
