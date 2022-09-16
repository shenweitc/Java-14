package Demo02;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        int hour,minute,second = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入秒数：");
        int num = sc.nextInt();
        if(num>=0){
            hour = num / 3600;
            minute = num % 3600 /60;
            second = num % 60;
            System.out.println(hour+"小时"+minute+"分钟"+second+"秒");
        }else{
            System.out.println("输入数据有误！");
        }
    }
}
