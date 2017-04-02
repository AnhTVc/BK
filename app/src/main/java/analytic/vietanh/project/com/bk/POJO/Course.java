package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by VietAnh on 3/3/2017.
 */

public class Course {
    private int year;
    private String maHP;
    private String tenHP;
    private int TC;
    private int lopHoc;
    private float diemQT;
    private float diemThi;
    private String diemChu;

    public Course(){}

    public Course(int year, String maHP, String tenHP, int TC, int lopHoc, float diemQT, float diemThi, String diemChu){
        this.year = year;
        this.maHP = maHP;
        this.tenHP = tenHP;
        this.TC = TC;
        this.lopHoc = lopHoc;
        this.diemQT = diemQT;
        this.diemThi = diemThi;
        this.diemChu = diemChu;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMaHP(String maHP) {
        this.maHP = maHP;
    }

    public void setTenHP(String tenHP) {
        this.tenHP = tenHP;
    }

    public void setTC(int TC) {
        this.TC = TC;
    }

    public void setLopHoc(int lopHoc) {
        this.lopHoc = lopHoc;
    }

    public void setDiemQT(float diemQT) {
        this.diemQT = diemQT;
    }

    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }

    public void setDiemChu(String diemChu) {
        this.diemChu = diemChu;
    }

    public int getYear() {
        return year;
    }

    public String getMaHP() {
        return maHP;
    }

    public String getTenHP() {
        return tenHP;
    }

    public int getTC() {
        return TC;
    }

    public int getLopHoc() {
        return lopHoc;
    }

    public float getDiemQT() {
        return diemQT;
    }

    public float getDiemThi() {
        return diemThi;
    }

    public String getDiemChu() {
        return diemChu;
    }
}
