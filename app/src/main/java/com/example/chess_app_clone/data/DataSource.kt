package com.example.chess_app_clone.data

import com.example.chess_app_clone.R
import com.example.chess_app_clone.model.GeneralInfo

class DataSource {
    fun loadPiecesInfo(): List<GeneralInfo> {
        return listOf<GeneralInfo>(GeneralInfo(R.string.affirmation1, R.drawable.cal_negru),
            GeneralInfo(R.string.affirmation2, R.drawable.nebun_negru),
            GeneralInfo(R.string.affirmation3, R.drawable.pion_negru),
            GeneralInfo(R.string.affirmation4, R.drawable.rege_negru),
            GeneralInfo(R.string.affirmation5, R.drawable.regina_neagra),
            GeneralInfo(R.string.affirmation6, R.drawable.turn_negru)
        )
    }
}