/*    */ package app;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class TextConverter {
/*    */   public static boolean oneBedB = false;
/*    */   public static boolean twoBedB = false;
/*    */   public static boolean studioB = false;
/*    */   public static boolean convertibleB = false;
/* 10 */   public static display gui = new display();
/*    */   
/*    */   public static void main(String[] args) {
/* 13 */     gui.createJpanel();
/*    */   }
/*    */   
/*    */   public static String converter(String x) {
/* 17 */     String completeString = "";
/* 18 */     ArrayList<String> buildings = new ArrayList<>();
/* 19 */     x = x.replace("\t", " ");
/* 20 */     String[] separate = x.split(" ");
/* 21 */     String building = ""; byte b; int i; String[] arrayOfString1;
/* 22 */     for (i = (arrayOfString1 = separate).length, b = 0; b < i; ) { String y = arrayOfString1[b];
/*    */       
/* 24 */       if (y.indexOf("http") == -1) {
/* 25 */         building = String.valueOf(building) + y + " ";
/*    */       } else {
/* 27 */         building = String.valueOf(building) + y + " ";
/* 28 */         buildings.add(building);
/* 29 */         building = "";
/*    */       } 
/*    */       b++; }
/*    */     
/* 33 */     for (String a : buildings) {
/* 34 */       String website = "";
/* 35 */       String[] type = { "Studios", "Convertibles", "One Bed", "Two Bed" };
/* 36 */       if (!studioB) {
/* 37 */         type[0] = null;
/*    */       }
/* 39 */       if (!convertibleB) {
/* 40 */         type[1] = null;
/*    */       }
/* 42 */       if (!oneBedB) {
/* 43 */         type[2] = null;
/*    */       }
/* 45 */       if (!twoBedB) {
/* 46 */         type[3] = null;
/*    */       }
/* 48 */       ArrayList<String> nums = new ArrayList<>();
/* 49 */       ArrayList<String> names = new ArrayList<>();
/* 50 */       String completeLine = "";
/* 51 */       String[] components = a.split(" "); byte b1; int k;
/*    */       String[] arrayOfString2;
/* 53 */       for (k = (arrayOfString2 = components).length, b1 = 0; b1 < k; ) { String y = arrayOfString2[b1];
/* 54 */         if (y.contains("https")) {
/* 55 */           website = y;
/* 56 */         } else if (y.indexOf("$") == 0) {
/* 57 */           nums.add(y);
/*    */         } else {
/* 59 */           names.add(y);
/*    */         }  b1++; }
/*    */       
/* 62 */       for (String y : names) {
/* 63 */         y = y.replace("\\s", "");
/* 64 */         y = y.replace("\t", "");
/* 65 */         if (y.equals("")) {
/* 66 */           completeLine = String.valueOf(completeLine) + y;
/*    */           continue;
/*    */         } 
/* 69 */         completeLine = String.valueOf(completeLine) + y + " ";
/*    */       } 
/*    */       
/* 72 */       completeString = String.valueOf(completeString) + completeLine + '\n';
/*    */       
/* 74 */       int j = 0;
/* 75 */       boolean loop = true;
/* 76 */       for (int index = 0; index < nums.size() - 1; index += 2) {
/* 77 */         while (loop) {
/* 78 */           if (type[j] != null) {
/* 79 */             completeLine = String.valueOf(type[j]) + " starting at " + (String)nums.get(index) + 
/* 80 */               " + XXX months free on a 12 month lease, net " + (String)nums.get(index + 1);
/* 81 */             completeString = String.valueOf(completeString) + completeLine + '\n';
/* 82 */             loop = false;
/*    */           } 
/* 84 */           j++;
/* 85 */           if (j > 3) loop = false; 
/*    */         } 
/* 87 */         if (j >= 4)
/* 88 */           break;  loop = true;
/*    */       } 
/* 90 */       completeString = String.valueOf(completeString) + website + '\n' + '\n';
/*    */     } 
/*    */     
/* 93 */     return completeString;
/*    */   }
/*    */ }


/* Location:              C:\Users\samue\OneDrive\Desktop\Java programs\TextConverter.jar!\app\TextConverter.class
 * Java compiler version: 14 (58.0)
 * JD-Core Version:       1.1.3
 */