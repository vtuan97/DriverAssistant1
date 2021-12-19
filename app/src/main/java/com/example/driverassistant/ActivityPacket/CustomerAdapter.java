package com.example.driverassistant.ActivityPacket;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.example.driverassistant.R;

public class CustomerAdapter {

    public class UserViewHolder extends RecyclerView.ViewHolder {
        private SwipeRevealLayout swipeRevealLayout;
        private LinearLayout layoutDelete;

        private TextView tvUsername;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            swipeRevealLayout = itemView.findViewById(R.id.swipeRevealLayout);
            layoutDelete = itemView.findViewById(R.id.layout_delete);
            tvUsername = itemView.findViewById(R.id.layout_history);

        }
    }
}
