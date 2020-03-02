package com.example.homework1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.widget.Button;

public class A2Activity extends AppCompatActivity {

   private Button btn;
   private FragmentTransaction fragmentTransaction;
   private FragmentManager fragmentManager;

   private A2F1 fragment1;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a2);

        fragment1 = new A2F1();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.a2f1, fragment1);
        fragmentTransaction.commit();

    }

}
