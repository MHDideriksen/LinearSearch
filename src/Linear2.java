public class Linear2 {
    public static void main(String[] args) {
        Boolean found = false;
        String[] navn = {"Mads", "Sebastian", "Flenner", "Harry", "Meblom"};
        int i = 0;

        String Navnetdusøger = "Harry";

        while (found == false){

            if ( Navnetdusøger == navn[i]){
                System.out.println("Du fandt ham på positionen: 1" + i);
                break;
            }
            else {
                System.out.println( "Du fandt ham ikke: " + i);

            }

            i++;
            if (i>(navn.length)){
                System.out.println("Vi fandt ham ikke: ");

            }
        }
    }
}
