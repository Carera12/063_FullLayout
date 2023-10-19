package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.WeatherAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen()
{
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(
            text = "WEATHER APP")
        Spacer(modifier = Modifier.padding(10.dp))

        BoxHeader()
        Spacer(modifier = Modifier.padding(10.dp))

        Lokasi()

        Spacer(modifier = Modifier.padding(10.dp))

        BoxKet()

    }
}

@Composable
fun BoxHeader(){
Box(modifier = Modifier
    .fillMaxWidth()
    .clip(RoundedCornerShape(20.dp))
    .background(Color.Cyan)){
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()){
        Image(
            painter = painterResource(id = R.drawable.gambar),
            contentDescription = null,
            modifier = Modifier.size(150.dp)
        )
        Text(text = "Rain",
            fontSize = 30.sp)
    }
}
}

@Composable
fun Lokasi(){
    Text(
        text = "19°C",
        fontWeight = FontWeight.Bold,
        fontSize = 100.sp
    )
    Row (verticalAlignment = Alignment.CenterVertically) {
        Image(painter = painterResource(id = R.drawable.baseline_location_on_24),
            contentDescription = null,
            modifier = Modifier.size(30.dp))
        Spacer(modifier = Modifier.padding(3.dp))
        Text(text = "Yogyakarta", fontSize = 40.sp, fontWeight = FontWeight.Bold)
    }
    Spacer(modifier = Modifier.padding(10.dp))
    Text(
        text = "Kasihan, Kabupaten Bantul, Daerah Istimewa Yogyakarta",
        textAlign = TextAlign.Center,
        color = Color.Gray,
        fontSize = 20.sp
    )


}

@Composable
fun BoxKet(){
    Spacer(modifier = Modifier.padding(20.dp))
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(Color.LightGray)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = "Humidity",
                        fontSize = 18.sp,
                        color = Color(0xFF333333),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Text(
                        text = "98%",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 4.dp)
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = "UV Index",
                        fontSize = 18.sp,
                        color = Color(0xFF333333),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Text(
                        text = "9/10",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Sunrise",
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center,
                        color = Color(0xFF333333),
                        modifier = Modifier.fillMaxWidth()
                    )
                    Text(
                        text = "05.00 AM",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Sunset",
                        fontSize = 18.sp,
                        color = Color(0xFF333333),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Text(
                        text = "05.40 PM",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WeatherAppTheme {
        HomeScreen()
    }
}