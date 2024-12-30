package com.example.nighteventsapp.models

import androidx.compose.runtime.mutableStateOf

val eventList = listOf(
    Event(
        id = 1,
        title = "Conferência de Tecnologia 2024",
        description = "Tendências em tecnologia.",
        date = "2024-12-15",
        location = "Parque Tecnológico",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageUrl = "https://conectanuvem.com.br/wp-content/uploads/2022/11/Capas-Blog-Imagem-destacadas-2022-44-865x576.png"
    ),
    Event(
        id = 2,
        title = "Workshop de IA",
        description = "Aprenda sobre Inteligência Artificial.",
        date = "2024-12-20",
        location = "Centro de Convenções",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageUrl = "https://noticiadoamazonas.com.br/wp-content/uploads/2024/12/Workshop-explora-a-transformacao-digital-com-IA-para-as-empresas-do-PIM.jpg"
    ),
    Event(
        id = 3,
        title = "Hackathon 2024",
        description = "24 horas de inovação e programação.",
        date = "2024-12-10",
        location = "Campus Universitário",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageUrl = "https://www.mackenzie.br/fileadmin/ARQUIVOS/Public/1-mackenzie/universidade/unidades-academicas/EE/2024/hackathon/HACKATHON_PRETO.png"
    )
)
