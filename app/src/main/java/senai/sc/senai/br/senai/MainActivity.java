package senai.sc.senai.br.senai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.et_texto);
        editText2 = findViewById(R.id.et_texto2);

    }

    public void onClickBtnMostrar(View v){
        EditText editText = findViewById(R.id.et_texto);
        EditText editText2 = findViewById(R.id.et_texto2);
        Toast.makeText(MainActivity.this, editText.getText().toString() + " "+ editText2.getText().toString(), Toast.LENGTH_LONG).show();

    }

    public void onClickBtnLimpar(View v){
        editText.setText("");
        editText2.setText("");
    }

}
