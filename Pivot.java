public class Pivot {
    public static void pivot(int pivotRow, int pivotColumn) {
        float pivotValue = Table.table[pivotRow][pivotColumn];

        // Normalizando a linha pivô
        for (int j = 0; j < Table.table[0].length; j++) {
            Table.table[pivotRow][j] /= pivotValue;
        }

        // Atualizando as outras linhas
        for (int i = 0; i < Table.table.length; i++) {
            if (i != pivotRow) {
                float factor = Table.table[i][pivotColumn];
                for (int j = 0; j < Table.table[0].length; j++) {
                    Table.table[i][j] -= factor * Table.table[pivotRow][j];
                }
            }
        }
    }   
}
