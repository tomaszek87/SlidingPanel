package com.tomek.slidingpanel.panel.view;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.tomek.slidingpanel.R;
import com.tomek.slidingpanel.utils.tools.Utils;

public class SlidingDialog extends AppCompatDialogFragment {

    public static SlidingDialog newInstance() {
        SlidingDialog yourDialogFragment = new SlidingDialog();
        yourDialogFragment.setStyle(DialogFragment.STYLE_NO_FRAME, R.style.MaterialDialogSheet);
        return yourDialogFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sliding_panel, null);
        getDialog().getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        getDialog().getWindow().setAttributes(Utils.setDialogLayoutParams(getActivity(), getDialog(), 0.4));
        getDialog().getWindow().setGravity(Gravity.BOTTOM);
        view.setPadding(0,50,0,0);
        return view;
    }
}