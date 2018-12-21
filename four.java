package com.example.ashutosh.demoproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Stack;
public class four extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
    TextView e1;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        b1=(Button)findViewById(R.id.mainb1);
        b2=(Button)findViewById(R.id.mainb2);
        b3=(Button)findViewById(R.id.mainb3);
        b4=(Button)findViewById(R.id.mainb4);
        b5=(Button)findViewById(R.id.mainb5);
        b6=(Button)findViewById(R.id.mainb6);
        b7=(Button)findViewById(R.id.mainb7);
        b8=(Button)findViewById(R.id.mainb8);
        b9=(Button)findViewById(R.id.mainb9);
        b10=(Button)findViewById(R.id.mainb10);
        b11=(Button)findViewById(R.id.mainb11);
        b12=(Button)findViewById(R.id.mainb12);
        b13=(Button)findViewById(R.id.mainb13);
        b14=(Button)findViewById(R.id.mainb14);
        b15=(Button)findViewById(R.id.mainb15);
        b16=(Button)findViewById(R.id.mainb16);
        b17=(Button)findViewById(R.id.mainb17);
        e1=(TextView)findViewById(R.id.maine1);
        b18=(Button)findViewById(R.id.mainb18);
        b19=(Button)findViewById(R.id.fourb1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                s=s1+"1";
                e1.setText(s);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s2=e1.getText().toString();
                s=s2+"2";
                e1.setText(s);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s3=e1.getText().toString();
                s=s3+"3";
                e1.setText(s);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s4=e1.getText().toString();
                s=s4+"4";
                e1.setText(s);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s5=e1.getText().toString();
                s=s5+"5";
                e1.setText(s);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s6=e1.getText().toString();
                s=s6+"6";
                e1.setText(s);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s6=e1.getText().toString();
                s=s6+"6";
                e1.setText(s);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s7=e1.getText().toString();
                s=s7+"7";
                e1.setText(s);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s8=e1.getText().toString();
                s=s8+"8";
                e1.setText(s);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s9=e1.getText().toString();
                s=s9+"9";
                e1.setText(s);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s10=e1.getText().toString();
                s=s10+"0";
                e1.setText(s);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s11=e1.getText().toString();
                s=s11+" ( ";
                e1.setText(s);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s13=e1.getText().toString();
                s=s13+" / ";
                e1.setText(s);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s14=e1.getText().toString();
                s=s14+" * ";
                e1.setText(s);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s15=e1.getText().toString();
                s=s15+" + ";
                e1.setText(s);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s16=e1.getText().toString();
                s=s16+" - ";
                e1.setText(s);
            }
        });
//Solving
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s12=e1.getText().toString();
                if(s12.isEmpty())
                {
                    Toast.makeText(four.this, "No expression found", Toast.LENGTH_SHORT).show();
                }
                else {
                    EvaluateString k = new EvaluateString();
                    int m = k.evaluate(s12);
                    String p;
                    p = Integer.toString(m);
                    e1.setText(p);
                }

            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s11=e1.getText().toString();
                s=s11+" ) ";
                e1.setText(s);
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s18=e1.getText().toString();
                s= s18.substring(0, s18.length() - 1);
                e1.setText(s);
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(four.this,third.class);
                startActivity(i);
                finish();
            }
        });
    }
}
class EvaluateString {
    public int evaluate(String expression) {
        char[] tokens = expression.toCharArray();

        // Stack for numbers: 'values'
        Stack<Integer> values = new Stack<Integer>();

        // Stack for Operators: 'ops'
        Stack<Character> ops = new Stack<Character>();

        for (int i = 0; i < tokens.length; i++) {
            // Current token is a whitespace, skip it
            if (tokens[i] == ' ')
                continue;

            // Current token is a number, push it to stack for numbers
            if (tokens[i] >= '0' && tokens[i] <= '9') {
                StringBuffer sbuf = new StringBuffer();
                // There may be more than one digits in number
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                    sbuf.append(tokens[i++]);
                values.push(Integer.parseInt(sbuf.toString()));
            }

            // Current token is an opening brace, push it to 'ops'
            else if (tokens[i] == '(')
                ops.push(tokens[i]);

                // Closing brace encountered, solve entire brace
            else if (tokens[i] == ')') {
                while (ops.peek() != '(')
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                ops.pop();
            }

            // Current token is an operator.
            else if (tokens[i] == '+' || tokens[i] == '-' ||
                    tokens[i] == '*' || tokens[i] == '/') {
                // While top of 'ops' has same or greater precedence to current
                // token, which is an operator. Apply operator on top of 'ops'
                // to top two elements in values stack
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));

                // Push current token to 'ops'.
                ops.push(tokens[i]);
            }
        }

        // Entire expression has been parsed at this point, apply remaining
        // ops to remaining values
        while (!ops.empty())
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));

        // Top of 'values' contains result, return it
        return values.pop();
    }

    // Returns true if 'op2' has higher or same precedence as 'op1',
    // otherwise returns false.
    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    // A utility method to apply an operator 'op' on operands 'a'
    // and 'b'. Return the result.
    public static int applyOp(char op, int b, int a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new
                            UnsupportedOperationException("Cannot divide by zero");
                return a / b;
        }
        return 0;
    }
}

