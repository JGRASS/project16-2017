package gui.kalendar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class KalendarGUI extends JFrame {

	private JPanel contentPane;
	private JPanel panelCalendar;
	private JLabel lblMonth;
	private JLabel lblChangeYear;
	private JButton btnPrevious;
	private JButton btnNext;
	private JComboBox cmbGodina;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KalendarGUI frame = new KalendarGUI();
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
	public KalendarGUI() {
		setTitle("Calendar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanelCalendar(), BorderLayout.CENTER);
	}

	private JPanel getPanelCalendar() {
		if (panelCalendar == null) {
			panelCalendar = new JPanel();
			panelCalendar.setLayout(null);
			panelCalendar.add(getLblMonth());
			panelCalendar.add(getLblChangeYear());
			panelCalendar.add(getBtnPrevious());
			panelCalendar.add(getBtnNext());
			panelCalendar.add(getCmbGodina());
			panelCalendar.add(getScrollPane());
		}
		return panelCalendar;
	}
	private JLabel getLblMonth() {
		if (lblMonth == null) {
			lblMonth = new JLabel("January");
			lblMonth.setBounds(189, 41, 46, 14);
		}
		return lblMonth;
	}
	private JLabel getLblChangeYear() {
		if (lblChangeYear == null) {
			lblChangeYear = new JLabel("Change year");
			lblChangeYear.setBounds(199, 301, 71, 14);
		}
		return lblChangeYear;
	}
	private JButton getBtnPrevious() {
		if (btnPrevious == null) {
			btnPrevious = new JButton("<<");
			btnPrevious.setBounds(65, 37, 89, 23);
		}
		return btnPrevious;
	}
	private JButton getBtnNext() {
		if (btnNext == null) {
			btnNext = new JButton(">>");
			btnNext.setBounds(267, 37, 89, 23);
		}
		return btnNext;
	}
	private JComboBox getCmbGodina() {
		if (cmbGodina == null) {
			cmbGodina = new JComboBox();
			cmbGodina.setBounds(274, 298, 82, 20);
		}
		return cmbGodina;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(65, 83, 291, 197);
			scrollPane.setViewportView(getTable_1());
		}
		return scrollPane;
	}
	private JTable getTable_1() {
		if (table == null) {
			table = new JTable();
		}
		return table;
	}

}
