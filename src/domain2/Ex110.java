package domain2;

public class Ex110 {
    public static void main (String[] args){
  // Q1: Do I need a cast? 
  byte b = 4;
  int c = b;

  // Q2: Do I need a cast? 
  short s = 32000; 
  double d = (double) s;

  // Q3: Do I need a cast? 
  int i = 100_000;
  byte bb = (byte) i;

  // Q4: Do I need a cast? 
  int ii = 100_000;
  byte bbb = (byte) ii;

  // Q5: Do I need a cast? 
  int j = 3;
  short jj = (short) j;

  // Q6: Do I need a cast? 
  int k = 45000;
  float f = k;

  // Q7: Do I need a cast? 
  float ff = 1.5f;
  int z = (int) ff;
 }// 

}
