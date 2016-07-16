package com.wenming.crashcachedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.wenming.library.LogReport;
import com.wenming.library.save.LogWriter;
import com.wenming.library.util.FileUtil;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    private Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String content = "test";
//        AESEncode AESEncode = new AESEncode();
//        try {
//            String encode = AESEncode.encrypt(content);
//            Log.d("wenmingvs", "encode = " + encode);
//            Log.d("wenmingvs", "decode = " + AESEncode.decrypt(encode));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        LogReport.getInstance().upload(this);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = null;
                s.length();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogWriter.writeLog("wenming", "郭文明真帅！！！！");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File file = new File(LogReport.LOGDIR);
                FileUtil.deleteDir(file);
            }
        });

    }
}
