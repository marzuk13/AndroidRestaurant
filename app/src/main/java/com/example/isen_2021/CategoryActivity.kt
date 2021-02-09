package com.example.isen_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

enum class ItemType {
    STARTER, MAIN, DESSERT
}

class CategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        val selectedItem = intent.getSerializableExtra(HomeActivity.CATEGORY_NAME) as? ItemType

        if (selectedItem != null) {
            displayTitle(item = selectedItem)
        }

        Log.d("lifecycle", "onCreate")
    }
    private fun displayTitle(item: ItemType){

        when(item){
            ItemType.STARTER -> Log.d("title", "starter")
            ItemType.MAIN -> Log.d("title", "main")
            ItemType.DESSERT -> Log.d("title" , "dessert")
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("lifecycle", "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("lifecycle", "onRestart")
    }

    override fun onDestroy() {
        Log.d("lifecycle", "onDestroy")
        super.onDestroy()
    }
}
