package de.rogallab.android.compose

import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import de.rogallab.android.compose.ui.MainScreen2
import de.rogallab.android.compose.ui.theme.AppTheme

class MainActivity : BaseActivity("ok>MainActivity       .") {
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContent {

         AppTheme(

         ) {
            Surface(
               modifier = Modifier.fillMaxSize(),
               color = MaterialTheme.colors.background
            ) {

               val name by remember { mutableStateOf("") }
               Log.d("ok>ComposeView        .", "Composition {$name}")
               MainScreen2()
//             RegisterScreen2()
            }
         }
      }
  }

}

/*

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
   AppTheme {
//    MainScreen()
      var state: String  by remember { mutableStateOf("") }
      var count: Int by remember { mutableStateOf(0) }

/*
      MainScreen(
         state = state,
         onStateChange = { state = it },
         count = count,
         onCountChange = { count++ }
      )
 */
   }
}
*/