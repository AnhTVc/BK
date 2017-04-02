package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by AnhTVc on 3/14/17.
 */

public final class CTDT_VIEN_MOI_TRUONG {
    final static String NAME_CLASS ="Viện Môi Trường";

    public static class CT_CU_NHAN_KY_THUAT_MOI_TRUONG{
        final static String NAME_SUBCLASS ="Cử Nhân Kỹ Thuật Môi Trường";
        public static int getSoTC() {
            return 132;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_KY_SU_KY_THUAT_MOI_TRUONG{
        final static String NAME_SUBCLASS =  "Kỹ Sư Môi Trường";
        public static int getSoTC() {
            return 166;
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
            if(nameSubClass.equals(CT_CU_NHAN_KY_THUAT_MOI_TRUONG.getTen()))
                return CT_CU_NHAN_KY_THUAT_MOI_TRUONG.getSoTC();
            else if(nameSubClass.equals(CT_KY_SU_KY_THUAT_MOI_TRUONG.getTen()))
                return CT_KY_SU_KY_THUAT_MOI_TRUONG.getSoTC();
            return -1;
        }else
            return -1;
    }
}
