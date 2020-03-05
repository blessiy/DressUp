package com.example.dressup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private CheckBox mcheckbox_arms;
    private CheckBox mcheckbox_ears;
    private CheckBox mcheckbox_eyebrows;
    private CheckBox mcheckbox_eyes;
    private CheckBox mcheckbox_glasses;
    private CheckBox mcheckbox_hat;
    private CheckBox mcheckbox_mouth;
    private CheckBox mcheckbox_mustache;
    private CheckBox mcheckbox_nose;
    private CheckBox mcheckbox_shoes;

    private ImageView mimageview_arms;
    private ImageView mimageview_ears;
    private ImageView mimageview_eyebrows;
    private ImageView mimageview_eyes;
    private ImageView mimageview_glasses;
    private ImageView mimageview_hat;
    private ImageView mimageview_mouth;
    private ImageView mimageview_mustache;
    private ImageView mimageview_nose;
    private ImageView mimageview_shoes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mcheckbox_arms=findViewById(R.id.checkbox_arms);
        mcheckbox_ears=findViewById(R.id.checkbox_ears);
        mcheckbox_eyebrows=findViewById(R.id.checkbox_eyebrows);
        mcheckbox_eyes=findViewById(R.id.checkbox_eyes);
        mcheckbox_glasses=findViewById(R.id.checkbox_glasses);
        mcheckbox_hat=findViewById(R.id.checkbox_hat);
        mcheckbox_mouth=findViewById(R.id.checkbox_mouth);
        mcheckbox_mustache=findViewById(R.id.checkbox_mustache);
        mcheckbox_nose=findViewById(R.id.checkbox_nose);
        mcheckbox_shoes=findViewById(R.id.checkbox_shoes);

        mimageview_arms=findViewById(R.id.imageview_arms);
        mimageview_ears=findViewById(R.id.imageview_ears);
        mimageview_eyebrows=findViewById(R.id.imageview_eyebrows);
        mimageview_eyes=findViewById(R.id.imageview_eyes);
        mimageview_glasses=findViewById(R.id.imageview_glasses);
        mimageview_hat=findViewById(R.id.imageview_hat);
        mimageview_mouth=findViewById(R.id.imageview_mouth);
        mimageview_mustache=findViewById(R.id.imageview_mustache);
        mimageview_nose=findViewById(R.id.imageview_nose);
        mimageview_shoes=findViewById(R.id.imageview_shoes);


        mcheckbox_arms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked){
                    mimageview_arms.setVisibility(View.VISIBLE);
                }else{
                    mimageview_arms.setVisibility(View.INVISIBLE);
                }
            }
    });

        mcheckbox_ears.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked){
                    mimageview_ears.setVisibility(View.VISIBLE);
                }else{
                    mimageview_ears.setVisibility(View.INVISIBLE);
                }
            }
        });

        mcheckbox_eyebrows.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked){
                    mimageview_eyebrows.setVisibility(View.VISIBLE);
                }else{
                    mimageview_eyebrows.setVisibility(View.INVISIBLE);
                }
            }
        });

        mcheckbox_eyes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked){
                    mimageview_eyes.setVisibility(View.VISIBLE);
                }else{
                    mimageview_eyes.setVisibility(View.INVISIBLE);
                }
            }
        });

        mcheckbox_glasses.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked){
                    mimageview_glasses.setVisibility(View.VISIBLE);
                }else{
                    mimageview_glasses.setVisibility(View.INVISIBLE);
                }
            }
        });

        mcheckbox_hat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked){
                    mimageview_hat.setVisibility(View.VISIBLE);
                }else{
                    mimageview_hat.setVisibility(View.INVISIBLE);
                }
            }
        });

        mcheckbox_mouth.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked){
                    mimageview_mouth.setVisibility(View.VISIBLE);
                }else{
                    mimageview_mouth.setVisibility(View.INVISIBLE);
                }
            }
        });

        mcheckbox_mustache.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked){
                    mimageview_mustache.setVisibility(View.VISIBLE);
                }else{
                    mimageview_mustache.setVisibility(View.INVISIBLE);
                }
            }
        });

        mcheckbox_nose.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked){
                    mimageview_nose.setVisibility(View.VISIBLE);
                }else{
                    mimageview_nose.setVisibility(View.INVISIBLE);
                }
            }
        });

        mcheckbox_shoes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked){
                    mimageview_shoes.setVisibility(View.VISIBLE);
                }else{
                    mimageview_shoes.setVisibility(View.INVISIBLE);
                }
            }
        });
}
}
