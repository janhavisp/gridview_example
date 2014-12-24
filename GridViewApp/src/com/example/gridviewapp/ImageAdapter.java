package com.example.gridviewapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

	
	private Context mContext;
	public ImageAdapter(Context context){
		
		mContext=context;
	}
	public int getCount() {

		
		return mThubIds.length;
	}

	@Override
	public Object getItem(int arg0) {

		
		return null;
	}

	@Override
	public long getItemId(int arg0) {

		
		return 0;
	}

	
	public View getView(int position, View convertview, ViewGroup parent) {
		
		ImageView imageview;
		if(convertview==null ){
			imageview = new ImageView(mContext);
			imageview.setLayoutParams(new GridView.LayoutParams(150,150));
			imageview.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageview.setPadding(5,5,5,5);
			
		}
		else
		{
			imageview=(ImageView) convertview;
		}
			imageview.setImageResource(mThubIds[position]);
		
		
		return imageview;
	}
	public Integer[] mThubIds={
			R.drawable.sample_0,R.drawable.sample_3,
			R.drawable.sample_2,R.drawable.sample_4,
			R.drawable.sample_3,R.drawable.sample_0,
			R.drawable.sample_4,R.drawable.sample_6,
			R.drawable.sample_5,R.drawable.sample_5,
			R.drawable.sample_6,R.drawable.sample_3,
			R.drawable.sample_7,R.drawable.sample_2,
	};
}