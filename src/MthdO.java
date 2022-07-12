//Overloading allows different methods to have the same name but different signatures where the signature can differ by the number of input
//parameters or both. It is related to compile time or static polymorphism


public class MthdO {
    //overloaded sum ..this takes two int parameters.
    public int MthdO(int x, int y){
        return (x+y);
    }

    //overloaded MthdO()..this sum takes three int parameters.
    public int Sum(int x, int y, int z){
        return (x + y + z);
    }
    //Overloaded MthdO()...This usm takes two double parameters
    public double Sum(double x, double y){
        return (x + y);
    }

    public static void main(String[] args) {
        MthdO s = new MthdO();
        System.out.println(s.MthdO(10, 20));
//        System.out.println(s.MthdO(10, 20 ));
        System.out.println(s.Sum(10, 20, 30));
    }
}
