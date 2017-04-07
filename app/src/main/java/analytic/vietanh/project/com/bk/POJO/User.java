package analytic.vietanh.project.com.bk.POJO;

import java.util.ArrayList;

/**
 * Created by VietAnh on 3/6/2017.
 */

public class User {
    private String MSSV;
    private String fullName;
    private String lop;
    private String ngaySinh;
    private String chuongTrinh;
    private String heHoc;
    private String trangThai;
    ArrayList<ResultGPA> resultGPAs;
    private ArrayList<Course> courses;
    private ArrayList<Course> coursesTry;

    public void setCoursesTry(ArrayList<Course> coursesTry) {
        this.coursesTry = coursesTry;
    }

    public ArrayList<Course> getCoursesTry() {
        return coursesTry;
    }

    public void setResultGPAs(ArrayList<ResultGPA> resultGPAs) {
        this.resultGPAs = resultGPAs;
    }

    public ArrayList<ResultGPA> getResultGPAs() {
        return resultGPAs;
    }

    public User(){}

    public User(String MSSV, String fullName, String ngaySinh, String lop, String chuongTrinh, String heHoc, String trangThai){
        this.MSSV = MSSV;
        this.fullName = fullName;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
        this.chuongTrinh = chuongTrinh;
        this.heHoc = heHoc;
        this.trangThai = trangThai;
    }



    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setChuongTrinh(String chuongTrinh) {
        this.chuongTrinh = chuongTrinh;
    }

    public void setHeHoc(String heHoc) {
        this.heHoc = heHoc;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLop() {
        return lop;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getChuongTrinh() {
        return chuongTrinh;
    }

    public String getHeHoc() {
        return heHoc;
    }

    public String getTrangThai() {
        return trangThai;
    }

    private int boMon;
    private int khoaVien;

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getMSSV() {
        return MSSV;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setBoMon(int boMon) {
        this.boMon = boMon;
    }

    public void setKhoaVien(int khoaVien) {
        this.khoaVien = khoaVien;
    }

    public int getBoMon() {
        return boMon;
    }

    public int getKhoaVien() {
        return khoaVien;
    }
}
