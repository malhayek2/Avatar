package avatar;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Canvas;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class AvatarGui extends JFrame {
	private JMenuBar menuBar;
    private JMenuItem mntnListVsSet;
    private JMenuItem mntmDemo;
    private JMenuItem mntnExit;
    private JPanel myPanel = new JPanel();
    private JLabel avatarpic = new JLabel("");
    private static  List<Images> basesList = new LinkedList<Images>();
    private static List<Images> hairList = new LinkedList<Images>();
    private static List<Images> eyesList = new LinkedList<Images>();
    private static List<Images> earsList = new LinkedList<Images>();

	public static void main(String[] arags){
		
		Images base0 = new Images("/avatar/images/avatarBases/avatarBase00.png" ,0 );
		Images base1 = new Images("/avatar/images/avatarBases/avatarBase01.png" ,0 );
		Images base2 = new Images("/avatar/images/avatarBases/avatarBase02.png" ,0 );
		Images base3 = new Images("/avatar/images/avatarBases/avatarBase03.png" ,0 );
		Images base4 = new Images("/avatar/images/avatarBases/avatarBase04.png" ,0 );
		basesList.add(base0);
		basesList.add(base1);
		basesList.add(base2);
		basesList.add(base3);
		basesList.add(base4);
		Images hair0 = new Images("/avatar/images/hair/hair00.png" ,5 );
		Images hair1 = new Images("/avatar/images/hair/hair01.png" ,5 );
		Images hair2 = new Images("/avatar/images/hair/hair02.png" ,5 );
		Images hair3 = new Images("/avatar/images/hair/hair03.png" ,5 );
		Images hair4 = new Images("/avatar/images/hair/hair04.png" ,5 );
		Images hair5 = new Images("/avatar/images/hair/hair05.png",5 );
		Images hair6 = new Images("/avatar/images/hair/hair06.png",5 );
		hairList.add(hair0);
		hairList.add(hair1);
		hairList.add(hair2);
		hairList.add(hair3);
		hairList.add(hair4);
		hairList.add(hair5);
		hairList.add(hair6);
		
		Images eyes0 = new Images("/avatar/images/eyes/eyes00.png" ,4);
		Images eyes1 = new Images("/avatar/images/eyes/eyes01.png" ,4 );
		Images eyes2 = new Images("/avatar/images/eyes/eyes02.png" ,4 );
		Images eyes3 = new Images("/avatar/images/eyes/eyes03.png" ,4 );
		Images eyes4 = new Images("/avatar/images/eyes/eyes04.png" ,4 );
		Images eyes5 = new Images("/avatar/images/eyes/eyes05.png",4);
		eyesList.add(eyes0);
		eyesList.add(eyes1);
		eyesList.add(eyes2);
		eyesList.add(eyes3);
		eyesList.add(eyes4);
		eyesList.add(eyes5);
		Images ears0 = new Images("/avatar/images/ears/ears00.png" ,1 );
		Images ears1 = new Images("/avatar/images/ears/ears01.png" ,1 );
		Images ears2 = new Images("/avatar/images/ears/ears02.png" ,1 );
		Images ears3 = new Images("/avatar/images/ears/ears03.png" ,1 );
		Images ears4 = new Images("/avatar/images/ears/ears04.png" ,1 );
		earsList.add(ears0);
		earsList.add(ears1);
		earsList.add(ears2);
		earsList.add(ears3);
		earsList.add(ears4);
		
		
		
		
		
		AvatarGui myApp = new AvatarGui();
		myApp.setTitle("AVATAR");
		myApp.setVisible(true);
		myApp.setResizable(false);
	}
	private AvatarGui(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50, 50, 809, 500);
    	JPanel myPanel = new JPanel();
    	myPanel.setLayout(null);
    	//====================================================================
    	final JLabel ears_lbl = new JLabel("");
    	ears_lbl.setIcon(new ImageIcon(AvatarGui.class.getResource(earsList.get(0).getFileLocation())));
    	
    	    	ears_lbl.setBounds(10, 54, 328, 340);
    	    	myPanel.add(ears_lbl);
    	//=============================================================
    	final JLabel eyes_lbl = new JLabel("");
    	eyes_lbl.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/images/eyes/eyes03.png")));
    	eyes_lbl.setBounds(10, 148, 339, 126);
    	myPanel.add(eyes_lbl);
    	//============================================================
    	final JLabel hair_lbl = new JLabel("");
    	hair_lbl.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/images/hair/hair00.png")));
    	hair_lbl.setBounds(10, 54, 328, 340);
    	myPanel.add(hair_lbl);
    	//============================================================
		JPanel panel = new JPanel(new GridLayout(3,2));
		final JButton n1 = new JButton (""); 
		n1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avatarpic.setIcon(new ImageIcon(AvatarGui.class.getResource(basesList.get(4).getFileLocation())));
			}
			
		});
		n1.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/avatarBases/iconBase04.png")));
		final JButton n2 = new JButton (""); 
		n2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avatarpic.setIcon(new ImageIcon(AvatarGui.class.getResource(basesList.get(3).getFileLocation())));
			}
		});
		n2.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/avatarBases/iconBase03.png")));
		JButton n3 = new JButton (""); 
		final JButton n4 = new JButton (""); 
		n4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avatarpic.setIcon(new ImageIcon(AvatarGui.class.getResource(basesList.get(2).getFileLocation())));
			}
		});
		n4.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/avatarBases/iconBase02.png")));
		final JButton n5 = new JButton (""); 
		n5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avatarpic.setIcon(new ImageIcon(AvatarGui.class.getResource(basesList.get(1).getFileLocation())));
			}
		});
		n5.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/avatarBases/iconBase01.png")));
		final JButton n6 = new JButton (""); 
		n6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				avatarpic.setIcon(new ImageIcon(AvatarGui.class.getResource(basesList.get(0).getFileLocation())));
				
				
				
			}
		});
		n6.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/avatarBases/iconBase00.png")));
		panel.add(n6);
		panel.add(n5);
		panel.add(n4);
		panel.add(n1);
		panel.add(n2);
		panel.add(n3);
	   	panel.setPreferredSize(new Dimension(120, 400));
    	final JScrollPane myScrollPane = new JScrollPane(panel);
    	myScrollPane.setViewportView(panel);
    	myScrollPane.setVisible(true);
    	myScrollPane.setMinimumSize(new Dimension(275, 400));
    	myScrollPane.setPreferredSize(new Dimension(275, 400));
    	myScrollPane.setBounds(465, 61, 270, 350);
      	myPanel.add(myScrollPane);
    	//============================================================

		JPanel panel02 = new JPanel(new GridLayout(3,2));
		final JButton n102 = new JButton (""); 
		n102.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hair_lbl.setIcon(new ImageIcon(AvatarGui.class.getResource(hairList.get(1).getFileLocation())));
			}
			
		});
		n102.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/hair/iconHair01.png")));
		final JButton n202 = new JButton (""); 
		n202.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hair_lbl.setIcon(new ImageIcon(AvatarGui.class.getResource(hairList.get(2).getFileLocation())));
			}
		});
		n202.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/hair/iconHair02.png")));
		final JButton n302 = new JButton (""); 
		n302.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hair_lbl.setIcon(new ImageIcon(AvatarGui.class.getResource(hairList.get(3).getFileLocation())));
			}
		});
		n302.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/hair/iconHair03.png")));
		final JButton n402 = new JButton (""); 
		n402.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hair_lbl.setIcon(new ImageIcon(AvatarGui.class.getResource(hairList.get(4).getFileLocation())));
			}
		});
		n402.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/hair/iconHair04.png")));
		final JButton n502 = new JButton (""); 
		n502.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hair_lbl.setIcon(new ImageIcon(AvatarGui.class.getResource(hairList.get(5).getFileLocation())));
			}
		});
		n502.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/hair/iconHair05.png")));
		final JButton n602 = new JButton (""); 
		n602.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hair_lbl.setIcon(new ImageIcon(AvatarGui.class.getResource(hairList.get(6).getFileLocation())));
				
				
				
			}
		});
		n602.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/hair/iconHair06.png")));
		panel02.add(n602);
		panel02.add(n502);
		panel02.add(n402);
		panel02.add(n102);
		panel02.add(n202);
		panel02.add(n302);
	   	panel02.setPreferredSize(new Dimension(120, 400));
    	final JScrollPane myScrollPane01 = new JScrollPane(panel02);
    	myScrollPane01.setViewportView(panel02);
    	myScrollPane01.setVisible(false);
    	myScrollPane01.setMinimumSize(new Dimension(275, 400));
    	myScrollPane01.setPreferredSize(new Dimension(275, 400));
    	myScrollPane01.setBounds(465, 61, 270, 350);
    	myPanel.add(myScrollPane01);
    	
    	//============================================================

		JPanel panel03 = new JPanel(new GridLayout(3,2));
		final JButton n003 = new JButton (""); 
		n003.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eyes_lbl.setIcon(new ImageIcon(AvatarGui.class.getResource(eyesList.get(0).getFileLocation())));
			}
			
		});
		n003.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/eyes/iconEyes00.png")));
		final JButton n103 = new JButton (""); 
		n103.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eyes_lbl.setIcon(new ImageIcon(AvatarGui.class.getResource(eyesList.get(1).getFileLocation())));
			}
		});
		n103.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/eyes/iconEyes01.png")));
		JButton n203 = new JButton (""); 
		n203.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eyes_lbl.setIcon(new ImageIcon(AvatarGui.class.getResource(eyesList.get(2).getFileLocation())));
			}
		});
		n203.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/eyes/iconEyes02.png")));
		
		
		
		final JButton n303 = new JButton (""); 
		n303.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eyes_lbl.setIcon(new ImageIcon(AvatarGui.class.getResource(eyesList.get(3).getFileLocation())));
			}
		});
		n303.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/eyes/iconEyes03.png")));
		final JButton n403 = new JButton (""); 
		n403.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eyes_lbl.setIcon(new ImageIcon(AvatarGui.class.getResource(eyesList.get(4).getFileLocation())));
			}
		});
		n403.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/eyes/iconEyes04.png")));
		final JButton n503 = new JButton (""); 
		n503.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				eyes_lbl.setIcon(new ImageIcon(AvatarGui.class.getResource(eyesList.get(5).getFileLocation())));
				
				
				
			}
		});
		n503.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/eyes/iconEyes05.png")));
		panel03.add(n003);
		panel03.add(n503);
		panel03.add(n403);
		panel03.add(n103);
		panel03.add(n203);
		panel03.add(n303);
	   	panel03.setPreferredSize(new Dimension(120, 400));
    	final JScrollPane myScrollPane03 = new JScrollPane(panel03);
    	myScrollPane03.setViewportView(panel03);
    	myScrollPane03.setVisible(false);
    	myScrollPane03.setMinimumSize(new Dimension(275, 400));
    	myScrollPane03.setPreferredSize(new Dimension(275, 400));
    	myScrollPane03.setBounds(465, 61, 270, 350);
    	myPanel.add(myScrollPane03);
    	//===================================================================
    	JPanel panel04 = new JPanel(new GridLayout(3,2));
		final JButton n004 = new JButton (""); 
		n004.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ears_lbl.setIcon(new ImageIcon(AvatarGui.class.getResource(earsList.get(0).getFileLocation())));
			}
			
		});
		n004.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/ears/iconEars00.png")));
		final JButton n104 = new JButton (""); 
		n104.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ears_lbl.setIcon(new ImageIcon(AvatarGui.class.getResource(earsList.get(1).getFileLocation())));
			}
		});
		n104.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/ears/iconEars01.png")));
		final JButton n204 = new JButton (""); 
		n204.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ears_lbl.setIcon(new ImageIcon(AvatarGui.class.getResource(earsList.get(2).getFileLocation())));
			}
		});
		n204.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/ears/iconEars02.png")));
		final JButton n304 = new JButton (""); 
		n304.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ears_lbl.setIcon(new ImageIcon(AvatarGui.class.getResource(earsList.get(3).getFileLocation())));
			}
		});
		n304.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/ears/iconEars03.png")));
		final JButton n404 = new JButton (""); 
		n404.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ears_lbl.setIcon(new ImageIcon(AvatarGui.class.getResource(earsList.get(4).getFileLocation())));
			}
		});
		n404.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/icons/ears/iconEars04.png")));
		final JButton n504 = new JButton (""); 
		n504.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		
			}
		});
		panel04.add(n004);
		panel04.add(n104);
		panel04.add(n204);
		panel04.add(n304);
		panel04.add(n404);
		panel04.add(n504);
	   	panel04.setPreferredSize(new Dimension(120, 400));
    	final JScrollPane myScrollPane04 = new JScrollPane(panel04);
    	myScrollPane04.setViewportView(panel04);
    	myScrollPane04.setVisible(false);
    	myScrollPane04.setMinimumSize(new Dimension(275, 400));
    	myScrollPane04.setPreferredSize(new Dimension(275, 400));
    	myScrollPane04.setBounds(465, 61, 270, 350);
    	myPanel.add(myScrollPane04);
    	//=============================================================
    	//================================================================
    	

  
    	getContentPane().add(myPanel);
    	
    	JButton btnNewButton = new JButton("etc..");
    	btnNewButton.setBounds(465, 27, 59, 23);
    	myPanel.add(btnNewButton);
    	
    	JButton btnNewButton_1 = new JButton("ears");
    	btnNewButton_1.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			myScrollPane04.setVisible(true);
    			myScrollPane.setVisible(false);
    			myScrollPane03.setVisible(false);
    			myScrollPane01.setVisible(false);
    		}
    	});
    	btnNewButton_1.setBounds(534, 27, 66, 23);
    	myPanel.add(btnNewButton_1);
    	
    	JButton btnNewButton_2 = new JButton("eyes");
    	btnNewButton_2.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			
    			myScrollPane04.setVisible(false);
    			myScrollPane.setVisible(false);
    			myScrollPane01.setVisible(false);
    			myScrollPane03.setVisible(true);
    			
    			
    		}
    	});
    	btnNewButton_2.setBounds(610, 27, 71, 23);
    	myPanel.add(btnNewButton_2);
    	
    	JButton btnNewButton_3 = new JButton("hair");
    	btnNewButton_3.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			myScrollPane.setVisible(false);
    			myScrollPane03.setVisible(false);
    			myScrollPane01.setVisible(true);
    			myScrollPane04.setVisible(false);
    			
    			

    		}
    	});
    	btnNewButton_3.setBounds(691, 27, 59, 23);
    	myPanel.add(btnNewButton_3);
    	
    	JButton bases_butn = new JButton("Skin");
    	bases_butn.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			
    			myScrollPane04.setVisible(false);
    			myScrollPane.setVisible(true);
    			myScrollPane03.setVisible(false);
    			myScrollPane01.setVisible(false);
    			
    			
    			
    		}
    	});
    	bases_butn.setBounds(361, 27, 89, 23);
    	myPanel.add(bases_butn);
    	//============================================================
    	//============================================================
    	

    	
    	//=======================================================
    	//========================================================
    	
    	
    	avatarpic.setIcon(new ImageIcon(AvatarGui.class.getResource("/avatar/images/avatarBases/avatarBase04.png")));
    	avatarpic.setBounds(10, 46, 400, 381);
    	myPanel.add(avatarpic);
    	

        createMenu();


	}
	private void addImage(){
		
	}
	private void saveImage(){
		
	}
	private void resetImage(){
		
	}
    private void createMenu() {
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        mntmDemo = new JMenuItem("Save");
        mntmDemo.setHorizontalAlignment(SwingConstants.CENTER);
        mntmDemo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
            	saveImage();
            }
        });
        menuBar.add(mntmDemo);

        mntnListVsSet = new JMenuItem("Reset");
        mntnListVsSet.setHorizontalAlignment(SwingConstants.CENTER);
        mntnListVsSet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
            	resetImage();
            }
        });
        menuBar.add(mntnListVsSet);
        mntnExit = new JMenuItem("Rand");
        mntnExit.setHorizontalAlignment(SwingConstants.CENTER);
        menuBar.add(mntnExit);
        mntnExit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg1) {
           
            }
        });
    }
}
