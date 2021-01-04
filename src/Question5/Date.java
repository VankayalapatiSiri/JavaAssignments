package Question5;

import java.util.Scanner;

class Date{
    int   day;
    int  month;
    int   year;
    static int m2, d2;
    Date( int dd,int mm,int yy){
        day=dd;
        month=mm;
        year=yy;
        System.out.println(day+"/"+month+"/"+year);
        errorCheck();
    }
    void displayDate(){
        System.out.println(day+"/"+month+"/"+year);
    }
    void errorCheck(){
        if(day>31|| day<=0){
            System.out.println("Pls enter a valid date");
        }
        else if(month <=0|| month>12){
            System.out.println("Pls enter a valid month");
        }
        else{
            System.out.println("Valid ");
        }
    }
    static boolean isLeap(int y)
    {
        if (y % 100 != 0 && y % 4 == 0 || y % 400 == 0)
            return true;

        return false;
    }

    static int offsetDays(int d, int m, int y)
    {
        int offset = d;

        if(m - 1 == 11)
            offset += 335;
        if(m - 1 == 10)
            offset += 304;
        if(m - 1 == 9)
            offset += 273;
        if(m - 1 == 8)
            offset += 243;
        if(m - 1 == 7)
            offset += 212;
        if(m - 1 == 6)
            offset += 181;
        if(m - 1 == 5)
            offset += 151;
        if(m - 1 == 4)
            offset += 120;
        if(m - 1 == 3)
            offset += 90;
        if(m - 1 == 2)
            offset += 59;
        if(m - 1 == 1)
            offset += 31;

        if (isLeap(y) && m > 2)
            offset += 1;

        return offset;
    }
    static void revoffsetDays(int offset, int y)
    {
        int []month={ 0, 31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31 };

        if (isLeap(y))
            month[2] = 29;

        int i;
        for (i = 1; i <= 12; i++)
        {
            if (offset <= month[i])
                break;
            offset = offset - month[i];
        }

        d2 = offset;
        m2 = i;
    }
    static void addDays(int d1, int m1, int y1, int x)
    {
        int offset1 = offsetDays(d1, m1, y1);
        int remDays = isLeap(y1) ? (366 - offset1) : (365 - offset1);
        int y2, offset2 = 0;
        if (x <= remDays)
        {
            y2 = y1;
            offset2 =offset1 + x;
        }

        else
        {
            x -= remDays;
            y2 = y1 + 1;
            int y2days = isLeap(y2) ? 366 : 365;
            while (x >= y2days)
            {
                x -= y2days;
                y2++;
                y2days = isLeap(y2) ? 366 : 365;
            }
            offset2 = x;
        }
        revoffsetDays(offset2, y2);
        //System.out.println("d2 = " + d2 + ", m2 = " +
               // m2 + ", y2 = " + y2);
        System.out.println(d2+"/"+m2+"/"+y2);
    }
    Date(){

    }
    public static void main(String[] args)
    {   int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Date");
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int yy = sc.nextInt();
        Date d = new Date(dd,mm,yy);
        System.out.println("Enter the integer to be added");
        x=sc.nextInt();
        addDays(dd, mm, yy, x);

    }
}


