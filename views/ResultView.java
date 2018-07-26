package com.mayank.Questions.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mayank.Questions.items.Test;
import com.mayank.Questions.items.TestOperations;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ResultView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	private JLabel lblQuesNo_1;
	private JLabel lblQuesNo_2;
	private JLabel lblQuesNo_3;
	private JLabel lblQues_1;
	private JLabel lblQues_2;
	private JLabel lblQues_3;
	private JLabel lblYourAns;
	private JLabel lblRightAns;
	private JLabel lblScore_1;
	private JLabel lblScore_2;
	private JLabel lblScore_3;
	private JLabel lblTotal;
	private JLabel lblUr_1;
	private JLabel lblUr_2;
	private JLabel lblUr_3;
	private JLabel lblRt_1;
	private JLabel lblRt_2;
	private JLabel lblRt_3;
	private JLabel lblRemarksVal;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultView frame = new ResultView();
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
	public ResultView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBounds(new Rectangle(0, 0, 5, 2));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblResult = new JLabel("RESULT");
		lblResult.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 30));
		lblResult.setBounds(350, 82, 101, 32);
		contentPane.add(lblResult);
		
		lblQuesNo_1 = new JLabel("1.");
		lblQuesNo_1.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 18));
		lblQuesNo_1.setBounds(79, 170, 36, 16);
		contentPane.add(lblQuesNo_1);
		
		lblQues_1 = new JLabel("question1");
		lblQues_1.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 18));
		lblQues_1.setBounds(127, 167, 432, 23);
		contentPane.add(lblQues_1);
		
		lblYourAns = new JLabel("Your Ans");
		lblYourAns.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourAns.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 18));
		lblYourAns.setBounds(570, 144, 79, 16);
		contentPane.add(lblYourAns);
		
		lblRightAns = new JLabel("Right Ans");
		lblRightAns.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 18));
		lblRightAns.setBounds(661, 141, 74, 23);
		contentPane.add(lblRightAns);
		
		JLabel lblScore = new JLabel("Score");
		lblScore.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 18));
		lblScore.setBounds(765, 146, 56, 16);
		contentPane.add(lblScore);
		
		lblUr_1 = new JLabel("ur1");
		lblUr_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblUr_1.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 18));
		lblUr_1.setBounds(580, 172, 56, 16);
		contentPane.add(lblUr_1);
		
		lblRt_1 = new JLabel("rt1");
		lblRt_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRt_1.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 18));
		lblRt_1.setBounds(661, 172, 56, 16);
		contentPane.add(lblRt_1);
		
		lblScore_1 = new JLabel("0");
		lblScore_1.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 18));
		lblScore_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore_1.setBounds(765, 170, 56, 16);
		contentPane.add(lblScore_1);
		
		lblQuesNo_2 = new JLabel("2.");
		lblQuesNo_2.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 18));
		lblQuesNo_2.setBounds(79, 218, 36, 16);
		contentPane.add(lblQuesNo_2);
		
		lblQues_2 = new JLabel("question2");
		lblQues_2.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 18));
		lblQues_2.setBounds(127, 215, 432, 23);
		contentPane.add(lblQues_2);
		
		lblUr_2 = new JLabel("ur2");
		lblUr_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblUr_2.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 18));
		lblUr_2.setBounds(580, 220, 56, 16);
		contentPane.add(lblUr_2);
		
		lblRt_2 = new JLabel("rt2");
		lblRt_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblRt_2.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 18));
		lblRt_2.setBounds(661, 220, 56, 16);
		contentPane.add(lblRt_2);
		
		lblScore_2 = new JLabel("0");
		lblScore_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore_2.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 18));
		lblScore_2.setBounds(765, 220, 56, 16);
		contentPane.add(lblScore_2);
		
		lblQuesNo_3 = new JLabel("3.");
		lblQuesNo_3.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 18));
		lblQuesNo_3.setBounds(79, 267, 36, 16);
		contentPane.add(lblQuesNo_3);
		
		lblQues_3 = new JLabel("question3");
		lblQues_3.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 18));
		lblQues_3.setBounds(127, 264, 432, 23);
		contentPane.add(lblQues_3);
		
		lblUr_3 = new JLabel("ur3");
		lblUr_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblUr_3.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 18));
		lblUr_3.setBounds(580, 269, 56, 16);
		contentPane.add(lblUr_3);
		
		lblRt_3 = new JLabel("rt3");
		lblRt_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblRt_3.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 18));
		lblRt_3.setBounds(661, 269, 56, 16);
		contentPane.add(lblRt_3);
		
		lblScore_3 = new JLabel("0");
		lblScore_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore_3.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 18));
		lblScore_3.setBounds(765, 269, 56, 16);
		contentPane.add(lblScore_3);
		
		JButton btnEndTest = new JButton("END TEST");
		btnEndTest.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 14));
		btnEndTest.setBounds(705, 542, 97, 32);
		btnEndTest.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(contentPane, new String("Thank You"));
				System.exit(EXIT_ON_CLOSE);
			}
		});
		contentPane.add(btnEndTest);
		
		JLabel lblTotalScore = new JLabel("Total Score :");
		lblTotalScore.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 20));
		lblTotalScore.setBounds(79, 499, 106, 23);
		contentPane.add(lblTotalScore);
		
		lblTotal = new JLabel("0");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 20));
		lblTotal.setBounds(210, 504, 56, 16);
		contentPane.add(lblTotal);
		
		JLabel lblRemarks = new JLabel("Remarks :");
		lblRemarks.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRemarks.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 20));
		lblRemarks.setBounds(79, 535, 106, 23);
		contentPane.add(lblRemarks);
		
		lblRemarksVal = new JLabel("-----");
		lblRemarksVal.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemarksVal.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 20));
		lblRemarksVal.setBounds(210, 535, 101, 23);
		contentPane.add(lblRemarksVal);
		
		checkResult();
		showResult();
		getTotal();
		setRemarks();
	}
	
	
	public void showResult() {
		int i =0;
		JLabel []QuesNo = {lblQuesNo_1, lblQuesNo_2, lblQuesNo_3};
		JLabel []Ques = {lblQues_1, lblQues_2, lblQues_3};
		JLabel []UrAns = {lblUr_1, lblUr_2, lblUr_3};
		JLabel []RtAns = {lblRt_1, lblRt_2, lblRt_3};
		JLabel []Score = {lblScore_1, lblScore_2, lblScore_3};
		for(Test test : TestOperations.getInstance().getQuestionList()) {
			QuesNo[i].setText(String.valueOf(test.getQuesNo()));
			Ques[i].setText(test.getQuestion());
			if(test.getUrAns() != null)
				UrAns[i].setText(test.getUrAns());
			else
				UrAns[i].setText("N/A");
			RtAns[i].setText(test.getRtAns());
			Score[i].setText(String.valueOf(test.getScore()));
			i++;
		}
		lblTotal.setText(String.valueOf(getTotal()));
	}
	public void checkResult() {
		
		for(Test test : TestOperations.getInstance().getQuestionList()) {
			if(test.getUrAns() == null)
				test.setScore(0);
			else if(!(test.getUrAns().equals(test.getRtAns())))
				test.setScore(-2);
			else if (test.getUrAns().equals(test.getRtAns()))
				test.setScore(5);
		}		
	}
	
	
		public int getTotal() {
			int sum = 0;
			for(Test test : TestOperations.getInstance().getQuestionList()) {
			sum+=test.getScore();
		}
		return sum;
	}
		
		public void setRemarks() {
			if(getTotal() == 15)
				lblRemarksVal.setText("Outstanding");
			else if((getTotal()>=10) && (getTotal() < 15))
				lblRemarksVal.setText("Very Good");
			else if((getTotal()>=5) && (getTotal() < 10))
				lblRemarksVal.setText("Average");
			else 
				lblRemarksVal.setText("Poor");
		}

}
