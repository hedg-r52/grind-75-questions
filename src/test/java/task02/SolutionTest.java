package task02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Abbreviation in test method naming:
 *  Rs - rounded start - (
 *  Re - rounded end - )
 *  Ss - squared start - [
 *  Se - squared end - ]
 *  Cs - curved start - {
 *  Ce - curved end - }
 */
class SolutionTest {
    Solution solution = new Solution();

    @Test
    void whenRsReThenTrue() {
        String input = "()";
        boolean result = solution.isValid(input);

        assertTrue(result);
    }

    @Test
    void whenRsReSsSeCsCeThenTrue() {
        String input = "()[]{}";
        boolean result = solution.isValid(input);

        assertTrue(result);
    }

    @Test
    void whenRsSeThenFalse() {
        String input = "(]";
        boolean result = solution.isValid(input);

        assertFalse(result);
    }

    @Test
    void whenRsSsSeReThenTrue() {
        String input = "([])";
        boolean result = solution.isValid(input);

        assertTrue(result);
    }

    @Test
    void whenRsSsSeReCsRsSsSeRsCsCeReReCeThenTrue() {
        String input = "([]){([]({}))}";
        boolean result = solution.isValid(input);

        assertTrue(result);
    }
}