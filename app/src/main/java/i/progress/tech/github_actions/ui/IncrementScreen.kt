package i.progress.tech.github_actions.ui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun IncrementScreen() {
    var i by remember { mutableIntStateOf(1) }
    Text("Value = $i")
    Button(onClick = {i++}) {
        Text("Plus")
    }
}