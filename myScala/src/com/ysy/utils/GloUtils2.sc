import scala.io.Source, java.io.File

//val file = getClass.getResource("").getPath

val file = new File("")

//val file = "./"
println(file.getAbsolutePath())

val path = "E:\\GitHub\\myJava\\myScala\\src\\com\\ysy\\utils\\GloUtils.scala"

//val path = getClass.getResource("").getPath

println(path)

val data = Source.fromFile(path, enc = "UTF-8")

println(data)

data.foreach(word=>print(word))