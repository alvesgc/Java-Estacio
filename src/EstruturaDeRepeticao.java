public class EstruturaDeRepeticao {
    public static void main (String[] args) {
        //FOR
        int i;
        for(i = 1; i < 11;i++){
            System.out.println("The value of index is: "+ i);
        }
        // While
        i = 10;
        while(i > 0) {
            System.out.println("The value of index is: "+ i);
            i--;
        }
        //DO WHILE
        i = 0;
        do{
            System.out.println("The value of do is.... while: " + i);
            i++;
        }while(0 < i);
    }
}
