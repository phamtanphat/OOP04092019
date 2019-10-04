package phamtanphat.ptp.khoaphamtraining.oop04092019;

import android.util.Log;

public class Hocvien {

    // 1 : Thuộc tính
    private String ten;
    String tuoi;

    //3 : Cấu trúc cho 1 đối tượng
//    public Hocvien(String ten , String tuoi){
//        this.ten = ten;
//        this.tuoi = tuoi;
//    }

    public void setTen(String ten){
//        "213213"
        if (ten.matches("[0-9]+")){
            return;
        }else{
           this.ten = ten;
        }
        Log.d("BBB","Cua hoc vien");
    }
    public String getTen(){
        return ten;
    }

    // 2 : Hành vi
    public void luatuoi(){
        int tuoi = Integer.parseInt(this.tuoi);
        if (tuoi < 18){
            Log.d("BBB","Con nít");
        }else{
            Log.d("BBB","Người lớn");
        }
    }

}
