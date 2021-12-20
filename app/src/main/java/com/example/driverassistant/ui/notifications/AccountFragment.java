package com.example.driverassistant.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.driverassistant.ActivityPacket.AccountSettingActivity;
import com.example.driverassistant.ActivityPacket.LoginActivity;
import com.example.driverassistant.R;
import com.example.driverassistant.databinding.FragmentAccountBinding;
import com.facebook.login.LoginManager;

public class AccountFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;
    private FragmentAccountBinding binding;

    Button btn_Setting, btn_DangXuat;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentAccountBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        btn_Setting = root.findViewById(R.id.btn_SettingAccount);
        btn_Setting.setOnClickListener(v -> caiDat());

        btn_DangXuat = root.findViewById(R.id.btn_Dangxuat);
        btn_DangXuat.setOnClickListener(v -> dangXuat());
        return root;


    }

    private void dangXuat() {
        LoginManager.getInstance().logOut();
        Intent i = new Intent(getActivity(), LoginActivity.class);
        startActivity(i);

    }

    private void caiDat() {
        Intent i = new Intent(getActivity(), AccountSettingActivity.class);
        startActivity(i);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}