import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    operateParking();
  }

  public static void operateParking() {
    while (true) {
      System.out.println("1. 初始化数据\n2. 停车\n3. 取车\n4. 退出\n请输入你的选择(1~4)：");
      Scanner printItem = new Scanner(System.in);
      String choice = printItem.next();
      if (choice.equals("4")) {
        System.out.println("已退出");
        break;
      }
      handle(choice);
    }
  }

  private static void handle(String choice) {
    Scanner scanner = new Scanner(System.in);
    if (choice.equals("1")) {
      System.out.println("请输入初始化数据\n格式为\"停车场编号1：车位数,停车场编号2：车位数\" 如 \"A:8,B:9\"：");
      String initInfo = scanner.next();
      init(initInfo);
    }
    else if (choice.equals("2")) {
      System.out.println("请输入车牌号\n格式为\"车牌号\" 如: \"A12098\"：");
      String carInfo = scanner.next();
      String ticket = park(carInfo);
      System.out.println(ticket);
    }
    else if (choice.equals("3")) {
      System.out.println("请输入停车券信息\n格式为\"停车场编号1,车位编号,车牌号\" 如 \"A,1,8\"：");
      String ticket = scanner.next();
      String car = fetch(ticket);
      System.out.println(car);
    }
  }

  public static void init(String initInfo) {

  }

  public static String park(String carNumber) {
    return "";
  }

  public static String fetch(String ticket) {
    return "";
  }

}
