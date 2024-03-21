package com.milan.milanvadgamaassignment3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.milan.milanvadgamaassignment3.ui.theme.MilanVadgamaAssignment3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MilanVadgamaAssignment3Theme {
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()

                    NavHost(navController, startDestination = "mainScreen") {
                        composable("mainScreen") { MainScreen(navController) }
                        composable("screen1") { Screen1() }
                        composable("screen2") { Screen2() }
                        composable("screen3") { Screen3() }
                        composable("screen4") { Screen4() }
                    }
                }
            }
        }
    }
}

@Composable
fun MainScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Main Screen",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Button(onClick = { navController.navigate("screen1") }) {
            Text("Go to Screen 1")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { navController.navigate("screen2") }) {
            Text("Go to Screen 2")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { navController.navigate("screen3") }) {
            Text("Go to Screen 3")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { navController.navigate("screen4") }) {
            Text("Go to Screen 4")
        }
    }
}

@Composable
fun Screen1() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Screen 1",
            style = MaterialTheme.typography.h4,
            color = Color.Black,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun Screen2() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Screen 2",
            style = MaterialTheme.typography.h4,
            color = Color.Black,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun Screen3() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Screen 3",
            style = MaterialTheme.typography.h4,
            color = Color.Black,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun Screen4() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Screen 4",
            style = MaterialTheme.typography.h4,
            color = Color.Black,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MilanVadgamaAssignment3Theme {
        MainScreen(navController = rememberNavController())
    }
}
