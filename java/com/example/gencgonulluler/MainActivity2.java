package com.example.gencgonulluler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.gencgonulluler.databinding.ActivityMain2Binding;
import com.example.gencgonulluler.databinding.ActivityMainBinding;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding  binding;
    private FirebaseAuth mAuth;

    ArrayList<Etkinlikler> etkinliklerArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);




        //Data

        etkinliklerArrayList = new ArrayList<>();

        Etkinlikler gencetkinlik1 = new Etkinlikler("genc1","Italy", R.drawable.genc1);
        Etkinlikler gencetkinlik2 = new Etkinlikler("genc2","France",R.drawable.genc2);
        Etkinlikler gencetkinlik3 = new Etkinlikler("genc3","Italy",R.drawable.genc3);
        Etkinlikler gencetkinlik4 = new Etkinlikler("genc4","UK",R.drawable.genc4);

        etkinliklerArrayList.add(gencetkinlik1);
        etkinliklerArrayList.add(gencetkinlik2);
        etkinliklerArrayList.add(gencetkinlik3);
        etkinliklerArrayList.add(gencetkinlik4);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        EtkinliklerAdapter etkinliklerAdapter = new EtkinliklerAdapter(etkinliklerArrayList);
        binding.recyclerView.setAdapter(etkinliklerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.signout) {
            //Signout
            mAuth.signOut();

            Intent intentToMain = new Intent(MainActivity2.this,MainActivity.class);
            startActivity(intentToMain);
            finish();
        }

        return super.onOptionsItemSelected(item);
    }



}