package com.myapp.introduce2panu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity
{
    public Button join;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        join = (Button) findViewById(R.id.join);
        join.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                final AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.question_dialog, null);

                final EditText mAns = (EditText) mView.findViewById(R.id.answer);

                Button mJoin = (Button) mView.findViewById(R.id.answerbt);

                mJoin.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String y = new String("y");
                        String Y = new String("Y");
                        String n = new String("n");
                        String N = new String("N");
                        if((mAns.getText().toString().equals(y)) || (mAns.getText().toString().equals(Y)))
                        {
                            Toast.makeText(MainActivity.this, R.string.Success,
                                    Toast.LENGTH_SHORT).show();
                            Intent a = new Intent(MainActivity.this, AboutMe.class);
                            a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(a);
                            MainActivity.this.finish();
                        }else if ((mAns.getText().toString().equals(n)) || (mAns.getText().toString().equals(N)))
                        {
                            Toast.makeText(MainActivity.this, R.string.fail,
                                    Toast.LENGTH_SHORT).show();
                        }else
                        {
                            Toast.makeText(MainActivity.this, R.string.error,
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.show();
            }
        });
    }
}