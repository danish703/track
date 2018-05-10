package np.com.rajanaryal.pari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button Trackme = findViewById(R.id.Trackme);
        Button Addme = findViewById(R.id.Addme);
        Button aboutus=findViewById(R.id.aboutus);

        Button faq = findViewById(R.id.faq);
        Button exit=findViewById(R.id.exit);

        Trackme.setOnClickListener(this);
        Addme.setOnClickListener(this);
        aboutus.setOnClickListener(this);
        faq.setOnClickListener(this);
        exit.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Trackme:
                Intent intent = new Intent(this, Trackme.class);
                startActivity(intent);
                break;
            case R.id.Addme:
                Intent intent1 = new Intent(this,Addme.class);
                startActivity(intent1);
                break;
            case R.id.aboutus:
                Intent intent3 = new Intent(this,aboutus.class);
                startActivity(intent3);
                break;
            case R.id.faq:
                Intent intent4 = new Intent(this,faq.class);
                startActivity(intent4);
                break;
            case R.id.exit:
                Intent intent5 = new Intent(this,exit.class);
                startActivity(intent5);
                break;
            default:

                break;
        }
    }

}

