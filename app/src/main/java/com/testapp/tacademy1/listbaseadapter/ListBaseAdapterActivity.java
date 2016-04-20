package com.testapp.tacademy1.listbaseadapter;

import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
public class ListBaseAdapterActivity extends Activity {

    ListView list;
    MyAdapter adapter;
    ArrayList<MyData> arrData;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //리스트에 보여줄 데이터를 세팅한다.
        setData();

        //어댑터 생성
        adapter = new MyAdapter(this, arrData);

        //리스트뷰에 어댑터 연결
        list = (ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

    }

    private void setData(){
        arrData = new ArrayList<MyData>();
        arrData.add(new MyData(R.drawable.ic_launcher, "소녀시대", "010-1111-2222", "girlsGeneration@naver.com"));
        arrData.add(new MyData(R.drawable.ic_launcher, "쥬얼리", "010-3333-4444", "juerly@daum.net"));
        arrData.add(new MyData(R.drawable.ic_launcher, "시크릿", "010-5555-6666", "secret@paran.com"));
    }
}