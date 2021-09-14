package com.inno.moofiy.ssad.labs;

import java.util.ArrayList;

public class SuperSmartList<T>{


    Adapter adapter;
    ArrayList<Object> arrayList;


    public void setAdapter(Adapter adapter) {
        this.adapter = adapter;
        adapter.createViewForList();
    }
}
