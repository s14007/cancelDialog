package com.example.uta.myapplication;

import android.content.DialogInterface;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText editText = new EditText(MainActivity.this);
        editText.setHint("デフォルト値");

        final EditText editText1 = new EditText(MainActivity.this);
        editText1.setHint("デフォルト値");

        EditTextDialog dialogFragment = new EditTextDialog();
        dialogFragment.show(getFragmentManager(), "dialog_fragment");
    }
}
