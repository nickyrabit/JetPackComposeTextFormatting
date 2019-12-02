package com.nickyrabit.composableexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.*
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.text.TextStyle
import androidx.ui.text.font.Font
import androidx.ui.text.font.FontFamily
import androidx.ui.text.font.FontStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.tooling.preview.Preview


/**
 * Nicholaus Legnard
 *  +255685097713
 *  nicky@nickylegnard.com
 *  nickyrabit@gmail.com
 *
 *
 * */
class MainActivity : AppCompatActivity() {
   
 


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme() {
                CustomFontDisplay()
            }
        }
    }
}

@Composable
fun CustomFontDisplay() {
//Wrapping Padding to leave white space at the sides
Padding(20.dp){

    // Vertical Scroller will help when the screen is small or yu have lots of data
    VerticalScroller() {
//Column arranges the children vertically
        Column(mainAxisAlignment = MainAxisAlignment.Start,
            crossAxisAlignment = CrossAxisAlignment.Stretch


        ){

            //Aligning texts in column
            // set Text style to blue for Custom Color do this Color(0x431323)
            Text("I am Custom Color Blue", style = TextStyle(color = Color.Blue))

            // place yuor fonts into the fonts folder inside res folder
            Text("I am Custom Font Montserrat", style = TextStyle(fontFamily = FontFamily(Font(name="montserrat_semibold.otf"))))
            // font style is italic here
            Text("I am Italic",style = TextStyle(fontStyle = FontStyle.Italic))
            // Weight is Bold
            Text("I am BOLD", style = TextStyle(fontWeight = FontWeight.Bold))
            // Set the font size inside the TextStyle
            Text("I am Large Text", style = TextStyle(fontSize = 25.sp))
            // This is normal simpler way to write the text
            Text("But We are all Custom  Made Fonts")




        }










    }


}




    
}
// Use this to make the Android Studio Composer viewer to show you UI
@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme (){
        CustomFontDisplay()
    }
}
