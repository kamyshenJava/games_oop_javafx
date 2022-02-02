package ru.job4j.chess.firuges.black;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import ru.job4j.chess.firuges.*;
import org.junit.Test;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        Cell expected = Cell.A3;
        assertThat(expected, is(bishopBlack.position()));
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        Cell expected = Cell.D4;
        assertThat(bishopBlack.copy(Cell.D4).position(), is(expected));
    }

    @Test
    public void testWayC1G6isD2E3F4G5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishopBlack.way(Cell.G5), is(expected));
    }

    @Test
    public void testIsDiagonalA1H8Correct() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        assertTrue(bishopBlack.isDiagonal(Cell.A1, Cell.H8));
    }

    @Test
    public void testIsDiagonalC1G5Correct() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        assertTrue(bishopBlack.isDiagonal(Cell.C1, Cell.G5));
    }

    @Test
    public void testIsDiagonalA1H7Incorrect() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        assertFalse(bishopBlack.isDiagonal(Cell.A1, Cell.H7));
    }
}