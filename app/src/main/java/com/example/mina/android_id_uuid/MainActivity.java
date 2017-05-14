package com.example.mina.android_id_uuid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.Settings.Secure;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.widget.TextView;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    TextView textView, uuid;
    private String androidDeviceId;
    private Context context;
    String UUID;
    String identity;
    public static final String PREFS_NAME = "MyPrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences preference = getSharedPreferences(PREFS_NAME, 0);


        textView = (TextView) findViewById(R.id.android_device_unique_id);
        uuid = (TextView) findViewById(R.id.uuid);
        androidDeviceId = Secure.getString(getApplicationContext().getContentResolver(),
                Secure.ANDROID_ID);
        textView.setText("Your Device ID Address : " + androidDeviceId);

        // UUID = java.util.UUID.randomUUID().toString();
        //  UUID=UUID.replace("-", "");

        String str = preference.getString("identity", identity);
        uuid.setText("UUID : " + identity);
    }


    public String getIdentity() {
        SharedPreferences preference = getSharedPreferences(PREFS_NAME, 0);
        identity = java.util.UUID.randomUUID().toString();

        SharedPreferences.Editor editor = preference.edit();
        preference.edit().putString("identity", identity);
        editor.commit();
        return identity;
    }



}