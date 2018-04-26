package com.example.jonmid.practicaborder.Parser;

import com.example.jonmid.practicaborder.Models.Food;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonFood {

        public static List<Food> getData(String content) throws JSONException {


            JSONObject jsonData = new JSONObject(content);
            JSONArray jsonArray = jsonData.getJSONArray("results");

            List<Food> postList = new ArrayList<>();

            for (int i = 0; i < jsonArray.length(); i++){

                JSONObject item = jsonArray.getJSONObject(i);

                Food food = new Food();
                food.setTitle(item.getString("title"));
                postList.add(food);
            }

            return postList;
        }
}
