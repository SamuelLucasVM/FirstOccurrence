package src.test.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import src.solution.fistOccurrence;

public class fistOccurrenceTest {
    fistOccurrence firstOccurrence;

    @Before
    public void prepareFisrtOccurrence() {
        this.firstOccurrence = new fistOccurrence();
    }

    void genericTest(int wanted, int[] array, int x) {
        assertEquals(wanted, firstOccurrence.searchFistIndex(array, x));
    }

    @Test
    public void firstOccurrenceTest01() {
        genericTest(1, new int[] {1, 2, 2, 2, 3, 3}, 2);
    }

    @Test
    public void firstOccurrenceTest02() {
        genericTest(0, new int[] {1, 2, 2, 2, 3, 3}, 1);
    }

    @Test
    public void firstOccurrenceTest03() {
        genericTest(4, new int[] {1, 2, 2, 2, 3, 3}, 3);
    }

    @Test
    public void firstOccurrenceTest04() {
        genericTest(0, new int[] {0, 0, 0, 0, 1, 1, 1, 2, 2, 3}, 0);
    }

    @Test
    public void firstOccurrenceTest05() {
        genericTest(4, new int[] {0, 0, 0, 0, 1, 1, 1, 2, 2, 3}, 1);
    }

    @Test
    public void firstOccurrenceTest06() {
        genericTest(7, new int[] {0, 0, 0, 0, 1, 1, 1, 2, 2, 3}, 2);
    }

    @Test
    public void firstOccurrenceTest07() {
        genericTest(9, new int[] {0, 0, 0, 0, 1, 1, 1, 2, 2, 3}, 3);
    }
}