package org.meicode.finalproject4.Bus;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import org.meicode.finalproject4.databinding.ItemViewListBusBinding;

public class BusListViewHolder extends RecyclerView.ViewHolder {

    ItemViewListBusBinding binding;

    public BusListViewHolder(ItemViewListBusBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public void setDataToView(Context context, BusModel item){
        binding.tvNameBus.setText(item.getNameBus());
        binding.ivBus.setImageDrawable(ContextCompat.getDrawable(context, item.getImageBus()));
        binding.tvSeat.setText(item.getSeatBus());
        binding.tvType.setText(item.getTypeBus());
    }
}
