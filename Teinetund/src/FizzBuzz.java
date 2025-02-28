public class FizzBuzz {

    public static void main(String[] args) {
        /*
        Printi kõik numbrid 1-100
        Kõik arvud, mis jaguvad 3-ga, printi nr asemel "Fizz"
        Kõik arvud, mis jaguvad 5-ga, printi nr asemel "Buzz"
        Kõik arvud, mis jaguvad 3-ga ja 5-ga, printi nr asemel "FizzBuzz"
         */

        for(int i = 1; i <= 100; i++) {
            String vastus = "";
            if(i % 3==0) {
                vastus += "Fizz";
            }
            if(i % 5 == 0){
                vastus += "Buzz";
            }
            if(vastus == "") {
                vastus += i;
            }
            System.out.println(vastus);
        }
    }

}
