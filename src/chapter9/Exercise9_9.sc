import java.io.File

// “Write a Scala program that counts how many files with .class extension are in a given directory and its subdirectories.”

def subdirs(dir: File) : Iterator[File]  = {
  val children = dir.listFiles
  children.toIterator ++ children.filter(_.isDirectory).toIterator.flatMap(subdirs)
}

val files: Iterator[File] = subdirs(new File("/Users/erikp/Userfiles/projects/scala/for-the-impatient/src"))
val scalaFiles = files.count(_.getName.endsWith(".sc"))
println(s"$scalaFiles found")

