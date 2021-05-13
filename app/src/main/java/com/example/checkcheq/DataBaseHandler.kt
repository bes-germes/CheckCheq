package com.example.checkcheq

import android.content.Context
import java.io.File


class DataBaseHandler {

    var MEMBERS_DATABASE_NAME = "FILE_NAME_MEMBERS.json"
    var MEMBERS_DATABASE_PATH = "filesBD/"
    var FILE_MEMBERS_DATABASE: File = File(MEMBERS_DATABASE_PATH, MEMBERS_DATABASE_NAME)

    //private var ARRAY_MEMBERS: MutableList<Member> = mutableListOf()

    init {
        FILE_MEMBERS_DATABASE.createNewFile()
    }


    fun addMember(member: Member) {

    }

    /*fun addMembers(members: MutableList<Member>) {
        for (member: Member in members)
    }

    fun addMember(name: String, status: Boolean) {
    }

    fun addMember(name: String, status: Boolean, summ: Int) {
    }

    fun getCountMembers(): Int {

    }

    fun getMember(id: Int): Member {

    }

    fun getMember(name: String): Member? {

    }

    fun getAllMembers(): MutableList<Member> {
    }


    fun memberIsExist(member: Member) : Boolean{

    }*/



}