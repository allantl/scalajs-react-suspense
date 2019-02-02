import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import org.scalajs.dom

object App {

  def main(args: Array[String]): Unit = {

    def body = {
      val main = AsyncCallback
        .pure(<.div(^.color := "#070", "Async load complete."))
        .delayMs(2000)

      React.Suspense(
        fallback = <.div(^.color.red, "Loading..."),
        asyncBody = main
      )
    }

    val Main =
      ScalaComponent
        .builder[Unit]("Main")
        .stateless
        .render_(<.div(^.fontSize := "175%", body))
        .build

    val container = dom.document.getElementById("root")
    Main().renderIntoDOM(container)
  }
}
