package com.myapp.introduce2panu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

/**
 * Created by Administrator on 1/28/2018.
 */

public class AbillitySkill extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abillityskill);
    }

    public void openActivity3(View view) {
        Intent intent = new Intent(AbillitySkill.this, AboutMe.class);
        startActivity(intent);
        AbillitySkill.this.finish();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}