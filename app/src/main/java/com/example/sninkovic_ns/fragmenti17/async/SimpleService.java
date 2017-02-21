package com.example.sninkovic_ns.fragmenti17.async;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.example.sninkovic_ns.fragmenti17.tools.ReviewerTools;
/**
 * Created by SNinkovic_ns on 21.2.2017.
 */

public class SimpleService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent){return  null;}

//------------------------------------------------------------------
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

//status == ReviewerTools.TYPE_WIFI ||
        int status = ReviewerTools.getConnectivityStatus(getApplicationContext());

        if ( status == ReviewerTools.TYPE_MOBILE) {
            new SimpleSyncTask(getApplicationContext()).execute(status);
        }
        else if (status == ReviewerTools.TYPE_WIFI){
            new SimpleSyncTask(getApplicationContext()).execute(status);
        }
            stopSelf();

                return START_NOT_STICKY;
    }

}
