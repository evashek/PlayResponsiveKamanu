
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object Index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/Main("Play Responsive Kamanu")/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""
   <div class="page-content">
     <div id="pic"></div>
    
    <div id="tagline">
        <h2>We Build Canoes.</h2>
    </div> 
   </div>
""")))})),format.raw/*11.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 08 01:09:20 HST 2013
                    SOURCE: /home/eva/PlayResponsiveKamanu/app/views/Index.scala.html
                    HASH: c8c82e0808f2efd5fc2849206ea8896ed72fe0d0
                    MATRIX: 774->1|885->18|922->21|960->51|999->53|1172->195
                    LINES: 26->1|29->1|31->3|31->3|31->3|39->11
                    -- GENERATED --
                */
            