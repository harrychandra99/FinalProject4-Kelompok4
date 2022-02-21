package org.meicode.finalproject4.Bus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import org.meicode.finalproject4.R;
import org.meicode.finalproject4.databinding.ActivityBusListBinding;

import java.util.ArrayList;

public class BusListActivity extends AppCompatActivity {

    ActivityBusListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBusListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<BusModel> bus = new ArrayList<>();
        bus.add(new BusModel(R.drawable.bluestar,  "BlueStar", "Medium Bus", "30"));
        bus.add(new BusModel(R.drawable.marissaholiday,  "Marissa Holiday", "Big Bus", "40"));
        bus.add(new BusModel(R.drawable.scorpionholiday,  "Scorpion Holidat", "Big Bus", "48"));
        bus.add(new BusModel(R.drawable.sinarjaya,  "Sinar Jaya", "Medium Bus", "32"));
        bus.add(new BusModel(R.drawable.symphonie,  "Symphonie", "MiniBus", "27"));
        bus.add(new BusModel(R.drawable.bluestar, "BlueStar", "Medium Bus", "30"));
        bus.add(new BusModel(R.drawable.marissaholiday, "Marissa Holiday", "Big Bus", "40"));
        bus.add(new BusModel(R.drawable.scorpionholiday, "Scorpion Holidat", "Big Bus", "48"));
        bus.add(new BusModel(R.drawable.sinarjaya, "Sinar Jaya", "Medium Bus", "32"));
        bus.add(new BusModel(R.drawable.symphonie, "Symphonie", "MiniBus", "27"));

        BusListAdapter adapter = new BusListAdapter(bus, this);
        binding.rvBusList.setLayoutManager(new LinearLayoutManager(this));
        binding.rvBusList.setAdapter(adapter);
    }
}