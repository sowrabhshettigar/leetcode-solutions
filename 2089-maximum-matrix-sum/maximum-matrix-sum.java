class Solution {
    public long maxMatrixSum(int[][] matrix) {

        long totalSum = 0;
        int negativeCount = 0;
        int smallestValue = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                int curr = matrix[i][j];

                if (curr < 0) {
                    negativeCount++;
                }

                int absVal = Math.abs(curr);
                totalSum += absVal;

                if (absVal < smallestValue) {
                    smallestValue = absVal;
                }
            }
        }

        if (negativeCount % 2 == 0) {
            return totalSum;
        }

        return totalSum - 2L * smallestValue;
    }
}
