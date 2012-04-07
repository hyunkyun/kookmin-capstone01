package com.dm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.dm.ui.mainActivity;

public class DateManagerActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		//   ActionBar actionBar = getActionBar();
		// actionBar.hide();
		// 로딩화면에서는 액션바를 숨긴다

		setContentView(R.layout.loading);
		Handler handler = new Handler(){
			@Override
			public void handleMessage(Message msg){
				super.handleMessage(msg);
				finish();
				startActivity(new Intent(getBaseContext(),  mainActivity.class));
				Log.e("start", "new intent");
			}
		};
		handler.sendEmptyMessageDelayed(0, 500);
		Toast.makeText(this, "안녕하세염", Toast.LENGTH_SHORT).show();
	}
}