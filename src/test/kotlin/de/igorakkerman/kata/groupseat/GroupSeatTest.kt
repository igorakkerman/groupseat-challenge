package de.igorakkerman.kata.groupseat

import de.igorakkerman.kata.groupseat.GroupSeat.Companion.groupSeats
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupSeatTest {
    @Test
    internal fun `the answer to everything used to be 42`() {
        assertThat(groupSeats())
                .isEqualTo(42)
    }
}