public class Question9 {
    public static void main(String[] args) {
        int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
        int sum=0;
        int avg=0;
        int small=A[0];
        for(int i=0;i<15;i++){
            sum=sum+i;
            if(small>A[i]){
                small=A[i];
            }
        }
        A[15]=sum;
        avg=sum/18;
        A[16]=avg;
        A[17]=small;
        for(int a:A){
            System.out.println(a);

        }
    }
}
