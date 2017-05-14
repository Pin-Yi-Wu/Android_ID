package com.example.mina.android_id_uuid;



import android.app.Activity;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.TextView;

import com.example.mina.android_id_uuid.GETuuid;

public class Test1 extends Activity {
    TextView textView,uuid;
    String A;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uuid = (TextView) findViewById(R.id.uuid);
        uuid.setText("UUID : " + A);
    }

    public void Test(){
        int n=3;
        while(n-->0){
            String id =GETuuid.getId();
            System.out.println(id);
            A = id;
        /*
         * 942cd30b-16c8-449e-8dc5-028f38495bb5
            535c010d-63d1-486e-912e-af274dcebe42
            8827dcfa-e4a5-40e8-8b5f-cca60eae70e8

         */
        }}
}