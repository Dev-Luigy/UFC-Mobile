package com.example.nighteventsapp.ui.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Menu

@ExperimentalMaterial3Api
@Composable
fun TopBar(
    onThemeToggle: () -> Unit,
    onOpenDrawer: () -> Unit
) {
    TopAppBar(
        title = { Text("EventsApp") },
        navigationIcon = {
            IconButton(onClick = onOpenDrawer) { // Abrir o menu ao clicar no ícone
                Icon(Icons.Default.Menu, contentDescription = "Open Menu")
            }
        },
        actions = {
            IconButton(onClick = onThemeToggle) {
                Icon(Icons.Default.Done, contentDescription = "Toggle Theme")
            }
        }
    )
}
