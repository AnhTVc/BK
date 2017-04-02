package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by AnhTVc on 3/11/17.
 */

public final class CTDT_KY_SU_TAI_NANG {
    final static String NAME_CLASS = "Chương Trình Kỹ Sư Tài Năng";

    public static class KSTN_CONG_NGHE_THONG_TIN{
        final static String NAME_SUBCLASS = "KS Công Nghệ Thông Tin";
        public static int getSoTC() {
            return 158;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class KSTN_DIEN_TU_VIEN_THONG {
        final static String NAME_SUBCLASS = "KS Điện Tử Viễn Thông";
        public static int getSoTC() {
            return 162;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class KSTN_DIEU_KHIEN_TU_DONG {
        final static String NAME_SUBCLASS = "KS Điều Kiển Tự Động";
        public static int getSoTC() {
            return 162;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class KSTN_CO_DIEN_TU{
        final static String NAME_SUBCLASS = "KS Cơ Điện ";
        public static int getSoTC() {
            return 164;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class KSTN_TOAN_TIN {
        final static String NAME_SUBCLASS = "KS Toán Tin";
        public static int getSoTC() {
            return 161;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class KSTN_VAT_LY_KY_THUAT{
        final static String NAME_SUBCLASS = "KS Vật Lý Kỹ Thuật";
        public static int getSoTC() {
            return 161;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class KSTN_CONG_NGHE_HUU_CO_HOA_DAU{
        final static String NAME_SUBCLASS = "KS Công Nghệ Hữu Cơ Hóa Dầu";
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
            if(nameSubClass.equals(KSTN_CONG_NGHE_THONG_TIN.getTen()))
                return KSTN_CONG_NGHE_THONG_TIN.getSoTC();
            else if(nameSubClass.equals(KSTN_DIEN_TU_VIEN_THONG.getTen()))
                return KSTN_DIEN_TU_VIEN_THONG.getSoTC();
            else if(nameSubClass.equals(KSTN_CO_DIEN_TU.getTen()))
                return KSTN_CO_DIEN_TU.getSoTC();
            else if(nameSubClass.equals(KSTN_TOAN_TIN.getTen()))
                return KSTN_TOAN_TIN.getSoTC();
            else if(nameSubClass.equals(KSTN_VAT_LY_KY_THUAT.getTen()))
                return KSTN_VAT_LY_KY_THUAT.getSoTC();
            else if(nameSubClass.equals(KSTN_CONG_NGHE_HUU_CO_HOA_DAU.getTen()))
                return KSTN_CONG_NGHE_HUU_CO_HOA_DAU.getSoTC();
            return -1;
        }else
            return -1;
    }

}