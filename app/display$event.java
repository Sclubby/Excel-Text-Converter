/*    */ package app;
/*    */ 
/*    */ import java.awt.event.ItemEvent;
/*    */ import java.awt.event.ItemListener;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class event
/*    */   implements ItemListener
/*    */ {
/*    */   public void itemStateChanged(ItemEvent e) {
/* 62 */     if (display.this.oneBed.isSelected()) { TextConverter.oneBedB = true; }
/* 63 */     else { TextConverter.oneBedB = false; }
/*    */     
/* 65 */     if (display.this.twoBed.isSelected()) { TextConverter.twoBedB = true; }
/* 66 */     else { TextConverter.twoBedB = false; }
/*    */     
/* 68 */     if (display.this.studios.isSelected()) { TextConverter.studioB = true; }
/* 69 */     else { TextConverter.studioB = false; }
/*    */     
/* 71 */     if (display.this.convertibles.isSelected()) { TextConverter.convertibleB = true; }
/* 72 */     else { TextConverter.convertibleB = false; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\samue\OneDrive\Desktop\Java programs\TextConverter.jar!\app\display$event.class
 * Java compiler version: 14 (58.0)
 * JD-Core Version:       1.1.3
 */