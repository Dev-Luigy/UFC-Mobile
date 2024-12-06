package com.example.zooapp.models

import com.example.zooapp.R


data class Animal (
    val id: Int,
    val name: String,
    val species: String,
    val imageRes: Int,
    val description: String,
    val curiosities: String,
    var isFavorite: Boolean = false
)

val animalList = listOf(
    Animal(
        id = 1,
        name = "Aspas",
        species = "Duelista",
        imageRes = R.drawable.aspas,
        description = "Atira m todos",
        curiosities = "Casado"
    ),
    Animal(
        id = 2,
        name = "Nzr",
        species = "IGL",
        imageRes = R.drawable.nzr,
        description = "Mono Sova",
        curiosities = "Manito"
    ),
    Animal(
        id = 3,
        name = "Artzin",
        species = "Flex",
        imageRes = R.drawable.artzin,
        description = "Mirinha boa",
        curiosities = "O único que ficou do time antigo"
    ),
    Animal(
        id = 4,
        name = "Cortezia",
        species = "Sentinela",
        imageRes = R.drawable.cortezia,
        description = "Joga demais.",
        curiosities = "Tem o mesmo bigode do Marcelo Mikael da nossa turma."
    ),
    Animal(
        id = 5,
        name = "Xenom",
        species = "Controlador",
        imageRes = R.drawable.xenom,
        description = "Novato experiente",
        curiosities = "Joga muito também"
    ),
)

