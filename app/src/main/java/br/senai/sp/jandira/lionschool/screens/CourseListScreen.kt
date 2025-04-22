package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.screens.components.CourseCard
import br.senai.sp.jandira.lionschool.screens.components.SoonComplete


@Composable
fun CourseListScreen(
) {
    val searchCourseState = remember {
        mutableStateOf(value = "")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.1f)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(0.3f)
                            .fillMaxHeight(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        SoonComplete()
                    }
                }

                HorizontalDivider(
                    color = colorResource(R.color.amareloDiferente)
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp, 20.dp, 10.dp, 20.dp)
            ) {
                Column {
                    OutlinedTextField(
                        value = searchCourseState.value,
                        onValueChange = {
                            searchCourseState.value = it
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(
                                color = colorResource(R.color.cinzaClaro),
                                RoundedCornerShape(15.dp)
                            )
                            .border(
                                2.dp,
                                color = colorResource(R.color.amareloDiferente),
                                RoundedCornerShape(18.dp)
                            ),
                        label = {
                            Text(
                                text = stringResource(R.string.find_your_course),
                                color = colorResource(R.color.cinza),
                            )
                        },
                        trailingIcon = {
                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = "",
                                tint = colorResource(R.color.cinza)
                            )
                        },
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Text,
                            imeAction = ImeAction.Done
                        ),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color.Transparent,
                            unfocusedBorderColor = Color.Transparent,
                            cursorColor = Color(0xFFBA88FF),
                            unfocusedLabelColor = Color(0xFFBA88FF)
                        )
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(0.dp, 20.dp, 0.dp, 20.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "",
                        tint = colorResource(R.color.amareloDiferente)
                    )
                    Text(
                        text = stringResource(R.string.courses),
                        color = colorResource(R.color.azulDiferente),
                        fontSize = 32.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    CourseCard()
                }
            }
        }
    }
}

@Preview
@Composable
private fun CourseListScreenPreview() {
    CourseListScreen()
}