package com.example.cmpunk.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  int mcount;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView) findViewById(R.id.textView);
        registerForContextMenu(tv1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,0,"我去年买了个表");
        menu.add(0,1,0,"我去年买了个钟");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this,item.getTitle().toString(),Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        mcount++;
        menu.add(0,2+mcount,0,"菜单"+mcount);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0,1,0,R.string.m1);
        menu.add(0,1,0,R.string.m2);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
        return super.onContextItemSelected(item);
    }
}
