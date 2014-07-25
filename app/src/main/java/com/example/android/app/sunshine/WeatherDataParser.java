package com.example.android.app.sunshine;

/**
 * Created by yo on 24/07/2014.
 */

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherDataParser {



    /**
     * Given a string of the form returned by the api call:
     * http://api.openweathermap.org/data/2.5/forecast/daily?q=94043&mode=json&units=metric&cnt=7
     * retrieve the maximum temperature for the day indicated by dayIndex
     * (Note: 0-indexed, so 0 would refer to the first day).
     */
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
        // TODO: add parsing code here



        JSONObject jsonWeather = new JSONObject(weatherJsonStr);


       JSONArray days = jsonWeather.getJSONArray("list");
        JSONObject dayInfo = days.getJSONObject(dayIndex);
        JSONObject tempInfo = dayInfo.getJSONObject("temp");
        return  tempInfo.getDouble("max");

        //Get specific data
        //String dia = Integer.toString(dayIndex);

        //JSONObject oneObject = new jsonWeather(dayIndex);


        // String aJsonMaxTemp;
       // aJsonMaxTemp = oneObject.getString("max");


      /**  for (int i=0; i < jsonWeather.length(); i++)
        {
            try {
                JSONObject oneObject = jArray.getJSONObject(i);
                // Pulling items from the array
                String oneObjectsItem = oneObject.getString("STRINGNAMEinTHEarray");
                String oneObjectsItem2 = oneObject.getString("anotherSTRINGNAMEINtheARRAY");
            } catch (JSONException e) {
                // Oops
            }
        }*/


       // Log.d("max", aJsonMaxTemp);

        //return -1;
    }

}
