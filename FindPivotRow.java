public class FindPivotRow {
    public static int findPivotRow(int pivotColumn) {
        int pivotRow = -1;
        float minRatio = Float.MAX_VALUE;
        for (int i = 0; i < Control.numberOfConstraints; i++) {
            if (Table.table[i][pivotColumn] > 0) {
                float ratio = Table.table[i][Table.table[0].length - 1] / Table.table[i][pivotColumn];
                if (ratio < minRatio) {
                    minRatio = ratio;
                    pivotRow = i;
                }
            }
        }
        return pivotRow;
    }
}
