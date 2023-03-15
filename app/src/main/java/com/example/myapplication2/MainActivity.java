package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputName,inputBuyingPrice,inputSellingPrice,inputProfitPercent, inputWeight, inputHeightFeet, inputHeightInch;
    Button clickButton, calculationButton;
    TextView displayText, displayProfit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        4. BMI calculation
        inputHeightFeet=findViewById(R.id.heightFeet);
        inputHeightInch=findViewById(R.id.heightInch);
        inputWeight=findViewById(R.id.weightKg);
        calculationButton=findViewById(R.id.calculateBMI);
        displayText=findViewById(R.id.displayResult);

        calculationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight,height,BMI;
                weight=Double.parseDouble(inputWeight.getText().toString());
                height=(Double.parseDouble(inputHeightFeet.getText().toString())*.3048)+(Double.parseDouble(inputHeightInch.getText().toString())*.0254);
                BMI=weight/(height*height);
                displayText.setText("Your BMI is: "+BMI);
            }
        });

//        3. selling price calculation from profit percentage
//        inputBuyingPrice=findViewById(R.id.buyingPrice);
//        inputProfitPercent=findViewById(R.id.percentProfit);
//        calculationButton = findViewById(R.id.calculateButton);
//        displayText = findViewById(R.id.displaySellingPrice);
//
//        calculationButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                double b_price = Double.parseDouble(inputBuyingPrice.getText().toString());
//                double percent = Double.parseDouble(inputProfitPercent.getText().toString());
//                double s_price = b_price+(b_price*percent/100);
//                displayText.setText("Selling price is: "+s_price);
//            }
//        });


//        2. Calculation on Shop profit and percentage
//        inputBuyingPrice=findViewById(R.id.buyingPrice);
//        inputSellingPrice=findViewById(R.id.sellingPrice);
//        calculationButton=findViewById(R.id.calculationButton);
//        displayProfit=findViewById(R.id.displayProfit);
//
//        calculationButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                double b_price = Double.parseDouble(inputBuyingPrice.getText().toString());
//                double s_price = Double.parseDouble(inputSellingPrice.getText().toString());
//                double profit = s_price - b_price;
//                displayProfit.setText("Profit is: "+profit+"\nProfit percentage is: "+(profit/b_price*100)+"%");
//            }
//        });

//        1. User input check done
//        inputName=findViewById(R.id.inputName);
//        clickButton=findViewById(R.id.clickButton);
//        displayText=findViewById(R.id.displayText);
//        clickButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                displayText.setText("You name is "+inputName.getText().toString());
//            }
//        });



    }
}