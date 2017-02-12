package com.example.sninkovic_ns.fragmenti17.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.sninkovic_ns.fragmenti17.Provajderi.JelaProvajder;
import com.example.sninkovic_ns.fragmenti17.R;
import java.util.List;

/**
 * Created by SNinkovic_ns on 12.2.2017.
 */

public class MasterFragment  extends Fragment {

    AdapterView.OnItemSelectedListener listener;

        public void onCreate(Bundle savedInstanceState){super.onCreate(savedInstanceState)}


    public void onActivityCreated(Bundle savedInstanceState){
                super.onActivityCreated(savedInstanceState);

        final List<String> jelaNames = JelaProvajder.getImenaJela();


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(),R.layout.list_item2);
        ListView listView=(ListView) getActivity().findViewById(R.id.listaJela);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                listener.onItemSelected(position);
        }
    });

}
