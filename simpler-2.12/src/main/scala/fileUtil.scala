package fileUtil

import java.io.{File}
import java.nio.file.{Path, Paths, Files}
import org.apache.commons.io.FileUtils.{deleteDirectory}
import java.nio.charset.StandardCharsets

object util {
  
  def writeOutputFile(fileText: String, fileName: String, outDir: String = "out") {
    //println(Paths.get(outDir + "/" + fileName))
    Files.write(Paths.get(outDir + "/" + fileName), fileText.getBytes(StandardCharsets.UTF_8))
  }
  
  def writeJsonFile(fileName: String, outDir: String = "out") {
    writeOutputFile("Foo\n", fileName, outDir) 
  }
  
  //
  // take care of a ready empty target folder under the current path
  //
  def createDir(outDir: String) = {
    val outDirObj = Paths.get(outDir)
    if (Files.exists(outDirObj)) deleteDirectory(new File(outDir))
    Files.createDirectory(outDirObj)
  }

} 