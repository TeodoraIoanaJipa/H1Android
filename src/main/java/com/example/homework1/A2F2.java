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

import static com.example.homework1.A2Activity.*;

public class A2F2 extends Fragment {

    private FragmentTransaction fragmentTransaction;
    private FragmentManager fragmentManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentManager = getFragmentManager();
        return inflater.inflate(R.layout.a2_f2, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // handle your fragment events here
        Button button1 = (Button)view.findViewById(R.id.btn1);
        Button button2 = (Button)view.findViewById(R.id.btn2);
        Button button3 = (Button)view.findViewById(R.id.btn3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A2F3 fragment3 = new A2F3();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.a2f1, fragment3);
                fragmentTransaction.commit();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                A2Activity.this.finish();
            }
        });

    }
}
