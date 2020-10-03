package com.betosoft.intentsdemo1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText lat, lon;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lat = findViewById(R.id.txtLat);
        lon = findViewById(R.id.txtLon);
    }

    public void showMe(View v) {
        String _lat = lat.getText().toString();
        String _lon = lon.getText().toString();
        Uri uri = Uri.parse("geo:" + _lat +"," + _lon);

        Toast.makeText(getApplicationContext(), "geo:" + _lat +"," + _lon, Toast.LENGTH_LONG).show();

        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

}