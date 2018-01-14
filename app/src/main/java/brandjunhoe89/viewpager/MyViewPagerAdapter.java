package brandjunhoe89.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by jh on 2018-01-14.
 */

public class MyViewPagerAdapter extends FragmentPagerAdapter {

    int images[] = {R.drawable.apple, R.drawable.banana, R.drawable.podo};
    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return ItemFragment.newInstance(images[position]);
    }

    @Override
    public int getCount() {
        return images.length;
    }
}
