package com.myapp.introduce2panu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

/**
 * Created by Administrator on 1/28/2018.
 */

public class Education extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.education);

    }
    public void openActivity2(View view) {
        Intent intent = new Intent(Education.this, AbillitySkill.class);
        startActivity(intent);
        Education.this.finish();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
