package com.lese.fragpager;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by deceax on 2/1/2017.
 */

public class TextFragment extends Fragment {

    String message;

    public static final TextFragment newInstance(String message) {
        TextFragment fragment = new TextFragment();
        Bundle args = new Bundle(1);
        args.putString("message", message);
        fragment.setArguments(args);
        return fragment;
    }

    public TextFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        message = getArguments() != null ? getArguments().getString("message") : "missing";
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_text, container, false);
        ((TextView)view.findViewById(R.id.textView)).setText(message);
        return view;
    }
}
