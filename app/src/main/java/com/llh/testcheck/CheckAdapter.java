package com.llh.testcheck;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

/**
 * 项目名:    TestCheck
 * 包名:      com.llh.testcheck
 * 文件名:    CheckAdapter
 * 创建者:    LLH
 * 创建时间:  2019/8/5 20:12
 * 描述:      TODO
 */
public class CheckAdapter extends RecyclerView.Adapter <CheckAdapter.ViewHolder>{
    private List<CheckTest> mList;
    //构造函数
    public CheckAdapter(List<CheckTest> mList){
        this.mList = mList;
    }
    //定义一个内部类
    static class ViewHolder extends RecyclerView.ViewHolder{
        CheckBox checkBox;
        TextView textView;
        public ViewHolder(View view){
            super(view);
            checkBox = (CheckBox)view.findViewById(R.id.checkbox);
            textView = (TextView)view.findViewById(R.id.text);
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //绑定视图
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_check,viewGroup,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        CheckTest checkTest = mList.get(i);
        viewHolder.checkBox.setChecked(checkTest.getCheck());
        viewHolder.textView.setText(checkTest.getCheckText());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
