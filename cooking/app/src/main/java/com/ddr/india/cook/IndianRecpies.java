package com.ddr.india.cook;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class IndianRecpies extends Activity{
	ListView listView;
	RelativeLayout real1,real2,real3,real4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.indianrecipesact);
		real1= findViewById(R.id.relative1);
		real2= findViewById(R.id.relative2);
		real3= findViewById(R.id.relative3);
		real4= findViewById(R.id.relative4);
		real1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(IndianRecpies.this,VegSouthRecpies.class);
				i.putExtra("Position", 0);
				//Toast.makeText(getApplicationContext(), "length:"+UniversalClass.chineseimages.length, 5000).show();
				startActivity(i);
			}
		});
		real2.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent i=new Intent(IndianRecpies.this,NonVegSouthRecpies.class);
						i.putExtra("Position", 1);
						//Toast.makeText(getApplicationContext(), "length:"+UniversalClass.chineseimages.length, 5000).show();
						startActivity(i);
					}
				});
		real3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(IndianRecpies.this,VegNorthRecpies.class);
				i.putExtra("Position", 2);
				//Toast.makeText(getApplicationContext(), "length:"+UniversalClass.chineseimages.length, 5000).show();
				startActivity(i);
			}
		});
		real4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(IndianRecpies.this,NonVegNorthRecpies.class);
				i.putExtra("Position", 3);
				//Toast.makeText(getApplicationContext(), "length:"+UniversalClass.chineseimages.length, 5000).show();
				startActivity(i);
			}
		});

		/*listView=(ListView)findViewById(R.id.africanrecpieslist);
		listView.setAdapter(new MyAdapter(IndianRecpies.this));
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub'
				if(arg2==0){
					Intent i=new Intent(IndianRecpies.this,VegSouthRecpies.class);
					i.putExtra("Position", arg2);
					//Toast.makeText(getApplicationContext(), "length:"+UniversalClass.chineseimages.length, 5000).show();
					startActivity(i);
				}else if(arg2==1){
					Intent i=new Intent(IndianRecpies.this,NonVegSouthRecpies.class);
					i.putExtra("Position", arg2);
					//Toast.makeText(getApplicationContext(), "length:"+UniversalClass.chineseimages.length, 5000).show();
					startActivity(i);
				}else if(arg2==2){
					Intent i=new Intent(IndianRecpies.this,VegNorthRecpies.class);
					i.putExtra("Position", arg2);
					//Toast.makeText(getApplicationContext(), "length:"+UniversalClass.chineseimages.length, 5000).show();
					startActivity(i);
				}else if(arg2==3){
					Intent i=new Intent(IndianRecpies.this,NonVegNorthRecpies.class);
					i.putExtra("Position", arg2);
					//Toast.makeText(getApplicationContext(), "length:"+UniversalClass.chineseimages.length, 5000).show();
					startActivity(i);
				}
			}
		});*/
	}
	public class MyAdapter extends BaseAdapter{
		private Context mContext;
		public MyAdapter(Context c){
			mContext=c;
		}
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return UniversalClass.indianimg.length;
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
			View vi=inflater.inflate(R.layout.africanliststyle, null);
			ImageView imageView= vi.findViewById(R.id.list_image);
			imageView.setBackgroundResource(UniversalClass.indianimg[position]);
			TextView tv= vi.findViewById(R.id.text);
			tv.setText(UniversalClass.indianreci[position]);
			return vi;
		}
	}

}
