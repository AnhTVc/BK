package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by AnhTVc on 3/11/17.
 */

public final class CTDT_VIEN_CO_KHI_DONG_LUC {
    final static String NAME_CLASS ="Viện Cơ Khí Động Lực";

    public static class CT_CU_NHAN_KY_THUAT_CO_KHI_DONG_LUC{
        final static String NAME_SUBCLASS ="CN Kỹ Thuật Cơ Khí Động Lực";
        public static int getSoTC() {
            return 134;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_KY_THUAT_CO_KHI_DONG_LUC{
        final static String NAME_SUBCLASS = "KS Cơ Khí Động Lực";
        public static int getSoTC() {
            return 164;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_CU_NHAN_KY_THUAT_TAU_THUY{
        final static String NAME_SUBCLASS =  "CN Kỹ Thuật Tàu Thủy";
        public static int getSoTC() {
            return 133;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_KY_THUAT_TAU_THUY{
        final static String NAME_SUBCLASS = "KS Tàu Thủy";
        public static int getSoTC() {
            return 163;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }
    public static class CT_CU_NHAN_KY_THUAT_HANG_KHONG{
        final static String NAME_SUBCLASS = "CN Kỹ Thuật Hàng Không";
        public static int getSoTC() {
            return 134;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }
    public static class CT_KY_SU_KY_THUAT_HANG_KHONG{
        final static String NAME_SUBCLASS = "KS Hàng Không";
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
            if(nameSubClass.equals(CT_CU_NHAN_KY_THUAT_CO_KHI_DONG_LUC.getTen()))
                return CT_CU_NHAN_KY_THUAT_CO_KHI_DONG_LUC.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_KY_THUAT_CO_KHI_DONG_LUC.getTen()))
                return CT_KY_SU_KY_THUAT_CO_KHI_DONG_LUC.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_KY_THUAT_TAU_THUY.getTen()))
                return CT_CU_NHAN_KY_THUAT_TAU_THUY.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_KY_THUAT_TAU_THUY.getTen()))
                return CT_KY_SU_KY_THUAT_TAU_THUY.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_KY_THUAT_HANG_KHONG.getTen()))
                return CT_CU_NHAN_KY_THUAT_HANG_KHONG.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_KY_THUAT_HANG_KHONG.getTen()))
                return CT_KY_SU_KY_THUAT_HANG_KHONG.getSoTC();
            return -1;
        }else
            return -1;
    }
}
