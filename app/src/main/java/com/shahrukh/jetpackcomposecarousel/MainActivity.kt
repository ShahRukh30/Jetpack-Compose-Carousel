package com.shahrukh.jetpackcomposecarousel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.shahrukh.carousaljetpackcompose.Carousal
import com.shahrukh.jetpackcomposecarousel.ui.theme.JetpackComposeCarouselTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeCarouselTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Carousal(
                        carouselItems = listOf(
                            R.drawable.image1,
                            R.drawable.image2,
                            R.drawable.image3,
                            // Add more image resources here...
                        ),
                        showDots = true, // Set this to true to show dots, false to hide dots
                        delayMillis = 5000L // Set the delay time in milliseconds (3 seconds in this case)
                    )
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun CarousalPreview() {
    JetpackComposeCarouselTheme {
        Carousal(
            carouselItems = listOf(
                R.drawable.image1,
                R.drawable.image2,
                R.drawable.image3,
                // Add more image resources here...
            ),
            showDots = false, // Set this to true to show dots, false to hide dots
            delayMillis = 5000L // Set the delay time in milliseconds (3 seconds in this case)
        )
    }
}
