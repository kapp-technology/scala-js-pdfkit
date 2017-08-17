
import scala.scalajs.js
import js.annotation._
import js.|

import scala.scalajs.js.Date

package pdfkit {

  package PDFKit {

    @js.native
    trait PDFGradient extends js.Object {
      /* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(document),false,Some(TypeRef(CoreType(any),List())))),Some(TypeRef(TypeName(PDFGradient),List())))) */
      def stop(pos: Double, color: String | PDFKit.PDFGradient = ???, opacity: Double = ???): PDFGradient = js.native
      def embed(): Unit = js.native
      @JSName("apply")
      def apply(): Unit = js.native
    }

    @js.native
    trait PDFLinearGradient extends PDFGradient {
      /* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(document),false,Some(TypeRef(CoreType(any),List()))), FunParam(Ident(x1),false,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(y1),false,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(x2),false,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(y2),false,Some(TypeRef(CoreType(number),List())))),Some(TypeRef(TypeName(PDFLinearGradient),List())))) */
      def shader(fn: js.Function0[Any]): js.Dynamic = js.native
      def opacityGradient(): PDFLinearGradient = js.native
    }

    @js.native
    trait PDFRadialGradient extends PDFGradient {
      /* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(document),false,Some(TypeRef(CoreType(any),List()))), FunParam(Ident(x1),false,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(y1),false,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(x2),false,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(y2),false,Some(TypeRef(CoreType(number),List())))),Some(TypeRef(TypeName(PDFRadialGradient),List())))) */
      def shader(fn: js.Function0[Any]): js.Dynamic = js.native
      def opacityGradient(): PDFRadialGradient = js.native
    }

    package Mixins {

      @js.native
      trait AnnotationOption extends js.Object {
        var Type: String = js.native
        var Rect: js.Any = js.native
        var Border: js.Array[Double] = js.native
        var SubType: String = js.native
        var Contents: String = js.native
        var Name: String = js.native
        var color: String = js.native
        var QuadPoints: js.Array[Double] = js.native
        var A: js.Any = js.native
        var B: js.Any = js.native
        var C: js.Any = js.native
        var L: js.Any = js.native
        var DA: String = js.native
      }

      @js.native
      trait PDFAnnotation[TDocument] extends js.Object {
        def annotate(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): TDocument = js.native
        def note(x: Double, y: Double, w: Double, h: Double, content: String, option: AnnotationOption = ???): TDocument = js.native
        def link(x: Double, y: Double, w: Double, h: Double, url: String, option: AnnotationOption = ???): TDocument = js.native
        def highlight(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption = ???): TDocument = js.native
        def underline(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption = ???): TDocument = js.native
        def strike(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption = ???): TDocument = js.native
        def lineAnnotation(x1: Double, y1: Double, x2: Double, y2: Double, option: AnnotationOption = ???): TDocument = js.native
        def rectAnnotation(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption = ???): TDocument = js.native
        def ellipseAnnotation(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption = ???): TDocument = js.native
        def textAnnotation(x: Double, y: Double, w: Double, h: Double, text: String, option: AnnotationOption = ???): TDocument = js.native
      }

      @js.native
      trait PDFColor[TDocument] extends js.Object {
        def fillColor(color: String | PDFGradient, opacity: Double = ???): TDocument = js.native
        def strokeColor(color: String, opacity: Double = ???): TDocument = js.native
        def opacity(opacity: Double): TDocument = js.native
        def fillOpacity(opacity: Double): TDocument = js.native
        def strokeOpacity(opacity: Double): TDocument = js.native
        def linearGradient(x1: Double, y1: Double, x2: Double, y2: Double): PDFLinearGradient = js.native
        def radialGradient(x1: Double, y1: Double, r1: Double, x2: Double, y2: Double, r2: Double): PDFRadialGradient = js.native
      }
      /* TODO see https://github.com/feross/buffer
      @js.native
      trait PDFFont[TDocument] extends js.Object {
        def font(buffer: Buffer): TDocument = js.native
        def font(src: String, family: String = ???, size: Double = ???): TDocument = js.native
        def fontSize(size: Double): TDocument = js.native
        def currentLineHeight(includeGap: Boolean = ???): Double = js.native
        def registerFont(name: String, src: String = ???, family: String = ???): TDocument = js.native
      }
*/

      @js.native
      trait ImageOption extends js.Object {
        var width: Double = js.native
        var height: Double = js.native
        var scale: Double = js.native
        var fit: js.Array[Double] = js.native
      }

      @js.native
      trait PDFImage[TDocument] extends js.Object {
        def image(src: js.Any, x: Double = ???, y: Double = ???, options: ImageOption = ???): TDocument = js.native
        def image(src: js.Any, options: ImageOption = ???): TDocument = js.native
      }

      @js.native
      trait TextOptions extends js.Object {
        var lineBreak: Boolean = js.native
        var width: Double = js.native
        var height: Double = js.native
        var ellipsis: Boolean | String = js.native
        var columns: Double = js.native
        var columnGap: Double = js.native
        var indent: Double = js.native
        var paragraphGap: Double = js.native
        var lineGap: Double = js.native
        var wordSpacing: Double = js.native
        var characterSpacing: Double = js.native
        var fill: Boolean = js.native
        var stroke: Boolean = js.native
        var link: String = js.native
        var underline: Boolean = js.native
        var strike: Boolean = js.native
        var continued: Boolean = js.native
        var align: String = js.native
      }

      @js.native
      trait PDFText[TDocument] extends js.Object {
        def lineGap(lineGap: Double): TDocument = js.native
        def moveDown(line: Double = ???): TDocument = js.native
        def moveUp(line: Double = ???): TDocument = js.native
        def text(text: String, x: Double = ???, y: Double = ???, options: TextOptions = ???): TDocument = js.native
        def text(text: String, options: TextOptions = ???): TDocument = js.native
        def widthOfString(text: String, options: TextOptions = ???): Double = js.native
        def heightOfString(text: String, options: TextOptions = ???): Double = js.native
        def list(list: js.Array[String | js.Any], x: Double = ???, y: Double = ???, options: TextOptions = ???): TDocument = js.native
        def list(list: js.Array[String | js.Any], options: TextOptions = ???): TDocument = js.native
      }

      @js.native
      trait PDFVector[TDocument] extends js.Object {
        def save(): TDocument = js.native
        def restore(): TDocument = js.native
        def closePath(): TDocument = js.native
        def lineWidth(w: Double): TDocument = js.native
        def lineCap(c: String): TDocument = js.native
        def lineJoin(j: String): TDocument = js.native
        def miterLimit(m: js.Any): TDocument = js.native
        def dash(length: Double, option: js.Any): TDocument = js.native
        def undash(): TDocument = js.native
        def moveTo(x: Double, y: Double): TDocument = js.native
        def lineTo(x: Double, y: Double): TDocument = js.native
        def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): TDocument = js.native
        def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): TDocument = js.native
        def rect(x: Double, y: Double, w: Double, h: Double): TDocument = js.native
        def roundedRect(x: Double, y: Double, w: Double, h: Double, r: Double = ???): TDocument = js.native
        def ellipse(x: Double, y: Double, r1: Double, r2: Double = ???): TDocument = js.native
        def circle(x: Double, y: Double, raduis: Double): TDocument = js.native
        def polygon(points: js.Array[Double]*): TDocument = js.native
        def path(path: String): TDocument = js.native
        def fill(color: String | PDFKit.PDFGradient, rule: String = ???): TDocument = js.native
        def stroke(color: String | PDFKit.PDFGradient = ???): TDocument = js.native
        def fillAndStroke(fillColor: String, strokeColor: String = ???, rule: String = ???): TDocument = js.native
        def clip(rule: String = ???): TDocument = js.native
        def transform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): TDocument = js.native
        def translate(x: Double, y: Double): TDocument = js.native
        def rotate(angle: Double, options: js.Any = ???): TDocument = js.native
        def scale(xFactor: Double, yFactor: Double = ???, options: js.Any = ???): TDocument = js.native
      }

    }

    @js.native
    trait PDFData extends js.Object {
      /* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(data),false,Some(TypeRef(TypeName(Array),List(TypeRef(CoreType(any),List())))))),Some(TypeRef(TypeName(PDFData),List())))) */
      def readByte(): js.Dynamic = js.native
      def writeByte(byte: js.Any): Unit = js.native
      def byteAt(index: Double): js.Dynamic = js.native
      def readBool(): Boolean = js.native
      def writeBool(`val`: Boolean): Boolean = js.native
      def readUInt32(): Double = js.native
      def writeUInt32(`val`: Double): Unit = js.native
      def readInt32(): Double = js.native
      def writeInt32(`val`: Double): Unit = js.native
      def readUInt16(): Double = js.native
      def writeUInt16(`val`: Double): Unit = js.native
      def readInt16(): Double = js.native
      def writeInt16(`val`: Double): Unit = js.native
      def readString(length: Double): String = js.native
      def writeString(`val`: String): Unit = js.native
      def stringAt(pos: Double, length: Double): String = js.native
      def readShort(): Double = js.native
      def writeShort(`val`: Double): Unit = js.native
      def readLongLong(): Double = js.native
      def writeLongLong(`val`: Double): Unit = js.native
      def readInt(): Double = js.native
      def writeInt(`val`: Double): Unit = js.native
      def slice(start: Double, end: Double): js.Array[js.Any] = js.native
      def read(length: Double): js.Array[js.Any] = js.native
      def write(bytes: js.Array[js.Any]): Unit = js.native
    }

    @js.native
    trait DocumentInfo extends js.Object {
      var Producer: String = js.native
      var Creator: String = js.native
      var CreationDate: Date = js.native
      var Title: String = js.native
      var Author: String = js.native
      var Keywords: String = js.native
      var ModDate: Date = js.native
    }

    @js.native
    trait PDFDocumentOptions extends js.Object {
      var compress: Boolean = js.native
      var info: DocumentInfo = js.native
      var autoFirstPage: Boolean = js.native
      var size: js.Array[Double] | String = js.native
      var margin: Double = js.native
      var margins: js.Any = js.native
      var layout: String = js.native
      var bufferPages: Boolean = js.native
    }
    /* TODO
    @js.native
    trait PDFDocument extends NodeJS.ReadableStream with Mixins.PDFAnnotation[PDFDocument] with Mixins.PDFColor[PDFDocument] with Mixins.PDFImage[PDFDocument] with Mixins.PDFText[PDFDocument] with Mixins.PDFVector[PDFDocument]  with Mixins.PDFFont[PDFDocument] {
      var version: Double = js.native
      var compress: Boolean = js.native
      var info: DocumentInfo = js.native
      var options: PDFDocumentOptions = js.native
      var page: PDFPage = js.native
      var x: Double = js.native
      var y: Double = js.native
      */
    /* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(options),true,Some(TypeRef(TypeName(PDFDocumentOptions),List())))),Some(TypeRef(TypeName(PDFDocument),List())))) */
    /*def addPage(options: PDFDocumentOptions = ???): PDFDocument = js.native
      def bufferedPageRange(): js.Any = js.native
      def switchToPage(n: Double = ???): PDFPage = js.native
      def flushPages(): Unit = js.native
      def ref(data: js.Any): PDFKitReference = js.native
      def addContent(data: js.Any): PDFDocument = js.native
      def write(fileName: String, fn: js.Any): Unit = js.native
      def output(fn: js.Any): Unit = js.native
      def end(): Unit = js.native
      def toString(): String = js.native
    }
    */

    @js.native
    trait PDFPage extends js.Object {
      var size: String = js.native
      var layout: String = js.native
      var margins: js.Any = js.native
      var width: Double = js.native
      var height: Double = js.native
      //var document: PDFDocument = js.native
      var content: PDFKitReference = js.native
      var dictionary: PDFKitReference = js.native
      var fonts: js.Any = js.native
      var xobjects: js.Any = js.native
      var ext_gstates: js.Any = js.native
      var patterns: js.Any = js.native
      var annotations: js.Any = js.native
      def maxY(): Double = js.native
      def write(chunk: js.Any): Unit = js.native
      def end(): Unit = js.native
    }

    @js.native
    @JSGlobal("PDFKit.PDFKitReference")
    class PDFKitReference protected () extends js.Object {
      //TODO def this(document: PDFDocument, id: Double, data: js.Any) = this()
      var id: Double = js.native
      var gen: Double = js.native
      var deflate: js.Any = js.native
      var compress: Boolean = js.native
      var uncompressedLength: Double = js.native
      var chunks: js.Array[js.Any] = js.native
      var data: js.Any = js.native
      //TODO var document: PDFDocument = js.native
      def initDeflate(): Unit = js.native
      def write(chunk: js.Any): Unit = js.native
      def end(chunk: js.Any): Unit = js.native
      def finalize(): Unit = js.native
      def toString(): String = js.native
    }

  }

  package `pdfkit/js/data` {

    @JSGlobal("pdfkit/js/data")
    @js.native
    object `Pdfkit/js/data` extends js.Object {
      var PDFKitData: PDFKit.PDFData = js.native
    }

  }

  package pdfkit {

    @JSGlobal("pdfkit")
    @js.native
    object Pdfkit extends js.Object {
      //TODO  var doc: PDFKit.PDFDocument = js.native
    }

  }

  package `pdfkit/js/gradient` {

    @js.native
    @JSGlobal("pdfkit/js/gradient.gradient")
    object gradient extends js.Object {
      var PDFGradient: PDFKit.PDFGradient = js.native
      var PDFLinearGradient: PDFKit.PDFLinearGradient = js.native
      var PDFRadialGradiant: PDFKit.PDFRadialGradient = js.native
    }

  }

  package `pdfkit/js/page` {

    @JSGlobal("pdfkit/js/page")
    @js.native
    object `Pdfkit/js/page` extends js.Object {
      var PDFKitPage: PDFKit.PDFPage = js.native
    }

  }

  package `pdfkit/js/reference` {

    @JSGlobal("pdfkit/js/reference")
    @js.native
    object `Pdfkit/js/reference` extends js.Object {
      var PDFKitReference: PDFKit.PDFKitReference = js.native
    }

  }

  package `pdfkit/js/mixins/annotations` {

    @JSGlobal("pdfkit/js/mixins/annotations")
    @js.native
    object `Pdfkit/js/mixins/annotations` extends js.Object {
      var PDFKitAnnotation: PDFKit.Mixins.PDFAnnotation[Unit] = js.native
    }

  }

  package `pdfkit/js/mixins/color` {

    @JSGlobal("pdfkit/js/mixins/color")
    @js.native
    object `Pdfkit/js/mixins/color` extends js.Object {
      var PDFKitColor: PDFKit.Mixins.PDFColor[Unit] = js.native
    }

  }
  /* TODO
  package `pdfkit/js/mixins/fonts` {

    @JSGlobal("pdfkit/js/mixins/fonts")
    @js.native
    object `Pdfkit/js/mixins/fonts` extends js.Object {
      var PDFKitFont: PDFKit.Mixins.PDFFont[Unit] = js.native
    }

  }
  */

  package `pdfkit/js/mixins/images` {

    @JSGlobal("pdfkit/js/mixins/images")
    @js.native
    object `Pdfkit/js/mixins/images` extends js.Object {
      var PDFKitImage: PDFKit.Mixins.PDFImage[Unit] = js.native
    }

  }

  package `pdfkit/js/mixins/text` {

    @JSGlobal("pdfkit/js/mixins/text")
    @js.native
    object `Pdfkit/js/mixins/text` extends js.Object {
      var PDFKitText: PDFKit.Mixins.PDFText[Unit] = js.native
    }

  }
  /* TODO
  package `pdfkit/js/mixins/vector` {

    @JSName("pdfkit/js/mixins/vector")
    @js.native
    object `Pdfkit/js/mixins/vector` extends js.Object {
      var PDFKitVector: PDFKit.Mixins.PDFVector[Unit] = js.native
    }

  }
  */

}
