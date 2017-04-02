package analytic.vietanh.project.com.bk.util;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

import analytic.vietanh.project.com.bk.POJO.*;
import analytic.vietanh.project.com.bk.constant.Defind;


/**
 * Created by VietAnh on 3/5/2017.
 */

public class UtilMainImpl implements UtilMain {
    final static Logger logger = Logger.getLogger(UtilMainImpl.class.toString());
    /**
     * File to String
     * @param path : string path to file
     * @return: data content file
     */
    public String fileToString(String path){
        try{
            logger.info("Read file " + path);
            File file = new File(path);
            StringBuilder fileContents = new StringBuilder((int)file.length());
            Scanner scanner = new Scanner(file);
            String lineSeparator = System.getProperty("line.separator");
            while(scanner.hasNextLine()) {
                fileContents.append(scanner.nextLine() + lineSeparator);
            }
            return fileContents.toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public String fileToString(File file){
        try{
            StringBuilder fileContents = new StringBuilder((int)file.length());
            Scanner scanner = new Scanner(file);
            String lineSeparator = System.getProperty("line.separator");
            while(scanner.hasNextLine()) {
                fileContents.append(scanner.nextLine() + lineSeparator);
            }
            return fileContents.toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public  boolean fileConfigIsExist(Context context){
        try {
            File file = new File(context.getFilesDir(), Defind.FILE_CONFIG_NAME);
            Gson gson = new Gson();
            if(gson.fromJson(fileToString(file), User.class) != null)
                return true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public User loadUserProfile(Context context){
        if(!fileConfigIsExist(context)){
            File file = new File(context.getFilesDir(), Defind.FILE_CONFIG_NAME);
            Gson gson = new Gson();
            User user = gson.fromJson(fileToString(file), User.class);
            return user;
        }
        return null;
    }

    public double roundDouble(double value, int places){
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public User dockingUser(User user){
        Course course = null;
        ArrayList<Course> courses = user.getCourses();
        for(int i = 0; i< courses.size(); i++)
            for(int j = 0; j < courses.size(); j++){

                if((courses.get(i).getDiemQT() * 0.3 + courses.get(i).getDiemThi() * 0.7)
                    < (courses.get(j).getDiemQT() * 0.3 + courses.get(j).getDiemThi() * 0.7)){
                    course = courses.get(i);
                    courses.set(i, courses.get(j));
                    courses.set(j, course);
                }
            }
        return user;
    }

    /**
     * Implement stringToFile
     * @param file: File name
     * @param content: content file
     * @return: true and false
     */
    public boolean stringToFile(File file, String content){
        try {
            FileWriter fw = new FileWriter(file);
            fw.write(content);
            fw.close();

            return true;
        } catch (IOException iox) {
            //do stuff with exception
            iox.printStackTrace();
        }
        return false;
    }

    public boolean stringToFile(String filePath, String content){
        try {
            File newTextFile = new File(filePath);
            FileWriter fw = new FileWriter(newTextFile);
            fw.write(content);
            fw.close();

            return true;
        } catch (IOException iox) {
            //do stuff with exception
            iox.printStackTrace();
        }
        return false;
    }

    public String suggest(User user, int maxTC){
        maxTC = maxTC - 18; // tru 18 chi dai cuong

        int countTC = 0;
        double sum = 0;
        for(Course course: user.getCourses()){
            sum += (course.getDiemQT() * 0.3 + course.getDiemThi() * 0.7) * course.getTC() * 0.4;
            countTC += course.getTC();
        }

        double scoresCurrent        = roundDouble(sum / countTC, 2);
        double scoresTaget;
        if(scoresCurrent < 2.5 ){
            // muc tieu bang kha
            scoresTaget = 2.5;


        }else if(scoresCurrent < 3.2){
            // muc tieu bang gioi
            scoresTaget = 3.2;
        }else{
            // dang duoc bang gioi, can bang xuat xac < 3,6
            scoresTaget = 3.6;
        }
        double temp = roundDouble((scoresTaget * maxTC - scoresCurrent * countTC) / (maxTC - countTC), 2);
        double scoresOne = 0.0, scoresTwo = 0.0;
        if(temp > 4){
            // khong kha quan => hoc lai
            /**
             * x + y = countTC
             * scoresCurrent * x + 3.6 * y  = scoresTaget * maxTC - 3.6 * (maxTC - countTC);
             * Tim y?
             * scoresCurrent * (countTC - y) + 3.6 * y  = scoresTaget * maxTC - 3.6 * (scoresTaget - scoresCurrent);
             */
            int y = (int) ((scoresTaget * maxTC - (3.6 * (maxTC - countTC)) - (scoresCurrent * countTC)) / (3.6 - scoresCurrent));
            if(scoresCurrent < 2.5){
                return "Bạn cần học cải thiện " + y + " tín chỉ A, và " + (maxTC - countTC) + " các tín chỉ sắp học đạt A thì được bằng khá!";
            }else if(scoresCurrent < 3.2){
                return "Bạn cần học cải thiện " + y + " tín chỉ A, và " + (maxTC - countTC) + " các tín chỉ sắp học đạt A thì được bằng giỏi!";
            }else if(scoresCurrent < 3.6){
                return "Bạn cần học cải thiện " + y + " tín chỉ A, và " + (maxTC - countTC) + " các tín chỉ sắp học đạt A thì được bằng xuất sắc!";
            }else if(scoresCurrent > 3.6){
                return "Bạn cứ thế mà ra trường nhận bằng xuất sắc thôi!";
            }else {
                return "Có lẽ bạn nên học lại từ đầu thôi!";
            }

        }else if(temp > 3.0){
            // can B va A
            // temp *  (maxTC - countTC) = imagebk * 3.0 + b * 4; imagebk, b < (maxTC - countTC); imagebk,b > 2
            scoresOne = 3.0;
        }else if(temp > 2.0){
            scoresOne = 2.0;
        }else {
            scoresOne = 1.0;
        }

        /**
         * imagebk * scoresOne + b * scoresTwo = (maxTC - countTC) * temp
         * imagebk + b = (maxTC - countTC)
         * => b = (maxTC - countTC) * (temp - scoresOne)
         * => imagebk = (maxTC - countTC) - b;
         */
        int b = (int) ((maxTC - countTC) * (temp - scoresOne));
        int a = (maxTC - countTC) - b;
        if(scoresOne == 2.0){
            // 2.0, 3.0
            return "Bạn cần " + a + " điểm C và " + b + " điểm B để được bằng khá!";
        }else if(scoresOne == 3.0){
            return "Bạn cần " + a + " điểm B và " + b + " điểm A để được bằng giỏi!";
        }else{
            return "Bạn trường với bằng trung bình hoặc bằng xuất sắc";
        }
    }

    public boolean writeToFile(String data,Context context){
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput(Defind.FILE_CONFIG_NAME, Context.MODE_PRIVATE));
            outputStreamWriter.write(data);
            outputStreamWriter.close();

            return true;
        }
        catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }

        return false;
    }

    public User loadUserProfileNew(Context context){
        String ret = "";

        try {
            InputStream inputStream = context.openFileInput(Defind.FILE_CONFIG_NAME);

            if ( inputStream != null ) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString = "";
                StringBuilder stringBuilder = new StringBuilder();

                while ( (receiveString = bufferedReader.readLine()) != null ) {
                    stringBuilder.append(receiveString);
                }

                inputStream.close();
                ret = stringBuilder.toString();
            }

            User user = new User();
            Gson gson = new Gson();

            user = gson.fromJson(ret, User.class);
            return user;
        }
        catch (FileNotFoundException e) {
            Log.e("login activity", "File not found: " + e.toString());
        } catch (IOException e) {
            Log.e("login activity", "Can not read file: " + e.toString());
        }

        return null;
    }
}
