package com.example.kshrd.fragment;

import android.app.Fragment;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import com.example.kshrd.fragment.Fragment.DetailFragement;
import com.example.kshrd.fragment.Fragment.MyItemListener;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity implements MyItemListener {

    DetailFragement detailFragement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        detailFragement= (DetailFragement) getSupportFragmentManager().findFragmentById(R.id.fragment2);

    }


    @Override
    public void OnItemClick(String val) {
        detailFragement.updateDetail(val);
    }
}
