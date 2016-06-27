package com.example.android_app_stroe;


import com.example.Download_File.download_file_queue;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.TabHost;

public class Main_face extends ActivityGroup {
	TabHost tabHost;
	RadioButton paihang,software,game,download ;
	@Override
	public void onCreate(Bundle o){
		super.onCreate(o);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main_tabhost);

		paihang = (RadioButton) findViewById(R.id.paihang);
		software = (RadioButton) findViewById(R.id.software);
		// gexing = (RadioButton) findViewById(R.id.yule);
		game = (RadioButton) findViewById(R.id.game);
		download = (RadioButton) findViewById(R.id.doweload);

		tabHost = (TabHost) findViewById(android.R.id.tabhost);
		tabHost.setup();
		tabHost.setup(getLocalActivityManager());
		tabHost.addTab(tabHost.newTabSpec("first").setIndicator("First").setContent(new Intent(this,MainActivity.class)));
		// tabHost.addTab(tabHost.newTabSpec("second").setIndicator("Second").setContent(new Intent(this,amusement.class)));
		tabHost.addTab(tabHost.newTabSpec("third").setIndicator("Third").setContent(new Intent(this,Game.class)));
		tabHost.addTab(tabHost.newTabSpec("fourth").setIndicator("Fourth").setContent(new Intent(this,SoftWare.class)));
		tabHost.addTab(tabHost.newTabSpec("fifth").setIndicator("Fifth").setContent(new Intent(this,DownLoading.class)));
		RadioButtonclick click = new RadioButtonclick();

		paihang.setOnClickListener(click);
		software.setOnClickListener(click);
		// gexing.setOnClickListener(click);
		game.setOnClickListener(click);
		download.setOnClickListener(click);

//
	}
	class RadioButtonclick implements OnClickListener{

		@Override
		public void onClick(View who) {
			// TODO Auto-generated method stub
			if(who == paihang){
				tabHost.setCurrentTabByTag("first");
			}
			else if(who == software ){
				tabHost.setCurrentTabByTag("fourth");
			}
		/*	else if(who == gexing){
				tabHost.setCurrentTabByTag("second");
			}*/
			else if(who == game){
				tabHost.setCurrentTabByTag("third");
			}
			else if(who == download){
				tabHost.setCurrentTabByTag("fifth");
			}

		}

	}

}









