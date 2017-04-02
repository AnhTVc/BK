package analytic.vietanh.project.com.bk.POJO;

import java.util.Calendar;

/**
 * Created by VietAnh on 4/2/2017.
 */

public class EventTimeTable {
    private String tenHP;
    private String lopHoc;
    private Calendar startTime;
    private Calendar endTime;

    public void setTenHP(String tenHP) {
        this.tenHP = tenHP;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Calendar endTime) {
        this.endTime = endTime;
    }

    public String getTenHP() {
        return tenHP;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public Calendar getStartTime() {
        return startTime;
    }

    public Calendar getEndTime() {
        return endTime;
    }
}
