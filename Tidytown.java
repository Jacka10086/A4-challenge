package Assignments.Com410_4A; // 定义包名
import java.util.ArrayList;    // 导入ArrayList类
import java.util.Scanner;       // 导入Scanner类

public class TidyTown {        // 定义一个名为TidyTown的公共类

    public static void main(String[] args) { // 主方法，程序的入口点
        
        ArrayList<String> volunteers = new ArrayList<String>(); // 创建一个存储志愿者名字的ArrayList
        boolean finished = false; // 声明一个布尔变量，初始为false，用于控制循环是否结束
        Scanner keyboard = new Scanner(System.in); // 创建一个Scanner对象用于从控制台读取输入
        String name;      // 声明一个字符串变量存储读入的名字
        int pos;          // 声明一个整数变量，用于确定名字在ArrayList中的位置

        do {              // 使用do-while循环读取用户输入，直到输入为"xxx"
            System.out.print("Enter a name or xxx to finish > "); // 提示用户输入名字或输入"xxx"结束
            name = keyboard.nextLine(); // 读取用户输入的一行

            if (name.equals("xxx")) {    // 如果用户输入的是"xxx"
                finished = true;         // 将finished设为true，意味着结束输入
            } 
            else {                       // 否则
                pos = 0;                 // 初始化位置为0
                // 使用while循环确定name应该在ArrayList的哪个位置，确保名字按字母顺序排列
                while (pos < volunteers.size() && name.compareTo(volunteers.get(pos)) > 0) pos++;
                volunteers.add(pos, name); // 在正确的位置添加名字
            }
        } while (!finished); // 如果finished为false，则继续循环

        System.out.println("\nTidytown Volunteers\n-------------------"); // 打印标题
        for (String person : volunteers) { // 使用增强for循环遍历志愿者名字列表
            System.out.println(person);   // 打印每个志愿者的名字
        }
    }
}

 
