package com.ddr.india.cook;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends Activity{
	Button countrywise,itemwise,moreapps,sharetheapp;
//	InterstitialAd mInterstitial;
//	private AdView mAdView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.home);
		

		
//		AppFlood.initialize(this, "wMLVpdVMmgsBH1J8", "asiZLbm05351L541c3ec1", AppFlood.AD_ALL);
//		AppFlood.showFullScreen(this);
//		AppFlood.showInterstitial(this);
//
//		mInterstitial = new InterstitialAd(this);
//		mInterstitial.setAdUnitId(getResources().getString(R.string.ad_unit_id));
//		mInterstitial.loadAd(new AdRequest.Builder().build());
//		mInterstitial.setAdListener(new ToastAdListener(HomeActivity.this) {
//			@Override
//			public void onAdLoaded() {
//				super.onAdLoaded();
//				if (mInterstitial.isLoaded()) {
//					mInterstitial.show();
//				}
//				System.out.println("ad show in block");
//			}
//
//			@Override
//			public void onAdFailedToLoad(int errorCode) {
//				super.onAdFailedToLoad(errorCode);
//				System.out.println("ad failed");
//			}
//		});
//		//AdView
//		mAdView = (AdView) findViewById(R.id.adView);
//		mAdView.setAdListener(new ToastAdListener(this));
//		mAdView.loadAd(new AdRequest.Builder().build());
		
		
		countrywise= findViewById(R.id.countrywise);
		itemwise= findViewById(R.id.itemwise);
		moreapps= findViewById(R.id.moreapps);
		sharetheapp= findViewById(R.id.shareapp);
		sharetheapp.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_SEND);
				intent.setType("text/plain");
				intent.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id=com.amartech.collagemakerfree.ui&hl=en");
				intent.putExtra(Intent.EXTRA_SUBJECT, "Try this App...!");
				startActivity(Intent.createChooser(intent, "Your Chooser Title"));
			}
		});
		countrywise.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(HomeActivity.this,MainActivity.class);
				startActivity(i);
			}
		});
		itemwise.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(HomeActivity.this,ItemActivity.class);
				startActivity(i);
			}
		});
		moreapps.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store/apps/developer?id=AMARNATH+TECHNOLOGY"));
				startActivity(i);
			}
		});
//		moreapps.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Toast.makeText(getApplicationContext(), "MoreApps Button", 5000).show();
//			}
//		});
		
		
	}

}
