package com.example.p071dictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val imageView: ImageView = findViewById(R.id.imagePlaceholder)
        val textView: TextView = findViewById(R.id.descriptionLabel)
        val radioGroup: RadioGroup = findViewById(R.id.radioGroup)
        val inflater: MenuInflater = menuInflater
        radioGroup.setOnCheckedChangeListener {
            _, checkedId -> findViewById<RadioButton>(checkedId.apply {
                if (checkedId == R.id.plantsRadio) {
                    menu?.clear()
                    imageView.setImageResource(R.drawable.plantsistockphoto_1194523841_1024x1024)
                    textView.setText(R.string.plants_selected_description)
                    inflater.inflate(R.menu.menuplants, menu)
                } else {
                    menu?.clear()
                    imageView.setImageResource(R.drawable.istockphoto_605980752_1024x1024)
                    textView.setText(R.string.birds_selected_description)
                    inflater.inflate(R.menu.menuanimals, menu)
                }
        })
        }
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val imageView: ImageView = findViewById(R.id.imagePlaceholder)
        val textView: TextView = findViewById(R.id.descriptionLabel)

        return when (item.itemId) {
            R.id.sparrowOption -> {
                imageView.setImageResource(R.drawable.sparrow)
                textView.setText(R.string.sparrow_description)
                true
            }
            R.id.colibriOption -> {
                imageView.setImageResource(R.drawable.colibri)
                textView.setText(R.string.colibri_description)
                true
            }

            R.id.chamomileOption -> {
                imageView.setImageResource(R.drawable.how_to_grow_chamomile_1402627_02_crop_9b5069a36d234b089b4a8d51be686493)
                textView.setText(R.string.chamomile_description)
                true
            }
            R.id.violetOption -> {
                imageView.setImageResource(R.drawable.purpleflower_violet)
                textView.setText(R.string.violet_description)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
