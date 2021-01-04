public class Question8 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers in the range 1 to 40");
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int arr[]={1,5,10,15,40};
        System.out.println("Your first number was :"+num1);
        System.out.println("Your first number was :"+num2);
        for(int i=0;i<arr.length;i++){
            if(num1 ==arr[i] || num2==arr[i]){
                System.out.println("It's Bingo!");
            }
            else{
                System.out.println("It's not Bingo!");
            }
        }
    }
}
