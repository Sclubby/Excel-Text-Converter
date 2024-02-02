/*    */ package app;
/*    */ 
/*    */ import java.awt.LayoutManager;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import java.awt.event.ItemEvent;
/*    */ import java.awt.event.ItemListener;
/*    */ import javax.swing.JButton;
/*    */ import javax.swing.JCheckBox;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JTextArea;
/*    */ import javax.swing.JTextField;
/*    */ 
/*    */ public class display
/*    */   extends JFrame
/*    */   implements ActionListener {
/* 17 */   private JButton Convert = new JButton("Convert Text");
/* 18 */   private JCheckBox oneBed = new JCheckBox("One Bed");
/* 19 */   private JCheckBox twoBed = new JCheckBox("Two Bed");
/* 20 */   private JCheckBox studios = new JCheckBox("Studios");
/* 21 */   private JCheckBox convertibles = new JCheckBox("Convertibles");
/* 22 */   private JButton clear = new JButton("Clear");
/* 23 */   private JTextField textInput = new JTextField("", 400);
/* 24 */   private JTextArea textOutput = new JTextArea("", 400, getDefaultCloseOperation());
/*    */   
/*    */   public void createJpanel() {
/* 27 */     setDefaultCloseOperation(3);
/* 28 */     setBounds(400, 400, 600, 800);
/* 29 */     this.Convert.setBounds(175, 100, 250, 50);
/* 30 */     this.Convert.addActionListener(this);
/* 31 */     this.clear.setBounds(2, 50, 90, 50);
/* 32 */     this.clear.addActionListener(this);
/*    */     
/* 34 */     this.studios.setBounds(100, 10, 100, 20);
/* 35 */     this.convertibles.setBounds(200, 10, 100, 20);
/* 36 */     this.oneBed.setBounds(350, 10, 100, 20);
/* 37 */     this.twoBed.setBounds(450, 10, 100, 20);
/*    */     
/* 39 */     event e = new event();
/* 40 */     this.oneBed.addItemListener(e);
/* 41 */     this.twoBed.addItemListener(e);
/* 42 */     this.studios.addItemListener(e);
/* 43 */     this.convertibles.addItemListener(e);
/* 44 */     add(this.oneBed);
/* 45 */     add(this.twoBed);
/* 46 */     add(this.studios);
/* 47 */     add(this.convertibles);
/* 48 */     add(this.clear);
/* 49 */     add(this.Convert);
/* 50 */     this.textInput.setBounds(100, 50, 400, 50);
/* 51 */     this.textOutput.setBounds(50, 150, 500, 600);
/* 52 */     add(this.textInput);
/* 53 */     add(this.textOutput);
/* 54 */     setLayout((LayoutManager)null);
/* 55 */     setVisible(true);
/* 56 */     setTitle("window");
/*    */   }
/*    */   
/*    */   public class event
/*    */     implements ItemListener {
/*    */     public void itemStateChanged(ItemEvent e) {
/* 62 */       if (display.this.oneBed.isSelected()) { TextConverter.oneBedB = true; }
/* 63 */       else { TextConverter.oneBedB = false; }
/*    */       
/* 65 */       if (display.this.twoBed.isSelected()) { TextConverter.twoBedB = true; }
/* 66 */       else { TextConverter.twoBedB = false; }
/*    */       
/* 68 */       if (display.this.studios.isSelected()) { TextConverter.studioB = true; }
/* 69 */       else { TextConverter.studioB = false; }
/*    */       
/* 71 */       if (display.this.convertibles.isSelected()) { TextConverter.convertibleB = true; }
/* 72 */       else { TextConverter.convertibleB = false; }
/*    */     
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void actionPerformed(ActionEvent e) {
/* 79 */     if (e.getSource() == this.Convert) {
/* 80 */       String text = this.textInput.getText();
/* 81 */       String newText = TextConverter.converter(text);
/* 82 */       this.textOutput.setText(newText);
/*    */     } 
/* 84 */     if (e.getSource() == this.clear)
/* 85 */       this.textInput.setText(""); 
/*    */   }
/*    */ }


/* Location:              C:\Users\samue\OneDrive\Desktop\Java programs\TextConverter.jar!\app\display.class
 * Java compiler version: 14 (58.0)
 * JD-Core Version:       1.1.3
 */