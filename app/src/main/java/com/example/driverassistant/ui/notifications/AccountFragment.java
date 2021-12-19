package com.example.driverassistant.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.driverassistant.ActivityPacket.AccountSettingActivity;
import com.example.driverassistant.R;
import com.example.driverassistant.databinding.FragmentAccountBinding;

public class AccountFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;
    private FragmentAccountBinding binding;

    Button btn_Setting;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentAccountBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        btn_Setting = root.findViewById(R.id.btnSetting);
        btn_Setting.setOnClickListener(v -> caiDat());
        return root;
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