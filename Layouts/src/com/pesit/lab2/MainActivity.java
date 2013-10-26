package com.pesit.lab2;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button)findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "Toastmsg", Toast.LENGTH_LONG).show();
				
			}
		});
        
        
    }

    /*public void display(View v){
    	Toast.makeText(MainActivity.this, "Toastmsg", Toast.LENGTH_LONG).show();
    }*/
}
