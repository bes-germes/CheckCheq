package com.example.checkcheq

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*

class AddMembers : AppCompatActivity() {

    private lateinit var array_members: MutableList<Member>
    private lateinit var members_adapter: MembersAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_members)
        initComponents()
    }

    fun initComponents() {
        val button_next: Button = findViewById(R.id.activity_add_members_button_next)
        button_next.setBackgroundColor(ContextCompat.getColor(this, R.color.light_grey))

        array_members = mutableListOf()
        members_adapter = MembersAdapter(array_members, button_next)

        val linear_layout_manager = LinearLayoutManager(this)
        linear_layout_manager.orientation = LinearLayoutManager.VERTICAL

        val recyclerView: RecyclerView = findViewById(R.id.activity_add_members_RV)
        recyclerView.layoutManager = linear_layout_manager
        recyclerView.adapter = members_adapter

    }

    fun addNewMember(view: View) {
        members_adapter.addMember(this)
        members_adapter.notifyItemChanged(members_adapter.itemCount - 1)
    }

    fun deleteLastMember(view: View) {
        //TODO(РЕАЛИЗОВАТЬ УДАЛЕНИЕ ПОСЛЕДНЕЙ КАРТОЧКИ)
    }


    fun Int.toDp(context: Context): Int = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, this.toFloat(), context.resources.displayMetrics
    ).toInt()
}