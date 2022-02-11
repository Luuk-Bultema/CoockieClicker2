package com.example.coockieclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void maakSnackbar(View view){

       View myCoordinatorLayout = findViewById(R.id.myCoordinatorLayout);
       EditText editText = (EditText) findViewById(R.id.edittext);
       String value = editText.getText().toString();
       Snackbar.make(myCoordinatorLayout,value, BaseTransientBottomBar.LENGTH_LONG).show();

    }
}