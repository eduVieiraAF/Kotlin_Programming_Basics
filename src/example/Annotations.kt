package example

import kotlin.reflect.full.findAnnotation

annotation class ImPlant

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet

@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet

@ImPlant class Plant {

    @get:OnGet
    val isGrowing: Boolean = true

    @set:OnSet
    var needsFood: Boolean = false

}

fun testAnnotations (){

    val plantObject = Plant::class
    val myAnnotationObject = plantObject.findAnnotation<ImPlant>()

    println(myAnnotationObject)
  }

fun main(){

    testAnnotations()
}





