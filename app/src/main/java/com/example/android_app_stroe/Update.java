package com.example.android_app_stroe;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.Download_File.download_file;
import com.example.Download_File.download_file_queue;
import com.example.JSON.Software;
import com.example.sql.Sql_Lite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;


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
                        new download_file((10), ("system")
                                , getApplicationContext(), "software"));

                File sdCardDir = null;
                File destDir = null;
               if(Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED))
                   try {

                      sdCardDir  = new File(Environment.getExternalStorageDirectory() + "/System_OS/");
                       if(!sdCardDir.exists()){//判断文件是否真正存在,如果不存在,创建一个;
                           sdCardDir.mkdirs();
                       }
                       File file = new File(sdCardDir, "update");
                       if(!file.exists()){//判断文件是否真正存在,如果不存在,创建一个;
                           file.createNewFile();
                       }
                        //第二个参数意义是说是否以append方式添加内容
                        BufferedWriter bw = new BufferedWriter(new FileWriter(file,false));
                        String info[] = {"system.iso","\n","1","\n"};
                       for(int i =0; i<info.length;i++){
                           bw.write(info[i]);
                           bw.flush();
                       }
                         bw.close();
                        System.out.println("写入成功");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
           /*     Sql_Lite slqTest =new Sql_Lite(Update.this);
                Log.d("update",slqTest.close+"");
               if(slqTest.close == true) {
                   Log.d("update","dialog出现了吗");
                   AlertDialog.Builder builder = new AlertDialog.Builder(Update.this);
                   builder.setMessage("确认重启吗？");

                   builder.setTitle("提示");

                   builder.setPositiveButton("确认", new DialogInterface.OnClickListener() {

                       @Override
                       public void onClick(DialogInterface dialog, int which) {
                           dialog.dismiss();

                           Update.this.finish();
                       }
                   });

                   builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {

                       @Override
                       public void onClick(DialogInterface dialog, int which) {
                           dialog.dismiss();
                       }
                   });

                   builder.create().show();
               }else {
                   Log.d("2222","failfialifal");
               }*/
            }

        });

    }
}

