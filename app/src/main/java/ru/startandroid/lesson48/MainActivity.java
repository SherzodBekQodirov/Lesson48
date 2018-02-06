package ru.startandroid.lesson48;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    final String ATRIBUTE_NAME_TEXT = "text";
    final String ATRIBUTE_NAME_CHEKED = "cheked";
    final String ATRIBUTE_NAME_IMAGE = "image";
    ListView lvSimple;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] texts = {"sometext 1", "sometext 2", "sometext 3", "sometext 4", "sometext 5"};
        boolean[] cheked = {true, false, false, true, false};

        ArrayList<Map<String, Object>> data = new ArrayList<Map<String, Object>>(texts.length);
        Map<String, Object> m;

        for(int i=0; i< texts.length; i++){
            m = new HashMap<String, Object>();
            m.put(ATRIBUTE_NAME_TEXT, texts[i]);
            m.put(ATRIBUTE_NAME_CHEKED, cheked[i]);
            m.put(ATRIBUTE_NAME_IMAGE, img);
            data.add(m);
        }
        String[] from = {ATRIBUTE_NAME_TEXT, ATRIBUTE_NAME_CHEKED,ATRIBUTE_NAME_IMAGE};

        int[] to = {R.id.tvText, R.id.cbChecked, R.id.ivImg};

        SimpleAdapter sAdapter = new SimpleAdapter(this, data, R.layout.item, from, to);

        lvSimple = (ListView) findViewById(R.id.lvSimple);
        lvSimple.setAdapter(sAdapter);


    }
}
