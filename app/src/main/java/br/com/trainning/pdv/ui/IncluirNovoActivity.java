package br.com.trainning.pdv.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import br.com.trainning.pdv.R;
import butterknife.Bind;

public class IncluirNovoActivity extends BaiseActivity {


    //texts
    @Bind(R.id.editText_descricao)
    EditText descricao;

    @Bind(R.id.editText_unidade)
    EditText unidade;

    @Bind(R.id.editText_codigo_barras)
    EditText codigoBarras;

    @Bind(R.id.editText_preco)
    EditText preco;


    //imagens
    @Bind(R.id.imageButton_camera)
    ImageButton botaoCamera;

    @Bind(R.id.imageButton_galeria)
    ImageButton botaoGaleria;

    @Bind(R.id.imageView_foto)
    ImageButton foto;

    //botao
    @Bind(R.id.fab)
    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incluir_novo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
