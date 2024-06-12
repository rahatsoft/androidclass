package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int[] logo;
    LayoutInflater inflater;

    public CustomAdapter(Context context, int[] logo) {
        this.context = context;
        this.logo = logo;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return logo.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        v=inflater.inflate(R.layout.items_view, null);
        ImageView img = v.findViewById(R.id.imageView);
        img.setImageResource(logo[position]);

        return v;
    }
}
