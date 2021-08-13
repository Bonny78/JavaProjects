import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class TicTacToe extends JFrame implements  ActionListener{

   private JTextField winner;
   private JTextField x00;
   private JTextField x01;
   private JTextField x02;
   private JTextField x10;
   private JTextField x11;
   private JTextField x12;
   private JTextField x20;
   private JTextField x21;
   private JTextField x22;
   private JButton playButton;
   private JButton clearButton;
   public static String[][] matrix=new String[3][3];
  
//No argument constructor
  public TicTacToe(){
      String[][] matrix=new String[3][3];
      for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
          matrix[i][j]=Integer.toString(((j+1)*(i+1)));
        }
      }
  
      
      
      
      //text fields
      setTitle("TicTacToe");
      winner= new JTextField(10);
      winner.setEditable(false);
      winner.setText(" ");
      
      x00= new JTextField(1);
      x00.setEditable(true);
      x00.setText(" ");
      
      x01=new JTextField(1);
      x01.setEditable(true);
      x01.setText(" ");
      
      x02=new JTextField(1);
      x02.setEditable(true);
      x02.setText(" ");
      
      x10=new JTextField(1);
      x10.setEditable(true);
      x10.setText(" ");
      
      x11=new JTextField(1);
      x11.setEditable(true);
      x11.setText(" ");
      
      x12=new JTextField(1);
      x12.setEditable(true);
      x12.setText(" ");
      
      x20=new JTextField(1);
      x20.setEditable(true);
      x20.setText(" ");
      
      x21=new JTextField(1);
      x21.setEditable(true);
      x21.setText(" ");
      
      x22=new JTextField(1);
      x22.setEditable(true);
      x22.setText(" ");
      
      //buttons
      playButton=new JButton("play");
      playButton.addActionListener(this);
      
      clearButton=new JButton("clear");
      clearButton.addActionListener(this);
      
      GridBagConstraints layoutConst=null;
      setLayout(new GridBagLayout());
      layoutConst=new GridBagConstraints();
      
      
  // 10 pixels of padding around component
  layoutConst.insets = new Insets(10, 10, 10, 10);

      
      layoutConst.gridx=0;
      layoutConst.gridy=0;
      add (x00,layoutConst);
      
      layoutConst.gridx=0;
      layoutConst.gridy=1;
      add (x01,layoutConst);  
      
      layoutConst.gridx=0;
      layoutConst.gridy=2;
      add (x02,layoutConst);   
      
      layoutConst.gridx=1;
      layoutConst.gridy=0;
      add (x10,layoutConst); 
      
      layoutConst.gridx=1;
      layoutConst.gridy=1;
      add (x11,layoutConst);
      
      layoutConst.gridx=1;
      layoutConst.gridy=2;
      add (x12,layoutConst);
      
      layoutConst.gridx=2;
      layoutConst.gridy=0;
      add (x20,layoutConst);
      
      layoutConst.gridx=2;
      layoutConst.gridy=1;
      add (x21,layoutConst);
      
      layoutConst.gridx=2;
      layoutConst.gridy=2;
      add (x22,layoutConst);
      
      layoutConst.gridx=0;
      layoutConst.gridy=3;
      add (playButton,layoutConst);
      
      layoutConst.gridx=1;
      layoutConst.gridy=3;
      add (winner,layoutConst);
      
      layoutConst.gridx=2;
      layoutConst.gridy=3;
      add (clearButton,layoutConst);


      this.pack();     
      
}//end constructor
 
