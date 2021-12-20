package com.example.driverassistant.ActivityPacket;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.driverassistant.R;
import com.example.driverassistant.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.StorageReference;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    FirebaseDatabase database = FirebaseDatabase.getInstance("https://driverassistant-593e2-default-rtdb.asia-southeast1.firebasedatabase.app/");
    DatabaseReference accountRef, customerRef, activityRef, activityHisRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        BottomNavigationView navView = findViewById(R.id.nav_view);
        init();
        setdata();

    }


    void init() {
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

    void setdata(){
        accountRef = database.getReference("Account");
        accountRef.setValue("test");

        customerRef = database.getReference("Customer");
        customerRef.setValue("test");

        activityRef = database.getReference("Activity");
        activityRef.setValue("test");

        activityHisRef = database.getReference("ActivityHistory");
        activityHisRef.setValue("test");
    }
}

