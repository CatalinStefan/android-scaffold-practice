package com.catalin.scaffoldpractice

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource

@Composable
fun TestTopAppBar() {
    val context = LocalContext.current
    val icon1 = painterResource(id = R.drawable.ic_fav)
    val icon2 = painterResource(id = R.drawable.ic_fb)
    val icon3 = painterResource(id = R.drawable.ic_down)
    val showMenu = remember { mutableStateOf(false) }

    TopAppBar(
        title = { Text(text = "Top app bar") },
        navigationIcon = {
            IconButton(onClick = {  }) {
                Icon(Icons.Default.Menu, contentDescription = null)
            }
        },
        actions = {
            IconButton(onClick = { makeToast(context, "Favourites") }) {
                Icon(painter = icon1, contentDescription = null)
            }
            IconButton(onClick = { showMenu.value = true }) {
                Icon(Icons.Default.MoreVert, contentDescription = null)
            }

            DropdownMenu(expanded = showMenu.value, onDismissRequest = { showMenu.value = false }) {
                DropdownMenuItem(onClick = { makeToast(context, "FB icon clicked") }) {
                    Icon(painter = icon2, contentDescription = null)
                }
                DropdownMenuItem(onClick = { makeToast(context, "Downloaded items") }) {
                    Icon(painter = icon3, contentDescription = null)
                }
            }
        }
    )
}






