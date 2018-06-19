package com.coco.multitypedemo;

import android.view.View;
import android.widget.TextView;


/**
 * Created by ydx on 18-6-19.
 */

public class ThreeViewHolder extends BaseViewHolder<Three> {
    public ThreeViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setUpView(Three model, int position, MultiTypeAdapter adapter) {
        TextView textView = (TextView) getView(R.id.three_title);
        textView.setText(model.getText());
    }
}
