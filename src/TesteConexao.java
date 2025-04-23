import conexao.Conexao;
import java.sql.Connection;

public class TesteConexao {
    public static void main(String[] args) {
        Connection conn = Conexao.conectar();
        
        if (conn != null) {
            System.out.println("✅ Conexão bem-sucedida com o banco de dados!");
            Conexao.desconectar(conn);
        } else {
            System.out.println("❌ Falha na conexão.");
        }
    }
}
