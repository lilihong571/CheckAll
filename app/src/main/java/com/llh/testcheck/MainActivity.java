package com.llh.testcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //声明控件
    private RecyclerView recyclerView;
    private List<CheckTest> mCheckList = new ArrayList<>();
    private Button button;
    CheckAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化复选框数据
        initFruit();
        button = (Button)findViewById(R.id.btn_select);
        button.setOnClickListener(this);
        recyclerView = (RecyclerView)findViewById(R.id.rv_main);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new CheckAdapter(mCheckList);
        recyclerView.setAdapter(adapter);
    }
    private void initFruit() {
        for (int i=0; i<10; i++){
            CheckTest checkTest = new CheckTest(false,"这是一个复选框");
            mCheckList.add(checkTest);
        }
        Log.d("mCheckList", "initFruit: "+mCheckList.size());
        Log.d("mCheckList", "initFruit: "+mCheckList);
    }
    @Override
    public void onClick(View v) {
        CheckTest checkTest = null;
        switch (v.getId()){
            case R.id.btn_select:
                if(button.getText() == "全选"){
                    for (int i=0; i<mCheckList.size(); i++){
                        //获取recyclerView中的子项
                        checkTest = mCheckList.get(i);
                        checkTest.setCheck(true);
                    }
                    button.setText("全不选");

                }
                else {
                    for (int i=0; i<mCheckList.size(); i++)
                    {
                        checkTest = mCheckList.get(i);
                        checkTest.setCheck(false);
                    }button.setText("全选");
                }
                adapter.notifyDataSetChanged();
                break;
        }
    }
}
/*
//for (int i=0; i<recyclerView.getChildCount(); i++){
                for (int i=0; i<mCheckList.size(); i++){
                    //获取recyclerView中的子项
                    View view = (CheckBox)recyclerView.getChildAt(i).findViewById(R.id.checkbox);
                    Log.d("llhData", "onClick: "+ i +"   "+ view);
                    ((CheckBox) view).setChecked(true);
                }

                //获设置一个值，传到适配器上，使得所有的复选框都选中
                if(CheckData.getInstance().checkStatus == false)
                {
                    CheckData.getInstance().checkStatus = true;
                }else if(CheckData.getInstance().checkStatus == true){
                    CheckData.getInstance().checkStatus = false;
                }
 */