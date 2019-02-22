package andapp.ignus.org.androidignusworkshop

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle :Bundle ?=intent.extras
        val message = bundle!!.getString("userNameIdentifier")
        val secondActivityMessage = "Second Activity welcomes "+message
        Toast.makeText(this, secondActivityMessage, Toast.LENGTH_SHORT).show()
    }
}
