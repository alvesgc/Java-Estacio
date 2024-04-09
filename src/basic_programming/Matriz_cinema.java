package basic_programming;

public class Matriz_cinema {
    public static void main(String[] args){
        int [][] m = new int[4][];
        m[0] = new int [2];
        m[1] = new int [4];
        m[2] = new int [1];
        m[3] = new int [10];
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j<m[i].length;j++){
                m[i][j] = i+j;
            }
        }
        for(int i = 0; i<m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "");
            }
            System.out.println();
        }
    }
}
