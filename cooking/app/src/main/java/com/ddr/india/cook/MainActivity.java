package com.ddr.india.cook;

import android.app.Activity;
import android.app.ActionBar.LayoutParams;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity{
	
	ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.main);
		
//		mInterstitial = new InterstitialAd(this);
//		mInterstitial.setAdUnitId(getResources().getString(R.string.ad_unit_id));
//		mInterstitial.loadAd(new AdRequest.Builder().build());
//		mInterstitial.setAdListener(new ToastAdListener(MainActivity.this) {
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
		
		listView= findViewById(R.id.recpieslist);
		listView.setAdapter(new MyAdapter(MainActivity.this));
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				if(arg2==0){
					Intent i=new Intent(MainActivity.this,AfricanRecpies.class);
					startActivity(i);
				}else if(arg2==1){
					Intent i=new Intent(MainActivity.this,AmericanRecpies.class);
					startActivity(i);
				}else if(arg2==2){
					Intent i=new Intent(MainActivity.this,ChineseRecpies.class);
					startActivity(i);
				}else if(arg2==3){
					Intent i=new Intent(MainActivity.this,FrenchRecpies.class);
					startActivity(i);
				}else if(arg2==4){
					Intent i=new Intent(MainActivity.this,GermanRecpies.class);
					startActivity(i);
				}else if(arg2==5){
					Intent i=new Intent(MainActivity.this,InternationalRecpies.class);
					startActivity(i);
				}else if(arg2==6){
					Intent i=new Intent(MainActivity.this,ItalianRecpies.class);
					startActivity(i);
				}else if(arg2==7){
					Intent i=new Intent(MainActivity.this,japneseRecpies.class);
					startActivity(i);
				}else if(arg2==8){
					Intent i=new Intent(MainActivity.this,JewishRecpies.class);
					startActivity(i);
				}else if(arg2==9){
					Intent i=new Intent(MainActivity.this,KoreanRecpies.class);
					startActivity(i);
				}else if(arg2==10){
					Intent i=new Intent(MainActivity.this,MexicRecpies.class);
					startActivity(i);
				}else if(arg2==11){
					Intent i=new Intent(MainActivity.this,MiddleEastRecpies.class);
					startActivity(i);
				}else if(arg2==12){
					Intent i=new Intent(MainActivity.this,NepaleseRecpies.class);
					startActivity(i);
				}else if(arg2==13){
					Intent i=new Intent(MainActivity.this,PakistaniRecpies.class);
					startActivity(i);
				}else if(arg2==14){
					Intent i=new Intent(MainActivity.this,ThaiRecpies.class);
					startActivity(i);
				}else if(arg2==15){
					Intent i=new Intent(MainActivity.this,SrilankanRecpies.class);
					startActivity(i);
				}else if(arg2==16){
					/*Intent i=new Intent(MainActivity.this,IndianRecpies.class);
					startActivity(i);*/
					LayoutInflater layoutInflater = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
					View popupView = layoutInflater.inflate(R.layout.indianrecipesact, null);
					final PopupWindow popupWindow = new PopupWindow(popupView, LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
					RelativeLayout real1= popupView.findViewById(R.id.relative1);
					RelativeLayout real2= popupView.findViewById(R.id.relative2);
					RelativeLayout real3= popupView.findViewById(R.id.relative3);
					RelativeLayout real4= popupView.findViewById(R.id.relative4);
					Button btnDismiss = popupView.findViewById(R.id.btn_dismiss);
					popupWindow.setOutsideTouchable(true);
					popupWindow.setFocusable(true);
					popupWindow.setBackgroundDrawable(new BitmapDrawable());
					real1.setOnClickListener(new OnClickListener() {
						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							Intent i=new Intent(MainActivity.this,VegSouthRecpies.class);
							i.putExtra("Position", 0);
							//Toast.makeText(getApplicationContext(), "length:"+UniversalClass.chineseimages.length, 5000).show();
							startActivity(i);
							popupWindow.dismiss();
						}
					});
					real2.setOnClickListener(new OnClickListener() {
								
								@Override
								public void onClick(View arg0) {
									// TODO Auto-generated method stub
									Intent i=new Intent(MainActivity.this,NonVegSouthRecpies.class);
									i.putExtra("Position", 1);
									//Toast.makeText(getApplicationContext(), "length:"+UniversalClass.chineseimages.length, 5000).show();
									startActivity(i);
									popupWindow.dismiss();
								}
							});
					real3.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							Intent i=new Intent(MainActivity.this,VegNorthRecpies.class);
							i.putExtra("Position", 2);
							//Toast.makeText(getApplicationContext(), "length:"+UniversalClass.chineseimages.length, 5000).show();
							startActivity(i);
							popupWindow.dismiss();
						}
					});
					real4.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							Intent i=new Intent(MainActivity.this,NonVegNorthRecpies.class);
							i.putExtra("Position", 3);
							//Toast.makeText(getApplicationContext(), "length:"+UniversalClass.chineseimages.length, 5000).show();
							startActivity(i);
							popupWindow.dismiss();
						}
					});
					popupWindow.showAtLocation(listView, Gravity.CENTER, 0,0);
				}
				//Toast.makeText(getApplicationContext(), "options  are  Under Develping", 5000).show();
				
				
			}
		});
	}
	
	public class MyAdapter extends BaseAdapter{
		private Context mContext;
		public MyAdapter(Context c){
			mContext=c;
		}
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return UniversalClass.images.length;
		}
		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			LayoutInflater inflater=(LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
			View vi=inflater.inflate(R.layout.customliststyle, null);
			ImageView imageView= vi.findViewById(R.id.list_image);
			imageView.setBackgroundResource(UniversalClass.images[position]);
			TextView tv= vi.findViewById(R.id.text);
			tv.setText(UniversalClass.types[position]);
			return vi;
		}
	}

}
