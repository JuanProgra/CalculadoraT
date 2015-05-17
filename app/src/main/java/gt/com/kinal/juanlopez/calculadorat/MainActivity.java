package gt.com.kinal.juanlopez.calculadorat;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends ActionBarActivity {

    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnP;
    private Button btnDiv;
    private Button btnMul;
    private Button btnSum;
    private Button btnRest;
    private Button btnRaiz;
    private Button btnIgua;
    private Button btnPoten;
    private Button btnLim;
    private Button btnLog;

    private TextView edtRes;

    private String datos;
    private String operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datos = "";
        operacion = "";

        edtRes = (TextView)findViewById(R.id.edtRes);

        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnP = (Button)findViewById(R.id.btnP);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnMul = (Button)findViewById(R.id.btnMul);
        btnSum = (Button)findViewById(R.id.btnSum);
        btnRest = (Button)findViewById(R.id.btnRest);
        btnRaiz = (Button)findViewById(R.id.btnRaiz);
        btnIgua = (Button)findViewById(R.id.btnIgu);
        btnPoten = (Button)findViewById(R.id.btnPoten);
        btnLim = (Button)findViewById(R.id.btnLim);
        btnLog = (Button)findViewById(R.id.btnLog);

        btnLim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos = "";
                edtRes.setText("");
                operacion = "";
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += btn0.getText().toString();
                edtRes.setText(datos);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += btn1.getText().toString();
                edtRes.setText(datos);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += btn2.getText().toString();
                edtRes.setText(datos);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += btn3.getText().toString();
                edtRes.setText(datos);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += btn4.getText().toString();
                edtRes.setText(datos);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += btn5.getText().toString();
                edtRes.setText(datos);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += btn6.getText().toString();
                edtRes.setText(datos);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += btn7.getText().toString();
                edtRes.setText(datos);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += btn8.getText().toString();
                edtRes.setText(datos);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += btn9.getText().toString();
                edtRes.setText(datos);
            }
        });
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += btnSum.getText().toString();
                edtRes.setText(datos);
                operacion = "+";
            }
        });
        btnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += btnRest.getText().toString();
                edtRes.setText(datos);
                operacion = "-";
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += btnMul.getText().toString();
                edtRes.setText(datos);
                operacion = "*";
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += btnDiv.getText().toString();
                edtRes.setText(datos);
                operacion = "/";
            }
        });
        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += btnRaiz.getText().toString();
                edtRes.setText(datos);
                operacion = "√";
                operar(datos,operacion);
            }
        });
        btnPoten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += btnPoten.getText().toString();
                edtRes.setText(datos);
                operacion = "^";
            }
        });
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtRes.setText("Log("+datos+"=");
                operacion = "!";
                operar(datos+"!",operacion);
            }
        });
        btnIgua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion.length() > 0){
                    operar(datos,operacion);
                }else {
                    datos = "";
                }

            }
        });
    }
    public void operar(String datosT,String operacionT)
    {
        try {
            if (operacionT.equals("+"))
            {
                String[] parts = datosT.split("\\+");
                String part1 = parts[0];
                String part2 = parts[1];

                double x = Double.parseDouble(part1);
                double y = Double.parseDouble(part2);

                double totalO = x + y;

                datos = String.valueOf(totalO);

                edtRes.setText(datos);

                Toast toast = Toast.makeText(getApplicationContext(), datos, Toast.LENGTH_SHORT);
                toast.show();
                operacion = "";

            } else if (operacionT.equals("-"))
            {
                String[] parts = datosT.split("\\-");
                String part1 = parts[0];
                String part2 = parts[1];

                double x = Double.parseDouble(part1);
                double y = Double.parseDouble(part2);

                double totalO = x - y;

                datos = String.valueOf(totalO);

                edtRes.setText(datos);

                Toast toast = Toast.makeText(getApplicationContext(), datos, Toast.LENGTH_SHORT);
                toast.show();
                operacion = "";
            }else if (operacionT.equals("/"))
            {
                String[] parts = datosT.split("\\÷");
                String part1 = parts[0];
                String part2 = parts[1];

                double x = Double.parseDouble(part1);
                double y = Double.parseDouble(part2);

                double totalO = x / y;

                datos = String.valueOf(totalO);

                edtRes.setText(datos);

                Toast toast = Toast.makeText(getApplicationContext(), datos, Toast.LENGTH_SHORT);
                toast.show();
                operacion = "";
            } else  if (operacionT.equals("*"))
            {
                String[] parts = datosT.split("\\*");
                String part1 = parts[0];
                String part2 = parts[1];

                double x = Double.parseDouble(part1);
                double y = Double.parseDouble(part2);

                double totalO = x * y;

                datos = String.valueOf(totalO);

                edtRes.setText(datos);

                Toast toast = Toast.makeText(getApplicationContext(), datos, Toast.LENGTH_SHORT);
                toast.show();
                operacion = "";
            } else  if (operacionT.equals("√"))
            {
                String[] parts = datosT.split("\\√");
                String part1 = parts[0];

                double x = Double.parseDouble(part1);

                double totalO = Math.sqrt(x);

                datos = String.valueOf(totalO);

                edtRes.setText(datos);

                Toast toast = Toast.makeText(getApplicationContext(), datos, Toast.LENGTH_SHORT);
                toast.show();
                operacion = "";
            }else  if (operacionT.equals("^"))
            {
                String[] parts = datosT.split("\\^");
                String part1 = parts[0];
                String part2 = parts[1];

                double x = Double.parseDouble(part1);
                double y = Double.parseDouble(part2);

                double totalO = Math.pow(x, y);;

                datos = String.valueOf(totalO);

                edtRes.setText(datos);

                Toast toast = Toast.makeText(getApplicationContext(), datos, Toast.LENGTH_SHORT);
                toast.show();
                operacion = "";
            }
            else  if (operacionT.equals("!"))
            {
                String[] parts = datosT.split("\\!");
                String part1 = parts[0];

                double x = Double.parseDouble(part1);

                double totalO = Math.log10(x);

                datos = String.valueOf(totalO);

                edtRes.setText(datos);

                Toast toast = Toast.makeText(getApplicationContext(), datos, Toast.LENGTH_SHORT);
                toast.show();
                operacion = "";
            }

        }catch (Exception e){
            Toast toast = Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_SHORT);
            toast.show();
            System.out.println(e.toString());
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
