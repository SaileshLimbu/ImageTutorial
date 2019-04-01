package np.com.softwarica.imagetutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private RadioButton rdRajesh, rdShiva, rdBhuwan;
    private ImageView imgDais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdRajesh = findViewById(R.id.rdRajesh);
        rdShiva = findViewById(R.id.rdShiva);
        rdBhuwan = findViewById(R.id.rdBhuwan);
        imgDais = findViewById(R.id.imgDais);
    }
}
