package com.example.homework1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class A2F1 extends Fragment {
    private FragmentTransaction fragmentTransaction;
    private FragmentManager fragmentManager;
    private Button addFragmentTwo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.a2_f1, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        addFragmentTwo = (Button)view.findViewById(R.id.btn);

        addFragmentTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A2F2 fragment2 = new A2F2();
                fragmentManager = getFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.a2f2, fragment2);
                fragmentTransaction.commit();
            }
        });

    }


}
