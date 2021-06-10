package com.roger

fun main (){
    val stocks = HashMap<String, String>()
    stocks.put("2303", "台積電")
    stocks.put("2317", "鴻海")
    stocks.put("2303", "TSMC")
    println(stocks)
    for (key in stocks.keys){
        println("$key ${stocks.get(key)}")
    }
//    set()

//    list()

}

private fun set() {
    val set = HashSet<Int>()
    set.add(1)
    set.add(3)
    set.add(7)
    set.add(8)
    set.add(3)
    println(set)
    for (n in set) {
        println(n)
    }
}

private fun list() {
    val list = listOf(5, 1, 2, 7)
    println(list)
    val scores = listOf(66, 88, 77, 99, 50)
    for (score in scores) {
        println(score)
    }
    println(list.get(3))
    var mutableList = mutableListOf(5, 1, 2, 7)
    mutableList.add(6)
    println(mutableList)
}