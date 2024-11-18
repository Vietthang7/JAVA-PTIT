package J04016;

import java.util.Scanner;

public class Matrix { 
  private int m, n;
  private int[][] a;

  
  public Matrix() {
  }

  public Matrix(int n, int m){
    this.n = n;
    this.m = m;
    this.a = new int[n][m];
  }

  public void nextMatrix(Scanner sc){
    for(int i = 0; i < this.n; i++){
      for(int j = 0; j < m; j++){
        a[i][j] = sc.nextInt();
      }
    }
  }

  public Matrix mul(Matrix b){
    Matrix c = new Matrix(this.n, b.m);
    for(int i = 0; i < this.n; i++){
      for(int j = 0; j < b.m; j++){
        for(int k = 0; k < this.m; k++){
          c.a[i][j] += this.a[i][k] * b.a[k][j];
        }
      }
    }
    return c;
  }
  public String toString() {
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < this.n; i++) {
        for (int j = 0; j < this.m; j++) s.append(a[i][j]).append(" ");
        s.append("\n");
    }
    return s.toString();
}
  
}


// 1 2 3
// 4 5 6
// 7 8 9

// 1 2 3 4
// 5 6 7 8
// 7 8 9 10

// n = 3 m = 3 p = 4

// a[i][j] * b[j][k] 

