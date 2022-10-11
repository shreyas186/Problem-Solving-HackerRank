class staircase{
    public static void main(String args[]){
        int i,j;
        String a[][]=new String[5][5];
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
                a[i][j]="*";
            }
        }
        for(i=0;i<a.length;i++){
            for(j=a.length-1;j>=a.length;j--){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}