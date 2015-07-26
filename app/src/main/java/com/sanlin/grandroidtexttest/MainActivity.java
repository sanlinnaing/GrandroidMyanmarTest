package com.sanlin.grandroidtexttest;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.sil.palaso.Graphite;


public class MainActivity extends ActionBarActivity {
    Typeface padaukGraphiteKsw;
    Typeface padaukGraphite;
    Typeface padaukRegular;
    Typeface tharlonRegular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Graphite.loadGraphite();
        padaukGraphiteKsw = (Typeface)Graphite.addFontResource(getAssets(), "Padauk.ttf", "padauk", 0, "ksw", "slanth = 1;watri = 1;lldot = 1");
        padaukGraphite = (Typeface)Graphite.addFontResource(getAssets(), "Padauk.ttf", "padauk", 0, "", "");
        padaukRegular=Typeface.createFromAsset(getAssets(),"Padauk.ttf");
        tharlonRegular =Typeface.createFromAsset(getAssets(),"Tharlon.ttf");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1=(TextView) findViewById(R.id.ksw_text);
        tv1.setTypeface(padaukGraphiteKsw);
        TextView tv2=(TextView) findViewById(R.id.ksw_regular_text);
        tv2.setTypeface(padaukRegular);
        TextView tv3=(TextView) findViewById(R.id.burmese_text1);
        tv3.setTypeface(padaukRegular);
        TextView tv4=(TextView) findViewById(R.id.burmese_text2);
        tv4.setTypeface(padaukGraphite);
        TextView tv5=(TextView) findViewById(R.id.burmese_text3);
        tv5.setTypeface(tharlonRegular);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
