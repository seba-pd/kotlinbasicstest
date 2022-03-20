package entities

class Box {

    var stringdata: String = ""
    var initdata = 0

    constructor(stringdata: String) {
        this.stringdata = stringdata
    }

    constructor(stringdata: String, initdata: Int) {
        this.stringdata = stringdata
        this.initdata = initdata
    }

    override fun toString(): String {
        return "Box(stringdata='$stringdata', initdata=$initdata)"
    }

}
