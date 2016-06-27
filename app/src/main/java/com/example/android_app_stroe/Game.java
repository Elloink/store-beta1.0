package com.example.android_app_stroe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Game extends Activity {

	private TextView tv_game_gedou,xiuxian,action,pe,net_game,fly_shoot,card_game,jiaose,jingying,xiaochu,
			baoli,run,chinese,zhanlue,jieji,game_fuzhu,jiemi,bianyou,zhongkou;
	private ImageView search ;
	@Override
	public void onCreate(Bundle o){
		super.onCreate(o);
		setContentView(R.layout.game_layout);
		tv_game_gedou= (TextView)findViewById(R.id.tv_game_gedou);
		xiuxian= (TextView)findViewById(R.id.xiuxian);
		action= (TextView)findViewById(R.id.action);
		pe= (TextView)findViewById(R.id.pe);
		net_game= (TextView)findViewById(R.id.net_game);
		fly_shoot= (TextView)findViewById(R.id.fly_shoot);
		card_game= (TextView)findViewById(R.id.card_game);
		jiaose= (TextView)findViewById(R.id.jiaose);
		jingying= (TextView)findViewById(R.id.jingying);
		xiaochu= (TextView)findViewById(R.id.xiaochu);
		baoli= (TextView)findViewById(R.id.baoli);
		run= (TextView)findViewById(R.id.run);
		chinese= (TextView)findViewById(R.id.chinese);
		zhanlue= (TextView)findViewById(R.id.zhanlue);
		jieji= (TextView)findViewById(R.id.jieji);
		game_fuzhu= (TextView)findViewById(R.id.game_fuzhu);
		jiemi= (TextView)findViewById(R.id.jiemi);
		bianyou= (TextView)findViewById(R.id.bian_you);
		zhongkou= (TextView)findViewById(R.id.zhongkou);
		search = (ImageView)findViewById(R.id.daohang_search);
		search.setOnClickListener(new click_());
		click Click = new click();
		tv_game_gedou.setOnClickListener(Click);
		xiuxian.setOnClickListener(Click);
		action.setOnClickListener(Click);
		pe.setOnClickListener(Click);
		net_game.setOnClickListener(Click);
		fly_shoot.setOnClickListener(Click);
		card_game.setOnClickListener(Click);
		jiaose.setOnClickListener(Click);
		jingying.setOnClickListener(Click);
		xiaochu.setOnClickListener(Click);

		baoli.setOnClickListener(Click);
		run.setOnClickListener(Click);
		chinese.setOnClickListener(Click);
		zhanlue.setOnClickListener(Click);
		jieji.setOnClickListener(Click);
		game_fuzhu.setOnClickListener(Click);
		jiemi.setOnClickListener(Click);
		bianyou.setOnClickListener(Click);
		zhongkou.setOnClickListener(Click);





	}
	class click_ implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(Game.this,Search.class);
			startActivity(intent);
		}

	}
	class click implements OnClickListener{


		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(Game.this,List_Software.class);
			intent.putExtra("operate", "game");
			int classify = 0 ;
			if(arg0 == tv_game_gedou){
				classify = 0;
			}
			else if(arg0 == xiuxian){
				classify = 1;
			}
			else if(arg0 == action){
				classify = 2;
			}
			else if(arg0 == pe){
				classify = 3;
			}
			else if(arg0 == net_game){
				classify = 4;
			}
			else if(arg0 == fly_shoot){
				classify = 5;
			}
			else if(arg0 == card_game){
				classify = 6;
			}
			else if(arg0 == jiaose){
				classify = 7;
			}
			else if(arg0 == jingying){
				classify = 8;
			}
			else if(arg0 == xiaochu){
				classify = 9;
			}
			else if(arg0 == baoli){
				classify = 10;
			}
			else if(arg0 == run){
				classify = 18;
			}
			else if(arg0 == chinese){
				classify = 11;
			}
			else if(arg0 == zhanlue){
				classify = 12;
			}
			else if(arg0 == jieji){
				classify = 13;
			}
			else if(arg0 == game_fuzhu){
				classify = 14;
			}
			else if(arg0 == jiemi){
				classify = 15;
			}
			else if(arg0 == bianyou){
				classify = 16;
			}
			else if(arg0 == zhongkou){
				classify = 17;
			}
			intent.putExtra("classify", classify);
			startActivity(intent);
		}

	}
}











