import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.util.System.in);
        double balance = 1000.0;
        boolean run = true;
        System.out.println("--- مرحباً بك في نظام الصراف الآلي المطور ---");

        while (run) {
            System.out.println("\nالرجاء اختيار العملية المطلوبة:");
            System.out.println("1. الاستعلام عن الرصيد");
            System.out.println("2. إيداع أموال");
            System.out.println("3. سحب أموال");
            System.out.println("4. خروج من النظام");
            System.out.print("أدخل رقم خيارك: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("رصيدك الحالي هو: " + balance + " ريال");
                    break;

                case 2:
                    System.out.print("أدخل المبلغ المراد إيداعه: ");
                    double depositAmount = input.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("تم الإيداع بنجاح! رصيدك الجديد هو: " + balance + " ريال");
                    } else {
                        System.out.println("مبلغ الإيداع غير صحيح!");
                    }
                    break;

                case 3:
                    System.out.print("أدخل المبلغ المراد سحبه: ");
                    double withdrawnAmount = input.nextDouble();
                    if (withdrawnAmount > balance) {
                        System.out.println("عذراً، رصيدك غير كافٍ. رصيدك الحالي هو: " + balance + " ريال");
                    } else if (withdrawnAmount <= 0) {
                        System.out.println("مبلغ السحب غير صحيح!");
                    } else {
                        balance -= withdrawnAmount;
                        System.out.println("تم السحب بنجاح! رصيدك المتبقي هو: " + balance + " ريال");
                    }
                    break;

                case 4:
                    System.out.println("شكراً لاستخدامك نظامنا البنكي. في أمان الله!");
                    run = false;
                    break;

                default:
                    System.out.println("خيار غير صحيح! الرجاء اختيار رقم من 1 إلى 4.");
            }
        }
        input.close();
    }
}
