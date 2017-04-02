package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by AnhTVc on 3/29/17.
 */

public class ResultGPA {
    private String hocKy;
    private String GPA;
    private String CPA;

    public ResultGPA(){}

    public ResultGPA(String hocKy, String GPA, String CPA){
        this.hocKy = hocKy;
        this.GPA = GPA;
        this.CPA = CPA;
    }

    public ResultGPA(String hocKy, String GPA){
        this.hocKy = hocKy;
        this.GPA = GPA;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }

    public void setCPA(String CPA) {
        this.CPA = CPA;
    }

    public String getHocKy() {
        return hocKy;
    }

    public String getGPA() {
        return GPA;
    }

    public String getCPA() {
        return CPA;
    }
}
