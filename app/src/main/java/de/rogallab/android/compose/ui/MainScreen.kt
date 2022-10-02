package de.rogallab.android.compose.ui

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {

   var count by remember { mutableStateOf(0) }

   Column(modifier = Modifier
      .padding(all = 8.dp)
      .fillMaxSize()
   ) {

      Log.d("ok>MainScreen         .","Composition count:$count")

      Text(
         text = count.toString(),  // getter
         textAlign = TextAlign.Center,
         modifier = Modifier
            .padding(vertical = 8.dp)
            .border(border = BorderStroke(3.dp, Color.Gray))
            .padding(vertical = 8.dp)
            .fillMaxWidth()
      )

      Button(
         onClick = {
            count++
         },    // setter
         modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth()
      ) {
         Text ( text = "Hochzählen")
      }
   }
}