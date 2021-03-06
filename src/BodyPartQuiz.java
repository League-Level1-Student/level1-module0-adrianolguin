
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// 0. You can use the celebrity photos we have placed in the default java
	// package,
	// or if you prefer, get celebrity photos from the Internet, place them in the
	// default
	// package, and change the names below.

	String firstImage = "src/arnold.jpeg";
	String secondImage = "src/leonardo.jpeg";
	String thirdImage = "src/morgan.jpeg";
	String fourthImage = "src/jack.jpeg";

	JFrame window = new JFrame();
	JPanel panel = new JPanel();

	private void startQuiz() {

		int score = 0;

		initializeGui();

		String input = JOptionPane.showInputDialog("who is this?");

		if (input.equalsIgnoreCase("arnold")) {
			JOptionPane.showMessageDialog(null, "You are Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "You are incorrect. This is arnold");
		}
		showNextImage();

		JOptionPane.showMessageDialog(null, "Score: " + score);

		String input2 = JOptionPane.showInputDialog("who is this?");
		
		if (input2.equalsIgnoreCase("Leonardo")) {
			JOptionPane.showMessageDialog(null, "You are correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "You are incorrect. This is Leonardo");

		}
		JOptionPane.showMessageDialog(null, "Score: " + score);
		showNextImage();
		
String input3 = JOptionPane.showInputDialog("who is this?");
		
		if (input3.equalsIgnoreCase("Morgan")) {
			JOptionPane.showMessageDialog(null, "You are correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "You are incorrect. This is Morgan Freeman, our lord and savior.");

		}
		JOptionPane.showMessageDialog(null, "Score: " + score);
		
		showNextImage();
		
String input4 = JOptionPane.showInputDialog("who is this?");
		
		if (input4.equalsIgnoreCase("Jack")) {
			JOptionPane.showMessageDialog(null, "You are correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "You are incorrect. This is Jack Black.");

		}
		JOptionPane.showMessageDialog(null, "Score: " + score);
		
	}

	

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());
		window.setVisible(true);
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);

		// 3. Change the size of the window so that you can only see part of the image.
		window.setSize(150, 230);

		showNextImage();

	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		System.exit(0);
		return new JLabel();
	}
}
