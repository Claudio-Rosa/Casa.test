

import java.sql.Connection;
import java.sql.driverManager;
import java.sql.SQLException;

public class Conexao {
String serverName = "db-caique-mysql";
String mydatabase = "integracaoprojectdb";
String url = "mysql/mysql-server:latest\r\n" + "container_name: db-caique-mysql" + "db-caique-mysql" + "/" + "integracaoprojectdb";
String username = "usernut";
String password = "passnut";
Conexao conexao;

Conexao () throws SQLException{
	conexao = DriveManager.getConnection(url, username, password);
}

}