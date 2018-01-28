package com.myapp.introduce2panu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


/**
 * Created by Administrator on 1/28/2018.
 */

public class AboutMe extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutme);

        int[] resId = { R.drawable.educate, R.drawable.ability};

        String[] list = { "EDUCATION", "ABILITY & SKILLS"};

        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), list, resId);

        final ListView listView = (ListView)findViewById(R.id.listView1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                if (arg2 == 0){
                    Intent a = new Intent(listView.getContext(), Education.class);
                    startActivityForResult(a,0);
                    AboutMe.this.finish();
                }
                if (arg2 == 1){
                    Intent a = new Intent(listView.getContext(), AbillitySkill.class);
                    startActivityForResult(a,1);
                    AboutMe.this.finish();
                }
            }
        });
    }
}
