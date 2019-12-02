package com.nickyrabit.composableexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.layout.Column
import androidx.ui.layout.FlexColumn
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview

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
        FlexColumn(

        ) {
            
        }
    
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme (){
        CustomFontDisplay()
    }
}
