package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JTextArea;
import java.awt.ComponentOrientation;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RokovnikGui extends JFrame {

	private JPanel contentPane;
	private JPanel westPanel;
	private JButton btnCalendar;
	private JButton btnBirthdays;
	private JButton btnEvents;
	private JButton btnToDo;
	private JButton btnContacts;
	private JPanel northPanel;
	private JRadioButton rdbtnEnglish;
	private JRadioButton rdbtnSrpski;
	private JPanel southPanel;
	private JPanel eastPanel;
	private JPanel centerPanel;
	private JScrollPane centerScrollPane;
	private JTextArea centerTextArea;
	private final ButtonGroup buttonGroupJezik = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RokovnikGui frame = new RokovnikGui();
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RokovnikGui() {
		setResizable(false);
		setTitle("Rokovnik");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getWestPanel(), BorderLayout.WEST);
		contentPane.add(getNorthPanel(), BorderLayout.NORTH);
		contentPane.add(getSouthPanel(), BorderLayout.SOUTH);
		contentPane.add(getEastPanel(), BorderLayout.EAST);
		contentPane.add(getCenterPanel(), BorderLayout.CENTER);
		
		rdbtnEnglish.setSelected(true);
	}

	private JPanel getWestPanel() {
		if (westPanel == null) {
			westPanel = new JPanel();
			westPanel.setPreferredSize(new Dimension(130, 1125));
			westPanel.setLayout(new MigLayout("", "[][][][]", "[][46.00][46.00][46.00][46.00][46.00][][][]"));
			westPanel.add(getButton_1(), "cell 1 1");
			westPanel.add(getButton_2(), "cell 1 2");
			westPanel.add(getButton_3(), "cell 1 3");
			westPanel.add(getBtnToDo(), "cell 1 4");
			westPanel.add(getBtnContacts(), "cell 1 5");
		}
		return westPanel;
	}
	private JButton getButton_1() {
		if (btnCalendar == null) {
			btnCalendar = new JButton("Calendar\r\n");
			btnCalendar.setPreferredSize(new Dimension(115, 30));
		}
		return btnCalendar;
	}
	private JButton getButton_2() {
		if (btnBirthdays == null) {
			btnBirthdays = new JButton("Birthdays");
			btnBirthdays.setPreferredSize(new Dimension(115, 30));
		}
		return btnBirthdays;
	}
	private JButton getButton_3() {
		if (btnEvents == null) {
			btnEvents = new JButton("Events");
			btnEvents.setPreferredSize(new Dimension(115, 30));
		}
		return btnEvents;
	}
	private JButton getBtnToDo() {
		if (btnToDo == null) {
			btnToDo = new JButton("To-do list");
			btnToDo.setPreferredSize(new Dimension(115, 30));
		}
		return btnToDo;
	}
	private JButton getBtnContacts() {
		if (btnContacts == null) {
			btnContacts = new JButton("Contacts");
			btnContacts.setPreferredSize(new Dimension(115, 30));
		}
		return btnContacts;
	}
	private JPanel getNorthPanel() {
		if (northPanel == null) {
			northPanel = new JPanel();
			northPanel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
			northPanel.setPreferredSize(new Dimension(30, 30));
			northPanel.setLayout(new MigLayout("", "[][][][][][][][][][][][][][][][][][][][][]", "[]"));
			northPanel.add(getRdbtnEnglish(), "cell 0 0,aligny center");
			northPanel.add(getRdbtnSrpski(), "cell 1 0");
		}
		return northPanel;
	}
	private JRadioButton getRdbtnEnglish() {
		if (rdbtnEnglish == null) {
			rdbtnEnglish = new JRadioButton("English");
			rdbtnEnglish.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					engleskiJezik();
				}
			});
			buttonGroupJezik.add(rdbtnEnglish);
		}
		return rdbtnEnglish;
	}
	private JRadioButton getRdbtnSrpski() {
		if (rdbtnSrpski == null) {
			rdbtnSrpski = new JRadioButton("Srpski");
			rdbtnSrpski.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					srpskiJezik();
				}
			});
			buttonGroupJezik.add(rdbtnSrpski);
		}
		return rdbtnSrpski;
	}
	private JPanel getSouthPanel() {
		if (southPanel == null) {
			southPanel = new JPanel();
			southPanel.setPreferredSize(new Dimension(10, 50));
		}
		return southPanel;
	}
	private JPanel getEastPanel() {
		if (eastPanel == null) {
			eastPanel = new JPanel();
			eastPanel.setPreferredSize(new Dimension(100, 10));
		}
		return eastPanel;
	}
	private JPanel getCenterPanel() {
		if (centerPanel == null) {
			centerPanel = new JPanel();
			centerPanel.add(getCenterScrollPane());
		}
		return centerPanel;
	}
	private JScrollPane getCenterScrollPane() {
		if (centerScrollPane == null) {
			centerScrollPane = new JScrollPane();
			centerScrollPane.setPreferredSize(new Dimension(250, 250));
			centerScrollPane.setViewportView(getCenterTextArea());
		}
		return centerScrollPane;
	}
	private JTextArea getCenterTextArea() {
		if (centerTextArea == null) {
			centerTextArea = new JTextArea();
		}
		return centerTextArea;
	}
	
	private void srpskiJezik(){
		btnCalendar.setText("Kalendar");
		btnBirthdays.setText("Rodjendani");
		btnEvents.setText("Dogadjaji");
		btnToDo.setText("Zadaci");
		btnContacts.setText("Kontakti");
/*		btnCalendar.setPreferredSize(new Dimension(115, 30));
		btnBirthdays.setPreferredSize(new Dimension(115, 30));
		btnEvents.setPreferredSize(new Dimension(115, 30));
		btnToDo.setPreferredSize(new Dimension(115, 30));
		btnContacts.setPreferredSize(new Dimension(115, 30));*/
	}
	
	private void engleskiJezik(){
		btnCalendar.setText("Calendar");
		btnBirthdays.setText("Birthdays");
		btnEvents.setText("Events");
		btnToDo.setText("To-do List");
		btnContacts.setText("Contacts");
/*		btnCalendar.setPreferredSize(new Dimension(115, 30));
		btnBirthdays.setPreferredSize(new Dimension(115, 30));
		btnEvents.setPreferredSize(new Dimension(115, 30));
		btnToDo.setPreferredSize(new Dimension(115, 30));
		btnContacts.setPreferredSize(new Dimension(115, 30));*/
	}
}
