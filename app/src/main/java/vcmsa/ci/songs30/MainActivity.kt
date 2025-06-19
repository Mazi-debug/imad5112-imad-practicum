package vcmsa.ci.songs20

import android.content.Intent
import android.os.Bundle
//imports for objects from designer
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //declaring variables and calling over objects from designer
        val playlist = findViewById<Button>(R.id.toplaylist)
        val page = findViewById<Button>(R.id.tonextpage)
        val exitbutton = findViewById<Button>(R.id.toexit)
        val songtitle = findViewById<TextView>(R.id.songtitle)
        val artist = findViewById<TextView>(R.id.artist)
        val rates = findViewById<TextView>(R.id.rating)
        val comment = findViewById <TextView> (R.id.comments)
        val answer1 = findViewById<TextView> (R.id.a1)
        val answer2 = findViewById<TextView> (R.id.a2)
        val answer3 = findViewById<TextView> (R.id.a3)
        val answer4 = findViewById<TextView> (R.id.a4)

        //declaring and calling from songapp class
        var det1 = SongApp("$answer1.text", "$answer2.text", "$answer3.text", "$answer4.text")
        var exit = exitbutton.text.toString().toInt()
        exit = 0
        var counter1 = 0

        exitbutton.setOnClickListener {
            exit = exit + 1
        }

        //loop to keep app running
        while (exit != 1)
            playlist.setOnClickListener{
                playlist.text = "Please enter the following !"
                songtitle.text = "Please enter the name of the song : "
                artist.text = "Please enter the name of the artist : "
                rates.text = "Please rate the song from 1 - 5 : "
                comment.text = "Please leave a comment : "
            }

        //prompt to change pages
        page.setOnClickListener{
            val intent = Intent (this, SongApp::class.java)
            startActivity(intent)
        }
    }
}