package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun HomeScreen(
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White
            )
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 77.dp), // aumenta esse valor pra descer mais
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo 1",
                    modifier = Modifier
                        .width(170.dp)
                        .height(170.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.logo_text),
                    contentDescription = "Logo 2",
                    modifier = Modifier
                        .width(170.dp)
                        .height(170.dp)
                )
            }




            Column (
                modifier = Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(32.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = stringResource(R.string.find_your_favorite),
                        color = colorResource(R.color.azulDiferente),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold // isso aqui deixa em negrito
                    )

                    Card (
                        modifier = Modifier
                            .width(50.dp)
                            .height(10.dp),
                        shape = CardDefaults.shape,
                        colors = CardDefaults.cardColors(
                            colorResource(R.color.amareloDiferente)
                        ),
                    ) { }
                }
                Text(
                    text = stringResource(R.string.home_screen_texto_principal),
                    color = colorResource(R.color.cinzaClaro),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )

            }
            Button(
                onClick = {},
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .width(270.dp) // ajusta pra uma largura menor
                    .height(50.dp),
                border = BorderStroke(
                    2.dp,
                    color = colorResource(R.color.azulDiferente)
                ),

                colors = ButtonDefaults.buttonColors(colorResource(R.color.amareloDiferente)),
                shape = RoundedCornerShape(20.dp)
            )
            {
                Text(
                    text = stringResource(R.string.home_screen_botao),
                    color = colorResource(R.color.azulDiferente)
                )
            }

            Row {  }
        }
    }
}


@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}