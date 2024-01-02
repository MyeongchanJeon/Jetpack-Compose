package com.example.jetpackcompose

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.padding(),
                    color = MaterialTheme.colors.background,
                ) {
                    //실제 화면
                    Greeting("")
                }
            }
        }
    }
}

private fun onClick(context: Context) {
    Toast.makeText(
        context,
        "Item name",
        Toast.LENGTH_SHORT
    ).show()
}

@Composable
fun Greeting(name: String, context: Context = LocalContext.current) {
    Scaffold(topBar = {
        TopAppBar(title = {Text("TopAppBar")}
        , backgroundColor = Color(0xff589ac6))
    }) {
        Text(text = "안녕하세요? $name")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTheme {
        //tools
        Greeting("World")
    }
}