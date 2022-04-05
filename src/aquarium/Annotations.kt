package aquarium

import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.findAnnotation

@ImPlant class Plant(){

    fun trim(){}
    fun fertilize(){}

    @get: OnGet
    val isGrowing = true

    @set: OnSet
    var needsFood = false

}

annotation class ImPlant

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet

@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet

fun reflections(){

    val classObj = Plant::class
    for (method in classObj.declaredMemberFunctions){println(method.name)}

    for (method in classObj.annotations) {println(method.annotationClass.simpleName)}

    val annotated = classObj.findAnnotation<ImPlant>()
    annotated?.apply { println("Found a plant annotation") }

}