public class matrix {
    int[][] matrix;

    public matrix(int rows,int cols){
        matrix = new int[rows][cols];
    }
    public void mat(int[][] values) {
        if(values.length != matrix.length || values[0].length != matrix[0].length){
            System.out.println("Do Not match matrix dimensions");
            return;
        }
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[0].length; j++){
                matrix[i][j] = values[i][j];
            }
        }
    }
    public void display(){
        for(int i = 0; i< matrix.length; i++){
            for(int j=0; j< matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] values = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        matrix m = new matrix(3, 3);
        m.mat(values);
        m.display();
    }
}



