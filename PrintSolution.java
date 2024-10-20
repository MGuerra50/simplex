public class PrintSolution {
    public static void printSolution() {
        float[] solution = new float[Control.numberOfVariables];
        for (int i = 0; i < Control.numberOfVariables; i++) {
            boolean isBasic = false;
            int row = -1;
            for (int j = 0; j < Control.numberOfConstraints; j++) {
                if (Table.table[j][i] == 1) {
                    if (isBasic) {
                        isBasic = false;
                        break;
                    }
                    isBasic = true;
                    row = j;
                } else if (Table.table[j][i] != 0) {
                    isBasic = false;
                    break;
                }
            }
            if (isBasic) {
                solution[i] = Table.table[row][Table.table[0].length - 1];
            } else {
                solution[i] = 0;
            }
        }
    

    }
}
