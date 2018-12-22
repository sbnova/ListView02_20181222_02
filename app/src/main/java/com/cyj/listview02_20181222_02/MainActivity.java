package com.cyj.listview02_20181222_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.cyj.listview02_20181222_02.Adapters.StoreAdapter;
import com.cyj.listview02_20181222_02.datas.Store;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    ListView storeListView;
    List<Store> storeList = new ArrayList<Store>();
    StoreAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setupEvents();
        setupValues();
    }

    @Override
    public void setupEvents() {
        storeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                position 변수에는 몇번째 줄이 눌렸는지를 담고 있음.
//                이를 활용해서 상황에 맞는 대처.

//                눌린 가게가 어떤 가게인지?
                Store clickedStore = storeList.get(position);

//                눌린 가게를 Intent에 첨부해서 가게 상세 화면으로 전할 + 이동.
                Intent intent = new Intent(mContext, StoreDetailActivity.class);
                intent.putExtra("storeData", clickedStore);
                startActivity(intent);
            }
        });

    }

    @Override
    public void setupValues() {
        fillStores();

        mAdapter = new StoreAdapter(mContext, storeList);
        storeListView.setAdapter(mAdapter);

    }

//    가게 데이터를 채우기 위한 임시 메소드
    void fillStores(){
        storeList.clear();

        storeList.add(new Store("BBQ", "종로구 10길", 4, "오후2시 ~ 오전1시", "01012345678"));
        storeList.add(new Store("네네치킨", "종로구 7길", 4, "오후3시 ~ 오전12시", "01098765432"));
        storeList.add(new Store("노랑통닭", "종로구 15길", 4, "오후1시 ~ 오전1시", "01012345678"));
        storeList.add(new Store("디디치킨", "종로구 8길", 4, "오후4시 ~ 오전3시", "01098765432"));
        storeList.add(new Store("BHC", "종로구 1길", 4, "오후12시 ~ 오전12시", "01012345678"));
        storeList.add(new Store("교촌치킨", "종로구 2길", 4, "오후2시 ~ 오전2시", "01098765432"));
        storeList.add(new Store("굽네치킨", "종로구 4길", 4, "오후3시 ~ 오전2시", "01012345678"));

    }

    @Override
    public void bindViews() {

        storeListView = findViewById(R.id.storeListView);

    }
}
