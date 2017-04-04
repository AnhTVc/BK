package analytic.vietanh.project.com.bk;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.ViewPortHandler;

import java.util.ArrayList;

import analytic.vietanh.project.com.bk.POJO.Course;
import analytic.vietanh.project.com.bk.POJO.User;
import analytic.vietanh.project.com.bk.util.UtilMain;
import analytic.vietanh.project.com.bk.util.UtilMainImpl;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    User user;
    UtilMain utilMain = new UtilMainImpl();
    TableLayout tbLayoutDanhSachDiem    = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        // Add by anhtvc
        addChart();
        addBarChart();

        // Add diem
        user = utilMain.loadUserProfileNew(getApplicationContext());
        tbLayoutDanhSachDiem = (TableLayout) findViewById(R.id.tbLayoutDanhSachDiem);
        if(user != null){
            for(int i =0; i< user.getCourses().size(); i++){
                Course course = user.getCourses().get(i);
                TableRow tableRow = createTableRow(course, i);
                tbLayoutDanhSachDiem.addView(tableRow);
            }
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent intent;
        switch (id){
            case (R.id.taikhoan):
                intent  = new Intent(this, ProfileUser.class);
                startActivity(intent);
                break;
            case (R.id.thoikhoabieu):
                intent = new Intent(this, ClassScheduleActivity.class);
                startActivity(intent);
                break;
            case (R.id.caithien):
                intent = new Intent(this, TryAgainActivity.class);
                startActivity(intent);
                break;
            case (R.id.hocphi):
                intent = new Intent(this, HocPhiActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    void addChart(){
        LineChart lineChart = (LineChart) findViewById(R.id.chart);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(2f, 0));
        entries.add(new Entry(2.89f, 1));
        entries.add(new Entry(2.07f, 2));
        entries.add(new Entry(1.91f, 3));
        entries.add(new Entry(1.94f, 4));
        entries.add(new Entry(2.52f, 5));
        entries.add(new Entry(2.2f, 6));
        entries.add(new Entry(3.11f, 7));
        entries.add(new Entry(3.19f, 8));

        LineDataSet dataset = new LineDataSet(entries, "CPA");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("20121");
        labels.add("20122");
        labels.add("20131");
        labels.add("20132");
        labels.add("20141");
        labels.add("20142");
        labels.add("20151");
        labels.add("20152");
        labels.add("20161");

        LineData data = new LineData(labels, dataset);
        dataset.setColors(ColorTemplate.COLORFUL_COLORS); //
        dataset.setDrawCubic(true);
        dataset.setDrawFilled(true);
        dataset.setValueTextSize(12.0f);
        lineChart.setData(data);
        lineChart.animateY(5000);

    }

    void addBarChart(){

        BarChart barChart = (BarChart) findViewById(R.id.chartTwo);

        // HorizontalBarChart barChart= (HorizontalBarChart) findViewById(R.id.chart);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(18, 4));
        entries.add(new BarEntry(12, 3));
        entries.add(new BarEntry(6, 2));
        entries.add(new BarEntry(8, 1));
        entries.add(new BarEntry(4, 0));

        BarDataSet dataset = new BarDataSet(entries, "# mon hoc");

        ArrayList<String> labels = new ArrayList<>();

        labels.add("F");
        labels.add("D/D+");
        labels.add("C/C+");
        labels.add("B/B+");
        labels.add("A/A+");
        dataset.setColors(ColorTemplate.COLORFUL_COLORS);
        dataset.setValueTextSize(12.0f);
        dataset.setValueFormatter(new MyValueFormatter());
        BarData data = new BarData(labels, dataset);
        // dataset.setColors(ColorTemplate.COLORFUL_COLORS); //
        barChart.setData(data);
        barChart.animateY(5000);

    }
    private class MyValueFormatter implements ValueFormatter {
        private MyValueFormatter() {
        }

        public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
            return Math.round(value) + BuildConfig.FLAVOR;
        }
    }

    private TableRow createTableRow(Course course, int pos){
        TableRow tableRow = new TableRow(this);
        tableRow.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.MATCH_PARENT));
        if(pos % 2 == 0){
            tableRow.setBackgroundColor(getResources().getColor(R.color.colorTableRowOne));
        }else{
            tableRow.setBackgroundColor(getResources().getColor(R.color.colorTableRowTwo));
        }

        TextView tvMaHP                 = createTextView(course.getMaHP(), 10, 5, 5, 10, 0);
        TextView tvTenHocPhan           = createTextView(course.getTenHP(), 10, 5, 5, 10, 0);
        TextView tvDiemQuaTrinh         = createTextView(String.valueOf(course.getDiemQT()), 10, 5, 5, 10, 0);
        TextView tvDiemThi              = createTextView(String.valueOf(course.getDiemThi()), 10, 5, 5, 10, 0);
        TextView tvDiemChu              = createTextView(course.getDiemChu(), 10, 5, 5, 10, 0);

        tableRow.addView(tvMaHP);
        LinearLayout linearLayoutOne = createLinerLayout();
        tableRow.addView(linearLayoutOne);

        tableRow.addView(tvTenHocPhan);
        LinearLayout linearLayoutTwo = createLinerLayout();
        tableRow.addView(linearLayoutTwo);

/*        tableRow.addView(tvDiemQuaTrinh);
        LinearLayout linearLayoutThree = createLinerLayout();
        tableRow.addView(linearLayoutThree);

        tableRow.addView(tvDiemThi);
        LinearLayout linearLayoutFour = createLinerLayout();
        tableRow.addView(linearLayoutFour);*/

        tableRow.addView(tvDiemChu);
        LinearLayout linearLayoutFive = createLinerLayout();
        tableRow.addView(linearLayoutFive);
        return tableRow;
    }

    /**
     * Khởi tạo textview
     * @param text
     * @param textSize
     * @param paddingLeft
     * @param paddingRight
     * @param paddingTop
     * @param paddingBottom
     * @return
     */
    private TextView createTextView(String text, int textSize, int paddingLeft, int paddingRight, int paddingTop, int paddingBottom){
        TextView tvMaHP = new TextView(this);
        tvMaHP.setText(text);
        tvMaHP.setTextSize(textSize);
        tvMaHP.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        tvMaHP.setTextColor(Color.WHITE);
        return tvMaHP;
    }

    private LinearLayout createLinerLayout(){
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(1, LinearLayout.LayoutParams.MATCH_PARENT));

        View view = new View(this, null, R.style.Divider2);
        linearLayout.addView(view);
        return linearLayout;
    }
}
