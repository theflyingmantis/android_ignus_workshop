package andapp.ignus.org.androidignusworkshop

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This is where the code of logic will go!

        submit_android_workshop_button.setOnClickListener {
            val userName = name_android_workshop.text

            val message = "Hello "+ userName.toString()

            Toast.makeText(applicationContext,message,Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("userNameIdentifier", userName.toString())
            startActivity(intent)
        }

    }
}
