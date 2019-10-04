package phamtanphat.ptp.khoaphamtraining.oop04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    Button btna;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 : Định nghĩa
        // class : Tập thể , object : cá thể
        //2 : Tạo sao phải sinh ra class : Tối ưu dữ liệu
        //3 : Cách tạo ra class
        // Mỗi đối tượng sẽ có địa chỉ nhà khác nhau
        // Nếu khi so sánh 2 đối tương thì nó chỉ so sánh 2 địa chỉ nhà
        // Nếu như sử dụng toán tử = thì sẽ gán địa chỉ ở cùng với nhau
//        Hocvien nguyenvana = new Hocvien("Nguyen Van A","19");
//        Log.d("BBB",nguyenvana.getTen());

//        Hocvien nguyenvanb = new Hocvien("Nguyen Van B","21");
//
//        nguyenvana.luatuoi();
//        nguyenvanb.luatuoi();

        // 2 : Tinh thua ke : extend , implements
        // tai sao su dung ke thua
        // Dua con co kieu du giong cha
        Giangvien phat = new Giangvien();
        phat.luatuoi();

    }
}
