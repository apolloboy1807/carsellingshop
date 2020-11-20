package com.example.carsellingshop.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carsellingshop.Models.ContactsModel;
import com.example.carsellingshop.R;

import java.util.ArrayList;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.viewHolder>{

    ArrayList<ContactsModel> list;
    Context context;

    public ContactsAdapter(ArrayList<ContactsModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_sample , parent , false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        final ContactsModel model = list.get(position);
        holder.contactImage.setImageResource(model.getContactImage());
        holder.soldcarname.setText(model.getSoldCarName());
        holder.contactnumber.setText(model.getContactNumber());
        holder.price.setText(model.getPrice());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        ImageView contactImage;
        TextView soldcarname , contactnumber , price;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            contactImage = itemView.findViewById(R.id.contactimage);
            soldcarname = itemView.findViewById(R.id.contactCarName);
            contactnumber = itemView.findViewById(R.id.contactNumber);
            price = itemView.findViewById(R.id.contactPrice);
        }
    }

}