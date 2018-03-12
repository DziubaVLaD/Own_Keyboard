package ru.startandroid.my_keyboard_version_3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener {

    ImageButton imageButton;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(this);
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(this);
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(this);
        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageButton:
                // TODO Call second activity
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=panda.keyboard.emoji.theme"));
                startActivity(browserIntent);
                Uri uri = Uri.parse("android.resource://ru.startandroid.my_keyboard_version_3/drawable/qqq");
                imageButton.setImageURI(uri);
                break;

            case R.id.imageButton2:
                Intent browserIntent2 = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.touchtype.swiftkey"));
                startActivity(browserIntent2);
                Uri uri2 = Uri.parse("android.resource://ru.startandroid.my_keyboard_version_3/drawable/www");
                imageButton2.setImageURI(uri2);
                break;

            case R.id.imageButton3:
                Intent browserIntent3 = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.jb.emoji.gokeyboard"));
                startActivity(browserIntent3);
                Uri uri3 = Uri.parse("android.resource://ru.startandroid.my_keyboard_version_3/drawable/eee");
                imageButton3.setImageURI(uri3);
                break;

            case R.id.imageButton4:
                Intent browserIntent4 = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.qisiemoji.inputmethod"));
                startActivity(browserIntent4);
                Uri uri4 = Uri.parse("android.resource://ru.startandroid.my_keyboard_version_3/drawable/rrr");
                imageButton4.setImageURI(uri4);
                break;
            default:
                break;
        }
    }
}
