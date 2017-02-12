package com.example.sninkovic_ns.fragmenti17.Fragments;

import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.sninkovic_ns.fragmenti17.Provajderi.CategoryProvajder;
import com.example.sninkovic_ns.fragmenti17.Provajderi.JelaProvajder;
import com.example.sninkovic_ns.fragmenti17.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by SNinkovic_ns on 12.2.2017.
 */

public class DetailFragment extends Fragment{

    private int position =0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (savedInstanceState != null) {
            position = savedInstanceState.getInt("position", 0);
        }

        ImageView imageView= (ImageView)getView().findViewById(R.id.iv_slika);
        InputStream is=null;

        try{
                    is = getActivity().getAssets().open(JelaProvajder.getJelaById(position).getSlika());
            Drawable drawable=Drawable.createFromStream(is,null);
            imageView.setImageDrawable(drawable);
        }catch (IOException e) {
            e.printStackTrace();
        }

        TextView textView= (TextView) getView().findViewById(R.id.tv_naziv);
        textView.setText(JelaProvajder.getJelaById(position).getNaziv());

        TextView cena= (TextView) getView().findViewById(R.id.tv_cena);
        cena.setText(Double.toString(JelaProvajder.getJelaById(position).getCena()));

        TextView kv= (TextView) getView().findViewById(R.id.tv_kalorijska_vrednost);
        kv.setText(Double.toString(JelaProvajder.getJelaById(position).getKalorijskaVrednsot()));

        TextView opis= (TextView) getView().findViewById(R.id.tv_opis);
        opis.setText(JelaProvajder.getJelaById(position).getOpis());

        Spinner categoty=(Spinner)getView().findViewById(R.id.sp_category);

        List<String> categoris= CategoryProvajder.getCategorynames();
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, categoris);
        categoty.setAdapter(adapter);
        categoty.setSelection(JelaProvajder.getJelaById(position).getCategory().getId());

        RatingBar ratingBar= (RatingBar)getView().findViewById(R.id.rb_rating);
        ratingBar.setRating(JelaProvajder.getJelaById(position).getRating());






    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putInt("position", position);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        return view;
    }

    public void setContent(final int position){

        this.position = position;

        Log.v("DetailFragment", "setContent() sets position to " + position);
    }

    public void updateContent(final int position){

        this.position = position;

        Log.v("DetailFragment", "updateContent() sets position to " + position);



        ImageView imageView= (ImageView)getView().findViewById(R.id.iv_slika);
        InputStream is=null;

        try{
            is = getActivity().getAssets().open(JelaProvajder.getJelaById(position).getSlika());
            Drawable drawable=Drawable.createFromStream(is,null);
            imageView.setImageDrawable(drawable);
        }catch (IOException e) {
            e.printStackTrace();
        }

        TextView textView= (TextView) getView().findViewById(R.id.tv_naziv);
        textView.setText(JelaProvajder.getJelaById(position).getNaziv());

        TextView cena= (TextView) getView().findViewById(R.id.tv_cena);
        cena.setText(Double.toString(JelaProvajder.getJelaById(position).getCena()));

        TextView kv= (TextView) getView().findViewById(R.id.tv_kalorijska_vrednost);
        kv.setText(Double.toString(JelaProvajder.getJelaById(position).getKalorijskaVrednsot()));

        TextView opis= (TextView) getView().findViewById(R.id.tv_opis);
        opis.setText(JelaProvajder.getJelaById(position).getOpis());

        Spinner categoty=(Spinner)getView().findViewById(R.id.sp_category);

        List<String> categoris= CategoryProvajder.getCategorynames();
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, categoris);
        categoty.setAdapter(adapter);
        categoty.setSelection(JelaProvajder.getJelaById(position).getCategory().getId());

        RatingBar ratingBar= (RatingBar)getView().findViewById(R.id.rb_rating);
        ratingBar.setRating(JelaProvajder.getJelaById(position).getRating());




    }

}
