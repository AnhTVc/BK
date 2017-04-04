package analytic.vietanh.project.com.bk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import analytic.vietanh.project.com.bk.POJO.Course;
import analytic.vietanh.project.com.bk.POJO.User;
import analytic.vietanh.project.com.bk.adapter.CourseAdapter;
import analytic.vietanh.project.com.bk.util.UtilMain;
import analytic.vietanh.project.com.bk.util.UtilMainImpl;

public class TryAgainActivity extends AppCompatActivity {
    Button btnAdd;
    Intent otherInter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_try_again);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        otherInter = new Intent(this, ListViewDSHocPhan.class);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(otherInter);
            }
        });

        UtilMain utilMain = new UtilMainImpl();
        User user = utilMain.loadUserProfileNew(getApplicationContext());
        ArrayList<Course> courses = user.getCourses();
        CourseAdapter courseAdapter = new CourseAdapter(this, courses);
        ListView listView = (ListView) findViewById(R.id.lvItemMonCaiThien);
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
