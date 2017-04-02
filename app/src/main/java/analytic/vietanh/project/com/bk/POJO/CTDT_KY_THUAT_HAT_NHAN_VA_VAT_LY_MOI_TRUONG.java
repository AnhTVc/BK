package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by AnhTVc on 3/14/17.
 */

public final class CTDT_KY_THUAT_HAT_NHAN_VA_VAT_LY_MOI_TRUONG {
    final static String NAME_CLASS = "Viện Kỹ Thuật Hạt Nhân Và MT";
    public static class CT_CU_NHAN_KY_THUAT_HAT_NHAN{
        final static String NAME_SUBCLASS = "CN Kỹ Thuật Hạt Nhân và MT";
        public static int getSoTC() {
            return 134;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_HAT_NHAN_VA_VAT_LY_MOI_TRUONG{
        final static String NAME_SUBCLASS = "KS Kỹ Thuật Hạt Nhân và MT";
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
            if(nameSubClass.equals(CT_CU_NHAN_KY_THUAT_HAT_NHAN.getTen()))
                return CT_CU_NHAN_KY_THUAT_HAT_NHAN.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_HAT_NHAN_VA_VAT_LY_MOI_TRUONG.getTen()))
                return CT_KY_SU_HAT_NHAN_VA_VAT_LY_MOI_TRUONG.getSoTC();
            return -1;
        }else
            return -1;
    }
}
