package com.example.jet1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //PreviewItem2()
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                NotificationCounter()
            }

        }
    }
}

@Composable
fun MessageBar(count: Int) {
    Card(elevation = CardDefaults.cardElevation(6.dp)) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                imageVector = Icons.Outlined.CheckCircle, contentDescription = "",
                Modifier.padding(5.dp)
            )

            Text(text = "Message Sent so Far : $count")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun NotificationCounter() {
    var count by rememberSaveable {
        mutableStateOf(0)
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "You have sent $count notifications.")
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { count++ }) {
            Text(text = "Send Notification")
        }
        MessageBar(count)
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