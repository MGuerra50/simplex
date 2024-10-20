public class Control {
    public static int numberOfConstraints = Table.table.length - 1;
    public static int numberOfVariables = Table.table[0].length - numberOfConstraints - 1; 

    public static void control() {
        while (true) {
            int pivotColumn = FindPivotColumn.findPivotColumn();
            if (pivotColumn < 0) {
                break;
            }
            
            int pivotRow = FindPivotRow.findPivotRow(pivotColumn);
            if (pivotRow < 0) {
               break;
            }

            Pivot.pivot(pivotColumn, pivotRow);
        }
        
        PrintFinalResolution.printSolution();
        Main.imprime(PrintFinalResolution.answers);
    }    
}
