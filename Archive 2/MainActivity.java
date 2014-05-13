

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements FragmentManager.OnBackStackChangedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addA=(Button)findViewById(R.id.add_a);
        addA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addA();
            }
        });

        final Button detach_a=(Button)findViewById(R.id.detach_a);
        detach_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dettachA();
            }
        });
        Button attach_a=(Button)findViewById(R.id.attach_a);
        attach_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attachA();
            }
        });


        Button removeA=(Button)findViewById(R.id.remove_a);
        removeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeA();
            }
        });

        Button buttonB=(Button)findViewById(R.id.add_b);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addB();
            }
        });

         Button removeB=(Button)findViewById(R.id.remove_b);
        removeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeB();
            }
        });

        Button replaceAB=(Button)findViewById(R.id.replac_a_b);
        replaceAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceAB();
            }
        });

    }//end of oncreate

    public void addA(){
        FragmentA frag_A= new FragmentA();
        FragmentTransaction trasactio_A=getFragmentManager().beginTransaction();
        trasactio_A.add(R.id.dispaly_group,frag_A,"A");
        trasactio_A.addToBackStack("addA");
        trasactio_A.commit();
    }//end of add

    public void addB(){
        FragmentB frag_b= new FragmentB();
        FragmentTransaction ft= getFragmentManager().beginTransaction();
        ft.add(R.id.dispaly_group,frag_b,"B");
        ft.addToBackStack("addB");

        ft.commit();
    }//end

    public void removeA(){
        FragmentA fa=(FragmentA)getFragmentManager().findFragmentByTag("A");

        FragmentTransaction ft= getFragmentManager().beginTransaction();
        if(fa!=null){
            ft.remove(fa);
           ft.addToBackStack("removeA");
            ft.commit();
        }//end of if
        else
        {
            Toast.makeText(this,"Please add the ragment",Toast.LENGTH_LONG).show();
        }//end of else

    }//end

    public void removeB(){
        FragmentB fb=(FragmentB)getFragmentManager().findFragmentByTag("B");

        FragmentTransaction ft= getFragmentManager().beginTransaction();
        if(fb!=null){
            ft.remove(fb);
           ft.addToBackStack("removeB");
            ft.commit();
        }//end of if
        else
        {
            Toast.makeText(this,"Please add the ragment",Toast.LENGTH_LONG).show();
        }//end of else
    }//end

    public void replaceAB(){
        FragmentB repB= new FragmentB();
        FragmentTransaction ft=getFragmentManager().beginTransaction();
        ft.replace(R.id.dispaly_group,repB,"AtoB");
       ft.addToBackStack("replaceAB");

        ft.commit();
    }//end

    public void attachA(){
        FragmentA fa=(FragmentA)getFragmentManager().findFragmentByTag("A");

        FragmentTransaction ft= getFragmentManager().beginTransaction();

        if(fa!=null){ft.attach(fa);

        ft.commit();}
    }
    public void dettachA(){
        FragmentA fa=(FragmentA)getFragmentManager().findFragmentByTag("A");

        FragmentTransaction ft= getFragmentManager().beginTransaction();

        if(fa!=null){ft.detach(fa);
                ft.addToBackStack("detachA");
            ft.commit();}
    }//end of

    @Override
    public void onBackStackChanged() {

    }
}//end of class
