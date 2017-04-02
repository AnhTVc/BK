package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by AnhTVc on 3/14/17.
 */

public final class CTDT_VIEN_DET_MAY_VA_DA_DAY {

    final static String NAME_CLASS =  "Viện Dệt May Thời Trang và Da Giày";
    public static class CT_CU_NHAN_KY_THUAT_DET{
        final static String NAME_SUBCLASS = "CN Kỹ Thuật Dệt";
        public static int getSoTC() {
            return 133;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_KY_THUAT_DET{
        final static String NAME_SUBCLASS ="KS Dệt";
        public static int getSoTC() {
            return 153;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }
    public static class CT_CU_NHAN_KY_THUAT_MAY{
        final static String NAME_SUBCLASS ="CN Kỹ Thuật May";
        public static int getSoTC() {
            return 133;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_CN_MAY{
        final static String NAME_SUBCLASS ="KS Công Nghệ May";
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
            if(nameSubClass.equals(CT_CU_NHAN_KY_THUAT_DET.getTen()))
                return CT_CU_NHAN_KY_THUAT_DET.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_KY_THUAT_DET.getTen()))
                return CT_KY_SU_KY_THUAT_DET.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_KY_THUAT_MAY.getTen()))
                return CT_CU_NHAN_KY_THUAT_MAY.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_CN_MAY.getTen()))
                return CT_KY_SU_CN_MAY.getSoTC();
            return -1;
        }else
            return -1;
    }
}
