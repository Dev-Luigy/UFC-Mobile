package com.example.nighteventsapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.nighteventsapp.models.eventList
import coil.compose.AsyncImage

@Composable
fun EventDetailsScreen(eventId: String?) {
    val event = eventList.find { it.id.toString() == eventId }
    event?.let {
        Card(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            elevation = CardDefaults.cardElevation(8.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                // Exibe a imagem do evento usando Coil
                AsyncImage(
                    model = it.imageUrl,
                    contentDescription = "Imagem do evento",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Exibe o título do evento
                Text(
                    text = it.title,
                    style = MaterialTheme.typography.titleLarge
                )

                Spacer(modifier = Modifier.height(8.dp))

                // Exibe a descrição do evento
                Text(
                    text = it.description,
                    style = MaterialTheme.typography.bodyMedium
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Exibe a data e localização do evento
                Text(
                    text = "Data: ${it.date}",
                    style = MaterialTheme.typography.bodySmall
                )
                Text(
                    text = "Local: ${it.location}",
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    } ?: run {
        Text(
            text = "Evento não encontrado",
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

