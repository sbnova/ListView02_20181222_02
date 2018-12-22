package com.cyj.listview02_20181222_02.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.cyj.listview02_20181222_02.R;
import com.cyj.listview02_20181222_02.datas.Store;

import java.util.List;

public class StoreAdapter extends ArrayAdapter<Store> {

    Context mContext;
    List<Store> mList;
    LayoutInflater inf;

    public StoreAdapter(Context mContext, List<Store> mList){
        super(mContext,R.layout.store_list_item, mList);

        this.mContext = mContext;
        this.mList = mList;
        this.inf = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if(row == null){
            row = inf.inflate(R.layout.store_list_item, null);
        }

        TextView storeNameTxt = row.findViewById(R.id.storeNameTxt);
        TextView storeAddressTxt = row.findViewById(R.id.storeAddressTxt);
        Button storeCallBtn = row.findViewById(R.id.storeCallBtn);
        TextView storeOpenTimeTxt = row.findViewById(R.id.storeOpenTimeTxt);

        final Store data = mList.get(position);

        storeNameTxt.setText(data.getName());
        storeAddressTxt.setText(data.getAddress());
        storeOpenTimeTxt.setText(data.getOpenAndCloseTime());

        storeCallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, data.getPhoneNum()+"전화를 겁니다.", Toast.LENGTH_SHORT).show();
            }
        });

        return row;
    }
}
