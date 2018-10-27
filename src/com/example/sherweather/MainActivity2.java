package com.example.sherweather;

import com.example.sherweather.MainActivity1.MyButtonListener;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity2);
		
		Button baidu=(Button)findViewById(R.id.button2);
		baidu.setOnClickListener(new MyButtonListener());
		Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener(){
        	public void onClick(View view){
        		//Toast.makeText(getApplicationContext(), "锟斤拷锟斤拷锟斤拷button锟斤拷钮", Toast.LENGTH_SHORT).show();
        		Intent Intent = new Intent(MainActivity2.this, MainActivity.class);
        		startActivity(Intent);
        	}
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity2, menu);
		return true;
	}
	class MyButtonListener implements OnClickListener{

		   @Override
		   public void onClick(View v) {
		    // TODO Auto-generated method stub
		    Uri uri = Uri.parse("http://www.weather.com.cn/html/weather/101020100.shtml");
		    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		             startActivity(intent);
		   }
		      
	 }
}
