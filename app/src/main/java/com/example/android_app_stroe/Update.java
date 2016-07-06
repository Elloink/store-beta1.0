package com.example.android_app_stroe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.Download_File.download_file;
import com.example.Download_File.download_file_queue;
import com.example.JSON.Software;


/**
 * Created by yoko on 2016/6/30.
 */
public class Update extends Activity {

    public void onCreate(Bundle o) {
        super.onCreate(o);

        setContentView(R.layout.update);
        Button check_update = (Button) findViewById(R.id.check_update);
        check_update.setOnClickListener(new View.OnClickListener() {
            String key = getIntent().getStringExtra("key");
            Object obj = getIntent().getSerializableExtra("obj");
            String name = getIntent().getStringExtra("soft_name");

            @Override
            //
            // 调用software的下载方法，去下载系统,7.5
            public void onClick(View v) {

                download_file_queue.Add_item(
                        new download_file((100), ("system")
                                , getApplicationContext(), "software"));
                    }

        });

    }
}

