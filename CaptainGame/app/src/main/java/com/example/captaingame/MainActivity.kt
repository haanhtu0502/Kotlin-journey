package com.example.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CaptainGameTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CaptainGame(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }

    @Composable
    fun CaptainGame(modifier: Modifier) {
        val treasureFound = remember { mutableIntStateOf(0) }
        val direction = remember { mutableStateOf("North") }
        val stormOfTreasure = remember{mutableStateOf("")}

        Column(modifier = modifier) {
            Text("Treasure found: ${treasureFound.intValue}")
            Text("Current direction: ${direction.value}")
            Text(stormOfTreasure.value)
            Button(onClick = {
                direction.value = "East"
                if (Random.nextBoolean()) {
                    treasureFound.value += 1
                }else{
                    stormOfTreasure.value = "Storm Ahead"
                }
            }) {
                Text("Sail East")
            }
            Button(onClick = {
                direction.value = "West"
                if (Random.nextBoolean()) {
                    treasureFound.value += 1
                }
            }) {
                Text("Sail West")
            }
            Button(onClick = {
                direction.value = "North"
                if (Random.nextBoolean()) {
                    treasureFound.value += 1
                }
            }) {
                Text("Sail North")
            }
            Button(onClick = {
                direction.value = "South"
                if (Random.nextBoolean()) {
                    treasureFound.value += 1
                }
            }) {
                Text("Sail South")
            }

        }
    }
}