// This is the new ActionPerformed Method.
 // It catches any events with an ActionListener attached.
 // Using an if statement, we can determine which button was pressed
 // and change the appropriate values in our GUI.   
   public void actionPerformed(ActionEvent e){
        String field;
          if(e.getSource()==playButton){
             field= x00.getText().trim();
           if(field.equals("x")||field.equals("o")){
                  matrix[0][0]=field;
           } 
              
            field=x01.getText().trim();
            if(field.equals("x")||field.equals("o")){
                 matrix[0][1]=field;
            }
                
            field=x02.getText().trim();
            if(field.equals("x")||field.equals("o")){
                 matrix[0][2]=field;
            }
                
            field=x10.getText().trim();
            if(field.equals("x")||field.equals("o")){
                 matrix[1][0]=field;
            }
            field=x11.getText().trim();
            if(field.equals("x")||field.equals("o")){
                 matrix[1][1]=field;
            }
            field=x12.getText().trim();
            if(field.equals("x")||field.equals("o")){
                 matrix[1][2]=field;
            }
                 
            field=x20.getText().trim();
            if(field.equals("x")||field.equals("o")){
                 matrix[2][0]=field;
            }
            
            field=x21.getText().trim();
            if(field.equals("x")||field.equals("o")){
                 matrix[2][1]=field;
            } 
             
            field=x22.getText().trim();
            if(field.equals("x")||field.equals("o")){
                 matrix[2][2]=field;
            }
      boolean ans=checkTTT(matrix);
      if(ans)
         winner.setText("You won");
      else
         winner.setText("You lose");
    }
    
    if(e.getSource() == clearButton){
       x00.setText(" ");
       x01.setText(" ");
       x02.setText(" ");
       x10.setText(" ");
       x11.setText(" ");
       x12.setText(" ");
       x20.setText(" ");
       x21.setText(" ");
       x22.setText(" ");
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
          matrix[i][j]=" ";
        }
      }
      winner.setText(" ");           
   }
}//method

/**method to check if there is a winner
@param matrix represents the tictactoe grid
@return true if there is a winner, otherwise false
**/
   public boolean checkTTT(String[][] m){
   boolean ans;
    if(m[0][0].equalsIgnoreCase(m[0][1]) && m[0][1].equalsIgnoreCase(m[0][2])
       && m[0][0].equalsIgnoreCase(m[0][2]) && (m[0][0].equalsIgnoreCase("x") || m[0][0].equalsIgnoreCase("o")))
       ans=true;
    else if(m[1][0].equalsIgnoreCase(m[1][1]) && m[1][1].equalsIgnoreCase(m[1][2])
       && m[1][0].equalsIgnoreCase(m[1][2]) && (m[1][0].equalsIgnoreCase("x") || m[1][0].equalsIgnoreCase("o")))
      ans=true;
    else if(m[2][0].equalsIgnoreCase(m[2][1]) && m[2][1].equalsIgnoreCase(m[2][2])
       && m[2][0].equalsIgnoreCase(m[2][2]) && (m[2][0].equalsIgnoreCase("x") || m[2][0].equalsIgnoreCase("o")))
     ans=true;
   else if(m[1][0].equalsIgnoreCase(m[0][0]) && m[1][0].equalsIgnoreCase(m[2][0])
       && m[0][0].equalsIgnoreCase(m[2][0]) && (m[0][0].equalsIgnoreCase("x") || m[0][0].equalsIgnoreCase("o")))
     ans=true;
   else if(m[1][1].equalsIgnoreCase(m[0][1]) && m[1][1].equalsIgnoreCase(m[2][1])
       && m[2][1].equalsIgnoreCase(m[0][1]) && (m[0][1].equalsIgnoreCase("x") || m[0][1].equalsIgnoreCase("o")))
     ans=true;
   else if(m[1][2].equalsIgnoreCase(m[0][2]) && m[1][2].equalsIgnoreCase(m[2][2])
       && m[2][2].equalsIgnoreCase(m[0][2]) && (m[0][2].equalsIgnoreCase("x") || m[0][2].equalsIgnoreCase("o")))
       ans=true;
   else if(m[0][0].equalsIgnoreCase(m[1][1]) && m[1][1].equalsIgnoreCase(m[2][2])
       && m[0][0].equalsIgnoreCase(m[2][2]) && (m[0][0].equalsIgnoreCase("x") || m[0][0].equalsIgnoreCase("o")))
       ans=true;
   else if(m[2][0].equalsIgnoreCase(m[1][1]) && m[1][1].equalsIgnoreCase(m[0][2])
       && m[2][0].equalsIgnoreCase(m[0][2]) && (m[0][2].equalsIgnoreCase("x") || m[0][2].equalsIgnoreCase("o")))
       ans=true;
   else
      ans=false;
      
   return ans;
   }//end method


public static void main(String []args ){
      TicTacToe myFrame =new TicTacToe();
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);

}//end main**/
  }//end class