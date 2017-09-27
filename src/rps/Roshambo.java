package rps;
 
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;
 
public class Roshambo {
    
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public Roshambo(){
      prepareGUI();
   }

   public static void main(String[] args){
	   Roshambo  swingControlDemo = new Roshambo();      
      swingControlDemo.showRadioButtonDemo();
   }

   private void prepareGUI(){
      mainFrame = new JFrame("Roshambo");
      mainFrame.setSize(500,800);
      mainFrame.getContentPane().setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new JLabel("", JLabel.CENTER); 
      headerLabel.setIcon(new ImageIcon("/home/graymi/Pictures/RockPaperScissors.jpg"));
      statusLabel = new JLabel("",JLabel.CENTER);    

      statusLabel.setSize(350,250);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.getContentPane().add(headerLabel);
      mainFrame.getContentPane().add(controlPanel);
      mainFrame.getContentPane().add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showRadioButtonDemo(){

      final JRadioButton radRock = new JRadioButton("Rock", true);
      final JRadioButton radPaper = new JRadioButton("Paper");
      final JRadioButton radScissors = new JRadioButton("Scissors");

      radRock.setMnemonic(KeyEvent.VK_C);
      radPaper.setMnemonic(KeyEvent.VK_M);
      radScissors.setMnemonic(KeyEvent.VK_P);

      radRock.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {
             headerLabel.setIcon(new ImageIcon("../img/Small_Rock.jpg"));
        	 String computerSelects = rpsRandom();
        	 String outcome = determineOutcome(1, computerSelects);
             statusLabel.setText("The Computer Chooses " + computerSelects + "! You " + outcome); 
             
         }           
      });

      radPaper.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {   
             headerLabel.setIcon(new ImageIcon("/home/graymi/Pictures/Small_Paper.jpg"));
        	 String computerSelects = rpsRandom();
       	 	String outcome = determineOutcome(2, computerSelects);
            statusLabel.setText("The Computer Chooses " + computerSelects + "! You " + outcome); 
         }           
      });

      radScissors.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {
             headerLabel.setIcon(new ImageIcon("/home/graymi/Pictures/Small_Scissors.jpg"));
        	 String computerSelects = rpsRandom();
        	 String outcome = determineOutcome(3, computerSelects);
             statusLabel.setText("The Computer Chooses " + computerSelects + "! You " + outcome); 
         }           
      });

      //Group the radio buttons.
      ButtonGroup group = new ButtonGroup();
      group.add(radRock);
      group.add(radPaper);
      group.add(radScissors);

      controlPanel.add(radRock);
      controlPanel.add(radPaper);
      controlPanel.add(radScissors);       

      mainFrame.setVisible(true);  
   }
   
   private String rpsRandom(){
	   String comsRPS;
	   Random rpsRand = new Random();
	   int compChoice = rpsRand.nextInt(2);
   
	   if(compChoice == 1){
		   comsRPS = "Rock";
	   }
	   else if(compChoice == 2){
		   comsRPS = "Paper";
	   }
	   else
		   comsRPS = "Scissors";
	   
	   return comsRPS;
   }
   
   private String determineOutcome(int userChoice, String compChoice){
	   int Outcome = 0; // 0 tie - 1 win 2 lost
	   if(compChoice.equals("Rock")){
		   if(userChoice == 1){
			   Outcome = 0;
		   }
		   else if(userChoice == 2){
			   Outcome = 1;
		   }
		   else 
			   Outcome = 2; 
	   }
	   else if(compChoice.equals("Paper")){
		   if(userChoice == 1){
			   Outcome = 2;
		   }
		   else if(userChoice == 2){
			   Outcome = 0;
		   }
		   else 
			   Outcome = 1; 		   
	   }
	   else if(compChoice.equals("Scissors")){
		   if(userChoice == 1){
			   Outcome = 1;
		   }
		   else if(userChoice == 2){
			   Outcome = 2;
		   }
		   else 
			   Outcome = 0; 		   
	   }
	   if(Outcome == 0)
		   return "Tie";
	   else if(Outcome == 1){
		   return "Win";
	   }
	   else
		   return "Lost";
   }

   
   
}
