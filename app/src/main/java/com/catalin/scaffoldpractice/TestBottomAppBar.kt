package com.catalin.scaffoldpractice

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

enum class BottomIcons {
    LIST,
    SHARE,
    FAV
}

@Composable
fun TestBottomAppBar() {
    val selected = remember { mutableStateOf(BottomIcons.LIST) }

    BottomAppBar(content = {
        Row(
            modifier = Modifier.fillMaxWidth(1f),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Bottom bar", fontSize = 20.sp)
            IconButton(onClick = { selected.value = BottomIcons.LIST }) {
                Icon(
                    Icons.Default.List,
                    contentDescription = null,
                    tint = if (selected.value == BottomIcons.LIST) Color.Red else Color.White
                )
            }
            IconButton(onClick = { selected.value = BottomIcons.SHARE }) {
                Icon(
                    Icons.Default.Share,
                    contentDescription = null,
                    tint = if (selected.value == BottomIcons.SHARE) Color.Red else Color.White
                )
            }
            IconButton(onClick = { selected.value = BottomIcons.FAV }) {
                Icon(
                    Icons.Default.Favorite,
                    contentDescription = null,
                    tint = if (selected.value == BottomIcons.FAV) Color.Red else Color.White
                )
            }
        }
    })
}