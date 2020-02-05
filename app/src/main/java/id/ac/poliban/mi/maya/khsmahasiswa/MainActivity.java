package id.ac.poliban.mi.maya.khsmahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etNama = findViewById(R.id.etNama);
        final EditText etNim = findViewById(R.id.etNim);
        final EditText etKelas = findViewById(R.id.etKelas);
        final EditText etProdi = findViewById(R.id.etProdi);
        Button btClear = findViewById(R.id.btClear);
        Button btSubmit = findViewById(R.id.btSubmit);

        btClear.setOnClickListener(v -> {

            etNama.setText("");
            etNim.setText("");
            etKelas.setText("");
            etProdi.setText("");
        });

        btSubmit.setOnClickListener(v -> {
            etNama.setText("");
            etNim.setText("");
            etKelas.setText("");
            etProdi.setText("");
            etNama.requestFocus();
            Toast.makeText(this, "Berhasil", Toast.LENGTH_SHORT).show();


        });


    }
}
