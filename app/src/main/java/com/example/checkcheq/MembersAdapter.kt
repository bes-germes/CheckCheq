package com.example.checkcheq

import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class MembersAdapter(val members: MutableList<Member>) : RecyclerView.Adapter<MembersAdapter.MemberViewHolder>() {

    var array_members: MutableList<Member> = mutableListOf()
    private var members_size: Int = 0
    //private lateinit var context: Context
    //private var dbHandler: DataBaseHandler

    init {
        //this.context = context
        //this.dbHandler = dbHandler
        this.array_members = members
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.recycle_item_name_status, parent, false)
        val new_member_view_holder = MemberViewHolder(itemView)
        return new_member_view_holder
    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        holder.bind(this.array_members[position])

    }

    override fun getItemCount(): Int {
        return members_size
    }

    fun addMember() {
        members_size++
        array_members.add(Member("", false))
    }

    inner class MemberViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var name_edit_text: EditText = view.findViewById<View>(R.id.recycle_item_name_status_edit_text_name) as EditText
        var status_button: ImageView = view.findViewById(R.id.recycle_item_name_status_image_view_status) as ImageView

        fun bind(member: Member) {

            /*if (member.getStatus())
                this.status_button.setImageResource(R.drawable.money)
            else
                this.status_button.setImageResource(R.drawable.gray_no_money)*/

            //name_edit_text.setText(member.getName())

            this.status_button.setOnClickListener {
                if (member.getStatus()) {
                    this.status_button.setImageResource(R.drawable.gray_no_money)
                    member.setStatus(false)
                } else {
                    this.status_button.setImageResource(R.drawable.money)
                    member.setStatus(true)
                }
            }
            /*this.name_edit_text.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    TODO("Not yet implemented")
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    TODO("Not yet implemented")
                }

                override fun afterTextChanged(s: Editable) {
                    member.setName(s.toString())
                }
            })*/
        }
    }

}
