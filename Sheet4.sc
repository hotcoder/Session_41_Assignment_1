// Task 2


import scala.collection.mutable.ArrayBuffer

var names = ArrayBuffer("alpha", "gamma", "omega", "zeta", "beta")

var namesWithLength4 = names.filter(_.length == 4)

print(namesWithLength4)

var namesToLengthMapping = names.map(_.length)

print(namesToLengthMapping)

var allStringWhichContainm = names.filter(_.contains("m"))

print(allStringWhichContainm.size)


var allStringWhichStartWitha = names.filter(_.startsWith("a"))

println(allStringWhichStartWitha.size)




