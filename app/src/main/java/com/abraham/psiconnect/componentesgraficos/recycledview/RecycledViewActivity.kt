package com.abraham.psiconnect.componentesgraficos.recycledview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abraham.psiconnect.R

class RecycledViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycled_view)

        val userList = findViewById<RecyclerView>(R.id.userList)

        val userDataList = arrayListOf(
            User("Dr. Garcia","1234","garcia@gmail.com"),
            User("Dr. Pedraza","1234","pedraza@gmail.com"),
            User("Dr. Ramírez","1234","ramirez@gmail.com"),
            User("Dr. Sánchez","1234","sanchez@gmail.com"),
            User("Dr. Méndez","1234","mendez@gmail.com"),
            User("Dr. López","1234","lopez@gmail.com"),
            User("Dr. Martínez","1234","martinez@gmail.com"),
            User("Dr. Torres","1234","torres@gmail.com"),
            User("Dr. Rodríguez","1234","rodriguez@gmail.com"),
            User("Dr. Flores","1234","flores@gmail.com"),
            User("Dr. Gómez","1234","gomez@gmail.com"),
            User("Dr. Castro","1234","castro@gmail.com"),
            User("Dr. Moreno","1234","moreno@gmail.com"),
            User("Dr. Vargas","1234","vargas@gmail.com"),
            User("Dr. Navarro","1234","navarro@gmail.com"),
            User("Dr. Herrera","1234","herrera@gmail.com"),
            User("Dr. Ruiz","1234","ruiz@gmail.com"),
            User("Dr. González","1234","gonzalez@gmail.com")
        )

        val adapter =UserAdapter(userDataList)
        adapter.onItemSelected={
            Toast.makeText(this,"User selected = ${it.name}", Toast.LENGTH_SHORT).show()
        }

        userList.adapter = adapter
        userList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
    }
}