package com.example.tick.furniture.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tick.furniture.R;

import java.util.zip.Inflater;

/**
 * Created by Tick on 2016/5/13.
 */
public class TypeFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.type_fg,container,false);
        return view;
    }
}
