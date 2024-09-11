package vn.edu.usth.usthweather;

import android.os.Bundle;
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
            @Override
            public Fragment getItem(int position) {
                return new vn.edu.usth.usthweather.WeatherAndForecastFragment();
            }

            @Override
            public int getCount() {
                return 3; // Three instances of WeatherAndForecastFragment
            }

            @Override
            public CharSequence getPageTitle(int position) {
                switch (position) {
                    case 0:
                        return "Tab 1";
                    case 1:
                        return "Tab 2";
                    case 2:
                        return "Tab 3";
                    default:
                        return null;
                }
            }
        });

        tabLayout.setupWithViewPager(viewPager);
    }
}