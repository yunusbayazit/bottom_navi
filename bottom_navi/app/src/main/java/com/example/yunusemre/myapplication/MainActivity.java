package com.example.yunusemre.myapplication;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;

import com.example.yunusemre.myapplication.Fragments.onefragment;
import com.roughike.bottombar.BottomBar;

import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private TextView txtDurum;
    private BottomBar bottomBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtDurum=(TextView) findViewById(R.id.durum_txt);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(false);




        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_gezi) {
                    // The tab with id R.id.tab_favorites was selected,
                    // change your content accordingly.
                txtDurum.setText("Gezilecek Yerler");
                    onefragment one= new onefragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.contentContainer,one).commit();
                }
                else if (tabId == R.id.tab_mekan) {
                    // The tab with id R.id.tab_favorites was selected,
                    // change your content accordingly.
                    txtDurum.setText("Mekan");
                }
                else if  (tabId == R.id.tab_yemek) {
                    // The tab with id R.id.tab_favorites was selected,
                    // change your content accordingly.
                    txtDurum.setText("Yemek");
                }
                else if  (tabId == R.id.tab_alisveris) {
                    // The tab with id R.id.tab_favorites was selected,
                    // change your content accordingly.
                    txtDurum.setText("Alışveriş");
                }
            }
        });
        bottomBar.setOnTabReselectListener(new OnTabReselectListener() {
            @Override
            public void onTabReSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_gezi) {
                    // The tab with id R.id.tab_favorites was reselected,
                    // change your content accordingly.
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_refresh) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
