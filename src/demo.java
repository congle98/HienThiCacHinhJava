import java.util.Scanner;

public class demo {
    static void menu(int pick){
        switch (pick){
            case 1:
                printRectangle();
                break;
            case 2:
                printSquareTriangle();
                break;
            case 3:
                printIsoscelesTriangle();
                break;
        }
    }
    static void printRectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chiều dài");
        int length = sc.nextInt();
        System.out.println("Mời nhập chiều rộng");
        int width = sc.nextInt();
        for (int i=0; i<width; i++){
            for (int j=0;j<length;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void printSquareTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Muốn góc vuông ở vị trí nào: \n 1.top-left \n 2.top-right \n 3.botton-left \n 4.botton-right");
        int check = sc.nextInt();
        System.out.println("Nhập số dòng:");
        int line = sc.nextInt();
        switch (check){
            case 1:
                for(int i=0; i<line;i++){
                    for (int j=line;j>i;j--){
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for(int i = 0; i<line; i++){
                    for (int k = 0; k < i; k++){
                        System.out.print("   ");
                    }
                    for (int j = line; j > i; j--){
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for(int i=0; i<line;i++){
                    for (int j=0;j<=i;j++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                for(int i = 0; i<line; i++){
                    for (int k = line; k > i; k--){
                        System.out.print("   ");
                    }
                    for (int j = 0; j <= i; j++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;
        }
    }
    static void printIsoscelesTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng:");
        int line = sc.nextInt();
        for(int i = 1; i <= line; i++){
            for (int j = 1; j <= line*2; j++) {
                if((Math.abs(line-j))<=(i-1)){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Bạn muốn vẽ hình gì:\n 1.Hình chữ nhật \n 2.Hình tam giác vuông \n 3.Tam giác cân \n 4.Exit");
            int pick = scanner.nextInt();
            menu(pick);
            if(pick==4){
                System.out.println("Cảm ơn bạn đã dùng phần mềm");
                break;
            }
        }
    }
}
