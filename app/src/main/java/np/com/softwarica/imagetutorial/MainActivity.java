package np.com.softwarica.imagetutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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

        rdRajesh.setOnClickListener(this);
        rdShiva.setOnClickListener(this);
        rdBhuwan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rdRajesh:
                imgDais.setImageResource(R.drawable.rajesh);
                break;
            case R.id.rdShiva:
                imgDais.setImageResource(R.drawable.shiva);
                break;
            case R.id.rdBhuwan:
                imgDais.setImageResource(R.drawable.bhuwan);
                break;

        }
    }
}
