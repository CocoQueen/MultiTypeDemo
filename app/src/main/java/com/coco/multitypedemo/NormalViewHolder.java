package com.coco.multitypedemo;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by ydx on 18-6-19.
 */

public class NormalViewHolder extends BaseViewHolder<Normal> {
    public NormalViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setUpView(final Normal model, int position, MultiTypeAdapter adapter) {
        final TextView textView = (TextView) getView(R.id.normal_title);
        textView.setText(model.getText());

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(textView.getContext(),model.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
