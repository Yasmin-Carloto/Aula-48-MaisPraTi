package org.example;
public class Main {
    public static void main(String[] args) {
        int[] vector = new int[5];

        vector[0] = 10;
        vector[1] = 20;
        vector[2] = 30;
        vector[3] = 40;
        vector[4] = 50;
        vector[4] = 100;

        // Reverta o array
        int start = 0;
        int end = vector.length - 1;

        while (start < end){
            int currNumber = vector[start];
            vector[start] = vector[end];
            vector[end] = currNumber;

            start++;
            end--;
        }

//        Para mostrar elementos do array
//        for (int i = 0; i < vector.length; i++){
//            System.out.println(vector[i]);
//        }

        // Adicionar elemento no array
        int[] vectorToAddElement = new int[vector.length + 1];
        for(int i = 0; i < vector.length; i++){
            vectorToAddElement[i] = vector[i];
        }
        vectorToAddElement[vector.length] = 110;

//        Para mostrar elementos do array
//        for (int i = 0; i < vetcorToAddElement.length; i++){
//            System.out.println(vectorToAddElement[i]);
//        }

        // Remover elementos no array
        int[] vectorToDeleteElement = new int[vector.length - 1];
        for(int i = 0; i < vectorToDeleteElement.length; i++){
            vectorToDeleteElement[i] = vector[i];
        }

//        Para mostrar elementos do array
//        for (int i = 0; i < vectorToDeleteElement.length; i++){
//            System.out.println(vectorToDeleteElement[i]);
//        }

        // Pesquisando elemento no array
        for(int i = 0; i < vector.length; i++){
            if(vector[i] == 30){
                System.out.println("O número 30 está na posição: " + i);
            }
        }

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {10, 11, 10}
        };

        for(int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Somar todos os elementos da matriz
        float sum = 0;
        for(int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        System.out.println("Soma da matriz: " + sum);

        // Somar diagonal principal e secundária
        float  mainDiagonal = 0;
        float secondaryDiagonal = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(j == i){
                    mainDiagonal += matrix[i][j];
                }
                if((i+j) == matrix.length - 1){
                    secondaryDiagonal += matrix[i][j];
                }
            }
        }

        System.out.println("Soma dos elementos da diagonal principal: " + mainDiagonal);
        System.out.println("Soma dos elementos da diagonal secundária: " + secondaryDiagonal);

        // Buscar elemento em matriz
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
               if(matrix[i][j] == 10){
                   System.out.println("A posição do número dez na matriz é: i = " + i + "; j = " + j + ";");
               }
            }
        }

        // Rotacionar matriz em 90 graus
        int matrixLength = matrix.length;
        int[][] rotatedMatrix = new int[matrixLength][matrixLength];

        for(int i = 0; i < matrixLength; i++){
            for(int j = 0; j < matrix[i].length; j++){
                rotatedMatrix[j][matrixLength - 1 - i] = matrix[i][j];
            }
        }

        for(int[] row : rotatedMatrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}