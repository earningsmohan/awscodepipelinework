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
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class AfricanRecpies extends Activity{
	ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.africanrecpies);
		listView= findViewById(R.id.africanrecpieslist);
		listView.setAdapter(new MyAdapter(AfricanRecpies.this));
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Intent i=new Intent(AfricanRecpies.this,AfricanRecpiesExpAct.class);
				i.putExtra("Position", arg2);
				startActivity(i);
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
			return UniversalClass.Africanimages.length;
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
			imageView.setBackgroundResource(UniversalClass.Africanimages[position]);
			TextView tv= vi.findViewById(R.id.text);
			tv.setText(UniversalClass.Africantypes[position]);
			return vi;
		}
	}
}
