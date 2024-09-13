package vn.edu.usth.usthweather;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class WeatherFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weather, container, false);

        TextView weatherTextView = view.findViewById(R.id.weather);
        TextView cityTextView = view.findViewById(R.id.city);

        Bundle args = getArguments();
        if (args != null) {
            String city = args.getString("city");
            cityTextView.setText(city);
            String weather = args.getString("weather");
            weatherTextView.setText(weather);
        }

        return view;
    }

}