import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class CalendarGUI extends JFrame {
    private JPanel calendarPanel;
    private JLabel monthLabel;
    private LocalDate currentDate;

    public CalendarGUI() {
        setTitle("Swing Calendar");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        currentDate = LocalDate.now();

        // 상단 패널 (월 변경)
        JPanel topPanel = new JPanel(new BorderLayout());
        JButton prevButton = new JButton("<");
        JButton nextButton = new JButton(">");
        monthLabel = new JLabel("", SwingConstants.CENTER);

        prevButton.addActionListener(e -> {
            currentDate = currentDate.minusMonths(1);
            updateCalendar();
        });

        nextButton.addActionListener(e -> {
            currentDate = currentDate.plusMonths(1);
            updateCalendar();
        });

        topPanel.add(prevButton, BorderLayout.WEST);
        topPanel.add(monthLabel, BorderLayout.CENTER);
        topPanel.add(nextButton, BorderLayout.EAST);

        // 달력 패널
        calendarPanel = new JPanel(new GridLayout(0, 7, 3, 3));

        add(topPanel, BorderLayout.NORTH);
        add(calendarPanel, BorderLayout.CENTER);

        updateCalendar();
    }

    private void updateCalendar() {
        calendarPanel.removeAll();

        // 월 레이블 업데이트
        YearMonth yearMonth = YearMonth.of(currentDate.getYear(), currentDate.getMonth());
        monthLabel.setText(currentDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH) + " " + currentDate.getYear());

        // 요일 출력
        for (DayOfWeek dow : DayOfWeek.values()) {
            calendarPanel.add(new JLabel(dow.getDisplayName(TextStyle.SHORT, Locale.ENGLISH), SwingConstants.CENTER));
        }

        // 시작 요일 및 총 일 수
        LocalDate firstDayOfMonth = yearMonth.atDay(1);
        int startDay = firstDayOfMonth.getDayOfWeek().getValue(); // 1 (Mon) ~ 7 (Sun)
        int daysInMonth = yearMonth.lengthOfMonth();

        // 앞 빈칸
        for (int i = 1; i < startDay; i++) {
            calendarPanel.add(new JLabel(""));
        }

        // 날짜 출력
        for (int day = 1; day <= daysInMonth; day++) {
        	JPanel dayPanel = new JPanel(new BorderLayout());
            JButton dayButton = new JButton(String.valueOf(day));
            dayButton.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Selected: " + currentDate.getYear() + "-" +
                        currentDate.getMonthValue() + "-" + dayButton.getText());
            });
            JTextArea dayScadule = new JTextArea();
            dayPanel.add(dayButton, BorderLayout.NORTH);
            dayPanel.add(dayScadule, BorderLayout.CENTER);
            calendarPanel.add(dayPanel);
        }

        calendarPanel.revalidate();
        calendarPanel.repaint();
    }

    public static void main(String[] args) {
    	JFrame obj = new CalendarGUI();
    	obj.setVisible(true);
    }
}
