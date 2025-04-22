package br.senai.sp.jandira.lionschool.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun CourseCard(
    markColor: Color = Color.Red,
    isFilled: Boolean = false,
    text1: String = "",
    text2: String = "",
) {
    Card(
        modifier = Modifier
            .height(250.dp)
            .fillMaxWidth()
            .padding(5.dp)
        ,
        shape = RoundedCornerShape(13.dp),
        colors = CardDefaults.cardColors(
            colorResource(R.color.azulDiferente)
        ),
        elevation = CardDefaults.elevatedCardElevation(5.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp)
            ,
        ){
            Column {
                Row{
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "Logo",
                        modifier = Modifier
                            .fillMaxHeight(1f)
                            .fillMaxWidth(0.5f)
                            .padding(5.dp)
                    )
                    Text(
                        text = "DS",
                        color = colorResource(R.color.amareloDiferente),
                        fontSize = 24.sp
                    )
                }
                Text(
                    text = stringResource(R.string.courses),
                    color = colorResource(R.color.white),
                    fontSize = 16.sp
                )
            }
            Row {
                Icon(
                    imageVector = Icons.Default.CheckCircle,
                    contentDescription = "",
                    tint = colorResource(R.color.amareloDiferente)
                )
                Text(
                    text = stringResource(R.string.students),
                    color = colorResource(R.color.azulDiferente),
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Preview
@Composable
private fun CourseCardPreview() {
    CourseCard()
}