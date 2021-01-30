package com.ddr.india.cook;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ScrollView;

public class ChineseRecpiesExpAct extends Activity{
	int position;
	ScrollView type1,type2,type3,type4,type5,type6,type7,type8,type9,type10,type11,type12,type13,type14,type15,type16,type17,type18,type19,type20
	,type21,type22,type23,type24,type25,type26,type27,type28,type29,type30;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.chineserecpiesexpact);
		type1= findViewById(R.id.type1);
		type2= findViewById(R.id.type2);
		type3= findViewById(R.id.type3);
		type4= findViewById(R.id.type4);
		type5= findViewById(R.id.type5);
		type6= findViewById(R.id.type6);
		type7= findViewById(R.id.type7);
		type8= findViewById(R.id.type8);
		type9= findViewById(R.id.type9);
		type10= findViewById(R.id.type10);
		type11= findViewById(R.id.type11);
		type12= findViewById(R.id.type12);
		type13= findViewById(R.id.type13);
		type14= findViewById(R.id.type14);
		type15= findViewById(R.id.type15);
		type16= findViewById(R.id.type16);
		type17= findViewById(R.id.type17);
		type18= findViewById(R.id.type18);
		type19= findViewById(R.id.type19);
		type20= findViewById(R.id.type20);
		type21= findViewById(R.id.type21);
		type22= findViewById(R.id.type22);
		type23= findViewById(R.id.type23);
		type24= findViewById(R.id.type24);
		type25= findViewById(R.id.type25);
		type26= findViewById(R.id.type26);
		type27= findViewById(R.id.type27);
		type28= findViewById(R.id.type28);
		type29= findViewById(R.id.type29);
		type30= findViewById(R.id.type30);
		position=this.getIntent().getExtras().getInt("Position")+1;
		if(position==1){
			type1.setVisibility(View.VISIBLE);
		}else if(position==2){
			type2.setVisibility(View.VISIBLE);
		}else if(position==2){
			type2.setVisibility(View.VISIBLE);
		}else if(position==3){
			type3.setVisibility(View.VISIBLE);
		}else if(position==4){
			type4.setVisibility(View.VISIBLE);
		}else if(position==5){
			type5.setVisibility(View.VISIBLE);
		}else if(position==6){
			type6.setVisibility(View.VISIBLE);
		}else if(position==7){
			type7.setVisibility(View.VISIBLE);
		}else if(position==8){
			type8.setVisibility(View.VISIBLE);
		}else if(position==9){
			type9.setVisibility(View.VISIBLE);
		}else if(position==10){
			type10.setVisibility(View.VISIBLE);
		}else if(position==11){
			type11.setVisibility(View.VISIBLE);
		}else if(position==12){
			type12.setVisibility(View.VISIBLE);
		}else if(position==13){
			type13.setVisibility(View.VISIBLE);
		}else if(position==14){
			type14.setVisibility(View.VISIBLE);
		}else if(position==15){
			type15.setVisibility(View.VISIBLE);
		}else if(position==16){
			type16.setVisibility(View.VISIBLE);
		}else if(position==17){
			type17.setVisibility(View.VISIBLE);
		}else if(position==18){
			type18.setVisibility(View.VISIBLE);
		}else if(position==19){
			type19.setVisibility(View.VISIBLE);
		}else if(position==20){
			type20.setVisibility(View.VISIBLE);
		}else if(position==21){
			type21.setVisibility(View.VISIBLE);
		}else if(position==22){
			type22.setVisibility(View.VISIBLE);
		}else if(position==23){
			type23.setVisibility(View.VISIBLE);
		}else if(position==24){
			type24.setVisibility(View.VISIBLE);
		}else if(position==25){
			type25.setVisibility(View.VISIBLE);
		}else if(position==26){
			type26.setVisibility(View.VISIBLE);
		}else if(position==27){
			type27.setVisibility(View.VISIBLE);
		}else if(position==28){
			type28.setVisibility(View.VISIBLE);
		}else if(position==29){
			type29.setVisibility(View.VISIBLE);
		}else if(position==30){
			type30.setVisibility(View.VISIBLE);
		}
		
		
		
	}

}
