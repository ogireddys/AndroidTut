package com.niveditha.fragmentpractise.app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Nivu on 5/11/14.
 */
public class FragmentA extends Fragment implements  AdapterView.OnItemClickListener{
    private ListView list_a;
     communicator communicator_object;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view= inflater.inflate(R.layout.fragment_a,container,false);
        return view;
    }//end
    @Override
    public void onActivityCreated(Bundle savedInstances){
        super.onActivityCreated(savedInstances);
        communicator_object=(communicator)getActivity();
        list_a=(ListView)getView().findViewById(R.id.listView_a);
        ArrayAdapter adapter=ArrayAdapter.createFromResource(getActivity(),R.array.array_a,android.R.layout.simple_expandable_list_item_1);
        list_a.setAdapter(adapter);
        list_a.setOnItemClickListener(this);
    }//end of on Activity


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        communicator_object.respond(position);
    }//end of method
}//end of class
