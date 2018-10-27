package com.example.sherweather;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class Main2Activity extends Activity {
	
	final int Menu1 = 1;
	final int Menu2 = 2;
	final int Menu3 = 3;
	final int Menu4 = 4;
	final int Menu5 = 5;
	final int Menu6 = 6;
	final int Menu7 = 7;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		this.registerForContextMenu(findViewById(R.id.EditText01));
		this.registerForContextMenu(findViewById(R.id.EditText02));
		
		Button buttonl = (Button)findViewById(R.id.button1);
	    buttonl.setOnClickListener(new OnClickListener(){
	     	public void onClick(View view){
	     		Toast.makeText(getApplicationContext(), "您的评价已提交~", Toast.LENGTH_SHORT).show();
	     		Intent Intent = new Intent(Main2Activity.this, MainendActivity.class);
	     		startActivity(Intent);
	     	}
	     });
		final ImageView image = (ImageView)findViewById(R.id.imageView1);
		SeekBar seekbar = (SeekBar) findViewById(R.id.seekBar1);
		
		seekbar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			@SuppressWarnings("deprecation")
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				image.setAlpha(progress);

			}

			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
			}

			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub

			}
		});
	}
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {

		menu.setHeaderIcon(R.drawable.ic_launcher);
		if (v == findViewById(R.id.EditText01)) {
			menu.add(0, Menu1, 0, "IT领域专业人士");
			menu.add(0, Menu2, 0, "计算机类专业学生");
			menu.add(0, Menu3, 0, "软件开发爱好者");
			menu.add(0, Menu4, 0, "软件开发小白");
			
		} else if (v == findViewById(R.id.EditText02)) {
			menu.add(0, Menu5, 0, "接近完美了 ，没说的");
			menu.add(0, Menu6, 0, "还有小的瑕疵，可以改进");
			menu.add(0, Menu7, 0, "完全不明白你的逻辑，重做吧");
		}
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case Menu1:
		case Menu2:
		case Menu3:
		case Menu4:
			EditText et1 = (EditText) this.findViewById(R.id.EditText01);
			et1.append("\n" + "选择  "+item.getTitle() );
			break;
		case Menu5:
		case Menu6:
		case Menu7:
			EditText et2 = (EditText) this.findViewById(R.id.EditText02);
			et2.append("\n" + "选择  "+item.getTitle());

		}
		return true;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main2, menu);
		return true;
	}

}
