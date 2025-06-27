public class SparseMatrix {
    public static void main(String args[]){
        int a[][] = {{0, 0, 3, 0, 4},
                    {0, 0, 5, 7, 0},
                    {0, 0, 0, 0, 0},
                    {0, 2, 6, 0, 0}
                };
        int r = a.length;
        int c =a [0].length;
        int size = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]!=0){
                    size+=1;
                }
            }
        } 

        int res[][] = new int[size][3];
        int k=0;

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(a[i][j] != 0){
                    res[k][0] = i;      
                    res[k][1] = j;      
                    res[k][2] = a[i][j]; 
                    k++;
                }
            }
        }

        System.out.println("Row\tColumn\tValue");
        for(int i=0; i<size; i++){
            System.out.println(res[i][0] + "\t" + res[i][1] + "\t" + res[i][2]);
        }

    }
}
