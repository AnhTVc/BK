package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by AnhTVc on 3/14/17.
 */

public final class CTDT_VIEN_CN_SINH_HOC_VA_THUC_PHAM {
    final static String NAME_CLASS = "Viện Sinh Học - Thực Phẩm";

    public static class CT_CU_NHAN_KY_THUAT_SINH_HOC{
        final static String NAME_SUBCLASS = "CN Kỹ Thuật Sinh Học";
        public static int getSoTC() {
            return 134;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_KY_THUAT_SINH_HOC{
        final static String NAME_SUBCLASS = "KS Sinh Học";
        public static int getSoTC() {
            return 162;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_CU_NHAN_KY_THUAT_THUC_PHAM{
        final static String NAME_SUBCLASS = "CN Kỹ Thuật Thực Phẩm";
        public static int getSoTC() {
            return 134;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_KY_THUAT_THUC_PHAM{
        final static String NAME_SUBCLASS = "KS Thực Phẩm";
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
    public static int checkSoTC(String nameClass, String nameSubClass){
        if(nameClass.equals(NAME_CLASS)){
            if(nameSubClass.equals(CT_CU_NHAN_KY_THUAT_SINH_HOC.getTen()))
                return CT_CU_NHAN_KY_THUAT_SINH_HOC.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_KY_THUAT_SINH_HOC.getTen()))
                return CT_KY_SU_KY_THUAT_SINH_HOC.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_KY_THUAT_THUC_PHAM.getTen()))
                return CT_CU_NHAN_KY_THUAT_THUC_PHAM.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_KY_THUAT_THUC_PHAM.getTen()))
                return CT_KY_SU_KY_THUAT_THUC_PHAM.getSoTC();
            return -1;
        }else
            return -1;
    }
}
