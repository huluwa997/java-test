package main.java.han;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by zhaoxiaoqi on 16/9/25.
 */
public class han {

  private String [] han = {"零", "壹", "贰", "叁", "肆", "伍", "陸", "柒", "捌", "玖"};

  private String [] step = {"拾", "佰", "仟", "万", "亿"};

  private String [] tmp ={"0","仟","0","佰","0","拾","0","亿","0","仟","0","佰","0","拾","0","万","0","仟","0","佰","0","拾","0"};

  public ArrayList<String> hanNumStr = new ArrayList<String>(); //最终的陆拾柒万肆仟零叁拾;

  public String numOrigin = new String();

  public int [] zeroPosition = new int[];

  public void getNumStr() {
    System.out.println("输入数字:");
    Scanner scanner = new Scanner(System.in);
    numOrigin = scanner.next();
  }

  //get  //柒六五四三二一 包含之内连续多个0
  public ArrayList<String> getHanNumStr() {
    ArrayList<String> tmpNumStr = new ArrayList<String>(); //柒六五四三二一;
    int len = numOrigin.length();
    int num = 0;
    for (int i = 0; i < len; i++) {
      if (numOrigin.charAt(i) == '0' && i == 0) { //去开头的0
        char [] tmpCharArray = numOrigin.toCharArray();
        numOrigin = null;
        numOrigin = String.copyValueOf(tmpCharArray,1,len);
        len--;
        i--;
        continue;
      }
      num = (int) (numOrigin.charAt(i) - 48);
      tmpNumStr.add(han[num]);
    }
    return tmpNumStr;
  }

  public void getRMBHan(ArrayList<String> tmpNumStr) {
    int len = tmpNumStr.size();
    for (int i = len-1; i>=0; i--) {
      
    }
  }

  public static void main(String[] args) {


  }

}
