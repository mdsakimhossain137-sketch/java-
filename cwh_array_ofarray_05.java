public class cwh_array_ofarray_05 {
    public static void main(String[] args) {
     //int [] marks={23,45,56,78,56};
     //int [][] flats={};
     int [] marks;
     int [][] flats;
     flats = new int [2][3];
     flats[0][0] =101;
     flats[0][1] =101;
     flats[0][2] =101;
     flats[1][0] =101;
     flats[1][1] =101;
     flats[1][2] =101;
     for(int i=0;i<flats.length;i++){
        for(int j=0;j<flats[i].length;j++){
            System.out.print(flats[i][j]);
            System.out.print(" ");
        }
          System.out.print("\n");
     }

    }
}
