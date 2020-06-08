/*
 * Made With Love
 * Author @Moh Husni Mubaraq
 * Not for Commercial Purpose
 */

package com.vyzyz.covidupdate.fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.vyzyz.covidupdate.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment implements View.OnClickListener {

    public InfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_info, container, false);


        Button btnNews = (Button)v.findViewById(R.id.BtnNews);
        Button btnHoax = (Button)v.findViewById(R.id.BtnHoax);
        Button btnPeta = (Button)v.findViewById(R.id.BtnPeta);
        Button btnEdukasi = (Button)v.findViewById(R.id.BtnEdukasi);
        Button btnQnA = (Button) v.findViewById(R.id.BtnQnA);
        Button btnKontak = (Button) v.findViewById(R.id.BtnKontak);

        btnNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newsUrl = "https://covid19.go.id/p/berita";
                Uri newsUri = Uri.parse(newsUrl);
                Intent news = new Intent(Intent.ACTION_VIEW, newsUri);
                Toast.makeText(getActivity(), getResources().getString(R.string.redirect), Toast.LENGTH_SHORT).show();
                startActivity(news);
            }
        });
        btnHoax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String HoaxUrl = "https://covid19.go.id/p/hoax-buster";
                Uri HoaxUri = Uri.parse(HoaxUrl);
                Intent hoax = new Intent(Intent.ACTION_VIEW, HoaxUri);
                Toast.makeText(getActivity(), getResources().getString(R.string.redirect), Toast.LENGTH_SHORT).show();
                startActivity(hoax);
            }
        });
        btnPeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String petaUrl = "https://covid19.go.id/peta-sebaran";
                Uri petaUri = Uri.parse(petaUrl);
                Intent peta = new Intent(Intent.ACTION_VIEW, petaUri);
                Toast.makeText(getActivity(), getResources().getString(R.string.redirect), Toast.LENGTH_SHORT).show();
                startActivity(peta);
            }
        });
        btnEdukasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edukasiUrl = "https://covid19.go.id/edukasi/pengantar";
                Uri edukaiUri = Uri.parse(edukasiUrl);
                Intent edukasi = new Intent(Intent.ACTION_VIEW, edukaiUri);
                Toast.makeText(getActivity(), getResources().getString(R.string.redirect), Toast.LENGTH_SHORT).show();
                startActivity(edukasi);
            }
        });
        btnQnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String QnAUrl = "https://covid19.go.id/tanya-jawab";
                Uri QnAUri = Uri.parse(QnAUrl);
                Intent QnA = new Intent(Intent.ACTION_VIEW, QnAUri);
                Toast.makeText(getActivity(), getResources().getString(R.string.redirect), Toast.LENGTH_SHORT).show();
                startActivity(QnA);
            }
        });
        btnKontak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kontakUrl = "https://covid19.go.id/p/konten/kontak-layanan-kementerianlembaga-untuk-covid-19";
                Uri kontakUri = Uri.parse(kontakUrl);
                Intent kontak = new Intent(Intent.ACTION_VIEW, kontakUri);
                Toast.makeText(getActivity(), getResources().getString(R.string.redirect), Toast.LENGTH_SHORT).show();
                startActivity(kontak);
            }
        });
        return v;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {

        }
        return super.onOptionsItemSelected(item);
    }

   @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnInfoHospital:
                String hospitalUrl = "https://news.detik.com/berita/d-4942353/daftar-rumah-sakit-rujukan-covid-19-seluruh-indonesia?single=1";
                Uri hospitalUri = Uri.parse(hospitalUrl);
                Intent intentInfoHospital = new Intent(Intent.ACTION_VIEW, hospitalUri);
               // Toast.makeText(this, getResources().getString(R.string.redirect), Toast.LENGTH_SHORT).show();
                startActivity(intentInfoHospital);
                break;

            case R.id.btnInfoSymptom:
                String symptomUrl = "https://www.cnnindonesia.com/gaya-hidup/20200128205625-258-469589/infografis-bedanya-demam-selesma-dan-virus-corona-wuhan";
                Uri symptomUri = Uri.parse(symptomUrl);
                Intent intentInfoSymptom = new Intent(Intent.ACTION_VIEW, symptomUri);
                //Toast.makeText(getActivity(), getResources().getString(R.string.redirect), Toast.LENGTH_SHORT).show();
                //Toast.makeText(this, getResources().getString(R.string.redirect), Toast.LENGTH_SHORT).show();
                startActivity(intentInfoSymptom);
                break;

            case R.id.btnInfoPrevention:
                String urlPrevention = "https://www.kompas.com/sains/read/2020/03/15/190200123/panduan-mencegah-virus-corona-pesan-who-untuk-kita-semua?page=all#page4";
                Uri preventionUri = Uri.parse(urlPrevention);
                Intent intentPrevention = new Intent(Intent.ACTION_VIEW, preventionUri);
                //Toast.makeText(this, getResources().getString(R.string.redirect), Toast.LENGTH_SHORT).show();
                startActivity(intentPrevention);
                break;

            case R.id.btnInfoAdviceWho:
                String urlWho = "https://www.youtube.com/watch?v=bPITHEiFWLc&feature=emb_title";
                Uri whoUri = Uri.parse(urlWho);
                Intent intentWho = new Intent(Intent.ACTION_VIEW, whoUri);
               // Toast.makeText(this, getResources().getString(R.string.redirect), Toast.LENGTH_SHORT).show();
                startActivity(intentWho);
                break;
        }
    }
}
