package analytic.vietanh.project.com.bk.adapter;

import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import analytic.vietanh.project.com.bk.POJO.Course;
import analytic.vietanh.project.com.bk.R;

/**
 * Created by VietAnh on 4/6/2017.
 */

public class CourseTryAgainAdapter extends ArrayAdapter<Course> {
    final private static String TAG = "CourseTryAgainAdapter: ";
    View rootView = null;
    public CourseTryAgainAdapter(Context context, ArrayList<Course> users) {
        super(context, 0, users);
    }
    @Override
    public boolean isEnabled(int position)
    {
        return true;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Log.d(TAG, "danh sách các môn dự kiến cải thiện");
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
                final Dialog dialog = new Dialog(v.getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.dialog_xoa_chon_mon_cai_thien);
                TextView tv_dialog_ten_hoc_phan_try, tv_dialog_ma_hoc_phan_try;
                tv_dialog_ma_hoc_phan_try = (TextView) dialog.findViewById(R.id.tv_dialog_ma_hoc_phan_try);
                tv_dialog_ten_hoc_phan_try = (TextView) dialog.findViewById(R.id.tv_dialog_ten_hoc_phan_try);

                tv_dialog_ma_hoc_phan_try.setText(course.getMaHP());
                tv_dialog_ten_hoc_phan_try.setText(course.getTenHP());

                Button cancelBtnTry = (Button) dialog.findViewById(R.id.cancelBtnTry);
                Button deleteBtnTry = (Button) dialog.findViewById(R.id.deleteBtnTry);

                cancelBtnTry.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });

                deleteBtnTry.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Xoa mon du kien cai thien
                    }
                });
                dialog.show();
            }
        });

        return convertView;
    }
}

