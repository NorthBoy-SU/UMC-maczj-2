package com.ZJUMC.umc.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ZJUMC.umc.R;
import com.ZJUMC.umc.Util.Util;
import com.ZJUMC.umc.activity.AnalyzeActivity;
import com.ZJUMC.umc.activity.FStepActivity;

/**
 * @author: Lemon-XQ
 * @date: 2018/1/24
 * @description: 工具箱界面
 */
public class ToolFragment extends Fragment {

    private View view;
    private Button analyzeBtn;
    private Button fstepBtn;
    private Button foodIdentifyBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tool, container, false);
        InitComponent();
        return view;
    }

    private void InitComponent(){
        analyzeBtn = view.findViewById(R.id.analyze);
        foodIdentifyBtn = view.findViewById(R.id.foodIdentify);
        fstepBtn = view.findViewById(R.id.fstep);

        analyzeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AnalyzeActivity.class);
                startActivity(intent);
            }
        });

        foodIdentifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Util.makeToast(getActivity(),"此功能开发中，敬请期待");
            }
        });

        fstepBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), FStepActivity.class);
                startActivity(intent);
            }
        });

    }

}

