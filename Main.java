public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] m={25_000,30_000,35_000,40_000,50_000};
        int sum=0;
        for (int i=0;i<m.length;i++) {
            sum=sum+m[i];
        }
        System.out.println("Сумма трат за месяц "+sum+" рублей");

        System.out.println("Задача 2");
        int max=m[0];
        int min=m[0];
        for (int i=0; i < m.length; i++){

            if (m[i] < min) {
                min = m[i];
            }
           if (m[i]>max){
               max = m[i];
            }
        }
         System.out.println("Минимальная сумма трат за неделю составила "+min+ " рублей. Максимальная сумма трат за неделю составила "+max+ " рублей");

        System.out.println("Задача 3");
        double averageDouble=(double) sum / m.length;
        System.out.println("Средняя сумма трат за месяц составила "+averageDouble +" рублей" );

        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i=reverseFullName.length-1;i>=0; i--){
            System.out.print(reverseFullName[i]);

        }
    }
}