package se.oscargynning.pia11intro

import android.graphics.Color
import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var siffra = 0

   lateinit var myText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        myText =  findViewById<TextView>(R.id.fancyText)


        myText.text = "hej"




        findViewById<Button>(R.id.fancyButton).setOnClickListener{






        }

        findViewById<Button>(R.id.minus).setOnClickListener {

            background()

            docalc(calcsiffra = -1)


        }

        findViewById<Button>(R.id.plus).setOnClickListener {


            background()

            docalc(calcsiffra = 1)


        }

        findViewById<Button>(R.id.nollstall).setOnClickListener {


            background()

            docalc(calcsiffra = 0
            )


        }
    }
    fun docalc(calcsiffra : Int){


        if (calcsiffra == 0){

            siffra = 0

        }

        siffra += calcsiffra

        if(siffra < 0){

            siffra = 0
        }

        myText.text = siffra.toString()


        }

    fun background(){

        when(siffra){

            15 -> myText.setBackgroundColor(Color.RED)
            25 -> myText.setBackgroundColor(Color.BLUE)
            else -> {
                myText.setBackgroundColor(Color.MAGENTA)

            }
        }

    }
}