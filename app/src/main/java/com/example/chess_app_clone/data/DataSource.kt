package com.example.chess_app_clone.data

import com.example.chess_app_clone.R
import com.example.chess_app_clone.model.GeneralInfo

class DataSource {
    fun loadPiecesInfo(): List<GeneralInfo> {
        return listOf(
            GeneralInfo(R.string.cal, R.drawable.caiii),

            GeneralInfo(R.string.nebun, R.drawable.nebunii),

            GeneralInfo(R.string.pion, R.drawable.pionii),

            GeneralInfo(R.string.rege, R.drawable.regiii),

            GeneralInfo(R.string.regina, R.drawable.damee),

            GeneralInfo(R.string.turn, R.drawable.turee),



        )
    }
}

