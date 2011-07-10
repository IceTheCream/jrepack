package org.ice.repack;

import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.AbstractButton;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
//import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainForm extends JFrame {
	
	private static final long serialVersionUID = 1L;

	static MainForm mainform;  

	public MainForm() {
		// TODO Auto-generated constructor stub
	      super("Repacker");
		  //testField=new JTextField();
		  //testField.setColumns(23);
	      createForm("");
/*
class runexe
{
public static void main(String[] args)
{
Runtime r =Runtime.getRuntime();
Process p =null;
String cmd[]={"notepad","f:/mytext.txt"};
try{
p=r.exec(cmd);
}
catch(java.lang.Exception e)
{}
}
}
*/

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(
				new Runnable()  {
	    	        public void run() {
	    	          //*** Оформление окон
	    	          setDefaultLookAndFeelDecorated(false);
	    	          mainform=new MainForm();
	    	          mainform.pack();
	    	          mainform.setLocationRelativeTo(null);
	    	          mainform.setPreferredSize(new Dimension(640, 480));
	    	      	  mainform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	      	  //mainform.
	    	          mainform.setVisible(true);
	    	        }
	    	      }
	    	    );

	}

	  public int createForm(String psHeader) {
		  JPanel mainPanel=new JPanel();
		  mainPanel.setLayout(new FlowLayout()); 
		  //BorderLayout GridLayout GridBagLayout CardLayout
		
		  /*
		//***** Создаем главную панель..
		
		//***** Создаем панель для кнопок
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		
		//***** Создаем панель для грида
		JPanel gridPanel=new JPanel();
		gridPanel.setLayout(new BorderLayout());
		
		//***** Кнопка `Добавить` 
		JButton appendButton=new JButton("Добавить");
		//appendButton.setActionCommand("Вы нажали `Добавить`!");
		ActionListener appendListener=new appendButtonActionListener();
		appendButton.addActionListener(appendListener);
		appendButton.setVerticalTextPosition(AbstractButton.CENTER);
	    appendButton.setHorizontalTextPosition(AbstractButton.LEADING);
		buttonPanel.add(appendButton);
		//Icon centerIcon = UIManager.getIcon("OptionPane.informationIcon");
	    //centerButton.setIcon(centerIcon); 
		
		//*** Кнопка `Изменить`
		JButton editButton=new JButton("Изменить");
		editButton.setActionCommand("Вы нажали `Изменить`!");
		ActionListener editListener=new editButtonActionListener();
		editButton.addActionListener(editListener);
		buttonPanel.add(editButton);
		
		//*** Кнопка `Удалить`
		JButton deleteButton=new JButton("Удалить");
		deleteButton.setActionCommand("Вы нажали `Удалить`!");
		ActionListener deleteListener=new deleteButtonActionListener();
	    deleteButton.addActionListener(deleteListener);
		buttonPanel.add(deleteButton);

		// Кнопка `Выйти`
		JButton quitButton=new JButton("Выйти");
		quitButton.setActionCommand("Вы нажали `Выйти`!");
		ActionListener quitListener=new quitButtonActionListener();
	    quitButton.addActionListener(quitListener);
		buttonPanel.add(quitButton);
		
		//testField=new JTextField();
		buttonPanel.add(testField);
		mainPanel.add(buttonPanel);

		//***** Создадим текстовую панель
		final String TEXT = "Типа такой вот текст";
		JTextArea textArea = new JTextArea(10, 20);
	    textArea.setText(TEXT);
	    textArea.setCaretPosition(0);	
		
		//***** Создадим панель прокрутки
		final JScrollPane scrollPane = new JScrollPane(textArea);
		gridPanel.add(scrollPane);
		
		mainPanel.add(gridPanel);
		getContentPane().add(mainPanel);
		/*    
	    loPanel1.setLayout(new FlowLayout());
		    
		JLabel loLabel1 = new JLabel("Это метка");
		loPanel1.add(loLabel1);
		    

		JButton loButton1 = new JButton("Это кнопка");
		    
		//!!! ActionListener actionListener = new ButtonActionListener();
		//loButton1.addActionListener(actionListener);
		    
		//button2.addActionListener(actionListener);
	    loPanel1.add(loButton1);
	    
		JButton loButtonS = new JButton("Юг");
	    loPanel1.add(loButtonS,BorderLayout.SOUTH);

	    JButton loButtonN = new JButton("Север");
	    loPanel1.add(loButtonN,BorderLayout.NORTH);
		    
	    JButton loButtonW = new JButton("Запад");
	    loPanel1.add(loButtonW,BorderLayout.WEST);
		    
	    JButton loButtonE = new JButton("Восток");
	    loPanel1.add(loButtonE,BorderLayout.EAST);
	    */
	    //moMainFrame.getContentPane().add(loPanel1);
	    //getContentPane().add(mainPanel);
	    return 0;
	  }
}
