open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isLightOn: Boolean = false, var isFolded: Boolean = true) : 
	Phone(isScreenLightOn = isLightOn) {
    
	override fun switchOn() {
        if (!isFolded) super.switchOn()
    }
    
    fun fold() {
        isFolded = true
    }
    
    fun unfold() {
        isFolded = false
    }
    
    fun checkPhoneFolding() {
        val phoneFolding = if (isFolded) "folded" else "unfolded"
        println("The phone is $phoneFolding.")
    }
}
    
fun main() {
    val phone: FoldablePhone = FoldablePhone()
    phone.checkPhoneScreenLight()
    phone.switchOn()
    phone.checkPhoneScreenLight()
    phone.checkPhoneFolding()
    phone.unfold()
    phone.switchOn()
    phone.checkPhoneScreenLight()
    phone.checkPhoneFolding()
}