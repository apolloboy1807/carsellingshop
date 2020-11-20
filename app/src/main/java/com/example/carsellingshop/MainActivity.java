package com.example.carsellingshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.carsellingshop.Adapters.MainAdapter;
import com.example.carsellingshop.Models.MainModel;
import com.example.carsellingshop.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.harrier, "Harrier", "9000", "Diesel engine is 1956 cc. Manual and Automatic transmission.mileage of 17.0 kmpl.5 seater SUV.\n"));

        list.add(new MainModel(R.drawable.celerio, "Celerio", "9000", "The 998 cc Petrol engine generates a power of 67.04bhp@6000rpm and a torque of 90Nm@3500rpm.The kerb \n" +
                "weight of Celerio is 840 Kg.\n"));

        list.add(new MainModel(R.drawable.nexon, "Nexon", "9000", "Diesel engine is 1497 cc while the Petrol engine is 1199 cc.Manual and Automatic transmission.mileage \n" +
                "of 17.0 to 21.5 kmpl.5 seater SUV.\n"));

        list.add(new MainModel(R.drawable.sumo, "Sumo", "9000", "Valve/Cylinder 2, SOHC. Engine Start-Stop Function, No. Engine Type, CR4 Diesel Engine. Engine \n" +
                "Description, 3.0-litre 83.8bhp 8V CR4 Diesel\n"));

        list.add(new MainModel(R.drawable.swift, "Swift", "9000", "The Petrol engine is 1197 cc.Manual and Automatic transmission.mileage of 21.21 kmpl.5 seater Hatchback \n"));

        list.add(new MainModel(R.drawable.venue, "Venue", "9000", "\n" +
                " 1 Diesel Engine and 2 Petrol Engine. The Diesel engine is 1493 cc while \n" +
                "the Petrol engine is 1197 cc and 998 cc.\n"));

        list.add(new MainModel(R.drawable.alto, "Alto", "2000", "The Petrol engine is 796 cc and 1061 cc while the CNG engine is 796 cc.mileage of 18.9 kmpl to 26.83 \n" +
                "km/kg.5 seater Hatchback \n"));

        list.add(new MainModel(R.drawable.sportzcreta, "Sportzcreta", "10000", "1 Diesel Engine and 3 Petrol Engine.The Diesel engine is 1493 cc while \n" +
                "the Petrol engine is 1493 cc  1497 cc, 1353 cc.Manual and Automatic transmission.5 seater SUV\n"));

        list.add(new MainModel(R.drawable.eon, "Eon", "3000", "The Hyundai Eon 0.8L iRDE is powered by a 814 cc, 3-cylinder petrol engine that puts out 55 bhp of \n" +
                "maximum power at 5500 rpm and 76 Nm of maximum torque at 4000 rpm.5-speed manual gearbox.\n"));

        list.add(new MainModel(R.drawable.elitte, "Elitte", "9000", "Elite i20 Specs, Features and Price The Petrol engine is 1197 cc.Manual transmission.mileage of 18.6 \n" +
                "kmpl.5 seater Hatchback \n"));

        list.add(new MainModel(R.drawable.kia, "Kia", "13000", "kia is a South Korean multinational automotive manufacturer headquartered in Seoul.It \n" +
                "is South Korea's second-\n"));

        list.add(new MainModel(R.drawable.toyota, "Toyota", "11000", " 1 Petrol Engine.The Petrol engine  1794 cc.mileage of 11.3 to 13.4 \n" +
                "kmpl.5 seater Sedan\n"));

        list.add(new MainModel(R.drawable.verna, "Verna", "8000", "1 Diesel Engine and 2 Petrol Engine. The Diesel engine 1493 cc while \n" +
                "the Petrol engine  1497 cc and 998 cc.Manual and Automatic transmission.5 seater Sedan \n"));


        MainAdapter adapter = new MainAdapter(list, this);
        binding.recyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);



    }
}