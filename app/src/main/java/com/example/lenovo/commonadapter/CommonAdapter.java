package com.example.lenovo.commonadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.IllegalFormatCodePointException;
import java.util.List;

/**
 * Created by lenovo on 2015/12/7.
 */
public class CommonAdapter<T> extends BaseAdapter {

    LayoutInflater inflater;
    List<T> dataList;

    int resLayout;
    Context context;

    public CommonAdapter(Context context,int resLayout,List<T> datas) {
        this.resLayout = resLayout;
        this.dataList=datas;
        this.context=context;
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater==null){
            inflater=LayoutInflater.from(context);
        }
        CommonViewHolder commonViewHolder=CommonViewHolder.get(inflater,convertView,resLayout);
        TextView textView=commonViewHolder.findView(commonViewHolder.getConvertView(),R.id.textview);
        textView.setText((CharSequence) getItem(position));


        return commonViewHolder.getConvertView();
    }
}
