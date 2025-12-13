import java.util.Scanner;

public class _1Q4 {
    public static void main(String[] args){
        char opt;
        char ch;
        Scanner sc=new Scanner(System.in);
        int prin,roi,years,months,mon_ins;
        do{
            float maturity_amount=0;
            System.out.println("Enter 'T' for Term deposit and 'R' for Recurring deposit");
            opt=sc.next();
            switch (opt) {
                case 'T':
                    System.out.println("Enter principal, rate of interest and years");
                    prin=sc.nextFloat();
                    roi=sc.nextFloat();
                    years=sc.nextFloat();
                    maturity_amount=prin*Math.pow((1+roi/100),years);
                    System.out.println("The maturity amount is "+maturity_amount);
                    break;
                    case 'R':
                    System.out.println("Enter monthly installment, rate of interest and months");
                    mon_ins=sc.nextFloat();
                    roi=sc.nextFloat();
                    months=sc.nextFloat(); 
                    maturity_amount=mon_ins*months+(mon_ins*(months*(months+1)/2)*roi/100*1/12);
                    System.out.println("The maturity amount is "+maturity_amount);
                    default:
                    System.out.println("Enter valid choice");
                    break;
            }
            System.out.println("Enter 'Y' to continue and 'N' to exit");
            ch=sc.next();
            sc.nextLine();
        }while(ch=='Y');
    }
}
