import java.util.Scanner;
class question03 {
    public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		System.out.print("Enter number: ");
		int number = reader.nextInt();
  
        System.out.println("Multiplication Table of the" + number);

        
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
