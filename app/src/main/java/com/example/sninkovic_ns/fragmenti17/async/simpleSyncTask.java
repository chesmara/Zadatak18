package com.example.sninkovic_ns.fragmenti17.async;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.sninkovic_ns.fragmenti17.Fragments.MasterFragment;
import com.example.sninkovic_ns.fragmenti17.Provajderi.JelaProvajder;
import com.example.sninkovic_ns.fragmenti17.R;

import java.util.List;

/**
 * Created by androiddevelopment on 17.2.17..
 */

public class simpleSyncTask  extends AsyncTask <Void, Void, Void> {


    private Activity activity;
    private MasterFragment.OnItemSelectedListener listener;


    public simpleSyncTask(Activity activity) {
        this.activity = activity;
        listener = (MasterFragment.OnItemSelectedListener) activity;
    }


    @Override
    protected void onPreExecute() {
    }


    @Override
    protected Void doInBackground(Void... params) {


        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }


    private void fillProduct(){
        final List<String> jelaNames = JelaProvajder.getImenaJela();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(activity ,R.layout.list_item2, jelaNames);
        ListView listView=(ListView) activity.findViewById(R.id.listaJela);

        listView.setAdapter(arrayAdapter);

        
    }
}
