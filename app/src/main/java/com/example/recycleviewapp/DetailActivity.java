package com.example.recycleviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView ivFotoDoa;
    TextView tvJudulDoa, tvDetailDoa;

    String fotoDoa, judulDoa, detailDoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivFotoDoa = findViewById(R.id.ivFoto_Doa);
        tvJudulDoa = findViewById(R.id.tv_Judul_Doa);
        tvDetailDoa = findViewById(R.id.tv_Detail_Doa);

        //this is initialization from previous activity
        fotoDoa = getIntent().getStringExtra("foto_doa");
        judulDoa = getIntent().getStringExtra("nama_doa");
        detailDoa = getIntent().getStringExtra("info_doa");


        //this is initialization to view
        Glide.with(this).asBitmap().load(fotoDoa).into(ivFotoDoa);
        tvJudulDoa.setText(judulDoa);
        tvDetailDoa.setText(detailDoa);
    }
}