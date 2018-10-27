package com.example.sherweather;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainendActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mainend);
		
		Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener(){
        	public void onClick(View view){
        		Toast.makeText(getApplicationContext(), "走，去看看天气~", Toast.LENGTH_SHORT).show();
        		Intent Intent = new Intent(MainendActivity.this, MainActivity.class);
        		startActivity(Intent);
        	}
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mainend, menu);
		return true;
	}

}
