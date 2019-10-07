package phamtanphat.ptp.khoaphamtraining.oop04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    Integer value = 0;
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
//        Giangvien phat = new Giangvien();
//        phat.luatuoi();

        // Overload : Nap chong
        // Override : ghi de


        // Dac diem : Giup cho phuong thuc thực được nhiều chức năng
        // Nhược điểm : Quá dài

        // Pham vi tạo ra: các phương thức nạp chồng sẽ ở cùng 1 nơi

        // Các phương thức nạp chồng sẽ giống nhau về tên , khác nhau
//        về tham số truyền vào

//        tinh(10 , 5);
//        Giangvien giangvien = new Giangvien("phat","20");
//        giangvien.setTen("Phat");


        // 3 button : cong tru  reset

        // 1 viet ra 1 phuong thuc : tra ve gia tri ma 3 button gui len


    }
    // method : tinh
    // dien tich tam giac : a * h / 2
    // chu vi tam giac : a + b + c
//    private void tinh(int canhday , int chieucao){
//        int ketqua = canhday * chieucao / 2;
//        Toast.makeText(this, "Diện tích tam giác " +ketqua, Toast.LENGTH_SHORT).show();
//    }
//    private void tinh(int canhday1 , int canhday2 , int canhday3){
//        int ketqua = canhday1 + canhday2 + canhday3;
//        Toast.makeText(this, "Chu vi tam giác " +ketqua , Toast.LENGTH_SHORT).show();
//    }
}
