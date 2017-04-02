package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by AnhTVc on 3/14/17.
 */

public final class CTDT_VIEN_KHOA_HOC_KY_THUAT_VAT_LIEU {
    final static String NAME_CLASS = "Viện Khoa Học Vật Liệu";
    public static class CT_CU_NHAN_KY_THUAT_VAT_LIEU{
        final static String NAME_SUBCLASS ="CN Kỹ Thuật Vật Liệu";
        public static int getSoTC() {
            return 133;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }
    public static class CT_KY_SU_KY_THUAT_VAT_LIEU{
        final static String NAME_SUBCLASS = "Kỹ Sư Vật Liệu";
        public static int getSoTC() {
            return 164;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_CU_NHAN_KY_THUAT_LUYEN_KIM{
        final static String NAME_SUBCLASS = "Cử Nhân Kỹ Thuật Luyện Kim";
        public static int getSoTC() {
            return 134;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }
    public static class CT_KY_SU_KY_THUAT_LUYEN_KIM{
        final static String NAME_SUBCLASS = "Kỹ Sư Luyện Kim";
        public static int getSoTC() {
            return 164;
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
            if(nameSubClass.equals(CT_CU_NHAN_KY_THUAT_VAT_LIEU.getTen()))
                return CT_CU_NHAN_KY_THUAT_VAT_LIEU.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_KY_THUAT_VAT_LIEU.getTen()))
                return CT_KY_SU_KY_THUAT_VAT_LIEU.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_KY_THUAT_LUYEN_KIM.getTen()))
                return CT_CU_NHAN_KY_THUAT_LUYEN_KIM.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_KY_THUAT_LUYEN_KIM.getTen()))
                return CT_KY_SU_KY_THUAT_LUYEN_KIM.getSoTC();
            return -1;
        }else
            return -1;
    }
}
