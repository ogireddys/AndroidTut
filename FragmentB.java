package com.niveditha.fragmentpractise.app;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Nivu on 5/11/14.
 */
public class FragmentB extends Fragment {
    private TextView text_b;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstances){
        View view_b=inflater.inflate(R.layout.fragment_b,container,false);
        return view_b;
    }//end
    @Override
    public void onActivityCreated(Bundle savedInstances){
        super.onActivityCreated(savedInstances);
        text_b=(TextView)getView().findViewById(R.id.text_b);

    }//end of method
    public void changeData(int i){
        Resources res= getResources();
        String[] description=res.getStringArray(R.array.description_a);
        text_b.setText(description[i]);
    }
}//end of class
