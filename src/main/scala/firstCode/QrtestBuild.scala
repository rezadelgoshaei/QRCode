package firstCode

import java.nio.file.{FileSystem, FileSystems}

//import com.google._

import com.google.zxing.BarcodeFormat
import com.google.zxing.client.j2se.MatrixToImageWriter
import com.google.zxing.qrcode.QRCodeWriter

class QRtestBuild  {

  private val path ="./qrcode.png"
  def QrCodeGen(text:String,width:Int, height:Int,filePath:String)={

      println(text)
    val qrwriter = new QRCodeWriter()
    val bitMatrix = qrwriter.encode(text,BarcodeFormat.QR_CODE,width,height)
    val path1 =FileSystems.getDefault().getPath(path)
    println(path1)
    MatrixToImageWriter.writeToPath(bitMatrix,"PNG",path1)
  }
}

object Demo {
  def main(args: Array[String]): Unit = {
    val qr = new QRtestBuild()
    qr.QrCodeGen("this my first QR code generation",350,350,"./code")
  }
}



