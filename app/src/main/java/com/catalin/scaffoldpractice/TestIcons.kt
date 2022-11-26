package com.catalin.scaffoldpractice

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun TestIcons() {
    Column(
        modifier = Modifier.fillMaxSize(1f),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val icon1 = painterResource(id = R.drawable.ic_fav)
        Icon(painter = icon1, contentDescription = null)

        Icon(Icons.Default.Email, contentDescription = null)
        Icon(Icons.Outlined.Email, contentDescription = null)

        IconButton(onClick = { /*navigate to profile screen*/ }) {
            Icon(Icons.Default.Person, contentDescription = null)
        }
    }
}