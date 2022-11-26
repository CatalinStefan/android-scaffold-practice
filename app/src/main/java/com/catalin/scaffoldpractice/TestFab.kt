package com.catalin.scaffoldpractice

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.launch

@Composable
fun TestFab(state: ScaffoldState) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()

    FloatingActionButton(onClick = {
//        makeToast(context, "Floating action button clicked")
        coroutineScope.launch {
            val result = state.snackbarHostState.showSnackbar(
                message = "Fab clicked",
                duration = SnackbarDuration.Short,
                actionLabel = "Action"
            )
            when (result) {
                SnackbarResult.ActionPerformed -> { makeToast(context, "Snackbar action performed") }
                SnackbarResult.Dismissed -> { makeToast(context, "Snackbar dismissed") }
            }
        }
    }) {
        Icon(Icons.Default.Add, contentDescription = null)
    }
}