package com.mollychin.array;

/**
 * In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a
 * new one with different size but keep its original data. You're given a matrix represented by a
 * two-dimensional array, and two positive integers r and c representing the row number and column
 * number of the wanted reshaped matrix, respectively. The reshaped matrix need to be filled with
 * all the elements of the original matrix in the same row-traversing order as they were. If the
 * 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix;
 * Otherwise, output the original matrix.
 */
public class ReshapeTheMatrixTest {

  public static void main(String[] args) {
  }

  public static int[][] reshapeMatrix(int[][] originalMatrix, int r, int c) {
    int originalRow = originalMatrix.length, originalColumn = originalMatrix[0].length;
    if (r * c != originalRow * originalColumn) {
      return originalMatrix;
    }
    int[][] currentMatrix = new int[r][c];
    for (int i = 0; i < r * c; i++) {
      currentMatrix[i / c][i % c] = originalMatrix[i / originalColumn][i % originalColumn];
    }
    return currentMatrix;
  }
}
