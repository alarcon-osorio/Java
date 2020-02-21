package b56WindowBuilderProblems;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class ProblemThree extends JFrame {

	private JPanel contentPane;
	private JLabel lblcompuerta1;
	private JLabel lblcompuerta2;
	private JLabel lblcompuerta3;
	private JSpinner spinner1;
	private JSpinner spinner2;
	private JSpinner spinner3;
	private JLabel lbltitleresult;
        private JLabel lblresult;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProblemThree frame = new ProblemThree();
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
	public ProblemThree() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(341, 247);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblcompuerta1 = new JLabel("Compuerta 1");
		
		lblcompuerta2 = new JLabel("Compuerta 2");
		
		lblcompuerta3 = new JLabel("Compuerta 3");
		
		spinner1 = new JSpinner();
		
		spinner2 = new JSpinner();
		
		spinner3 = new JSpinner();               
		
                /*Agregado por JEISON = LABEL ADICIONAL*/
                lblresult = new JLabel("0");
                lblresult.setBounds(250,163,50,30);
                add(lblresult);                
		
		btnNewButton = new JButton("Actualizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int v1=Integer.parseInt(spinner1.getValue().toString());
                int v2=Integer.parseInt(spinner2.getValue().toString());
                int v3=Integer.parseInt(spinner3.getValue().toString());
                int suma=v1+v2+v3;
                if (suma<=100)
                	lblresult.setText("Bajo");
                else
                    if (suma<=200)
                    	lblresult.setText("Medio");
                    else
                    	lblresult.setText("Alto");
			}
		});
		
		lbltitleresult = new JLabel("Resultado:");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(16)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(spinner1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(lblcompuerta1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(spinner2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(lblcompuerta2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(spinner3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(lblcompuerta3, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
							.addGap(35)
							.addComponent(lbltitleresult, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(spinner1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblcompuerta1)))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(spinner2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblcompuerta2)))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(spinner3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblcompuerta3)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(44)
							.addComponent(lbltitleresult))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(40)
							.addComponent(btnNewButton))))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
