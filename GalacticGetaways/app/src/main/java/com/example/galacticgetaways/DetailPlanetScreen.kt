package com.example.galacticgetaways

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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

    }
}

@Preview(showBackground = true)
@Composable
fun DetailPlanetScreenPreview() {
    GalacticGetawaysTheme {
        DetailPlanetScreen("")
    }
}