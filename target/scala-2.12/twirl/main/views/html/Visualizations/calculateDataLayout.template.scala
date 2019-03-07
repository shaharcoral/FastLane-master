
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

object calculateDataLayout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(description: Html)(parameters: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    """),format.raw/*7.58*/("""
    """),format.raw/*8.5*/("""<title>"""),_display_(/*8.13*/title),format.raw/*8.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.versioned("images/favicon.png")),format.raw/*10.100*/("""">
    <!--BOOTSTRAP-->
    <link rel="stylesheet" href=""""),_display_(/*12.35*/routes/*12.41*/.Assets.versioned("outsiders/bootstrap-4.2.1-dist/css/bootstrap.min.css")),format.raw/*12.114*/("""" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <!--MAPBOX-->
    <script src='https://api.tiles.mapbox.com/mapbox-gl-js/v0.52.0/mapbox-gl.js'></script>
    <link href='https://api.tiles.mapbox.com/mapbox-gl-js/v0.52.0/mapbox-gl.css' rel='stylesheet' />
    <style>
            /*body """),format.raw/*17.20*/("""{"""),format.raw/*17.21*/(""" """),format.raw/*17.22*/("""margin:50%; padding:10%; """),format.raw/*17.47*/("""}"""),format.raw/*17.48*/("""*/
            #map """),format.raw/*18.18*/("""{"""),format.raw/*18.19*/(""" """),format.raw/*18.20*/("""position:absolute; width:90%; height: 100%"""),format.raw/*18.62*/("""}"""),format.raw/*18.63*/("""
            """),format.raw/*19.13*/("""/*#map """),format.raw/*19.20*/("""{"""),format.raw/*19.21*/(""" """),format.raw/*19.22*/("""position:absolute; top:0; bottom:0; width:50%; height: 50%"""),format.raw/*19.80*/("""}"""),format.raw/*19.81*/("""*/

        </style>
</head>
<body>
    """),_display_(/*24.6*/navigationbar()),format.raw/*24.21*/("""
    """),format.raw/*25.5*/("""</br>
    <div>"""),_display_(/*26.11*/description),format.raw/*26.22*/("""</div>
    </br>
    <div class="container">
        <div class="row">
            <div class="col-8" >
                <div id='map'></div>
            </div>
            <div class="col">
                """),_display_(/*34.18*/parameters),format.raw/*34.28*/("""
            """),format.raw/*35.13*/("""</div>
        </div>
    </div>

   """),_display_(/*39.5*/calculateMap()),format.raw/*39.19*/("""
    """),format.raw/*40.5*/("""<script src=""""),_display_(/*40.19*/routes/*40.25*/.Assets.versioned("javascripts/main.js")),format.raw/*40.65*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*41.19*/routes/*41.25*/.Assets.versioned("outsiders/jquery-3.3.1.slim.min.js")),format.raw/*41.80*/(""""></script>
    <script src=""""),_display_(/*42.19*/routes/*42.25*/.Assets.versioned("outsiders/bootstrap-4.2.1-dist/js/bootstrap.min.js")),format.raw/*42.96*/(""""  integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
</body>
</html>
"""))
      }
    }
  }

  def render(title:String,description:Html,parameters:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(description)(parameters)

  def f:((String) => (Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (description) => (parameters) => apply(title)(description)(parameters)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 07 13:03:44 IST 2019
                  SOURCE: C:/Users/shaha/Desktop/p_n/FastLane-master/app/views/Visualizations/calculateDataLayout.scala.html
                  HASH: fad45928d0b1e58f349f16b2d29df7e4f7bf44c4
                  MATRIX: 987->1|1133->54|1161->56|1232->153|1263->158|1297->166|1322->171|1406->229|1420->235|1481->276|1565->333|1580->339|1641->378|1726->436|1741->442|1836->515|2216->867|2245->868|2274->869|2327->894|2356->895|2404->915|2433->916|2462->917|2532->959|2561->960|2602->973|2637->980|2666->981|2695->982|2781->1040|2810->1041|2877->1082|2913->1097|2945->1102|2988->1118|3020->1129|3254->1336|3285->1346|3326->1359|3390->1397|3425->1411|3457->1416|3498->1430|3513->1436|3574->1476|3654->1529|3669->1535|3745->1590|3802->1620|3817->1626|3909->1697
                  LINES: 28->1|33->2|35->4|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|43->12|43->12|43->12|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|50->19|50->19|50->19|50->19|50->19|50->19|55->24|55->24|56->25|57->26|57->26|65->34|65->34|66->35|70->39|70->39|71->40|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42
                  -- GENERATED --
              */
          