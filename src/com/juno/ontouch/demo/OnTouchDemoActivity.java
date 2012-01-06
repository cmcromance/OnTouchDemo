package com.juno.ontouch.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

public class OnTouchDemoActivity extends Activity implements OnTouchListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ImageView ivFacebook = (ImageView)findViewById(R.id.iv_facebook);
        
        ivFacebook.setOnTouchListener(this);
        ivFacebook.setClickable(true);
    }

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		
		int action = event.getAction();
		int id = v.getId();
		
		if(action==MotionEvent.ACTION_DOWN) {
			if(id == R.id.iv_facebook) {
				Log.d("TAG", "OnTouch : ACTION_DOWN");
			}
        }
        else if(action==MotionEvent.ACTION_UP){
        	if(id == R.id.iv_facebook) {
        		Log.d("TAG", "OnTouch : ACTION_UP");
    		}
        }
        else if(action==MotionEvent.ACTION_MOVE){
        	if(id == R.id.iv_facebook) {
        		Log.d("TAG", "OnTouch : ACTION_MOVE");
    		}
        }
		
		return false;
	}
    
    
}