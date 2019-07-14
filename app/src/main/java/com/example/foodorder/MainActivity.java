package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button pizzaButton,burgerButtton,lasagnaButton;

    //Declaring a string to take choices in it
    String choices = "";
    Double price = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizzaButton = (Button) findViewById(R.id.pizzaButton);
        burgerButtton = (Button) findViewById(R.id.burgerButton);
        lasagnaButton = (Button) findViewById(R.id.lasagnaButton);
    }

    //we made the string for list of cart with price


    public void add_to_list(View view){
        if(view == findViewById(R.id.pizzaButton)){
            choices = choices + "Pizza"+"\n";
            price = price+1200;

        }else if(view == findViewById(R.id.burgerButton)){
            choices = choices + "Burger"+"\n";
            price = price+450;

        }else if(view == findViewById(R.id.lasagnaButton)){
            choices = choices + "Lasagna"+"\n";
            price = price+750;

        }else{

        }
    }


    public void placeOrder(View view){

        Intent i = new Intent(MainActivity.this,OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price", price);
        i.putExtras(bundle);
        startActivity(i);

        //





    }


}
