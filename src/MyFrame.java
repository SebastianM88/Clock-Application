import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

    // Creating each element necessary in the project
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;

    // Our constructor
    MyFrame() {

        // Definition the structure on which the page elements will be located
        this.setDefaultCloseOperation(3);
        this.setSize(350, 200);
        this.setLayout(new FlowLayout());
        this.setResizable(true);

        // the time measurement units that we will use
        this.timeFormat = new SimpleDateFormat("hh:mm:ss a");
        this.dayFormat = new SimpleDateFormat("EEEE - ");
        this.dateFormat = new SimpleDateFormat("MMM - dd - yyyy");

        // Creation of the label where the current hour will be located
        this.timeLabel = new JLabel();
        this.timeLabel.setFont(new Font("Sans-Serif", 1, 50));
        this.timeLabel.setForeground(new Color(65280));
        this.timeLabel.setBackground(Color.BLACK);
        this.timeLabel.setOpaque(true);

        // Creation of the label where the current day, month and the year will be located
        this.dayLabel = new JLabel();
        this.dayLabel.setFont(new Font("Helvetica", 1, 25));
        this.dateLabel = new JLabel();
        this.dateLabel.setFont(new Font("Helvetica", 1, 25));

        // Adding each element to our structure so that it can function
        this.add(this.timeLabel);
        this.add(this.dayLabel);
        this.add(this.dateLabel);
        this.setVisible(true);

        // Defining of the method which are going to contain all project functionalities
        this.setTime();
    }

    public void setTime() {

        while(true) {

            /* Code designed to connect the current time, day and year on our computer
               and design it on our interface
             */
            this.time = this.timeFormat.format(Calendar.getInstance().getTime());
            this.timeLabel.setText(this.time);
            this.day = this.dayFormat.format(Calendar.getInstance().getTime());
            this.dayLabel.setText(this.day);
            this.date = this.dateFormat.format(Calendar.getInstance().getTime());
            this.dateLabel.setText(this.date);

            // Necessary condition for connecting the passage of time from the computer to our project
            try {

                Thread.sleep(1000L);
            } catch (InterruptedException var2) {

                InterruptedException e = var2 ;
                e.printStackTrace();
            }
        }
    }
}

