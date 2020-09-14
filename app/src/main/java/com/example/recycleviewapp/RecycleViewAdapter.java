package com.example.recycleviewapp;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {


    private ArrayList<String> imgListDoa = new ArrayList<>();
    private ArrayList<String> tvListDoa = new ArrayList<>();
    private ArrayList<String> infoDoa = new ArrayList<>();
    private Context context;

    public RecycleViewAdapter(ArrayList<String> imgListDoa, ArrayList<String> tvListDoa, ArrayList<String> infoDoa, Context context) {
        this.imgListDoa = imgListDoa;
        this.tvListDoa = tvListDoa;
        this.infoDoa = infoDoa;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_doa, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(context).asBitmap().load(imgListDoa.get(position)).into(holder.ciMyImg);
        holder.tvListDoa.setText(tvListDoa.get(position));
        holder.layoutListDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("foto_doa", imgListDoa.get(position));
                intent.putExtra("nama_doa", tvListDoa.get(position));
                intent.putExtra("info_doa", infoDoa.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tvListDoa.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView ciMyImg;
        TextView tvListDoa;
        LinearLayout layoutListDoa;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ciMyImg = itemView.findViewById(R.id.ci_My_image);
            tvListDoa = itemView.findViewById(R.id.tv_List_Doa);
            layoutListDoa = itemView.findViewById(R.id.LinearLayout_List);
        }
    }
}
