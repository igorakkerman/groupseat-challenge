package de.igorakkerman.kata.groupseat

import de.igorakkerman.kata.groupseat.GroupSeat.Companion.groupSeats
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupSeatTest {

    @Test
    fun `1 row, empty blocking none`() {
        assertThat(groupSeats(1, ""))
                .isEqualTo(2)
    }

    @Test
    fun `1 row, 1A blocking none`() {
        assertThat(groupSeats(1, "1A"))
                .isEqualTo(2)
    }

    @Test
    fun `1 row, 1B blocking left`() {
        assertThat(groupSeats(1, "1B"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1C blocking left`() {
        assertThat(groupSeats(1, "1C"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1D blocking left and middle`() {
        assertThat(groupSeats(1, "1D"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1E blocking left and middle`() {
        assertThat(groupSeats(1, "1E"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1F blocking right and middle`() {
        assertThat(groupSeats(1, "1F"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1G blocking right and middle`() {
        assertThat(groupSeats(1, "1G"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1H blocking right`() {
        assertThat(groupSeats(1, "1H"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1J blocking right`() {
        assertThat(groupSeats(1, "1J"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1K blocking none`() {
        assertThat(groupSeats(1, "1K"))
                .isEqualTo(2)
    }

    @Test
    fun `1 row, 1A 1B blocking left`() {
        assertThat(groupSeats(1, "1A 1B"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1B 1A blocking left`() {
        assertThat(groupSeats(1, "1B 1A"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1B 1K blocking left`() {
        assertThat(groupSeats(1, "1B 1K"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1A 1J blocking right`() {
        assertThat(groupSeats(1, "1A 1J"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1A 1C blocking left and middle`() {
        assertThat(groupSeats(1, "1A 1C"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1A 1D blocking left and middle`() {
        assertThat(groupSeats(1, "1A 1D"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1A 1G blocking right and middle`() {
        assertThat(groupSeats(1, "1A 1G"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1A 1H blocking right and middle`() {
        assertThat(groupSeats(1, "1A 1H"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1A 1K blocking none`() {
        assertThat(groupSeats(1, "1A 1K"))
                .isEqualTo(2)
    }

    @Test
    fun `1 row, 1D 1G blocking all`() {
        assertThat(groupSeats(1, "1D 1G"))
                .isEqualTo(0)
    }

    @Test
    fun `1 row, 1E 1F blocking all`() {
        assertThat(groupSeats(1, "1E 1F"))
                .isEqualTo(0)
    }

    @Test
    fun `1 row, 1A 1B 1C blocking left`() {
        assertThat(groupSeats(1, "1A 1B 1C"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1H 1I 1K blocking right`() {
        assertThat(groupSeats(1, "1H 1J 1K"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1B 1C 1J 1K blocking left and right`() {
        assertThat(groupSeats(1, "1B 1C 1J 1K"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1 1C 1D 1E blocking left and middle`() {
        assertThat(groupSeats(1, "1C 1D 1E"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1 1F 1G 1H blocking right and middle`() {
        assertThat(groupSeats(1, "1F 1G 1H"))
                .isEqualTo(1)
    }

    @Test
    fun `1 row, 1 1E 1F 1G blocking all`() {
        assertThat(groupSeats(1, "1E 1F 1G"))
                .isEqualTo(0)
    }

    @Test
    fun `2 rows, 1 1A 1B 2A blocking 1 left 2 none`() {
        assertThat(groupSeats(2, "1A 1B 2A"))
                .isEqualTo(3)
    }

    @Test
    fun `2 rows, 1 1F 1G 2K blocking 1 right 2 none`() {
        assertThat(groupSeats(2, "1F 1G 2K"))
                .isEqualTo(3)
    }

    @Test
    fun `2 rows, 1 1A 2B 2C blocking 1 none 2 left`() {
        assertThat(groupSeats(2, "1A 2B 2C"))
                .isEqualTo(3)
    }

    @Test
    fun `2 rows, 1 1A 2J 2K blocking 1 none 2 right`() {
        assertThat(groupSeats(2, "1A 2J 2K"))
                .isEqualTo(3)
    }

    @Test
    fun `2 rows, 1 1D 1G 2A 2J blocking 1 all 2 left and right`() {
        assertThat(groupSeats(2, "1D 1G 2A 2J"))
                .isEqualTo(1)
    }

    @Test
    fun `2 rows, 1 1D 1G 2E 2F blocking 1 all 2 all`() {
        assertThat(groupSeats(2, "1D 1G 2E 2F"))
                .isEqualTo(0)
    }

    @Test
    fun `3 rows, 1 1D 1G 2E 2F blocking 1 all 2 all 3 none`() {
        assertThat(groupSeats(3, "1D 1G 2E 2F"))
                .isEqualTo(2)
    }
}
