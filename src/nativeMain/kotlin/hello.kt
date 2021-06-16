import libnotify.notify_init
import libnotify.notify_notification_show
import libnotify.notify_uninit

fun main() {
  notify_init("Kotlin/Native")
  val notification = libnotify.notify_notification_new(
    summary = "Teste",
    body = "Hello Kotlin/Native!",
    icon = "dialog-information"
  )
  notify_notification_show(notification, error = null)
  notify_uninit()
}

