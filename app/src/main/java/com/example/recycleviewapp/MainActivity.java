package com.example.recycleviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> imgListDoa = new ArrayList<>();
    private ArrayList<String> tvListDOa = new ArrayList<>();
    private ArrayList<String> infoDoa = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDataFromInternet();
    }



    private void getDataFromInternet(){

        imgListDoa.add("https://cdn.popmama.com/content-images/post/20200319/desain-tanpa-judul-49png-063fdbb0a49926cbd58e6905acec986d.png");
        tvListDOa.add("Doa Sebelum Tidur");
        infoDoa.add("Jangan lupa ingatkan atau ajak anak untuk berdoa sebelum tidur dan ketika bangun tidur. Doa ini untuk berserah diri kepada Allah SWT tentang hidup dan mati yang sudah direncanakan Allah SWT. Begini doanya :\n" +
                "\n" +
                "Doa sebelum tidur\n" +
                "\n" +
                "بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتُ\n" +
                "\n" +
                "Bismikallahumma ahya wa amuutu.\n" +
                "\n" +
                "Artinya:\n" +
                "\n" +
                "\"Dengan menyebut nama-Mu ya Allah, aku hidup dan aku mati.\"\n" +
                "\n" +
                "Doa bangun tidur\n" +
                "\n" +
                "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ\n" +
                "\n" +
                "Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru.\n" +
                "\n" +
                "Artinya:\n" +
                "\n" +
                "\"Segala puji bagi Allah yang telah menghidupkan kami sesudah kami mati (membangunkan dari tidur) dan hanya kepada-Nya kami dikembalikan.\"");

        imgListDoa.add("https://cdn.popmama.com/content-images/post/20200319/desain-tanpa-judul-47png-a49114a138a4bbd1ab8b67a6d6450708.png");
        tvListDOa.add("Doa Masuk Kamar Mandi");
        infoDoa.add("Ingatkan anak untuk berdoa ketika akan masuk dan keluar kamar mandi ya, Ma.\n" +
                "\n" +
                "Beritahu anak bahwa doa ini penting dilafalkan untuk mendapatkan perlindungan dari Allah SWT sebelum masuk dan keluar kamar mandi dari adanya godaan setan.\n" +
                "\n" +
                "Ini juga bisa menjadi cara Mama mengajarkan anak untuk tidak perlu takut ke kamar mandi sendirian, karena anak bisa berdoa dan akan dilindungi oleh Allah SWT. \n" +
                "\n" +
                "Doa masuk kamar mandi\n" +
                "\n" +
                "َللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِ\n" +
                "\n" +
                "Allaahumma Innii a'uudzubika minal khubutsi wal khabaaitsi.\n" +
                "\n" +
                "Artinya:\n" +
                "\n" +
                "\"Ya Allah, aku berlindung pada-Mu dari godaan syetan laki-laki dan syetan perempuan\"\n" +
                "\n" +
                "Doa keluar kamar mandi\n" +
                "\n" +
                "غُفْرَانَكَ الْحَمْدُ ِللهِ الَّذِىْ اَذْهَبَ عَنّى اْلاَذَى وَعَافَانِىْ\n" +
                "\n" +
                "Ghufraanaka. Alhamdulillaahil ladzii adzhaba ‘annjil adzaa wa’aafaanii.\n" +
                "\n" +
                "Artinya:\n" +
                "\n" +
                "\"Dengan mengharap ampunanMu, segala puji milik Allah yang telah menghilangkan kotoran dari badanku dan yang telah menyejahterakan.\"");

        imgListDoa.add("https://cdn.popmama.com/content-images/post/20200319/desain-tanpa-judul-48png-d43c1911d3444f28081c11ac1bb6cd43.png");
        tvListDOa.add("Doa Sebelum Makan");
        infoDoa.add("Membaca doa sebelum dan sesudah makan untuk mengharapkan berkah atas apa yang kita makan dari Allah SWT. Karena ketika Allah memberikan berkah-Nya, insya Allah apapun yang kita kerjakan akan menghasilkan pahala.\n" +
                "\n" +
                "Doa sebelum makan\n" +
                "\n" +
                "َللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ\n" +
                "\n" +
                "Allaahumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar.\n" +
                "\n" +
                "Artinya:\n" +
                "\n" +
                "\"Ya Allah, berkahilah kami dalam rezeki yang telah Engkau berikan kepada kami dan peliharalah kami dari siksa api neraka.\"\n" +
                "\n" +
                "Doa sesudah makan\n" +
                "\n" +
                "َلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ\n" +
                "\n" +
                "Alhamdu lillaahil ladzii ath'amanaa wa saqaanaa wa ja'alnaa muslimiin.\n" +
                "\n" +
                "Artinya:\n" +
                "\n" +
                "\"Segala puji bagi Allah yang telah memberi makan kami dan minuman kami, serta menjadikan kami sebagai orang-orang Islam.\"");

        prosesRecycleViewAdapter();

    }

    private void prosesRecycleViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.rvApps);
        RecycleViewAdapter adapter = new RecycleViewAdapter(imgListDoa,tvListDOa,infoDoa,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}