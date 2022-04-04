package aquarium

class MyIntList {

    fun get(pos: Int): Int = 0
    fun addItem(item: Int) {}

}

class MyShortList {

    fun get(pos: Int): Short = 0
    fun addItem(item: Short) {}

}

// without generic type we'd need to create lists for each type as above

class MyList<T>{ // can be any name but 'T' is the convention

    fun get(pos: Int): T  = TODO("code here")

    fun addItem(item: T) {}

}

fun workWithMyList(){

    val intList: MyList<Int>
    val fishList: MyList<Fish>

}