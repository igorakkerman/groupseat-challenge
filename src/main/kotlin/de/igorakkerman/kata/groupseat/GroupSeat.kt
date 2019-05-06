package de.igorakkerman.kata.groupseat

class GroupSeat {
    companion object {
        fun groupSeats(rowsCount: Int, reservationText: String): Int {

            val reservations = reservationText.split(" ").toSet()

            return IntRange(1, rowsCount)
                    .map { rowNumber -> rowGroupsCount(rowNumber, reservations) }
                    .sum()
        }

        private fun rowGroupsCount(row: Int, reservations: Set<String>): Int {
            val leftGroup = arrayOf(seat(row, 'B'), seat(row, 'C'), seat(row, 'D'), seat(row, 'E'))
            val middleGroup = arrayOf(seat(row, 'D'), seat(row, 'E'), seat(row, 'F'), seat(row, 'G'))
            val rightGroup = arrayOf(seat(row, 'F'), seat(row, 'G'), seat(row, 'H'), seat(row, 'J'))

            return if (free(reservations, leftGroup) && free(reservations, rightGroup)) 2
            else if (free(reservations, leftGroup) || free(reservations, middleGroup) || free(reservations, rightGroup)) 1
            else 0
        }

        private fun seat(rowNumber: Int, seatLetter: Char) = "${rowNumber}${seatLetter}"

        private fun free(reservations: Collection<String>, group: Array<String>): Boolean =
                !group.any { reservations.contains(it) }
    }
}
