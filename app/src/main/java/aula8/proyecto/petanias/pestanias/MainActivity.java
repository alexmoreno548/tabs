package aula8.proyecto.petanias.pestanias;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends FragmentActivity
{
    private FragmentTabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarTabs();
    }


    private void inicializarTabs() {
        tabHost=(FragmentTabHost) findViewById(R.id.tabHost);
        tabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        Resources res= getResources();

        TabHost.TabSpec tab1= tabHost.newTabSpec("tab1");
        TabHost.TabSpec tab2= tabHost.newTabSpec("tab2");

        tab1.setIndicator(res.getString(R.string.pes1String),null);
        tab2.setIndicator(res.getString(R.string.pes2String),null);

        tabHost.addTab(tab1, Fragmento1.class, null);
        tabHost.addTab(tab2, Fragmento2.class, null);
    }
}
