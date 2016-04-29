package com.lcsmobileapps.trainingapp.controller;

import com.android.volley.Response;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.lcsmobileapps.trainingapp.model.Movie;

import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Leandro on 4/28/2016.
 */
public class DataController {


    public class ResponseListener implements Response.Listener<JSONObject> {

        @Override
        public void onResponse(JSONObject response) {

            Gson gson = new GsonBuilder().create();

            Type listTypeMovie = new TypeToken<ArrayList<Movie>>() {

            }.getType();
            JSONArray jsonArray;
            jsonArray = response.optJSONArray("Search");

            //TODO check if jsonArray is null
            String json = jsonArray.toString();
            List<Movie> movies = gson.fromJson(json, listTypeMovie);

            return;
            //TODO Send data to



        }
    }
}
