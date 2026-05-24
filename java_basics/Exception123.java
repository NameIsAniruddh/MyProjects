class Exception123{
  public static void main(String args[]){  
                try{
int a[]=new int[5];
         a[5]=4;
}
        catch(ArrayIndexOutOfBoundsException e) 
         {System.out.println(e);}
            System.out.println("other statement");
       

}
}