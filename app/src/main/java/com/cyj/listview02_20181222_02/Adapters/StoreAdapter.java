package com.cyj.listview02_20181222_02.Adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.cyj.listview02_20181222_02.R;
import com.cyj.listview02_20181222_02.datas.Store;

import java.util.List;

public class StoreAdapter extends ArrayAdapter<Store> {

    public StoreAdapter(Context mContext, List<Store> mList){
        super(mContext,R.layout.store_list_item, mList);
    }
}
