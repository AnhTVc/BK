package analytic.vietanh.project.com.bk.POJO;

import java.util.ArrayList;

/**
 * Created by VietAnh on 4/2/2017.
 */

public class DayTimeTable {
    private ArrayList<EventTimeTable> eventTimeTables;

    public DayTimeTable(){}

    public DayTimeTable(ArrayList<EventTimeTable> eventTimeTables){
        this.eventTimeTables = eventTimeTables;
    }
    public void setEventTimeTables(ArrayList<EventTimeTable> eventTimeTables) {
        this.eventTimeTables = eventTimeTables;
    }

    public ArrayList<EventTimeTable> getEventTimeTables() {
        return eventTimeTables;
    }
}
