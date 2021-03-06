package org.meicode.finalproject4.Bus;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.meicode.finalproject4.databinding.ItemViewListBusBinding;

import java.util.ArrayList;

public class BusListAdapter extends RecyclerView.Adapter<BusListViewHolder> {

    private ArrayList<BusModel> data;
    private Context context;

    public BusListAdapter(ArrayList<BusModel> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public BusListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemViewListBusBinding view = ItemViewListBusBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new BusListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BusListViewHolder holder, int position) {
        BusModel item = data.get(position);
        holder.setDataToView(context, item);
        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(holder.itemView.getContext(), BusDetailActivity.class);
            intent.putExtra("image", item.getImageBus());
            intent.putExtra("name", item.getNameBus());
            intent.putExtra("seat", item.getSeatBus());
            intent.putExtra("type", item.getTypeBus());
            holder.itemView.getContext().startActivity(intent);

        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
