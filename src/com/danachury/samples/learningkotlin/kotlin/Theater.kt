package com.danachury.samples.learningkotlin.kotlin

enum class View(val price: Double, val description: String) {
    BACK_ROW(14.50, "Back Row"),
    CHEAPER_SEAT(14.50, "Cheaper Seat"),
    RESTRICTED_VIEW(16.50, "Restricted View"),
    STANDARD_VIEW(18.00, "Standard View"),
    BEST_VIEW(21.00, "Best View");
}

class Theater {

    val seats: List<Seat>

    init {
        seats = (1..totalRows)
            .flatMap { row ->
                (1..totalSeatsByRow)
                    .map { Seat(row, it, getPrice(row, it), getDescription(row, it)) }
            }
    }

    companion object {
        private const val totalRows = 15
        private const val totalSeatsByRow = 36

        private fun getPrice(row: Int, seatNum: Int) =
            when {
                row >= 14 -> View.BACK_ROW.price
                seatNum <= 3 || seatNum >= 34 -> View.RESTRICTED_VIEW.price
                row == 1 -> View.BEST_VIEW.price
                else -> View.STANDARD_VIEW.price
            }

        private fun getDescription(row: Int, seatNum: Int) =
            when {
                row == 15 -> View.BACK_ROW.description
                row == 14 -> View.CHEAPER_SEAT.description
                seatNum <= 3 || seatNum >= 34 -> View.RESTRICTED_VIEW.description
                row == 1 -> View.BEST_VIEW.description
                else -> View.STANDARD_VIEW.description
            }
    }
}
