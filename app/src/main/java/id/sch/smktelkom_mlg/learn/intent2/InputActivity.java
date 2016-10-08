package id.sch.smktelkom_mlg.learn.intent2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class InputActivity extends AppCompatActivity {

    public static final String NAMA = "Nama";
    public static final String TAHUN_LAHIR = "TahunLahir";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);


    }
}
