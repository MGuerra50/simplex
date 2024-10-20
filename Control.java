public class Control {
    public static int numberOfConstraints = Table.table.length - 1;//Linhas retirando a função principal
    public static int numberOfVariables = Table.table[0].length - numberOfConstraints - 2; //Colunas com negativo na função principal

    public static void control() {
        while (true) {
            //1, 2, 5
            int pivotColumn = FindPivotColumn.findPivotColumn();
            if (pivotColumn < 0) {
                break; // Otimização completa
            }
            
            int pivotRow = FindPivotRow.findPivotRow(pivotColumn);
            if (pivotRow < 0) {
                throw new ArithmeticException("Problema ilimitado");
            }

            Pivot.pivot(pivotRow, pivotColumn);
        }
        
        PrintSolution.printSolution();
    }    
}
