package com.oderon.ian;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnact) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }

        else if(v.getId() == R.id.btnmap) {

            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.589747,120.9743394"));
            chooser = Intent.createChooser(i, "create a map application");
            startActivity(chooser);
        }

//        else if(v.getId() == R.id.btnWeb) {
//            i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ust.edu.ph"));
//            startActivity(i);
//        }
    }
}
