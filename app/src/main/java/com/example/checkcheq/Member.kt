package com.example.checkcheq

class Member {

    private var _name: String
    private var _status: Boolean
    private var _summ: Int

    init{
        _name = ""
        _status = false
        _summ = 0
    }

    constructor(name: String, status: Boolean){
        _name = name
        _status = status
    }

    constructor(name: String, status: Boolean, summ: Int) : this(name, status){
        _summ = summ
    }


    //GETTER'S
    fun getName() : String {
        return _name
    }
    fun getStatus() : Boolean {
        return _status
    }
    fun getSumm() : Int {
        return _summ
    }


    //SETTER'S
    fun setName(name: String) {
        this._name = name
    }
    fun setStatus(status: Boolean) {
        this._status = status
    }
    fun setSumm(summ: Int) {
        this._summ = summ
    }

}