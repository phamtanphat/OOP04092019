package phamtanphat.ptp.khoaphamtraining.oop04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

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
        Hocvien nguyenvana = new Hocvien();
        nguyenvana.ten = "Nguyen Van A";
        nguyenvana.tuoi = "19 tuổi";

        Hocvien nguyenvanb = new Hocvien();
        nguyenvanb.ten = "Nguyen Van B";
        nguyenvanb.tuoi = "21 tuổi";
        Log.d("BBB",nguyenvana.ten);
    }
}
