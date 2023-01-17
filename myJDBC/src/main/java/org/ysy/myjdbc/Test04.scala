import java.sql.{DriverManager, Statement}
import com.mysql.jdbc.Driver

val IP = "192.168.10.102"
val Port = "3306"
val DBType = "mysql"
//val DBName = "audit"
val username = "root"
val password = ""
//val url = "jdbc:" + DBType + "://" + IP + ":" + Port + "/" + DBName

val url = "jdbc:" + DBType + "://" + IP + ":" + Port + "/"

classOf[com.mysql.jdbc.Driver]

val conn = DriverManager.getConnection(url, username, password)
val stmt: Statement = conn.createStatement()

val sql = """select r_name from ods2.region a"""

try {
  val bool = stmt.execute(sql)
  println(bool)
} catch {
  case e: Exception => e.printStackTrace()
} finally {
  if (stmt != null) stmt.close()
  if (conn != null) conn.close()
}