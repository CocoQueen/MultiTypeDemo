package com.coco.multitypedemo;

import android.view.View;

/**
 * Created by ydx on 18-6-19.
 */

public interface TypeFactory {
    int type(One one);

    int type(Two two);

    int type(Three three);

    int type(Normal normal);

    BaseViewHolder createViewHolder(int type, View itemView);
}
