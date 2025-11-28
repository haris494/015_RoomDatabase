package com.example.roomdatabase.repositori

import android.content.Context

interface ContainerApp {
    val repositoriSiswa : RepositorySiswa
}


class ContainerDataApp(private val context: Context):
    ContainerApp {