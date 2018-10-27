package com.example.sherweather;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivityperson extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activityperson);
		
		 Button button = (Button)findViewById(R.id.button1);
	        button.setOnClickListener(new OnClickListener(){
	        	public void onClick(View view){
	        		Toast.makeText(getApplicationContext(), "提交中。。稍后", Toast.LENGTH_SHORT).show();
	        		Intent Intent = new Intent(MainActivityperson.this,MainerrorActivity.class);
	        		startActivity(Intent);
	        	}
	        });
	        Button button2 = (Button)findViewById(R.id.button2);
	        button2.setOnClickListener(new OnClickListener(){
	        	public void onClick(View view){
	        		Toast.makeText(getApplicationContext(), "提交中。。稍后", Toast.LENGTH_SHORT).show();
	        		Intent Intent = new Intent(MainActivityperson.this, MainerrorActivity.class);
	        		startActivity(Intent);
	        	}
	        });
	        Button button4 = (Button)findViewById(R.id.button4);
	        button4.setOnClickListener(new OnClickListener(){
	        	public void onClick(View view){
	        		Toast.makeText(getApplicationContext(), "提交中。。稍后", Toast.LENGTH_SHORT).show();
	        		Intent Intent = new Intent(MainActivityperson.this,MainerrorActivity.class);
	        		startActivity(Intent);
	        	}
	        });
	        Button button3 = (Button)findViewById(R.id.button3);
	        button3.setOnClickListener(new OnClickListener(){
	        	public void onClick(View view){
	        		Toast.makeText(getApplicationContext(), "提交中。。稍后", Toast.LENGTH_SHORT).show();
	        		Intent Intent = new Intent(MainActivityperson.this,MaincorrectActivity.class);
	        		startActivity(Intent);
	        	}
	        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activityperson, menu);
		return true;
	}

}
