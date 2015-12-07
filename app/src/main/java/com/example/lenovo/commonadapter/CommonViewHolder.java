package com.example.lenovo.commonadapter;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by lenovo on 2015/12/7.
 */
public class CommonViewHolder {


    SparseArray<View> viewArray=new SparseArray<>();
    View view;
    public CommonViewHolder(LayoutInflater inflater,View convertView,int resLayout) {
        view=inflater.inflate(resLayout, null);
        view.setTag(this);
    }

    public static CommonViewHolder get(LayoutInflater inflater,View convertView,int resLayout){
        if (convertView==null){
            return new CommonViewHolder(inflater,convertView,resLayout);
        }
        return (CommonViewHolder) convertView.getTag();
    }

    public <T extends View> T findView(View convertView, int resId){
        View view = null;
        if (viewArray.get(resId)==null) {
            view=convertView.findViewById(resId);
        }else{
            view=viewArray.get(resId);
        }

     return (T) view;
    }
    public View getConvertView() {
        return view;
    }




}
