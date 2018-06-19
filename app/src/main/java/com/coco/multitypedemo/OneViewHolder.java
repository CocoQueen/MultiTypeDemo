package com.coco.multitypedemo;

import android.view.View;
import android.widget.TextView;



/**
 * Created by ydx on 18-6-19.
 */

public class OneViewHolder extends BaseViewHolder<One> {
    public OneViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setUpView(One model, int position, MultiTypeAdapter adapter) {
        TextView textView = (TextView) getView(R.id.one_title);
        textView.setText(model.getText());
    }
}
