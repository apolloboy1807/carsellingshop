package com.example.carsellingshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.carsellingshop.Adapters.ContactsAdapter;
import com.example.carsellingshop.Models.ContactsModel;
import com.example.carsellingshop.databinding.ActivityContactBinding;

import java.util.ArrayList;

public class ContactActivity extends AppCompatActivity {

    ActivityContactBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityContactBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ArrayList<ContactsModel> list = new ArrayList<>();
        list.add(new ContactsModel(R.drawable.venue , "Hyundai Venue" ,  "9000" , "80790845740"));
        list.add(new ContactsModel(R.drawable.harrier , "Tata Harrier" ,  "9000" , "2121456370"));
        list.add(new ContactsModel(R.drawable.celerio , "Maruti Celerio" ,  "9000" , "80790845740"));
        list.add(new ContactsModel(R.drawable.nexon , "Tata Nexon" ,  "9000" , "8079424242"));
        list.add(new ContactsModel(R.drawable.sumo , "Tata Sumo" ,  "9000" , "8079777771"));
        list.add(new ContactsModel(R.drawable.swift , "Suzuki Swift" ,  "9000" , "8079477771"));
        list.add(new ContactsModel(R.drawable.alto , "Hyundai Venue" ,  "2000" , "9079084540"));
        list.add(new ContactsModel(R.drawable.sportzcreta , "Hyundai Creta" ,  "10000" , "8011115740"));
        list.add(new ContactsModel(R.drawable.eon , "Hyundai Eon" ,  "3000" , "8111845740"));
        list.add(new ContactsModel(R.drawable.elitte , "Hyundai Elitte" ,  "9000" , "8444445740"));
        list.add(new ContactsModel(R.drawable.kia , "Seltos Kia" ,  "13000" , "8000007040"));
        list.add(new ContactsModel(R.drawable.toyota , "Toyota" ,  "11000" , "8072121240"));
        list.add(new ContactsModel(R.drawable.verna , "Hyundai Verna" ,  "8000" , "4490845740"));


        ContactsAdapter adapter = new ContactsAdapter(list , this);
        binding.contactsRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager =new LinearLayoutManager(this);
        binding.contactsRecyclerView.setLayoutManager(layoutManager);
    }
}