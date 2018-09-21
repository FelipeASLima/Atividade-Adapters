package opet.acs.com.avaliacaofilmes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Filme> filmes;
    private EditText editNome;
    private Spinner spinnerGenero;
    private Spinner spinnerNota;
    private ListView listFilme;
    private ArrayAdapter<Filme> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filmes = new ArrayList<>();
        editNome = findViewById(R.id.editNome);
        spinnerGenero = findViewById(R.id.spinnerGenero);
        spinnerNota = findViewById(R.id.spinnerNota);
        listFilme = findViewById(R.id.listFilme);
        atualizarFilmes();
    }

    private void atualizarFilmes(){
        if(adapter == null) {
            adapter = new FilmeAdapter(getApplicationContext(), R.layout.filme_item, filmes);
            listFilme.setAdapter(adapter);
        }else{
            adapter.notifyDataSetChanged();
        }
    }

    public void salvarArtista(View v){
        String nome = editNome.getText().toString();
        String genero = spinnerGenero.getSelectedItem().toString();
        String nota = spinnerNota.getSelectedItem().toString();
        Filme a = new Filme();
        a.setNome(nome);
        a.setGenero(genero);
        a.setNota(nota);

        filmes.add(a);
        atualizarFilmes();
    }
}









