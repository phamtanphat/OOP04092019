package phamtanphat.ptp.khoaphamtraining.oop04092019;

import android.util.Log;

import androidx.annotation.NonNull;

public class Giangvien extends Hocvien{


    // Alt + insert : Gợi ý chức năng


    // Ghi đè : sẽ có annotation @Override
    // Khác nhau về thân hàm
    @Override
    public void setTen(String ten) {
        Log.d("BBB","Giang vien");
    }
}
