package com.example.list;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.List;

public class OzelAdaptor extends BaseAdapter {

    LayoutInflater layoutInflater;
    List<gidalar> list;
    Activity activity;

    public OzelAdaptor(Activity activity, List<gidalar> mList) {
        layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        list = mList;
        this.activity = activity;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View satirView;

        satirView = layoutInflater.inflate(R.layout.satir, null);

        ImageView iv = (ImageView) satirView.findViewById(R.id.imageView);
        TextView tv = (TextView) satirView.findViewById((R.id.textViewIsim));
        TextView tv2 = (TextView) satirView.findViewById((R.id.textViewFiyat));
        Button button = (Button) satirView.findViewById(R.id.button);

        final gidalar gidalar = list.get(position);


        tv.setText(gidalar.getIsim().toString());
        tv2.setText(NumberFormat.getCurrencyInstance().format(gidalar.getFiyat()));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, gidalar.getIsim().toString() + "  aldınız ", Toast.LENGTH_SHORT).show();
            }
        });


        String gidaisim = gidalar.getIsim().toString();

        if (gidaisim.equals("üzüm")) {
            iv.setImageResource(R.drawable.uzum);
        } else if (gidaisim.equals("elma")) {
            iv.setImageResource(R.drawable.elma);
        } else if (gidaisim.equals("armut")) {
            iv.setImageResource(R.drawable.armut);
        }


            return satirView;
        }

    }
