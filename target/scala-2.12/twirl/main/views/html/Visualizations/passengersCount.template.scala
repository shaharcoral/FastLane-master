
package views.html.Visualizations

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object passengersCount extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[PassengersCountForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form : Form[PassengersCountForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!--TODO change hour to select-->
<!--TODO add multiple dates selection-->
"""),_display_(/*5.2*/calculateDataLayout("Passengers Count")/*5.41*/{_display_(Seq[Any](format.raw/*5.42*/("""
"""),format.raw/*6.1*/("""<h4>Passengers count visualization description</h4>
""")))}/*7.2*/{_display_(Seq[Any](format.raw/*7.3*/("""

"""),_display_(/*9.2*/helper/*9.8*/.form(action = routes.VisualizationController.calculatePassengersCount())/*9.81*/{_display_(Seq[Any](format.raw/*9.82*/("""
    """),_display_(/*10.6*/helper/*10.12*/.select(form("day"), options=Seq(
        ("Sunday","Sunday"),
        ("Monday","Monday"),
        ("Tuesday","Tuesday"),
        ("Wednesday","Wednesday"),
        ("Thursday","Thursday"),
        ("Friday","Friday"),
        ("Saturday","Saturday")),'_label -> "Day")),format.raw/*17.51*/("""
    """),_display_(/*18.6*/helper/*18.12*/.select(form("startTime"),options=Seq(
        ("h0", "00"),
        ("h1", "01"),
        ("h2", "02"),
        ("h3", "03"),
        ("h4", "04"),
        ("h5", "05"),
        ("h6", "06"),
        ("h7", "07"),
        ("h8", "08"),
        ("h9", "09"),
        ("h10", "10"),
        ("h11", "11"),
        ("h12", "12"),
        ("h13", "13"),
        ("h14", "14"),
        ("h15", "15"),
        ("h16", "16"),
        ("h17", "17"),
        ("h18", "18"),
        ("h19", "19"),
        ("h20", "20"),
        ("h21", "21"),
        ("h22", "22"),
        ("h23", "23")

        ), '_label -> "Start Time")),format.raw/*44.36*/("""
    """),_display_(/*45.6*/helper/*45.12*/.select(form("endTime"),options=Seq(
        ("h0", "00"),
        ("h1", "01"),
        ("h2", "02"),
        ("h3", "03"),
        ("h4", "04"),
        ("h5", "05"),
        ("h6", "06"),
        ("h7", "07"),
        ("h8", "08"),
        ("h9", "09"),
        ("h10", "10"),
        ("h11", "11"),
        ("h12", "12"),
        ("h13", "13"),
        ("h14", "14"),
        ("h15", "15"),
        ("h16", "16"),
        ("h17", "17"),
        ("h18", "18"),
        ("h19", "19"),
        ("h20", "20"),
        ("h21", "21"),
        ("h22", "22"),
        ("h23", "23")

        ), '_label -> "End Time")),format.raw/*71.34*/("""
    """),_display_(/*72.6*/helper/*72.12*/.inputText(form("minPassengersForPublicLane"), '_label -> "Min Passengers For Public Lane")),format.raw/*72.103*/("""

    """),format.raw/*74.5*/("""<input type="submit" value="Calculate">
""")))}),format.raw/*75.2*/("""


""")))}))
      }
    }
  }

  def render(form:Form[PassengersCountForm]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((Form[PassengersCountForm]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 07 13:03:44 IST 2019
                  SOURCE: C:/Users/shaha/Desktop/p_n/FastLane-master/app/views/Visualizations/passengersCount.scala.html
                  HASH: 37fe80ae43019679b1bc175d021cd489913c20f9
                  MATRIX: 992->1|1120->36|1147->37|1248->113|1295->152|1333->153|1360->154|1430->207|1467->208|1495->211|1508->217|1589->290|1627->291|1659->297|1674->303|1965->573|1997->579|2012->585|2649->1201|2681->1207|2696->1213|3329->1825|3361->1831|3376->1837|3489->1928|3522->1934|3593->1975
                  LINES: 28->1|33->2|34->3|36->5|36->5|36->5|37->6|38->7|38->7|40->9|40->9|40->9|40->9|41->10|41->10|48->17|49->18|49->18|75->44|76->45|76->45|102->71|103->72|103->72|103->72|105->74|106->75
                  -- GENERATED --
              */
          