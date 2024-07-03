import java.sql.{Connection, DriverManager, ResultSet, Statement}

// Change to Your Database Config
val conn_str = "jdbc:mysql://localhost:3306/ambari?user=root&password="
// Load the driver
classOf[com.mysql.jdbc.Driver]
// Setup the connection
val conn = DriverManager.getConnection(conn_str)
try {
// Configure to be Read Only
val statement = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)
// Execute Query
val rs = statement.executeQuery("select request_id from ambari.stage a limit 30")
// Iterate Over ResultSet
while (rs.next) {
println(rs.getString("request_id"))
}
} catch{
case e:Exception =>e.printStackTrace
}
finally {
conn.close
}