package com.abraham.psiconnect.componentesgraficos.recycledview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.abraham.psiconnect.R

class UserAdapter(private val list:ArrayList<User>): RecyclerView.Adapter<UserViewHolder>() {
    var onItemSelected : ((User)->Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_user,parent,false )
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.render(list[position],onItemSelected)

    }

}

class UserViewHolder(view: View) : RecyclerView.ViewHolder(view){

    val ivUser = view.findViewById<ImageView>(R.id.ivUser)
    val tvUser = view.findViewById<TextView>(R.id.tvUser)
    val root = view.findViewById<ConstraintLayout>(R.id.root)

    fun render(user: User,onItemSelected : ((User)->Unit)? = null){
        tvUser.text=user.name
        //tvUser.typeface=ResourcesCompat.getFont(tvUser.context,R.font.bernier_shade_regular)

        root.setOnClickListener {
            onItemSelected?.invoke(user)
        }

    }



}