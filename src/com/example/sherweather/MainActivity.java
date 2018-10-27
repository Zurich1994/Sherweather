package com.example.sherweather;

import java.util.ArrayList;
import java.util.List;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemSelectedListener{
    private TextView textView;
    private Spinner spinner;
    private List<String>list;
    Button buttonq;
    Button baidu;
    private ArrayAdapter<String>adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 Button buttonl = (Button)findViewById(R.id.button3);
	     buttonl.setOnClickListener(new OnClickListener(){
	     	public void onClick(View view){
	     		Toast.makeText(getApplicationContext(), "稍后呈现精彩内容", Toast.LENGTH_SHORT).show();
	     		Intent Intent = new Intent(MainActivity.this, MainActivityperson.class);
	     		startActivity(Intent);
	     	}
	     });
		baidu=(Button)findViewById(R.id.button2);
		baidu.setOnClickListener(new MyButtonListener());
		buttonq=(Button)findViewById(R.id.button1);
		textView=(TextView)findViewById(R.id.textView1);
		spinner=(Spinner)findViewById(R.id.spinner);
		textView.setText("请选择");
		//璁剧疆鏁版嵁婧�
		list=new ArrayList<String>();
		list.add("北京");
		list.add("上海");
		list.add("哈尔滨");
		list.add("香港");
		list.add("沈阳");
		list.add("长春");
		//鏂板缓arrayadapter锛堟暟缁勯�閰嶅櫒锛�
		adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
		//adapter璁剧疆涓�釜涓嬫媺鍒楄〃鏍峰紡
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	    //spinner鍔犺浇閫傞厤鍣�
		spinner.setAdapter(adapter);
		spinner.setOnItemSelectedListener(this);
		buttonq.setOnClickListener(new Button.OnClickListener() {  
			  
            @Override  
            public void onClick(View v) {  
                // TODO Auto-generated method stub  
  
  
                Intent intent = new Intent();  
                switch (spinner.getSelectedItemPosition()) {  
                case 0:  
                    intent.setClass(MainActivity.this,MainActivity1.class);  
                    startActivity(intent);  
                    break;  
                case 1:  
                    intent.setClass(MainActivity.this, MainActivity2.class);  
                    startActivity(intent);  
                    break;  
                case 2:  
                    intent.setClass(MainActivity.this,MainActivity3.class);  
                    startActivity(intent);  
                    break;  
                case 3:  
                    intent.setClass(MainActivity.this,MainActivity4.class);  
                    startActivity(intent);  
                    break;  
                case 4:  
                    intent.setClass(MainActivity.this,MainActivity5.class);  
                    startActivity(intent);  
                    break;  
                case 5:  
                    intent.setClass(MainActivity.this,MainActivity6.class);  
                    startActivity(intent);  
                    break;  
                }  
            }  
  
        });  
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		
		String cityname=adapter.getItem(arg2);
		textView.setText("您所选择的城市是"+cityname);
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
	 class MyButtonListener implements OnClickListener{

		   @Override
		   public void onClick(View v) {
		    // TODO Auto-generated method stub
		    Uri uri = Uri.parse("http://www.weather.com.cn/static/html/weather.shtml");
		    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		             startActivity(intent);
		   }
     }
}
