package HWclass12;

public class Task1 {
    public static void main(String[] args) {
        String name="Ivana";
        if (!name.isEmpty() && name.length()>=3 && name.length()%2!=0){
            System.out.println(name.charAt(2));
        }
    }
}
