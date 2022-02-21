package com.example.muhnna_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Integer[]Animals={R.drawable.cub2,R.drawable.cat4,R.drawable.cute6,R.drawable.lynx7,R.drawable.monkey10,R.drawable.wolf3};

    ImageView pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView grid =(GridView)findViewById(R.id.gridView);
        final ImageView pic =(ImageView)findViewById(R.id.imageView2);
        grid.setAdapter(new ImageAdapter(this));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {  @Override  public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            Toast.makeText(getBaseContext(),"Selected Species" + (position+1) ,Toast.LENGTH_SHORT).show();
            pic.setImageResource(Animals[position]);
        }});


    }
    public class ImageAdapter extends BaseAdapter {
        private Context context;
        public ImageAdapter( Context c){
            context= c;
        }
        @Override
        public int getCount(){
            return Animals.length;
        }

        @Override
        public Object getItem(int position){
            return null;
        }

        @Override
        public long getItemId(int position){
            return 0;
        }

        @Override
        public View getView(int position, View converView, ViewGroup parent){
            pic = new ImageView(context);
            pic.setImageResource(Animals[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_CENTER);
            pic.setLayoutParams(new ViewGroup.LayoutParams(200,200));

            return pic;
        }


    }
}