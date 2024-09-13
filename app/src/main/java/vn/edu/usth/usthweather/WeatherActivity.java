package vn.edu.usth.usthweather;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabLayout);

        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                WeatherAndForecastFragment fragment = new WeatherAndForecastFragment();
                Bundle args = new Bundle();
                switch (position) {
                    case 0:
                        args.putString("city", getString(R.string.hanoi));
                        args.putString("weather", getString(R.string.sunny));
                        break;
                    case 1:
                        args.putString("city", getString(R.string.hcm));
                        args.putString("weather", getString(R.string.rainy));
                        break;
                    case 2:
                        args.putString("city", getString(R.string.danang));
                        args.putString("weather", getString(R.string.cloudy));
                        break;
                }
                fragment.setArguments(args);
                return fragment;
            }

            @Override
            public int getCount() {
                return 3;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                switch (position) {
                    case 0:
                        return getString(R.string.hanoi);
                    case 1:
                        return getString(R.string.hcm);
                    case 2:
                        return getString(R.string.danang);
                    default:
                        return null;
                }
            }
        });

        tabLayout.setupWithViewPager(viewPager);
    }


}