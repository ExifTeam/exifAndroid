package info.nhamnhi.manhtinh.exifandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import info.nhamnhi.manhtinh.exifandroid.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }
}