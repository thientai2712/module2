package demo;

public class NhiPhan {
    public static void main(String[] args) {
        ThapPhanToNhiPhan obj = new ThapPhanToNhiPhan();
        System.out.println("Giá trị nhị phân của 124 là: ");
        obj.convertBinary(124);
        System.out.println("\nGiá trị nhị phân của 45 là: ");
        obj.convertBinary(49);
        System.out.println("\nGiá trị nhị phân của 999 là: ");
        obj.convertBinary(1000);
        System.out.println();
    }
    public static class ThapPhanToNhiPhan {
        public void convertBinary(int num) {
            int binary[] = new int[40];
            int index = 0;
            while (num > 0) {
                binary[index++] = num % 2;
                num = num / 2;
            }
            for (int i = index - 1; i >= 0; i--) {
                System.out.print(binary[i]);
            }
        }
    }
}

