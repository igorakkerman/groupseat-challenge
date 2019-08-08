package de.igorakkerman.challenge.groupseat

class GroupSeat {
    companion object {
        fun groupSeats(rowsCount: Int, reservationText: String): Int {

            val reservations: Set<String> = reservationText.split(" ").toSet()

            return (1..rowsCount)
                    .map { rowNumber -> rowGroupsCount(rowNumber, reservations) }
                    .sum()
        }

        private fun rowGroupsCount(row: Int, reservations: Set<String>): Int {
            val left = group(row, 'B', 'C', 'D', 'E')
            val middle = group(row, 'D', 'E', 'F', 'G')
            val right = group(row, 'F', 'G', 'H', 'J')

            return if (free(reservations, left) && free(reservations, right))
                2
            else if (free(reservations, left) || free(reservations, middle) || free(reservations, right))
                1
            else
                0
        }

        private fun seat(rowNumber: Int, seatLetter: Char): String =
            "${rowNumber}${seatLetter}"

        private fun group(row: Int, s1: Char, s2: Char, s3: Char, s4: Char): Array<String> =
            arrayOf(s1, s2, s3, s4).map { seat(row, it) }.toTypedArray()

        private fun free(reservations: Collection<String>, group: Array<String>): Boolean =
            !group.any { reservations.contains(it) }
    }
}
