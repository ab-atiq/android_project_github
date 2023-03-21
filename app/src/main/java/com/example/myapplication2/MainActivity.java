package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inputName,inputBuyingPrice,inputSellingPrice,inputProfitPercent, inputWeight, inputHeightFeet, inputHeightInch,inputText;
    Button clickButton, calculationButton,readTextButton;
    TextView displayText, displayProfit;

    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputText=findViewById(R.id.inputText);
        readTextButton=findViewById(R.id.readTextButton);
        textToSpeech=new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener(){
            @Override
            public void onInit(int status){

            }
        });

        readTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(""+inputText.getText().toString(),TextToSpeech.QUEUE_FLUSH,null,null);
            }
        });



//        4. BMI calculation
//        inputHeightFeet=findViewById(R.id.heightFeet);
//        inputHeightInch=findViewById(R.id.heightInch);
//        inputWeight=findViewById(R.id.weightKg);
//        calculationButton=findViewById(R.id.calculateBMI);
//        displayText=findViewById(R.id.displayResult);
//
//        calculationButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String SWeight,SHeightFeet, SHeightInch;
//                SWeight=inputWeight.getText().toString();
//                SHeightFeet=inputHeightFeet.getText().toString();
//                SHeightInch=inputHeightInch.getText().toString();
//                if(SWeight.length()>0&&SHeightFeet.length()>0 && SHeightInch.length()>0) {
//                    double weight, height, BMI;
//                    weight = Double.parseDouble(SWeight);
//                    height = (Double.parseDouble(SHeightFeet) * .3048) + (Double.parseDouble(SHeightInch) * .0254);
//                    BMI = weight / (height * height);
//                    if (BMI > 24) {
//                        displayText.setText("Your BMI is: " + BMI + "\nYou are Motu");
//                    } else if (BMI > 18) {
//                        displayText.setText("Your BMI is: " + BMI + "\nYou are Handsome");
//                    } else {
//                        displayText.setText("Your BMI is: " + BMI + "\nYou are chikna");
//                    }
//                }
//                else{
//                    Toast.makeText(MainActivity.this,"Please, Input fields.",Toast.LENGTH_LONG).show();
//                }
//            }
//        });

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