package com.example.galleryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private var currentImage = 0
    lateinit var image: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val next = findViewById<ImageButton>(R.id.NxtBtn)
        val prev = findViewById<ImageButton>(R.id.PrevBtn)

        next.setOnClickListener{
        var idOfCurrentImageString = "pic$currentImage"
        var idOfCurrentImageInt = this.resources.getIdentifier(idOfCurrentImageString , "id" , packageName)
            image = findViewById<ImageView>(idOfCurrentImageInt)
        image.alpha=0f

            currentImage = (5+currentImage+1)%5
        var idOfImageToShowString = "pic$currentImage"
        var idOfImageToShowInt = this.resources.getIdentifier(idOfImageToShowString , "id" , packageName)
        image = findViewById<ImageView>(idOfImageToShowInt)
        image.alpha=1f

        }
        prev.setOnClickListener{
            var idOfCurrentImageString = "pic$currentImage"
            var idOfCurrentImageInt = this.resources.getIdentifier(idOfCurrentImageString , "id" , packageName)
            image = findViewById<ImageView>(idOfCurrentImageInt)
            image.alpha=0f

            currentImage = (5+currentImage-1)%5
            var idOfImageToShowString = "Pic$currentImage"
            var idOfImageToShowInt = this.resources.getIdentifier(idOfCurrentImageString , "id" , packageName)
            image = findViewById<ImageView>(idOfCurrentImageInt)
            image.alpha=1f
        }


    }
}