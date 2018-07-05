package calculator.nikca.example.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtInput;

    String inputText;

    final static String SAVEINPUTTEXT = "SAVETEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInput = (TextView) findViewById(R.id.txtInput);
    }

    // сохранение состояния
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(SAVEINPUTTEXT, txtInput.getText().toString());
        super.onSaveInstanceState(outState);
    }

    // получение ранее сохраненного состояния
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        txtInput.setText(savedInstanceState.getString(SAVEINPUTTEXT));
    }

    // нажатие на кнопку с цифрой, оператором, разделителем
    public void btnClick(View v) {
        txtInput.setText(txtInput.getText().toString() + v.getTag().toString());
    }

    // нажатие на кнопку удаления символа ←
    public void btnВасkspaceClick(View v) {
        if (!txtInput.getText().toString().equals("")) {
            txtInput.setText(txtInput.getText().toString().substring(0, txtInput.getText().toString().length() - 1));
        }
    }

    // нажатие на кнопку очистки ввода
    public void btnCClick(View v) {
        txtInput.setText("");
    }

    // нажатие на кнопку =
    public void btnResultClick(View v) {
        //Calc calc = new Calc(MainActivity.this);
        //Toast.makeText(MainActivity.this, txtNum2.getText().toString(), Toast.LENGTH_SHORT).show();
        txtInput.setText(Calc.calculate(txtInput.getText().toString()));
    }
}
