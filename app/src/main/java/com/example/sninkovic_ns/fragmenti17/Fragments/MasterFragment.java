package com.example.sninkovic_ns.fragmenti17.Fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
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

        OnItemSelectedListener listener;
//---------------------------------------------------------------------
    @Override
    public void onCreate(Bundle savedInstanceState){super.onCreate(savedInstanceState);}

//-------------------------------------------------------------------   ------------
         @Override
          public void onActivityCreated(Bundle savedInstanceState) {
                super.onActivityCreated(savedInstanceState);



   /*

        final List<String>jelaNames = JelaProvajder.getImenaJela();


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(),R.layout.list_item2, jelaNames);
        ListView listView=(ListView) getActivity().findViewById(R.id.listaJela);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                listener.onItemSelected(position);
        }
    });
*/


}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        if (container == null) {
            return null;
        }

        View view = inflater.inflate(R.layout.fragment_list, container, false);

        return view;

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try{listener= (OnItemSelectedListener) activity;

        }catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnItemSelectedListener");
        }


    }


      public interface OnItemSelectedListener {

             public void onItemSelected(int position);


}

}
