class CommandLineArgument{
  public static void main(String args[]){
    int total=0;
    for(int i=0;i<args.length;i++){
      total=total+Integer.parseInt(args[i]);
    }
    System.out.println(total);
  }
}
// Use javac Javabasics.java
//     java Javabasics 1 2 3 4 5 
// for executing program using command line argument