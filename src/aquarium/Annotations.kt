package aquarium

import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.findAnnotation

@ImPlant class Plant(){

    fun trim(){}
    fun fertilize(){}

}

annotation class ImPlant

fun reflections(){

    val classObj = Plant::class
//   for (method in classObj.declaredMemberFunctions){println(method.name)}

    for (method in classObj.annotations) {println(method.annotationClass.simpleName)}

    val annotated = classObj.findAnnotation<ImPlant>()
    annotated?.apply { println("Found a plant annotation") }

}