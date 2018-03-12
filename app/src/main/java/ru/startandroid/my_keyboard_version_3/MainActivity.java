package ru.startandroid.my_keyboard_version_3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button btnActTwo;
    Button buttonActKeyboard;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActTwo = (Button) findViewById(R.id.activate);
        btnActTwo.setOnClickListener(this);

        buttonActKeyboard = (Button) findViewById(R.id.select);
        buttonActKeyboard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.select:
                // TODO Call second activity
                Intent intent = new Intent(this, ActivityTwo.class);
                startActivity(intent);
                break;

            case R.id.activate:
                InputMethodManager mgr =
                        (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                if (mgr != null) {
                    mgr.showInputMethodPicker();
                }
                startActivityForResult(
                        new Intent(android.provider.Settings.ACTION_INPUT_METHOD_SETTINGS), 0);
                break;
        }
    }
}