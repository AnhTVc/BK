package analytic.vietanh.project.com.bk.util;

import android.content.Context;

import java.io.File;

import analytic.vietanh.project.com.bk.POJO.User;


/**
 * Created by VietAnh on 3/8/2017.
 */

public interface UtilMain {
    /**
     * File to String
     * @param path : string path to file
     * @return: data content file
     */
    String fileToString(String path);

    String fileToString(File file);

    /**
     * Kiem tra xem co giu lieu nguoi dung chua
     * @param context
     * @return
     */
    boolean fileConfigIsExist(Context context);

    User loadUserProfile(Context context);

    User loadUserProfileNew(Context context);

    /**
     * Here's an utility that rounds (instead of truncating) imagebk double to specified number of decimal places.
     * For example:
     * round(200.3456, 2); // returns 200.35
     * @param value
     * @param places
     * @return
     */
    double roundDouble(double value, int places);

    /**
     * Sắp xếp điểm của người dùng từ cao tới thấp
     * Tính toán theo điểm của người dùng
     * @param user: Object user
     * @return: Object user
     */
    User dockingUser(User user);

    /**
     * Save data to file overwite
     * @param file: File name
     * @param content: content file
     * @return: true and false
     */
    boolean stringToFile(File file, String content);

    boolean writeToFile(String data, Context context);
    /**
     * Save data to file
     * @param filePath: file path
     * @param content: content file
     * @return: true and false
     */
    boolean stringToFile(String filePath, String content);

    /**
     * Goi y cho nguoi dung
     * @param user
     * @param maxTC
     * @return
     */
    String suggest(User user, int maxTC);
}
