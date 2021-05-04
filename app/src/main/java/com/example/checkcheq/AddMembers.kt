package com.example.checkcheq

import android.content.Context
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*

class AddMembers : AppCompatActivity() {


    //private lateinit var dbHandler: DataBaseHandler
    private lateinit var members_adapter: MembersAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_members)

        //dbHandler = DataBaseHandler()
        //members_adapter = MembersAdapter(dbHandler)
        val array_members: MutableList<Member> = mutableListOf()
        members_adapter = MembersAdapter(array_members)

        val linear_layout_manager = LinearLayoutManager(this)
        linear_layout_manager.orientation = LinearLayoutManager.VERTICAL

        val recyclerView: RecyclerView = findViewById(R.id.activity_add_members_RV)
        recyclerView.layoutManager = linear_layout_manager
        recyclerView.adapter = members_adapter
    }

    fun addNewMember(view: View) {
        members_adapter.addMember()
        members_adapter.notifyItemChanged(members_adapter.itemCount - 1)

    }

    fun nextPage(view: View) {
        //dbHandler.addMembers(members_adapter.array_members)
    }


    fun Int.toDp(context: Context): Int = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, this.toFloat(), context.resources.displayMetrics
    ).toInt()
}