package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by AnhTVc on 3/11/17.
 */

public final class CTDT_VIEN_CO_KHI {
    final static String NAME_CLASS = "Viện Cơ Khí";

    public static class CT_CU_NHAN_KY_THUAT_CO_KHI_CHE_TAO_MAY{
        final static String NAME_SUBCLASS = "CN Kỹ Thuật Cơ Khí Chế Tạo Máy";
        public static int getSoTC() {
            return 134;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_KY_THUAT_CO_KHI_CHE_TAO_MAY{
        final static String NAME_SUBCLASS = "KS Cơ Khí Chế Tạo Máy";
        public static int getSoTC() {
            return 164;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_CU_NHAN_CO_DIEN_TU{
        final static String NAME_SUBCLASS = "CN Kỹ Thuật Cơ Điện Tử";
        public static int getSoTC() {
            return 133;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_CO_DIEN_TU{
        final static String NAME_SUBCLASS = "KS Cơ Điện Tử";
        public static int getSoTC() {
            return 162;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_CU_NHAN_CO_KY_THUAT{
        final static String NAME_SUBCLASS = "CN Cơ Kỹ Thuật";
        public static int getSoTC() {
            return 132;
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
            if(nameSubClass.equals(CT_CU_NHAN_KY_THUAT_CO_KHI_CHE_TAO_MAY.getTen()))
                return CT_CU_NHAN_KY_THUAT_CO_KHI_CHE_TAO_MAY.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_KY_THUAT_CO_KHI_CHE_TAO_MAY.getTen()))
                return CT_KY_SU_KY_THUAT_CO_KHI_CHE_TAO_MAY.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_CO_DIEN_TU.getTen()))
                return CT_CU_NHAN_CO_DIEN_TU.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_CO_DIEN_TU.getTen()))
                return CT_KY_SU_CO_DIEN_TU.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_CO_KY_THUAT.getTen()))
                return CT_CU_NHAN_CO_KY_THUAT.getSoTC();
            return -1;
        }else
            return -1;
    }
}
