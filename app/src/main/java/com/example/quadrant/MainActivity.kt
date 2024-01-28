package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrant4()
                }
            }
        }
    }
}

@Composable
fun Quadrant4(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            horizontalArrangement = Arrangement.Absolute.Center,
            verticalAlignment = Alignment.Top,
            modifier = Modifier.
            fillMaxWidth()
            .fillMaxHeight(0.5f)
        ) {
            Quadrant(
                "Text composable",
                "Displays text and follows the recommended Material Design guidelines.",
                0xFFEADDFF,
                modifier = Modifier.weight(0.5f)
            )
            Quadrant(
                "Image composable",
                "Creates a composable that lays out and draws a given Painter class object.",
                0xFFD0BCFF,
                modifier = Modifier.weight(0.5f)
            )
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.
            fillMaxWidth()
            .fillMaxHeight(1f)
        ) {
            Quadrant(
                "Row composable",
                "A layout composable that places its children in a horizontal sequence.",
                0xFFB69DF8,
                modifier = Modifier.weight(0.5f)
            )
            Quadrant(
                "Column composable",
                "A layout composable that places its children in a vertical sequence.",
                0xFFF6EDFF,
                modifier = Modifier.weight(0.5f)
            )
        }
    }
}

@Composable
fun Quadrant(titulo: String, texto: String, color: Long, modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .background(Color(color))
            .fillMaxSize()
            .padding(16.dp) ,
        contentAlignment = Alignment.Center
    ){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = titulo,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(text = texto)
        }
    }
}




@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    QuadrantTheme {
        Quadrant4()
    }
}