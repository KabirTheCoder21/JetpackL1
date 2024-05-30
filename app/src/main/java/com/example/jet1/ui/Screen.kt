import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import com.example.jet1.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun PreviewItem2() {
    //ProfileCard(image = R.drawable.avtar, title = "User Name", subtitle = "Profession")
    /*Column(modifier = Modifier.verticalScroll(rememberScrollState())){
        getCategoryList().map {
            ProfileCard(image = it.image, title = it.title, subtitle = it.subtitle)
        }
    }*/
    Column {
        // App Bar
        TopAppBar(
            title = {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.avtar), // Replace with your drawable resource
                        contentDescription = "App Logo",
                        modifier = Modifier
                            .size(48.dp)
                            .padding(end = 8.dp)
                            .clip(CircleShape)
                    )
                    Text(text = "Profile Page", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                }
            },
            modifier = Modifier.heightIn(40.dp)
           // backgroundColor = Color.Blue,  // Set your preferred background color
           // contentColor = Color.White     // Set your preferred content color
        )
        LazyColumn(modifier = Modifier.padding(bottom = 56.dp)
            .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            content = {
            items(getCategoryList()){
                ProfileCard(image = it.image, title = it.title, subtitle = it.subtitle)
            }
        })
    }
}

@Composable
fun ProfileCard(image: Int, title: String, subtitle: String) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 12.dp),
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .height(150.dp)

    ) {
        Row(
            modifier = Modifier
                .padding(18.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {  // Add padding inside the Row
            Card(
                shape = CircleShape,
                modifier = Modifier
                    .padding(10.dp)
                    .shadow(8.dp, CircleShape)
                    .clip(CircleShape)
                    .size(77.dp)
                    .border(2.dp, Color.LightGray, CircleShape)
            ) {
                Image(
                    painter = painterResource(id = image),
                    contentDescription = "India Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(77.dp)
                )
            }

            ItemDescription(title, subtitle,Modifier.padding(8.dp))
        }
    }
}

@Composable
private fun ItemDescription(title: String, subtitle: String,modifier : Modifier) {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = modifier.fillMaxWidth()
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            style = MaterialTheme.typography.headlineLarge
        )
        Text(
            text = subtitle,
            fontSize = 20.sp,
            style = MaterialTheme.typography.labelSmall,
            color = Color.Gray
        )
    }
}

data class Category(val image : Int,val title : String,val subtitle : String)

fun getCategoryList() : MutableList<Category>{
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.a5,"Grace Harper","SDE1"))
    list.add(Category(R.drawable.a6,"Eden Rose","Hiring Manager"))
    list.add(Category(R.drawable.a2,"Scarlett Sky","Team Lead"))
    list.add(Category(R.drawable.a3,"Luna Belle","Product Manager"))
    list.add(Category(R.drawable.a4,"Ivy Mae","SDE2"))
    list.add(Category(R.drawable.a1,"Stella Jade","SDE2"))
    list.add(Category(R.drawable.a5,"Grace Harper","SDE1"))
    list.add(Category(R.drawable.a6,"Eden Rose","Hiring Manager"))
    list.add(Category(R.drawable.a2,"Scarlett Sky","Team Lead"))
    list.add(Category(R.drawable.a3,"Luna Belle","Product Manager"))
    list.add(Category(R.drawable.a4,"Ivy Mae","SDE2"))
    list.add(Category(R.drawable.a1,"Stella Jade","SDE2"))


    return list
}
