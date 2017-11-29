package com.example.a18097.myapplication3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by 18097 on 2017/7/18.
 */

public class WeaponAdapter extends BaseAdapter {


    private final String[] mStrName;
    private final Context mContext;

    public WeaponAdapter(String[] mName, Context context){
        mStrName =mName;
        mContext =context;
    }

    @Override
    public int getCount() {
        return mStrName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View inflate = View.inflate(mContext,R.layout.tv_item,null);

        TextView tvname = (TextView) inflate.findViewById(R.id.tv_name);
        /**传递数组内容*/
        String strNameData=mStrName[i];
        tvname.setText(strNameData);

        return inflate;

    }
}
