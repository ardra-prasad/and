import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.text.isDigitsOnly
import kotlinx.android.synthetic.main.activity_main.*
import android.R.bool
import java.lang.Math.sqrt
  
  
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
  
        // when user clicks on check button.
        check_btn.setOnClickListener {
  
            // check if number_et.text is empty or not
            if (number_et.text.isNotEmpty()) {
  
                // check if et.text is an integer or not.
                if (number_et.text.isDigitsOnly()) {
                    val num = number_et.text.toString().toInt()
                      
                    // check if num is a prime number or not.
                    if (CheckPrime(num)) {
                        Toast.makeText(this, "Entered number is a Prime Number.", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "Entered number is a not a Prime Number.", Toast.LENGTH_SHORT).show()
                    }
                }
                // when number_et.text is not an integer value.
                else {
                    Toast.makeText(this, "please enter a valid number.", Toast.LENGTH_SHORT).show()
                }
            }
            // when number_et.text is empty.
            else {
                Toast.makeText(this, "please enter a number", Toast.LENGTH_SHORT).show()
            }
        }
    }
  
    // function to check is a number is prime or not.
    private fun CheckPrime(num: Int): Boolean {
        // Corner case
        if (num <= 1) return false
  
        // Check from 2 to square root of n
        for (i in 2..sqrt(num.toDouble()).toInt()) if (num % i == 0) return false
        return true
    }
  
}
