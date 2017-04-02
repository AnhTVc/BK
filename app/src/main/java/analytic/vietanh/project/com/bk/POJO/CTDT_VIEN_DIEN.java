package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by AnhTVc on 3/14/17.
 */

public final class CTDT_VIEN_DIEN {
    final static String NAME_CLASS = "Viện Điện";

    public static class CT_CU_NHAN_KY_THUAT_DIEN{
        final static String NAME_SUBCLASS = "Chương Trình Cử Nhân Kỹ Thuật Điện";
        public static int getSoTC() {
            return 133;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }
    public static class CT_KY_SU_KY_THUAT_DIEN{
        final static String NAME_SUBCLASS = "Chương Trình Kỹ Sư Kỹ Thuật Điện";
        public static int getSoTC() {
            return 161;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_CU_NHAN_KY_THUAT_DIEU_KHIEN_VA_TU_DONG_HOA{
        final static String NAME_SUBCLASS = "CN Điều Khiển Và Tự Động Hóa";
        public static int getSoTC() {
            return 134;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_KY_THUAT_DIEU_KHIEN_VA_TU_DONG_HOA{
        final static String NAME_SUBCLASS = "KS Điều Khiển-Tự Động Hóa";
        public static int getSoTC() {
            return 162;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_CU_NHAN_KY_THUAT_DIEN_TU_VIEN_THONG{
        final static String NAME_SUBCLASS = "CN Điện Tử Viễn Thông";
        public static int getSoTC() {
            return 134;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }
    public static class CT_KY_SU_DIEN_TU_VIEN_THONG{
        final static String NAME_SUBCLASS = "KS Điện Tử Viễn Thông";
        public static int getSoTC() {
            return 163;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }
    public static String getName(){
        return NAME_CLASS;
    }
    public static int checkSoTC(String nameClass, String nameSubClass){
        if(nameClass.equals(NAME_CLASS)){
            if(nameSubClass.equals(CT_CU_NHAN_KY_THUAT_DIEN.getTen()))
                return CT_CU_NHAN_KY_THUAT_DIEN.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_KY_THUAT_DIEN.getTen()))
                return CT_KY_SU_KY_THUAT_DIEN.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_KY_THUAT_DIEU_KHIEN_VA_TU_DONG_HOA.getTen()))
                return CT_CU_NHAN_KY_THUAT_DIEU_KHIEN_VA_TU_DONG_HOA.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_KY_THUAT_DIEU_KHIEN_VA_TU_DONG_HOA.getTen()))
                return CT_KY_SU_KY_THUAT_DIEU_KHIEN_VA_TU_DONG_HOA.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_KY_THUAT_DIEN_TU_VIEN_THONG.getTen()))
                return CT_CU_NHAN_KY_THUAT_DIEN_TU_VIEN_THONG.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_DIEN_TU_VIEN_THONG.getTen()))
                return CT_KY_SU_DIEN_TU_VIEN_THONG.getSoTC();
            return -1;
        }else
            return -1;
    }

}
