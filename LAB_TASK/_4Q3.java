import java.util.Scanner;

class WordExample{
    private String strdata;
    WordExample(String str){
        if(str.charAt(str.length()-1)=='.'||str.charAt(str.length()-1)=='?'||str.charAt(str.length()-1)=='!'){
            if(str.toUpperCase().equals(str)){
                int count=0;
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)==' '){
                        count++;
                    }
                    if(count>1){
                        strdata=str;
                    }
                }
                if(count<=1){
                    System.out.println("Entered string isn't acceptable");
                }
            }
            else{
                System.out.println("Entered string isn't acceptable");
            }
        }
        else{
            System.out.println("Entered string isn't acceptable");
        }
    }
    public int countWord(){
        String[] words=strdata.split(" ");
        int count=0;
        for(int i=0;i<words.length;i++){
            int f=words[i].charAt(0);
            int l=words[i].charAt(words[i].length()-1);
            if((f=='A'||f=='E'||f=='I'||f=='O'||f=='U')&&(l=='A'||l=='E'||l=='I'||l=='O'||l=='U')){
                count++;
            }
        }
        return count;
    }
    public StringBuilder placeWords(){
        StringBuilder sbr=new StringBuilder();
        String[] words=strdata.split(" ");
        for(int i=0;i<words.length;i++){
            int f=words[i].charAt(0);
            int l=words[i].charAt(words[i].length()-1);
            if((f=='A'||f=='E'||f=='I'||f=='O'||f=='U')&&(l=='A'||l=='E'||l=='I'||l=='O'||l=='U')){
                sbr.append(words[i]);
                sbr.append(" ");
            }
        }
        for(int i=0;i<words.length;i++){
            int f=words[i].charAt(0);
            int l=words[i].charAt(words[i].length()-1);
            if((f=='A'||f=='E'||f=='I'||f=='O'||f=='U')&&(l=='A'||l=='E'||l=='I'||l=='O'||l=='U')){
                continue;
            }
            else{
                sbr.append(words[i]);
                sbr.append(" ");
            }
        }
        // sbr.append(str.charAt(str.length()-1));
        return sbr;
    }
}
public class _4Q3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        WordExample w=new WordExample(str);
        int words=w.countWord();
        StringBuilder sbr=w.placeWords();
        System.out.println(words);
        System.out.println(sbr);
    }
}