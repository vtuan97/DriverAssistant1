package com.example.driverassistant.ui.home;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.driverassistant.ActivityPacket.DichVuActivity;
import com.example.driverassistant.ActivityPacket.DoXangActivity;
import com.example.driverassistant.ActivityPacket.SosActivity;
import com.example.driverassistant.R;
import com.example.driverassistant.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    DatePickerDialog.OnDateSetListener setListener;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        ImageButton imageButtonDoXang = root.findViewById(R.id.do_xang_btn);
        imageButtonDoXang.setOnClickListener(v -> doXang());

        ImageButton imageButtonDichVu = root.findViewById(R.id.dich_vu_btn);
        imageButtonDichVu.setOnClickListener(v -> dichVu());

        ImageButton imageButtonSoS = root.findViewById(R.id.sos_btn);
        imageButtonSoS.setOnClickListener(v -> Sos());
        return root;
    }


    private void Sos() {
        Intent i = new Intent(getActivity(), SosActivity.class);
        startActivity(i);
    }

    private void dichVu() {
        Intent i = new Intent(getActivity(), DichVuActivity.class);
        startActivity(i);
    }

    private void doXang() {
        Intent i = new Intent(getActivity(), DoXangActivity.class);
        startActivity(i);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}