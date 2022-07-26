package com.example.chess_app_clone.data

import com.example.chess_app_clone.R
import com.example.chess_app_clone.model.GeneralInfo

class DataSource {
    fun loadPiecesInfo(): List<GeneralInfo> {
        return listOf<GeneralInfo>(GeneralInfo(R.string.cal, R.drawable.cal_negru),
            GeneralInfo(R.string.nebun, R.drawable.nebun_negru),
            GeneralInfo(R.string.pion, R.drawable.pion_negru),
            GeneralInfo(R.string.rege, R.drawable.rege_negru),
            GeneralInfo(R.string.regina, R.drawable.regina_neagra),
            GeneralInfo(R.string.turn, R.drawable.turn_negru)
        )
    }
}