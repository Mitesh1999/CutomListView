package com.example.makwanamitesh.cutomlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<ModelClass> mData;

    public Adapter(Context mContext, ArrayList<ModelClass> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View view1 = LayoutInflater.from( mContext ).inflate( R.layout.custom_container, viewGroup, false );

        ModelClass data = mData.get( i );

        ImageView imageView = view1.findViewById( R.id.imageView );
        TextView textView = view1.findViewById( R.id.text_view );

        imageView.setImageResource( data.getImg() );
        textView.setText( data.getName() );

        return view1;
    }
}
