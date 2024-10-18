package com.denise.castro.voll.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.denise.castro.voll.R
import com.denise.castro.voll.ui.theme.VollTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier.fillMaxSize(),
    ) {
        Image(
            painter = painterResource(R.drawable.ic_voll),
            contentDescription = "Imagem azul clara com o nome Voll",
            modifier.padding(start = 32.dp, top = 64.dp, bottom = 8.dp),
        )
        Text(
            text = "Gerenciando sua clínica",
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 32.dp, bottom = 40.dp),
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary,
        )
        Text(
            text = "Escolha qual seção deseja iniciar:",
            modifier = Modifier.padding(start = 32.dp),
            fontFamily = FontFamily.Serif,
            color = Color.Black
        )
        Card(
            colors = CardDefaults.cardColors(
                containerColor = colorResource(id = R.color.primary),
            ),
            elevation = CardDefaults.cardElevation(),
            modifier = Modifier
                .size(400.dp, 150.dp)
                .padding(start = 32.dp, end = 32.dp, top = 8.dp)
                .fillMaxWidth(),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement  = Arrangement.Center,
                horizontalAlignment = CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.doctor),
                    contentDescription = "Imagem de um médico",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(80.dp)
                        .align(CenterHorizontally)
                        .padding(top = 16.dp)
                )
                Text(
                    text = "Médicos(as)",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 16.dp, bottom = 16.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            colors = CardDefaults.cardColors(
                containerColor = colorResource(id = R.color.primary),
            ),
            elevation = CardDefaults.cardElevation(),
            modifier = Modifier
                .size(400.dp, 150.dp)
                .padding(start = 32.dp, end = 32.dp, top = 8.dp)
                .fillMaxWidth(),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement  = Arrangement.Center,
                horizontalAlignment = CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.patient),
                    contentDescription = "Imagem de um médico",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(80.dp)
                        .align(CenterHorizontally)
                        .padding(top = 16.dp)
                )
                Text(
                    text = "Pacientes",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 16.dp, bottom = 16.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            colors = CardDefaults.cardColors(
                containerColor = colorResource(id = R.color.primary),
            ),
            elevation = CardDefaults.cardElevation(),
            modifier = Modifier
                .size(400.dp, 150.dp)
                .padding(start = 32.dp, end = 32.dp, top = 8.dp)
                .fillMaxWidth(),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement  = Arrangement.Center,
                horizontalAlignment = CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.consultations),
                    contentDescription = "Imagem de um médico",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(80.dp)
                        .align(CenterHorizontally)
                        .padding(top = 16.dp)
                )
                Text(
                    text = "Consultas",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 16.dp, bottom = 16.dp)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    VollTheme {
        HomeScreen()
    }
}