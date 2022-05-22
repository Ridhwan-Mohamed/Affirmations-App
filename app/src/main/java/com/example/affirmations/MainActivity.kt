package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource
import javax.sql.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataSet = Datasource().loadAffirmations()
        val recyclerview = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerview.adapter = ItemAdapter(this, myDataSet)
        recyclerview.setHasFixedSize(true)

    }
}