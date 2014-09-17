package com.habr25less.adaptertest2.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sovan on 15.09.2014.
 */
public class PhoneModelAdapter extends BaseAdapter {
    private List<PhoneModel> mList;// = new ArrayList<PhoneModel>();
    private LayoutInflater mInflater;

    public PhoneModelAdapter(Context context, List<PhoneModel> list) {
        this.mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return (PhoneModel) mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null)
            view = mInflater.inflate(R.layout.list_layout, parent, false);

        ((TextView) view.findViewById(R.id.textView)).setText(getItem(position).toString());


        return view;
    }
}
