package opet.acs.com.avaliacaofilmes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Diego on 19/09/2018.
 */

public class FilmeAdapter extends ArrayAdapter<Filme> {
    private int rId;

    public FilmeAdapter(Context context, int resource, List<Filme> objects) {
        super(context, resource, objects);
        this.rId = resource;
    }

    @Override
    public View getView(int position, View currentView, ViewGroup parent){
        View mView = currentView;

        if(mView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mView = inflater.inflate(rId,null);
        }

        Filme filme = getItem(position);

        TextView textNome = mView.findViewById(R.id.textNome);
        TextView textGenero = mView.findViewById(R.id.textGenero);
        TextView textNota = mView.findViewById(R.id.textNota);

        textNome.setText(filme.getNome());
        textGenero.setText(filme.getGenero());
        textNota.setText(filme.getNota());

        return mView;
    }
}
