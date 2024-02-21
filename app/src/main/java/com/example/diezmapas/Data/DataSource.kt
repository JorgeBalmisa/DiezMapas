package com.example.diezmapas.Data

import com.example.diezmapas.R

class DataSource {
    fun getMapas(): List<Mapa> {
        return listOf(
            Mapa(R.drawable.kino_der_toten_menu_selection_bo3, R.string.mapa_nombre_1, 1968, R.string.mapa_descripcion_1),
            Mapa(R.drawable.callofthedead, R.string.mapa_nombre_2, 1990, R.string.mapa_descripcion_2),
            Mapa(R.drawable.dierise, R.string.mapa_nombre_3, 2025, R.string.mapa_descripcion_3),
            Mapa(R.drawable.derriese, R.string.mapa_nombre_4, 1943, R.string.mapa_descripcion_4),
            Mapa(R.drawable.mobofthedead, R.string.mapa_nombre_5, 1970, R.string.mapa_descripcion_5),
            Mapa(R.drawable.moon, R.string.mapa_nombre_6, 2024, R.string.mapa_descripcion_6),
            Mapa(R.drawable.nacht, R.string.mapa_nombre_7, 1941, R.string.mapa_descripcion_7),
            Mapa(R.drawable.shinonuma, R.string.mapa_nombre_8, 1943, R.string.mapa_descripcion_8),
            Mapa(R.drawable.verruckt, R.string.mapa_nombre_9, 1942, R.string.mapa_descripcion_9)
        )
    }
}