package com.coco.multitypedemo;

import android.view.View;
import android.widget.TextView;


/**
 * Created by ydx on 18-6-19.
 */

public class TwoViewHolder extends BaseViewHolder<Two> {
    public TwoViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setUpView(Two model, int position, MultiTypeAdapter adapter) {
        TextView textView = (TextView) getView(R.id.two_title);
        textView.setText(model.getText());
    }
}
