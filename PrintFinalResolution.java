public class PrintFinalResolution {
    public static float[] answers;
    public static void printSolution() {
        answers = new float[Control.numberOfVariables];
        float[][] tableLocal = Table.table;
        for (int i = 0; i < Control.numberOfVariables; i++) {
            int row = -1;
            boolean basicVariable = false;
            for (int j = 0; j < Control.numberOfConstraints; j++) {
                if (tableLocal[j][i] == 1) {
                    if (basicVariable) {
                        basicVariable = false;
                        break;
                    }
                    basicVariable = true;
                    row = j;
                } else if (tableLocal[j][i] != 0) {
                    basicVariable = false;
                    break;
                }
            }
            if (basicVariable) {
                answers[i] = tableLocal[row][tableLocal[0].length - 1];
            } else {
                answers[i] = 0;
            }
        }
    

    }
}
