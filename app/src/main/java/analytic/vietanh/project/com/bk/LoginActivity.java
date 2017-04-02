package analytic.vietanh.project.com.bk;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;

import org.json.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import analytic.vietanh.project.com.bk.POJO.Course;
import analytic.vietanh.project.com.bk.POJO.ResultGPA;
import analytic.vietanh.project.com.bk.POJO.User;
import analytic.vietanh.project.com.bk.util.ParseHtmlUtil;
import analytic.vietanh.project.com.bk.util.UtilMain;
import analytic.vietanh.project.com.bk.util.UtilMainImpl;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";
    private EditText inpuMSSV  ;
    private EditText inputPass;
    UtilMain utilMain = new UtilMainImpl();

    AppCompatButton btnLogin;
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        inpuMSSV = (EditText) findViewById(R.id.input_mssv);
        inputPass = (EditText) findViewById(R.id.input_password);
        btnLogin = (AppCompatButton) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }
    public void login() {
        Log.d(TAG, "Login");

        if (!validate()) {
            onLoginFailed();
            return;
        }

        final ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this,
                R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Authenticating...");
        progressDialog.show();

        final String mssv = inpuMSSV.getText().toString();
        final String password = inputPass.getText().toString();

        // TODO: Implement your own authentication logic here.
        final Intent intent = new Intent(this, MainActivity.class);
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                try  {
                    if(checkLogin(mssv, password)){
                        startActivity(intent);
                        finish();
                    }
                    else{
                        progressDialog.dismiss();
                    }
                    progressDialog.dismiss();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();

    }

    public void onLoginFailed() {
        Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_LONG).show();
        btnLogin.setEnabled(true);
    }

    public boolean validate() {
        boolean valid = true;

        String mssv = inpuMSSV.getText().toString();
        String password = inputPass.getText().toString();

        if (mssv.isEmpty()) {
            inpuMSSV.setError("enter a valid email address");
            valid = false;
        } else {
            inpuMSSV.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
            inputPass.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            inputPass.setError(null);
        }

        return valid;
    }

    boolean checkLogin(String mssv, String pass){
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
            formData.put("ctl00$cLogIn1$tb_cLogIn_User", mssv);
            formData.put("ctl00$cLogIn1$tb_cLogIn_Pass", pass);
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
                    Document bangDiemCaNhanDoc = bangDiemCaNhan.parse();
                    Element userElement = bangDiemCaNhanDoc.getElementById("MainContent_rpInfo_RPC");
                    String msv = userElement.getElementsByTag("b").first().text();
                    String hoTen = ((Element) userElement.getElementsByTag("b").get(1)).text();
                    String ngaySinh = ((Element) userElement.getElementsByTag("b").get(2)).text();
                    String lop = ((Element) userElement.getElementsByTag("b").get(3)).text();
                    String chuongTrinh = ((Element) userElement.getElementsByTag("b").get(4)).text();
                    String heHoc = ((Element) userElement.getElementsByTag("b").get(5)).text();
                    String trangThai = ((Element) userElement.getElementsByTag("b").get(6)).text();

                    user =  new User(mssv, hoTen, ngaySinh, lop, chuongTrinh, heHoc, trangThai);

                    Elements elements = bangDiemCaNhanDoc.getElementById("MainContent_gvCourseMarks_DXMainTable").select(".dxgvDataRow_SisTheme");
                    Elements resultElement = bangDiemCaNhanDoc.getElementById("MainContent_gvResults_DXMainTable").select(".dxgvDataRow_SisTheme");
                    it = elements.iterator();

                    ArrayList<Course> courses = new ArrayList<>();
                    Course course;

                    while (it.hasNext()) {
                        element = (Element) it.next();
                        course = new Course();
                        course.setYear(Integer.parseInt((element.select("td.dxgv").get(0)).text()));
                        course.setMaHP((element.select("td.dxgv").get(1)).text());
                        course.setTenHP((element.select("td.dxgv").get(2)).text());
                        course.setTC(Integer.parseInt((element.select("td.dxgv").get(3)).text()));
                        course.setLopHoc(Integer.parseInt((element.select("td.dxgv").get(4)).text()));
                        course.setDiemChu((element.select("td.dxgv").get(7)).text());

                        try {
                            course.setDiemQT(Float.parseFloat((element.select("td.dxgv").get(5)).text()));
                        }catch (Exception e){
                            course.setDiemQT(Float.parseFloat((element.select("td.dxgv").get(6)).text()));
                        }

                        courses.add(course);
                    }

                    ArrayList<Course> tempCourse = ParseHtmlUtil.checkCourse(courses);
                    courses = tempCourse;

                    user.setCourses(courses);
                    // Lay thong tin GPA, CPA

                    it = resultElement.iterator();
                    ArrayList<ResultGPA> resultGPAs = new ArrayList<>();
                    ResultGPA resultGPA;
                    while (it.hasNext()) {
                        element = (Element) it.next();
                        String hocKy = (element.select("td.dxgv").get(0)).text();
                        String GPA = (element.select("td.dxgv").get(1)).text();
                        String CPA = (element.select("td.dxgv").get(2)).text();
                        resultGPA  = new ResultGPA(hocKy, GPA, CPA);
                        resultGPAs.add(resultGPA);
                    }

                    user.setResultGPAs(resultGPAs);
                }

                String json = new Gson().toJson(user);
                utilMain.writeToFile(json, this);
                Log.d(TAG, "login success");
                return true;
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

}
