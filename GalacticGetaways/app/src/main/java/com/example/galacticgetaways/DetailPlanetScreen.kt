package com.example.galacticgetaways

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.galacticgetaways.ui.theme.GalacticGetawaysTheme

@Composable
fun DetailPlanetScreen(name: String, modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(9, 0, 17))
            .padding(20.dp)
    ){
        Row {
            Image(
                painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                contentDescription = "Back Arrow",
                modifier = Modifier
                    .height(30.dp)
                    .width(38.dp)
            )
            Text(
                text = "Back",
                color = Color.White,
                fontSize = 23.sp
            )

            Spacer(modifier = modifier.width(210.dp))

            Image(
                painter = painterResource(id = R.drawable.favourite),
                contentDescription = "Favourite",
                modifier = Modifier
                    .height(40.dp)
                    .width(42.dp)
            )
        }

        Spacer(modifier = modifier.height(3.dp))

        Image(
            painter = painterResource(id = R.drawable.earth),
            contentDescription = "Earth",
            modifier = Modifier
                .height(348.dp)
                .width(350.dp)
        )

        Row {
            Text(
                text = "Planet",
                color = Color.White,
            )

            Spacer(modifier = modifier.width(200.dp))

            Column {
                Row (
                    modifier = Modifier.padding(start = 44.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.star),
                        contentDescription = "Star",
                        modifier = Modifier
                            .height(20.dp)
                            .width(20.dp)
                    )

                    Spacer(modifier = modifier.width(5.dp))

                    Text(
                        text = "4.8",
                        color = Color.White,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Text(
                    text = "8 billion reviews",
                    color = Color.White,
                    fontSize = 12.sp,
                )

            }
        }

        Text(
            text = "THE EARTH",
            color = Color.White,
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold
        )

        Spacer(modifier = modifier.height(3.dp))

        Text(
            text = "Nestled in the vastness of space, Earth is the third " +
                    "planet from the Sun and the only known celestial body " +
                    "to harbour life (so far). With its diverse ecosystems, " +
                    "ranging from lush forests to expansive deserts, and its " +
                    "vast oceans teeming with life, Earth is a vibrant oasis " +
                    "in the cosmos. Its atmosphere provides the perfect " +
                    "conditions for a rich tapestry of flora and fauna, " +
                    "making it a haven for countless species, including humans." +
                    " From the highest peaks to the deepest ocean trenches, " +
                    "Earth's beauty and biodiversity inspire awe and reverence," +
                    " earning it the nickname \"The Blue Jewel\" of the solar " +
                    "system.",
            color = Color.White,
            fontSize = 10.8.sp,
            lineHeight = 1.3.em
        )

        Spacer(modifier = modifier.height(14.dp))

        Row {
            Card (
                colors = CardDefaults.cardColors(
                    containerColor = Color(17,8,62)
                )
            ){
                Row (
                    modifier = Modifier
                        .padding(10.dp)
                ){
                    Column {
                        Text(
                            text = "71%",
                            color = Color.White,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "H2O Surface Coverage",
                            color = Color.White,
                            fontSize = 10.sp
                        )
                    }

                    Spacer(modifier = modifier.width(18.dp))

                    Image(
                        painter = painterResource(id = R.drawable.humidity),
                        contentDescription = "Water Drop",
                        modifier = Modifier
                            .height(60.dp)
                            .width(30.dp)
                    )
                }
            }

            Spacer(modifier = modifier.width(10.dp))

            Card (
                colors = CardDefaults.cardColors(
                    containerColor = Color(17,8,62)
                )
            ){
                Row (
                    modifier = Modifier
                        .padding(10.dp)
                ){
                    Column {
                        Text(
                            text = "42%",
                            color = Color.White,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "Technology Advancement",
                            color = Color.White,
                            fontSize = 8.sp
                        )
                    }

                    Image(
                        painter = painterResource(id = R.drawable.tech),
                        contentDescription = "Technology",
                        modifier = Modifier
                            .height(60.dp)
                            .width(40.dp)
                    )
                }
            }
        }

        Spacer(modifier = modifier.height(14.dp))

        Card (
            colors = CardDefaults.cardColors(
                containerColor = Color(17,8,62)
            )
        ){
            Row (
                modifier = Modifier
                    .padding(16.dp)
            ){
                Column {
                    Text(
                        text = "Facts about earth",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "3 videos available",
                        color = Color.White,
                        fontSize = 13.sp
                    )
                }

                Spacer(modifier = modifier.width(66.dp))

                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(121, 32, 194)
                    )
                ) {
                    Text(
                        text = "Watch",
                        fontSize = 14.sp
                    )
                }


            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun DetailPlanetScreenPreview() {
    GalacticGetawaysTheme {
        DetailPlanetScreen("")
    }
}