public class Variables {
    public static void main(String[] args) {
        // Variables:- are reusable container for a value
        // Primitive:- stores memory directly in memory (stack). [ INT DOUBLE CHAR BOOLEAN ].
        // Reference:- memory address ( stack ) points to the ( heap ), [ ARRAYS STRINGS OBJECTS ].

        String name = "Suhag S Shetty";
        int age = 22;
        char section = 'A';
        boolean isPassedOut = true;
        if(isPassedOut){
            System.out.println("The name is " + name + " and my age is " + age  + " and Im from " + section + " section") ;
        }else {
            System.out.println("Your still studying");
        }
    }
}
