import java.util.*;
public class ShortestPath {
    public static float Path(String s){
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            char dir=s.charAt(i);
            if(dir=='S')y--;
            else if(dir=='N')y++;
            else if(dir=='W')x--;
            else{
                x++;
            }
        }
        return (float)(Math.sqrt(x*x+y*y));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(Path(str));
    }
}
