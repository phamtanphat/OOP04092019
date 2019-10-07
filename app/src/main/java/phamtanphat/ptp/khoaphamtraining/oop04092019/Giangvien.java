package phamtanphat.ptp.khoaphamtraining.oop04092019;

import android.util.Log;

import androidx.annotation.NonNull;

public class Giangvien extends Hocvien implements OnListenerValue{

    private String diachi;
    private Integer value;
    // Alt + insert : Gợi ý chức năng

    // Ghi đè : sẽ có annotation @Override
    // Khác nhau về thân hàm
    public Giangvien(String ten , String tuoi){
        super(ten,tuoi);

    }
    public Giangvien(String ten , String tuoi, String diachi ){
        super(ten,tuoi);
        this.diachi = diachi;
    }

    @Override
    public void setTen(String ten) {
        super.setTen(ten);
        Log.d("BBB","Giang vien");
    }

    public void setInteface(){

    }

    public Integer getValue(){
        return  value;
    }


    @Override
    public void onListenInteger(Integer integer) {
        this.value = integer;
    }

    @Override
    public void onListenString(String string) {

    }
}
