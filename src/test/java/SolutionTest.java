import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void knightProbabilityTest1(){
        int n = 3;
        int k = 2;
        int row = 0;
        int column = 0;

        double expected = 0.06250;
        double delta = 1e-5;
        double actual = new Solution().knightProbability(n, k, row, column);

        Assert.assertEquals(expected, actual, delta);

    }

    @Test
    public void knightProbabilityTest2() {
        int n = 1;
        int k = 0;
        int row = 0;
        int column = 0;

        double expected = 1.00000;
        double delta = 1e-5;
        double actual = new Solution().knightProbability(n, k, row, column);

        Assert.assertEquals(expected, actual, delta);

    }
}
