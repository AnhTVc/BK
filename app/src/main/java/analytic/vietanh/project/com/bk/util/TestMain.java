package analytic.vietanh.project.com.bk.util;


import com.google.firebase.analytics.FirebaseAnalytics;

import org.json.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by AnhTVc on 3/11/17.
 */

public class TestMain {
    public static void main(String[] arg){
        try {
            HashMap<String, String> cookies = new HashMap();
            HashMap<String, String> formData = new HashMap();
            Connection.Response loginForm = Jsoup.connect("http://sis.hust.edu.vn/").method(Connection.Method.GET).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36").execute();
            Document loginDocument = loginForm.parse();
            cookies.putAll(loginForm.cookies());
            String __EVENTVALIDATION = loginDocument.select("input[id=__EVENTVALIDATION]").first().attr(FirebaseAnalytics.Param.VALUE);
            String __VIEWSTATE = loginDocument.select("input[id=__VIEWSTATE]").first().attr(FirebaseAnalytics.Param.VALUE);
            formData.put("__EVENTTARGET", "ctl00$cLogIn1$bt_cLogIn");
            formData.put("__EVENTARGUMENT", "Click");
            formData.put("__VIEWSTATE", __VIEWSTATE);
            formData.put("__VIEWSTATEGENERATOR", "CA0B0334");
            formData.put("__EVENTVALIDATION", __EVENTVALIDATION);
            formData.put("ctl00$cLogIn1$tb_cLogIn_User", "20121242");
            formData.put("ctl00$cLogIn1$tb_cLogIn_Pass", "23021994");
            formData.put("ctl00$MainContent$H\u01b0\u1edbng d\u1eabn", "0;3;1;0");
            formData.put("ctl00$MainContent$L\u1ecbch thi", "0;3;5;0");
            formData.put("ctl00$MainContent$Th\u00f4ng b\u00e1o c\u1ee7a ban Qu\u1ea3n tr\u1ecb", "0;3;18;0");
            formData.put("ctl00$MainContent$Th\u00f4ng b\u00e1o \u0111\u0103ng k\u00fd h\u1ecdc t\u1eadp", "0;3;22;0");
            formData.put("ctl00$MainContent$Th\u00f4ng b\u00e1o x\u00e9t nh\u1eadn \u0111\u1ed3 \u00e1n t\u1ed1t nghi\u1ec7p", "0;3;4;0");
            formData.put("ctl00$MainContent$Th\u00f4ng b\u00e1o x\u00e9t t\u1ed1t nghi\u1ec7p", "0;3;14;0");
            formData.put("ctl00$MainContent$Th\u00f4ng b\u00e1o x\u1eed l\u00fd h\u1ecdc t\u1eadp", "0;3;6;0");
            formData.put("ctl00$MainContent$ctl08", "0;3;1;0");
            formData.put("DXScript", "1_145,1_81,1_137,1_122,1_99,1_106,1_78,1_92,1_130,1_135,1_121,1_126,1_84,1_124");
            Element bangThongBaoElement = Jsoup.connect("http://sis.hust.edu.vn/").cookies(cookies).data((Map<String, String>) formData).method(Connection.Method.POST).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36").execute().parse().getElementById("MainContent_ctl08_ICell");
            //JSONObject thongTinJsonA = new JSONObject();
            if (bangThongBaoElement != null) {
                Element element;
                Iterator it;

                Elements theThongTinElements = bangThongBaoElement.select("div[class=dxncItemHeader_SisTheme]");
                String maHocPhan;
                boolean checkLogin = true;

                Iterator it2 = theThongTinElements.iterator();
                while (it2.hasNext()) {
                    element = (Element) it2.next();
                    String thongTin = element.getElementsByTag("a").text();
                    String urlThongTin = element.getElementsByTag("a").attr("href");


                }
                Connection.Response bangDiemCaNhan = Jsoup.connect("http://sis.hust.edu.vn/ModuleGradeBook/StudentCourseMarks.aspx").cookies(cookies).method(Connection.Method.GET).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36").execute();
                if (bangDiemCaNhan != null) {
                    String tenHocPhan;
                    String soTinChi;
                    String diemChu;
                    JSONObject jsonObject;
                    Document bangDiemCaNhanDoc = bangDiemCaNhan.parse();
                    Element user = bangDiemCaNhanDoc.getElementById("MainContent_rpInfo_RPC");
                    String msv = user.getElementsByTag("b").first().text();
                    String hoTen = ((Element) user.getElementsByTag("b").get(1)).text();
                    String ngaySinh = ((Element) user.getElementsByTag("b").get(2)).text();
                    String lop = ((Element) user.getElementsByTag("b").get(3)).text();
                    String chuongTrinh = ((Element) user.getElementsByTag("b").get(4)).text();
                    String heHoc = ((Element) user.getElementsByTag("b").get(5)).text();
                    String trangThai = ((Element) user.getElementsByTag("b").get(6)).text();
                    System.out.println(ngaySinh);

                    Elements elements = bangDiemCaNhanDoc.getElementById("MainContent_gvCourseMarks_DXMainTable").select(".dxgvDataRow_SisTheme");
                    it = elements.iterator();
                    while (it.hasNext()) {
                        element = (Element) it.next();
                        maHocPhan = ((Element) element.select("td.dxgv").get(1)).text();
                        tenHocPhan = ((Element) element.select("td.dxgv").get(2)).text();
                        soTinChi = ((Element) element.select("td.dxgv").get(3)).text();
                        diemChu = ((Element) element.select("td.dxgv").get(7)).text();
                        System.out.println("----------------------");
                        System.out.println("Ma Hoc Phan: " + maHocPhan);
                        System.out.println("diem chu: " + diemChu);
                        System.out.println("----------------------");
                    }
                }
            }
            System.out.print("begin");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
