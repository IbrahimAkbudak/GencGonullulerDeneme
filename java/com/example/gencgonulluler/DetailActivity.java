package com.example.gencgonulluler;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;


import androidx.appcompat.app.AppCompatActivity;


import com.example.gencgonulluler.databinding.ActivityDetailBinding;


public class DetailActivity extends AppCompatActivity  {

    private ActivityDetailBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);



       // Etkinlikler selectedLandmark = (Etkinlikler) getIntent().getSerializableExtra("Etkinlikler");



    }
    public void changeScreen(View view){
        Intent intent =new Intent(DetailActivity.this,MainActivity2.class);
        startActivity(intent);
    }


}