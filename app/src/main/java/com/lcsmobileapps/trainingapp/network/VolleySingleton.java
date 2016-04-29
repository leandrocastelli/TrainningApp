package com.lcsmobileapps.trainingapp.network;

import android.content.Context;

import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;

/**
 * Created by Leandro on 4/27/2016.
 */
public class VolleySingleton {
    private static VolleySingleton mInstance;

    private RequestQueue mRequestQueue;
    private static Context ctx;

    public static synchronized VolleySingleton getInstance(Context ctx) {
        if (mInstance == null)
            mInstance = new VolleySingleton(ctx);
        return mInstance;
    }
    private VolleySingleton(Context ctx) {
        this.ctx = ctx;
        Cache cache = new DiskBasedCache(ctx.getCacheDir(), 1024 * 1024);
        Network network = new BasicNetwork(new HurlStack());

        mRequestQueue = new RequestQueue(cache, network);

        mRequestQueue.start();

    }
    public void addToRequestQueue(Request request) {
        if (mRequestQueue != null)
            mRequestQueue.add(request);
        mRequestQueue.start();

    }
}
