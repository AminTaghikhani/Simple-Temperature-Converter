package app.mat.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.Amin.Temperature.Temperature;

public class MainActivity extends AppCompatActivity {
    private EditText etInput;
    private RadioGroup rdgTemp;
    private Temperature temperatureConverter =new Temperature();
    private TextView tvOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etInput=(EditText)findViewById(R.id.etInput);
        tvOutput=(TextView)findViewById(R.id.tvOutput);
        rdgTemp=(RadioGroup)findViewById(R.id.rdgTemp);
    }
    public void btnConvert_OnClicked(View view)
    {
        if(etInput.getText().length()==0)
            return;
        tvOutput.setText("");
        Double temp;
        temp=Double.parseDouble(etInput.getText().toString());
        if(rdgTemp.getCheckedRadioButtonId()==findViewById(R.id.rdbToCelcius).getId())
        {
            temperatureConverter.setFahrenheit(temp);
            tvOutput.setText(temperatureConverter.getCelcius().toString());
        }
        else
        {
            temperatureConverter.setCelcius(temp);
            tvOutput.setText(temperatureConverter.getFahrenheit().toString());
        }
        etInput.setText("");
    }
}
