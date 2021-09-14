package com.inno.moofiy.ssad.labs;

import java.util.List;

public abstract class Adapter<T> {
    abstract List<T> createViewForList(T view);
}
