package com.example.chess_app_clone.data

import com.example.chess_app_clone.R
import com.example.chess_app_clone.model.GeneralInfo

class DataSource {
    fun loadPiecesInfo(): List<GeneralInfo> {
        return listOf(
            GeneralInfo(R.string.cal, R.drawable.caiii,R.drawable.calmiscat),

            GeneralInfo(R.string.nebun, R.drawable.nebunii,R.drawable.nebunmiscat),

            GeneralInfo(R.string.pion, R.drawable.pionii,R.drawable.pionmiscat),

            GeneralInfo(R.string.rege, R.drawable.regiii,R.drawable.regemiscat),

            GeneralInfo(R.string.regina, R.drawable.damee,R.drawable.damamiscat),

            GeneralInfo(R.string.turn, R.drawable.turee,R.drawable.turnmiscat),

            )
    }
}


