public class FindPivotColumn {
    public static int findPivotColumn() {
        float[][] tableLocal = Table.table;
        int pivotColumn = -1;
        float menorValor = 0;
        for (int i = 0; i< tableLocal[0].length-1;i++) {
            menorValor = tableLocal[0][i] > menorValor ? menorValor : tableLocal[0][i];
            pivotColumn = tableLocal[0][i] > menorValor ? pivotColumn : i;
        }
        return pivotColumn;
    }
}
