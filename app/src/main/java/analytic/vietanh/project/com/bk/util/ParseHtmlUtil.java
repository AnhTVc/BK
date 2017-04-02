package analytic.vietanh.project.com.bk.util;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import analytic.vietanh.project.com.bk.POJO.*;
import analytic.vietanh.project.com.bk.constant.Defind;

/**
 * Created by VietAnh on 3/5/2017.
 */

public class ParseHtmlUtil {
    static private String URL_TEM_HTML_DATA = "D:\\Data\\Du An\\28022017\\data.html";
    final static Logger logger = Logger.getLogger(ParseHtmlUtil.class.toString());
    static public ArrayList<Course> parseHTMLToCourses(String htmlData){

        ArrayList<Course> courses = new ArrayList<>();
        Course course;
        try {
            Document document = Jsoup.parse(htmlData);
            logger.info("Parse data");
            Elements elements = document.getElementsByClass("dxgvDataRow_SisTheme");
            for(Element element: elements){
                try {
                    Elements elementTds = element.getElementsByTag("td");

                    if(elementTds.size() == 8){
                        course = new Course();
                        // Get data from td tag
                        course.setYear(Integer.parseInt(elementTds.get(0).text()));
                        course.setMaHP(elementTds.get(1).text());
                        course.setTenHP(elementTds.get(2).text());
                        course.setTC(Integer.parseInt(elementTds.get(3).text()));
                        course.setLopHoc(Integer.parseInt(elementTds.get(4).text()));
                        course.setDiemChu(elementTds.get(7).text());
                        try {
                            course.setDiemQT(Float.parseFloat(elementTds.get(5).text()));
                        }catch (Exception e){
                            course.setDiemQT(Float.parseFloat(elementTds.get(6).text()));
                        }

                        course.setDiemThi(Float.parseFloat(elementTds.get(6).text()));

                        courses.add(course);
                    }

                }catch (Exception e){
                    logger.warning("Đọc điểm môn học lỗi");
                }
            }

            return courses;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static User parseHtmlToUser(String html_data){
        UtilMain utilMain = new UtilMainImpl();
        User user = new User();
        user.setMSSV(parseHTMLToMSSV(utilMain.fileToString(URL_TEM_HTML_DATA)));
        ArrayList<Course> courses = checkCourse(parseHTMLToCourses(html_data));
        user.setCourses(courses);
        return user;
    }

    static boolean checkCourses(Course course){
        String maHP = course.getMaHP();
        if(maHP.equals(Defind.MAHP_DUONG_LOI_DANG)
                || maHP.equals(Defind.MAHP_MAC_LENIN_I)
                || maHP.equals(Defind.MAHP_MAC_LENIN_II)
                || maHP.equals(Defind.MAHP_QUAN_TRI_HOC_DAI_CUONG)
                || maHP.equals(Defind.MAHP_TU_TUONG_HCM)
                || maHP.equals(Defind.MAHP_PHAP_LUAT_DAI_CUONG
        ))
            return true;
        return false;
    }

    /**
     * Xóa các môn học cải thiện. blabla
     * @param courses
     * @return
     */
    public static ArrayList<Course> checkCourse(ArrayList<Course> courses){
        ArrayList<Course> temps = new ArrayList<>();

        ArrayList<Course> temps1 = new ArrayList<>();
        for (Course course: courses) {
            if(!checkCourses(course) && course.getTC() != 0)
                temps.add(course);
        }

        courses = temps;
        for(int i =0; i< courses.size(); i++){
            boolean check = false;
            int index = 0;


            for(int j = i + 1; j< courses.size(); j++){
                if(courses.get(i).getMaHP().equals(courses.get(j).getMaHP()))
                {
                    check = true;
                    index = j;
                    break;
                }
            }
            Course tempCourse = null;
            if(check){
                if((courses.get(i).getDiemQT()*0.3 + courses.get(i).getDiemThi() * 0.7) <
                        (courses.get(index).getDiemQT()*0.3 + courses.get(index).getDiemThi() * 0.7)){
                    tempCourse = courses.get(index);
                }else
                    tempCourse = courses.get(i);
            }
            temps1.add(check ?tempCourse : courses.get(i));

        }
        //Xóa các môn đã cải thiện
        Set<Course> hs = new HashSet<>();
        hs.addAll(temps1);
        temps1.clear();
        temps1.addAll(hs);
        return temps1;
    }

    /**
     *  Tìm mã số sinh viên từ html
     * @param datahtml
     * @return
     */
    static String parseHTMLToMSSV(String datahtml){
        try{
            Document document = Jsoup.parse(datahtml);
            logger.info("Parse data");
            Element element = document.getElementById("MainContent_rpInfo_RPC");

            return element.getElementsByTag("p").get(0).text();
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    /**
     *
     * @param datahtml
     * @param file
     * @return
     */
    static boolean parseHTMLsaveToFile(String datahtml, String file){
        return false;
    }
    public static  void main(String[] agr){
        UtilMain utilMain = new UtilMainImpl();
        ArrayList<Course> courses = checkCourse(parseHTMLToCourses(utilMain.fileToString(URL_TEM_HTML_DATA)));
        logger.info("----------------------------------------------------------------");
        User user = new User();
        user.setMSSV(parseHTMLToMSSV(utilMain.fileToString(URL_TEM_HTML_DATA)));
        user.setCourses(courses);


    }

}
