package com.e.fragmentbasicapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class SimpleFragment extends Fragment {
    Button firstbutton;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_simple,container,false);    //important line
        firstbutton=view.findViewById(R.id.button);

        firstbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Fragment's Button", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
