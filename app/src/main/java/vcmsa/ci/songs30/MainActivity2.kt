package vcmsa.ci.songs20

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        //declaring variables
        val details = findViewById<Button>(R.id.details)
        val ave_rate = findViewById<Button>(R.id.averate)
        val returnbutton = findViewById<Button>(R.id.returnbutton)

        //while (counter1 != 0)
        //rating[counter1] + rating[counter1]

        //prompt to return to the first page
        returnbutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}