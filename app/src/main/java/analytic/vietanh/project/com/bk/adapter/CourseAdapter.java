package analytic.vietanh.project.com.bk.adapter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;

import analytic.vietanh.project.com.bk.LoginActivity;
import analytic.vietanh.project.com.bk.POJO.Course;
import analytic.vietanh.project.com.bk.POJO.User;
import analytic.vietanh.project.com.bk.R;
import analytic.vietanh.project.com.bk.util.UtilMain;
import analytic.vietanh.project.com.bk.util.UtilMainImpl;

/**
 * Created by VietAnh on 4/3/2017.
 */

public class CourseAdapter extends ArrayAdapter<Course> {
    View rootView = null;
    Context context;
    final static  String TAG = "CourseAdapter: ";
    public CourseAdapter(Context context, ArrayList<Course> users) {
        super(context, 0, users);
        this.context = context;
    }
    @Override
    public boolean isEnabled(int position)
    {
        return true;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        final Course course = getItem(position);
        final Course courseTry = course;
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_hoc_phan, parent, false);
        }
        rootView = convertView;
        // Lookup view for data population
        TextView tvTenHocPhan, tvSoTinChi, tvDiemChu;
        tvTenHocPhan = (TextView) convertView.findViewById(R.id.tvTenHocPhan);
        tvSoTinChi   = (TextView) convertView.findViewById(R.id.tvSoTinChi);
        tvDiemChu    = (TextView) convertView.findViewById(R.id.tvDiemChu);

        // Return the completed view to render on screen
        tvTenHocPhan.setText(course.getTenHP());
        tvSoTinChi.setText(String.valueOf(course.getTC()));
        tvDiemChu.setText(course.getDiemChu());

        RelativeLayout relativeLayoutItemHocPhan = (RelativeLayout) convertView.findViewById(R.id.relativeLayoutItemHocPhan);
        relativeLayoutItemHocPhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = course.getTenHP();
                Log.d("**********", string);

                // custom dialog
                final Dialog dialog = new Dialog(v.getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.dialog_chon_mon_cai_thien);

                TextView tv_dialog_ten_hoc_phan, tv_dialog_ma_hoc_phan;
                tv_dialog_ma_hoc_phan       = (TextView) dialog.findViewById(R.id.tv_dialog_ma_hoc_phan);
                tv_dialog_ten_hoc_phan      = (TextView) dialog.findViewById(R.id.tv_dialog_ten_hoc_phan);

                tv_dialog_ten_hoc_phan.setText(course.getTenHP());
                tv_dialog_ma_hoc_phan.setText(course.getMaHP());

                // Click button and radio group
                Button chooseBtn, cancelBtn;
                chooseBtn = (Button) dialog.findViewById(R.id.chooseBtn);
                cancelBtn = (Button) dialog.findViewById(R.id.cancelBtn);

                final RadioGroup radioGroup = (RadioGroup) dialog.findViewById(R.id.radioGroupA);

                cancelBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                chooseBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int selectedId = radioGroup.getCheckedRadioButtonId();
                        RadioButton temp = (RadioButton) dialog.findViewById(selectedId);
                        String strRadioBtn = (String) temp.getText();

                        switch (strRadioBtn){
                            case ("A/A+"):
                                courseTry.setDiemDuKienCaiThien(4);
                                break;
                            case ("B+"):
                                courseTry.setDiemDuKienCaiThien((float) 3.5);
                                break;
                            case ("B"):
                                courseTry.setDiemDuKienCaiThien((float) 3);
                                break;
                            case ("C+"):
                                courseTry.setDiemDuKienCaiThien((float) 2.5);
                                break;
                            case ("C"):
                                courseTry.setDiemDuKienCaiThien((float) 2);
                                break;
                            case ("D+"):
                                courseTry.setDiemDuKienCaiThien((float) 1.5);
                                break;
                            case ("D"):
                                courseTry.setDiemDuKienCaiThien((float) 1);
                                break;
                            case ("F"):
                                courseTry.setDiemDuKienCaiThien((float) 3.5);
                                break;
                            default:
                                break;
                        }


                        User user = LoginActivity.USER_LOGIN;
                        ArrayList<Course> coursesTry = user.getCoursesTry();
                        if(coursesTry == null){
                            coursesTry = new ArrayList<Course>();
                        }
                        coursesTry.add(courseTry);
                        // save
                        Log.d(TAG, "Thêm môn học dự kiến cải thiện");
                        user.setCoursesTry(coursesTry);
                        ((Activity)context).finish();
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });

        return convertView;
    }
}

