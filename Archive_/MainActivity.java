

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity implements communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void respond(int item) {
    FragmentB fragmentB=(FragmentB) getFragmentManager().findFragmentById(R.id.frag_b);
        fragmentB.changeData(item);
    }
}//end of class
