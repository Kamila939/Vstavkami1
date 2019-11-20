 public class Main {
     public static void main(String[] args) {
         int[] mas = new int[10];
         for (int i = 0; i < mas.length; i++) {
             mas[i] = (int) Math.round(Math.random() * 100);
             System.out.print(mas[i] + " ");
         }

         int j, temp;
         for(int i = 0; i < mas.length; i++){
             temp = mas[i];
             for(j = i-1; j >= 0 && mas[j] > temp; j--){
                 mas[j+1] = mas[j];
             }
             mas[j+1] = temp;
         }

         for (int i = 0; i < mas.length; i++) System.out.print(mas[i] + " ");
     }
 }
