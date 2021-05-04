package com.example.checkcheq

import android.content.Context
import android.os.Environment
import java.io.File


class DataBaseHandler {
    private var ARRAY_MEMBERS: MutableList<Member> = mutableListOf()
    public var FILE_NAME_MEMBERS = "FILE_NAME_MEMBERS.json"
    public var FILE_MEMBERS_PATH = "filesBD/"


    /*private lateinit var FILE_MEMBERS: File
    public var FILE_NAME_MEMBERS: String = "FILE_MEMBERS"*/

    init {
        //create fileOut object
        var fileOut = File(FILE_MEMBERS_PATH, FILE_NAME_MEMBERS)

        //delete any file object with path and filename that already exists
        fileOut.delete()

        //create a new file
        fileOut.createNewFile()
    }

    /*constructor(context: Context){

    }*/


    fun addMember(member: Member) {
        ARRAY_MEMBERS.add(member)
    }

    fun addMembers(members: MutableList<Member>) {
        for (member: Member in members)
            ARRAY_MEMBERS.add(member)
    }

    fun addMember(name: String, status: Boolean) {
        ARRAY_MEMBERS.add(Member(name, status))
    }

    fun addMember(name: String, status: Boolean, summ: Int) {
        ARRAY_MEMBERS.add(Member(name, status, summ))
    }

    fun getCountMembers(): Int {
        return ARRAY_MEMBERS.size
    }

    fun getMember(id: Int): Member {
        return ARRAY_MEMBERS[id]
    }

    fun getMember(name: String): Member? {
        for (member in ARRAY_MEMBERS) {
            if (member.getName() == name)
                return member
        }
        return null
    }

    fun getAllMembers(): MutableList<Member> {
        return ARRAY_MEMBERS
    }
}