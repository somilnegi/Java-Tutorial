public class _3Q1 {
    public static void main(String[] args){
        String st=new String("Graphic");
        StringBuffer sbr=new StringBuffer("Graphic");
        System.out.println("Before modifying the values are -\n"+"st : "+st+", sbr : "+sbr);
        st.concat("Era");
        sbr.append("Era");
        System.out.println("After modifying the values are -\n"+"st : "+st+", sbr : "+sbr);
    }
}
