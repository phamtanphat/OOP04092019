package phamtanphat.ptp.khoaphamtraining.oop04092019;

import android.util.Log;

import androidx.annotation.NonNull;

public class Giangvien extends Hocvien{

    private String diachi;
    private Integer value;
    private OnListenerValue onListenerValue;
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


    public Integer getValue(){
        return  value;
    }
    public void setOnListenerValue(OnListenerValue onListenerValue ){
        this.onListenerValue = onListenerValue;
    }
}
