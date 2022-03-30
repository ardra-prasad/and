import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.lang.Math.pow
import kotlin.math.pow
  
class MainActivity : AppCompatActivity() {
  lateinit var btnCheck : Button
  lateinit var etNum : EditText
  
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
          
        // Binding the views
        btnCheck = findViewById(R.id.btnCheck)
        etNum = findViewById(R.id.etNum)
  
        btnCheck.setOnClickListener {
            val n = etNum.text.toString().length
            val num = etNum.text.toString().toInt()
            var temp = num
            var result = 0
  
            while (temp != 0){
                val remainder = temp % 10
  
                result += (remainder.toDouble().pow(n.toDouble())).toInt()
  
                temp /= 10
            }
            if (result == num)
                Toast.makeText(this,"Armstrong Number",Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this,"Not an Armstrong Number",Toast.LENGTH_SHORT).show()
        }
    }
}
