package Experiment_3;

import java.sql.Date;

/**
 * @author 冰
 */
public class DayRecord14 {
    private Date workDay;
    private int hourCount;
    private static final String NEW_LINE = System.getProperty("line.separator");

    /**
     *
     * @param workDay 特定的工作日期
     * @param hourCount 工作的时间
     */
    public DayRecord14(Date workDay, int hourCount) {
        super();
        this.workDay = workDay;
        this.hourCount = hourCount;
    }

    public Date getWorkDay() {
        return workDay;
    }

    public int getHourCount() {
        return hourCount;
    }

    @Override
    public String toString() {
        return "worked " + hourCount + ", hours in " + workDay + NEW_LINE;
    }

    public static void main(String[] args) {
        DayRecord14 dayRecord=new DayRecord14(new Date(121,2,25),8);
        System.out.println(dayRecord);
    }
}
