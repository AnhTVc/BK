package analytic.vietanh.project.com.bk.adapter;

import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import analytic.vietanh.project.com.bk.POJO.Course;
import analytic.vietanh.project.com.bk.R;

/**
 * Created by VietAnh on 4/3/2017.
 */

public class CourseAdapter extends ArrayAdapter<Course> {
    View rootView = null;
    public CourseAdapter(Context context, ArrayList<Course> users) {
        super(context, 0, users);
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
                Dialog dialog = new Dialog(v.getContext());
                dialog.setContentView(R.layout.dialog_chon_mon_cai_thien);

                dialog.show();
            }
        });

        return convertView;
    }
}

