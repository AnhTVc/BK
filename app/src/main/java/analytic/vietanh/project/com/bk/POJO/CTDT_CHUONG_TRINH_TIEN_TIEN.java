package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by AnhTVc on 3/11/17.
 * The hien chuong trinh dao tao tien tien
 */

public final class CTDT_CHUONG_TRINH_TIEN_TIEN {
    /**
     * Chuong trinh tien tien co dien tu
     */
    final static String NAME_CLASS = "Chương Trình Tiến Tiến";

    public static class CTTT_CO_DIEN_TU{
        private static String NAME_SUBCLASS = "Cơ Điện Tử";
        public static int getSoTC() {
            return 170;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CTTT_KY_THUAT_DIEN_DIEN_TU{
        private static String NAME_SUBCLASS = "Kỹ Thuật Điện Điện Tử";
        public static int getSoTC() {
            return 155;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CTTT_KHOA_HOC_VAT_LIEU {
        private static String NAME_SUBCLASS = "CKhoa Học Vật Liệu";
        public static int getSoTC() {
            return 158;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CTTT_KY_THUAT_Y_SINH{
        private static String NAME_SUBCLASS = "Kỹ Thuật Y Sinh";
        public static int getSoTC() {
            return 162;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static String getName(){
        return NAME_CLASS;
    }

    /**
     *
     * @param nameClass
     * @param nameSubClass
     * @return
     */
    public static int checkSoTC(String nameClass, String nameSubClass){
        if(nameClass.equals(NAME_CLASS)){
            if(nameSubClass.equals(CTTT_CO_DIEN_TU.getTen()))
                return CTTT_CO_DIEN_TU.getSoTC();
            else if(nameSubClass.equals(CTTT_KY_THUAT_DIEN_DIEN_TU.getTen()))
                return CTTT_KY_THUAT_DIEN_DIEN_TU.getSoTC();
            else if(nameSubClass.equals(CTTT_KHOA_HOC_VAT_LIEU.getTen()))
                return CTTT_KHOA_HOC_VAT_LIEU.getSoTC();
            else if(nameSubClass.equals(CTTT_KY_THUAT_Y_SINH.getTen()))
                return CTTT_KY_THUAT_Y_SINH.getSoTC();
            return -1;
        }else
            return -1;
    }
}
