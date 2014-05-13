

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentA extends Fragment {
    @Override
    public void onAttach(Activity activity){super.onAttach(activity);}

    @Override
    public void onCreate(Bundle savedInstances){super.onCreate(savedInstances);}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view_a= inflater.inflate(R.layout.frag_a,container,false);
        return view_a;
    }//end of method

    @Override
    public void onActivityCreated(Bundle savedInstances){super.onActivityCreated(savedInstances);}

    @Override
    public void onPause(){super.onPause();}
    @Override
    public void onStop(){super.onStop();}
    @Override
    public void onDestroy(){super.onDestroy();}
}//end iof class


