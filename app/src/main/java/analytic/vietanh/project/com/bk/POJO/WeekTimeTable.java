package analytic.vietanh.project.com.bk.POJO;

import java.util.ArrayList;

import bkhn.com.project.vietanh.library.WeekViewEvent;

/**
 * Created by VietAnh on 4/2/2017.
 */

public class WeekTimeTable {
    private ArrayList<DayTimeTable> dayTimeTables;

    public WeekTimeTable(){}

    public WeekTimeTable(ArrayList<DayTimeTable> dayTimeTables){
        this.dayTimeTables = dayTimeTables;
    }

    public void setDayTimeTables(ArrayList<DayTimeTable> dayTimeTables) {
        this.dayTimeTables = dayTimeTables;
    }

    public ArrayList<DayTimeTable> getDayTimeTables() {
        return dayTimeTables;
    }
}
