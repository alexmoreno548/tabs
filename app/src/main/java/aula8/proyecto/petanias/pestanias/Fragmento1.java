package aula8.proyecto.petanias.pestanias;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by xavier on 24/06/16.
 */
public class Fragmento1 extends Fragment
{
    private View rootView;
    private TextView text;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.fragmento1, container, false);
        text = (TextView) rootView.findViewById(R.id.text1);

        Resources res = getResources();

        text.setText(res.getText(R.string.pes1String));

        return rootView;
    }
}
