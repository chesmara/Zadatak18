package com.example.sninkovic_ns.fragmenti17.async;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import com.example.sninkovic_ns.fragmenti17.tools.ReviewerTools;

/**
 * Created by SNinkovic_ns on 21.2.2017.
 */

public class SimpleSyncTask extends AsyncTask< Integer, Void, Integer>{

    private Context context;

    public SimpleSyncTask(Context context) {this.context=context;}

    @Override
    protected void onPreExecute() {
    }

    @Override
    protected Integer doInBackground(Integer... params) {
        try {
            //simulacija posla koji se obavlja u pozadini i traje duze vreme
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return params[0];
    }

    @Override
    protected void onPostExecute(Integer kojiNet) {
        Toast.makeText(context, ReviewerTools.getConnectionType(kojiNet), Toast.LENGTH_SHORT).show();
    }


}
