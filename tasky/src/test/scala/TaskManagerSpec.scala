import org.scalatest._

class TaskManagerSpec extends FlatSpec with Matchers {

  "An empty tasks list" should "have 0 tasks due today" in {
      val tasksDueToday = TaskManager.allTasksDueToday(List())
      tasksDueToday should have length 0
  }

}