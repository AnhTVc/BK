package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by AnhTVc on 3/14/17.
 */

public final class CTDT_VIEN_KY_THUAT_HOA_HOC {
    final static String NAME_CLASS = "Viện Kĩ Thuật Hóa Học";
    public static class CT_CU_NHAN_KY_THUAT_HOA_HOC{
        final static String NAME_SUBCLASS = "CN Kỹ Thuật Hóa Học";
        public static int getSoTC() {
            return 134;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_KY_THUAT_HOA_HOC{
        final static String NAME_SUBCLASS =  "KS Kỹ Thuật Hóa Học";
        public static int getSoTC() {
            return 163;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_CU_NHAN_HOA_HOC{
        final static String NAME_SUBCLASS ="CN Kỹ Thuật Hóa Học";
        public static int getSoTC() {
            return 134;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }
    public static class CT_CU_NHAN_KY_THUAT_IN_VA_TRUYEN_THONG{
        final static String NAME_SUBCLASS =  "CN Kỹ Thuật In và Truyền Thông";

        public static int getSoTC() {
            return 131;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_KY_THUAT_IN_VA_TRUYEN_THONG{
        final static String NAME_SUBCLASS = "KS In và Truyền Thông";

        public static int getSoTC() {
            return 160;
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
            if(nameSubClass.equals(CT_CU_NHAN_KY_THUAT_HOA_HOC.getTen()))
                return CT_CU_NHAN_KY_THUAT_HOA_HOC.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_KY_THUAT_HOA_HOC.getTen()))
                return CT_KY_SU_KY_THUAT_HOA_HOC.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_HOA_HOC.getTen()))
                return CT_CU_NHAN_HOA_HOC.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_KY_THUAT_IN_VA_TRUYEN_THONG.getTen()))
                return CT_CU_NHAN_KY_THUAT_IN_VA_TRUYEN_THONG.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_KY_THUAT_IN_VA_TRUYEN_THONG.getTen()))
                return CT_KY_SU_KY_THUAT_IN_VA_TRUYEN_THONG.getSoTC();
            return -1;
        }else
            return -1;
    }
}
