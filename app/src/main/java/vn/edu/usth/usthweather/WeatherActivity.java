package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;

import androidx.appcompat.app.AppCompatActivity;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        View myView = findViewById(R.id.weather_activity);
        // Set the listener only after finding the View
        myView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @Override
            public WindowInsets onApplyWindowInsets(View view, WindowInsets insets) {
                return insets;
            }
        });
    }
}
