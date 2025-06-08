import java.util.Scanner;

public class Copilot {
  public static void main(String[] args) {
    int y = 0;
    for (int i = 0; i<100; i++) {
      if (i % 2 == 0) {
        y += i;
      }
    }
    System.out.println(y);
  
    for (int i = 1; i < 51; i++) {
        if (isPrime(i)) {
          System.out.println(i + " ");
        } 
    }

    Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一個正整數: ");
        int number = scanner.nextInt(); // 接收使用者輸入的數字
        scanner.close();

        int reversedNumber = 0; // 用來存放倒序數字

        while (number > 0) {
            int digit = number % 10; // 取出最後一位數字
            reversedNumber = reversedNumber * 10 + digit; // 組合成倒序的數字
            number /= 10; // 移除最後一位數字
        }

        System.out.println("倒序排列: " + reversedNumber);




  }
    public static boolean isPrime(int num) {
      if (num < 2) return false;
      for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i ==0) return false;
      }
      return true;  
    }
}
  
