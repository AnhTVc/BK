package analytic.vietanh.project.com.bk.POJO;

/**
 * Created by AnhTVc on 3/14/17.
 */

public final class CTDT_VIEN_NGOAI_NGU {
    final static String NAME_CLASS ="Viện Ngoại Ngữ";
    public static class CT_CU_NHAN_TIENG_ANH_KHOA_HOC_KY_THUAT_VA_CONG_NGHE{
        final static String NAME_SUBCLASS =  "Cử Nhân Tiếng Anh KHKT - CN";
        public static int getSoTC() {
            return 134;
        }

        public static String getTen() {
            return NAME_SUBCLASS;
        }
    }

    public static class CT_CU_NHAN_TIENG_ANH_CHUYEN_NGHIEP_QUOC_TE{
        final static String NAME_SUBCLASS = "Cử Nhân TA Quốc Tế (IPE)";
        public static int getSoTC() {
            return 131;
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
            if(nameSubClass.equals(CT_CU_NHAN_TIENG_ANH_KHOA_HOC_KY_THUAT_VA_CONG_NGHE.getTen()))
                return CT_CU_NHAN_TIENG_ANH_KHOA_HOC_KY_THUAT_VA_CONG_NGHE.getSoTC();
            else if(nameSubClass.equals(CT_CU_NHAN_TIENG_ANH_CHUYEN_NGHIEP_QUOC_TE.getTen()))
                return CT_CU_NHAN_TIENG_ANH_CHUYEN_NGHIEP_QUOC_TE.getSoTC();
            return -1;
        }else
            return -1;
    }
}
