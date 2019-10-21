package android.com.my_first_currency_converter_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view)
    {
        EditText DollarString = (EditText) findViewById(R.id.ed1);
        Double DollarFloat = Double.parseDouble(DollarString.getText().toString());
        Double Rupees = 71.65 * DollarFloat;
        Toast.makeText(MainActivity.this," ₹ : "+Rupees.toString(),Toast.LENGTH_SHORT).show();
    }

    public void convert2(View view)
    {
        EditText RupeeString = (EditText) findViewById(R.id.ed2);
        Double RupeeFloat = Double.parseDouble(RupeeString.getText().toString());
        Double Dollar = 0.014 * RupeeFloat;
        Toast.makeText(MainActivity.this," $ : "+Dollar.toString(),Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
