package com.example.jet1

import PreviewItem2
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jet1.ui.theme.Jet1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PreviewItem2()
        }
    }
}

/*
@Composable
fun PreviewItem()
{
Column{
    ListViewItem()
    ListViewItem()
    ListViewItem()
    ListViewItem()
    ListViewItem()
}
}

@Composable
fun ListViewItem() {
    Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(12.dp)
            .background(Color.LightGray)
            .border(1.dp, Color.Cyan)){
        Image(painter = painterResource(id = R.drawable.images), contentDescription = "Ganesh Ji",
            modifier = Modifier
                .padding(5.dp)
                .border(2.dp, Color.Red))
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "Kabir Seth", fontWeight = FontWeight.Bold)
            Text(text = "Software Developer",
                fontWeight = FontWeight.Thin,
                fontSize = 14.sp)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun circularImage()
{
    Card(
        shape = CircleShape,
        modifier = Modifier
            .padding(10.dp)
            .size(100.dp)
            .shadow(8.dp, CircleShape)
            .clip(CircleShape)
            .border(2.dp, Color.LightGray, CircleShape)
    ) {
        Image(
            painter = painterResource(id = R.drawable.circular),
            contentDescription = "India Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(100.dp)

        )
    }

}*/