package senai.sc.senai.br.senai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickBtnMostrar(View v){
        EditText editText = findViewById(R.id.et_texto);
        Toast.makeText(MainActivity.this, editText.getText(), Toast.LENGTH_LONG).show();

    }

}
