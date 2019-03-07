
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

object resultLayout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,Html,Html,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(styles: Html)(description: Html)(map: Html)(index: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Passengers Count</title>
    <meta charset='utf-8' />
    <meta name='viewport' content='initial-scale=1,maximum-scale=1,user-scalable=no' />
    <!--BOOTSTRAP-->
    <link rel="stylesheet" href=""""),_display_(/*10.35*/routes/*10.41*/.Assets.versioned("outsiders/bootstrap-4.2.1-dist/css/bootstrap.min.css")),format.raw/*10.114*/("""" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <!--MAPBOX-->
    <script src='https://api.tiles.mapbox.com/mapbox-gl-js/v0.52.0/mapbox-gl.js'></script>
    <link href='https://api.tiles.mapbox.com/mapbox-gl-js/v0.52.0/mapbox-gl.css' rel='stylesheet' />
    <style>
        /*body """),format.raw/*15.16*/("""{"""),format.raw/*15.17*/(""" """),format.raw/*15.18*/("""margin:50%; padding:10%; """),format.raw/*15.43*/("""}"""),format.raw/*15.44*/("""*/
        #map """),format.raw/*16.14*/("""{"""),format.raw/*16.15*/(""" """),format.raw/*16.16*/("""position:absolute; width:70%; height: 80%"""),format.raw/*16.57*/("""}"""),format.raw/*16.58*/("""
        """),format.raw/*17.9*/(""".grid-container """),format.raw/*17.25*/("""{"""),format.raw/*17.26*/("""
            """),format.raw/*18.13*/("""display: grid;
            grid-column-gap: 10%;
            grid-template-columns: auto auto auto;
            /*background-color: #2196F3;*/
            padding: 10px;
        """),format.raw/*23.9*/("""}"""),format.raw/*23.10*/("""

        """),format.raw/*25.9*/("""/*https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Grid_Layout/Basic_Concepts_of_Grid_Layout#Grid_lines*/
        .map """),format.raw/*26.14*/("""{"""),format.raw/*26.15*/("""
            """),format.raw/*27.13*/("""grid-column-start: 1;
            grid-column-end: 2;
            grid-row-start: 1;
            grid-row-end: 4;
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/("""
        """),format.raw/*32.9*/(""".parameters """),format.raw/*32.21*/("""{"""),format.raw/*32.22*/("""
            """),format.raw/*33.13*/("""grid-column-start: 4;
            grid-column-end: 5;
            grid-row-start: 1;
            grid-row-end: 4;
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/("""

    """),format.raw/*39.5*/("""</style>
    <style type='text/css'>
        #info """),format.raw/*41.15*/("""{"""),format.raw/*41.16*/("""
            """),format.raw/*42.13*/("""display: block;
            position: relative;
            margin: 0px auto;
            width: 50%;
            padding: 10px;
            border: none;
            border-radius: 3px;
            font-size: 12px;
            text-align: center;
            color: #222;
            background: #fff;
        """),format.raw/*53.9*/("""}"""),format.raw/*53.10*/("""
    """),format.raw/*54.5*/("""</style>
    <!--<script src = "node_modules/clientside-require/dist/bundle.js"></script>-->
    <!--<script type="text/javascript" src="DemoData.js"></script>-->
    <!--<link rel="stylesheet" href="https://js.arcgis.com/3.27/dijit/themes/claro/claro.css">-->
    <!--<link rel="stylesheet" href="https://js.arcgis.com/3.27/esri/css/esri.css" />-->
    <!--<script src="https://js.arcgis.com/3.27/"></script>-->
    """),_display_(/*60.6*/styles),format.raw/*60.12*/("""
"""),format.raw/*61.1*/("""</head>
    <body>
    """),_display_(/*63.6*/navigationbar()),format.raw/*63.21*/("""
    """),_display_(/*64.6*/description),format.raw/*64.17*/("""
    """),format.raw/*65.5*/("""<div class="grid-container">
        <div class="map"> <div id='map'><!--<pre id='info'></pre>--></div></div>
        """),_display_(/*67.10*/index),format.raw/*67.15*/("""
    """),format.raw/*68.5*/("""</div>
    <script>
        // var bounds = [
        //     [34.78471565, 31.2546456], // Southwest coordinates
        //     [34.8160659,31.27190740]  // Northeast coordinates
        // ];
        """),_display_(/*74.10*/map),format.raw/*74.13*/("""



    """),format.raw/*78.5*/("""</script>

    <script src=""""),_display_(/*80.19*/routes/*80.25*/.Assets.versioned("javascripts/main.js")),format.raw/*80.65*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*81.19*/routes/*81.25*/.Assets.versioned("outsiders/jquery-3.3.1.slim.min.js")),format.raw/*81.80*/(""""></script>
    <script src=""""),_display_(/*82.19*/routes/*82.25*/.Assets.versioned("outsiders/bootstrap-4.2.1-dist/js/bootstrap.min.js")),format.raw/*82.96*/(""""  integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
</body>
</html>"""))
      }
    }
  }

  def render(title:String,styles:Html,description:Html,map:Html,index:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(styles)(description)(map)(index)

  def f:((String) => (Html) => (Html) => (Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (styles) => (description) => (map) => (index) => apply(title)(styles)(description)(map)(index)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 07 13:03:44 IST 2019
                  SOURCE: C:/Users/shaha/Desktop/p_n/FastLane-master/app/views/Visualizations/resultLayout.scala.html
                  HASH: 2ae0f3241777f3866dcb488add6ae830703463b8
                  MATRIX: 990->1|1156->74|1183->75|1469->334|1484->340|1579->413|1955->761|1984->762|2013->763|2066->788|2095->789|2139->805|2168->806|2197->807|2266->848|2295->849|2331->858|2375->874|2404->875|2445->888|2650->1066|2679->1067|2716->1077|2867->1200|2896->1201|2937->1214|3086->1336|3115->1337|3151->1346|3191->1358|3220->1359|3261->1372|3410->1494|3439->1495|3472->1501|3551->1552|3580->1553|3621->1566|3959->1877|3988->1878|4020->1883|4464->2301|4491->2307|4519->2308|4569->2332|4605->2347|4637->2353|4669->2364|4701->2369|4847->2488|4873->2493|4905->2498|5134->2700|5158->2703|5193->2711|5249->2740|5264->2746|5325->2786|5405->2839|5420->2845|5496->2900|5553->2930|5568->2936|5660->3007
                  LINES: 28->1|33->2|34->3|41->10|41->10|41->10|46->15|46->15|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|48->17|48->17|48->17|49->18|54->23|54->23|56->25|57->26|57->26|58->27|62->31|62->31|63->32|63->32|63->32|64->33|68->37|68->37|70->39|72->41|72->41|73->42|84->53|84->53|85->54|91->60|91->60|92->61|94->63|94->63|95->64|95->64|96->65|98->67|98->67|99->68|105->74|105->74|109->78|111->80|111->80|111->80|112->81|112->81|112->81|113->82|113->82|113->82
                  -- GENERATED --
              */
          