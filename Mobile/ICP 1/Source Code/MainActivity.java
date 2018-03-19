package com.example.tvamshi13.ice1login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText username = (EditText)findViewById(R.id.editText2);
    EditText password = (EditText)findViewById(R.id.editText3);

    public void login(View view)
    {
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
            Toast.makeText(getApplicationContext(),
                    "Redirecting...",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), "Wrong
                    Credentials",Toast.LENGTH_SHORT).show();

                    tx1.setVisibility(View.VISIBLE);
            tx1.setBackgroundColor(Color.RED);
            counter--;
            tx1.setText(Integer.toString(counter));

            if (counter == 0) {
                b1.setEnabled(false);
            }
        }
            //correcct password
        }
        else
        {
            //wrong password
        }
    }

}
