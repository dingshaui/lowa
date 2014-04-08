package com.locationwallet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.location.Location;
import com.locationwallet.R;
import com.fima.cardsui.views.CardUI;
import com.locationwallet.MyLocation.LocationResult;

public class MainActivity extends Activity {

	private CardUI mCardView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mCardView = (CardUI) findViewById(R.id.cardsview);
        CardManager cm = new CardManager();
        cm.ShowCards(mCardView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void finishInput(View view) {
        Log.i("Mylog", "get latitude and longtitude");
		
		LocationResult locationResult = new LocationResult(){
		    @Override
		    public void gotLocation(Location location){
                Log.i("Mylog", "latitude" + location.getLatitude());
                Log.i("Mylog", "longtitude" + location.getLongitude());
		    }
		};
		MyLocation myLocation = new MyLocation();
		myLocation.getLocation(this, locationResult);
	}
}
