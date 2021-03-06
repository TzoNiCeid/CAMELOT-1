import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WithTheGood extends JFrame {

	private JPanel contentPane;
	Current_Game curr;
	Special_Rules a;
	Player examined;
	QuestChoiceData qd;
	QuestOutcome qo;
	Score scr;
	VotingData vd;

	public WithTheGood(Player examined, QuestChoiceData qd, Current_Game curr, Special_Rules a,VotingData vd, QuestOutcome qo, Score scr) {
		this.examined = examined;
		this.qd = qd;
		this.curr = curr;
		this.a = a;
		this.qo = qo;
		this.scr = scr;
		this.vd = vd;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(350, 500);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nameLabel = new JLabel(examined.getUsername());
		nameLabel.setForeground(new Color(255, 0, 0));
		nameLabel.setFont(new Font("Sitka Text", Font.BOLD, 24));
		nameLabel.setBounds(104, 219, 230, 38);
		contentPane.add(nameLabel);
		
		JLabel sideLabel = new JLabel("is with the goods' side");
		sideLabel.setForeground(new Color(255, 0, 0));
		sideLabel.setFont(new Font("Sitka Text", Font.BOLD, 24));
		sideLabel.setBounds(42, 257, 292, 49);
		contentPane.add(sideLabel);
		examined.setNewLady();
		JButton NextButton = new JButton("");
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean mer = false;
				for (int i=0;i<curr.role.length;i++) {
					if(curr.role[i].checkformerlin()) {
						mer = curr.role[i].checkformerlin();
						break;
					}
				}
				if(scr.evilSc==3) {
					dispose();
					evilwins1 evil=new evilwins1(curr);
					evil.setVisible(true);
				} else if (scr.goodSc==3){
					if(mer) {
						dispose();
						evillastchance last=new evillastchance(curr);
						last.setVisible(true);
					} else {
						dispose();
						goodwins1 good=new goodwins1(curr);
						good.setVisible(true);
					}
				}else {
				int quest = qd.getCount();
				QuestChoiceData qd = new QuestChoiceData(); 
				if(quest ==1) {
					qd.setCountQuest(2);
					if(a.checkTargeting()) {
						dispose();
						ChooseQuest cq = new ChooseQuest(qd, curr, a, vd, qo, scr);
						cq.setVisible(true);
					} else {
						dispose();
						ChooseMissioners cm = new ChooseMissioners(qd, curr, a, vd, qo, scr);
						cm.setVisible(true);
					}
				} else if(quest ==2) {
					qd.setCountQuest(3);
					if(a.checkTargeting()) {
						dispose();
						ChooseQuest cq = new ChooseQuest(qd, curr, a, vd, qo, scr);
						cq.setVisible(true);
					} else {
						dispose();
						ChooseMissioners cm = new ChooseMissioners(qd, curr, a, vd, qo, scr);
						cm.setVisible(true);
					}
				} else if(quest ==3) {
					qd.setCountQuest(4);
					if(a.checkTargeting()) {
						dispose();

						ChooseQuest cq = new ChooseQuest(qd, curr, a, vd, qo, scr);
						cq.setVisible(true);
					} else {
						dispose();

						ChooseMissioners cm = new ChooseMissioners(qd, curr, a, vd, qo, scr);
						cm.setVisible(true);
					}
				} else if(quest ==4) {
					qd.setCountQuest(5);
					if(a.checkTargeting()) {
						dispose();

						ChooseQuest cq = new ChooseQuest(qd, curr, a, vd, qo, scr);
						cq.setVisible(true);
					} else {
						dispose();

						ChooseMissioners cm = new ChooseMissioners(qd, curr, a, vd, qo, scr);
						cm.setVisible(true);
					}
				} else {
					//τερματισμος παιχνιδιου
				}
				}
				setVisible(false);
			}
		});
		Image img1 = new ImageIcon(this.getClass().getResource("/grey-arrow.png")).getImage();
		NextButton.setIcon(new ImageIcon(img1));
		NextButton.setBounds(284, 438, 50, 23);
		getContentPane().add(NextButton);
		
		JLabel imgLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/im11.jpg")).getImage();
		imgLabel.setIcon(new ImageIcon(img));
		imgLabel.setBounds(0, 0, 334, 461);
		contentPane.add(imgLabel);
	}
}