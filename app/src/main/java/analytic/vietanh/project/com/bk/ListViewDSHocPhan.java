package analytic.vietanh.project.com.bk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import analytic.vietanh.project.com.bk.POJO.Course;
import analytic.vietanh.project.com.bk.POJO.User;
import analytic.vietanh.project.com.bk.adapter.CourseAdapter;
import analytic.vietanh.project.com.bk.util.UtilMain;
import analytic.vietanh.project.com.bk.util.UtilMainImpl;

public class ListViewDSHocPhan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_dshoc_phan);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Hiện thị tất cả các môn học hiện tại
        // TODO nên sắp xếp từ thấp đến cao (cải thiện môn học có điểm thấp)
        UtilMain utilMain = new UtilMainImpl();
        User user = utilMain.loadUserProfileNew(getApplicationContext());
        final ArrayList<Course> courses = user.getCourses();
        final CourseAdapter courseAdapter = new CourseAdapter(this, courses);
        final ListView listView = (ListView) findViewById(R.id.lvItem);
        listView.setAdapter(courseAdapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //Write your logic here
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
