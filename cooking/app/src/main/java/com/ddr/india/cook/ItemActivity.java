package com.ddr.india.cook;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ItemActivity extends Activity{
	
	ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.item);
		
//		mInterstitial = new InterstitialAd(this);
//		mInterstitial.setAdUnitId(getResources().getString(R.string.ad_unit_id));
//		mInterstitial.loadAd(new AdRequest.Builder().build());
//		mInterstitial.setAdListener(new ToastAdListener(ItemActivity.this) {
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
//
		listView= findViewById(R.id.recpieslist);
		listView.setAdapter(new MyAdapter(ItemActivity.this));
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				if(arg2==0){
					Intent i=new Intent(ItemActivity.this,BakingRecpies.class);
					startActivity(i);
				}else if(arg2==1){
					Intent i=new Intent(ItemActivity.this,BiryaniRecpies.class);
					startActivity(i);
				}else if(arg2==2){
					Intent i=new Intent(ItemActivity.this,BreakfastRecpies.class);
					startActivity(i);
				}else if(arg2==3){
					Intent i=new Intent(ItemActivity.this,ChutneyRecpies.class);
					startActivity(i);
				}else if(arg2==4){
					Intent i=new Intent(ItemActivity.this,DessertsRecpies.class);
					startActivity(i);
				}else if(arg2==5){
					Intent i=new Intent(ItemActivity.this,DrinksRecpies.class);
					startActivity(i);
				}else if(arg2==6){
					Intent i=new Intent(ItemActivity.this,SaladRecpies.class);
					startActivity(i);
				}else if(arg2==7){
					Intent i=new Intent(ItemActivity.this,SoupRecpies.class);
					startActivity(i);
				}else if(arg2==8){
					Intent i=new Intent(ItemActivity.this,SnacksRecpies.class);
					startActivity(i);
				}else if(arg2==9){
					Intent i=new Intent(ItemActivity.this,ChickenRecpies.class);
					startActivity(i);
				}else if(arg2==10){
					Intent i=new Intent(ItemActivity.this,SeafoodRecpies.class);
					startActivity(i);
				}else if(arg2==11){
					Intent i=new Intent(ItemActivity.this,MuttonRecpies.class);
					startActivity(i);
				}
				
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
			return UniversalClass.itemimages.length;
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
			imageView.setBackgroundResource(UniversalClass.itemimages[position]);
			TextView tv= vi.findViewById(R.id.text);
			tv.setText(UniversalClass.itemtypes[position]);
			return vi;
		}
	}

}
