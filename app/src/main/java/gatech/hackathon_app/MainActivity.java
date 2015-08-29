package gatech.hackathon_app;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.*;

public class MainActivity extends AppCompatActivity {

    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton firstButton = (ImageButton)findViewById(R.id.techButton);
        final ImageButton secondButton = (ImageButton)findViewById(R.id.mansionButton);

        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstButton.setAlpha(0.35f);
                findViewById(R.id.textView).setAlpha(0.35f);
                Intent intent = new Intent(null, HomeScreen.class);
                close();

            }
        });

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondButton.setAlpha(0.35f);
                findViewById(R.id.textView2).setAlpha(0.35f);
                //Intent intent = new Intent(null, HomeScreen.class);
                close();
                // TODO Launch map with differnet destination
            }
        });


//        String jsonObj = null;
//
//        try {
//            lv = (ListView) findViewById(R.id.eventList);
//            ArrayList<Event> events = new ArrayList<Event>();
//            //TODO: populate events ArrayList with either fake json or fb api
//
//            InputStream is = getAssets().open("testjson");
//
//            int size = is.available();
//            byte[] buffer = new byte[size];
//            is.read(buffer);
//            is.close();
//
//            jsonObj = new String(buffer, "UTF-8");
//            System.out.println(jsonObj);
//            ArrayList<Event> eventsData = prepareJSON(jsonObj);
//            ArrayList<String> eventNames = new ArrayList<String>();
//
//            for(int i = 0; i < eventsData.size(); i++){
//                eventNames.add(eventsData.get(i).getName() + "\n" + eventsData.get(i).getPlace() + "\n" + eventsData.get(i).getStartTime()
//                + " to " + eventsData.get(i).getEndTime());
//            }
//
//            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
//                    this,
//                    android.R.layout.simple_list_item_1,
//                    eventNames);
//
//            lv.setAdapter(arrayAdapter);
//
//
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }
    }

//    public ArrayList<Event> prepareJSON(String jsonObj) {
//        ArrayList<Event> events = new ArrayList<Event>();
//        try {
//            JSONObject obj = new JSONObject(jsonObj);
//            System.out.println("I GOT TO THIS POINT");
//            Iterator<?> keys = obj.keys();
//            while(keys.hasNext()){
//                String key = (String)keys.next();
//                ArrayList<String> temp = new ArrayList<String>();
//                JSONObject event = (JSONObject) obj.get(key);
//                temp.add(event.getString("id"));
//                temp.add(event.getString("name"));
//                temp.add(event.getJSONObject("place").getString("name"));
//                temp.add(event.getString("start_time"));
//                temp.add(event.getString("end_time"));
//                events.add(new Event(temp));
//            }
//            return events;
//        }
//        catch(JSONException e) {
//            e.printStackTrace();
//            return null;
//        }
    //}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }
    public void close() {
        super.finish();
    }
}

