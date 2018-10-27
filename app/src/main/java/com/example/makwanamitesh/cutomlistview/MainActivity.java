package com.example.makwanamitesh.cutomlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private ArrayList<ModelClass> mData;
    private Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        mListView = findViewById( R.id.lv );

        mData = new ArrayList<>(  );
        mData.add( new ModelClass( R.drawable.ic_launcher_background, "Text 1" ) );
        mData.add( new ModelClass( R.drawable.ic_launcher_background, "Text 2" ) );
        mData.add( new ModelClass( R.drawable.ic_launcher_background, "Text 3" ) );
        mData.add( new ModelClass( R.drawable.ic_launcher_background, "Text 4" ) );
        mData.add( new ModelClass( R.drawable.ic_launcher_background, "Text 5" ) );
        mData.add( new ModelClass( R.drawable.ic_launcher_background, "Text 6" ) );
        mData.add( new ModelClass( R.drawable.ic_launcher_background, "Text 7" ) );
        mData.add( new ModelClass( R.drawable.ic_launcher_background, "Text 8" ) );

        mAdapter = new Adapter( this, mData );
        mListView.setAdapter( mAdapter );

    }
}
