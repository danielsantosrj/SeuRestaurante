package br.gov.inpi.system.util;

import javax.swing.JOptionPane;

import br.gov.inpi.system.model.Address;

public class ManterAddress {

	public static void main(String[] args) {

		int opcao = Integer.valueOf(JOptionPane.showInputDialog("Digite a letra da opção desejada - Endereço: \n" +
				"1 - Cadastrar \n"+
				"2 - Consultar \n"+
				"3 - Alterar \n"+
				"4 - Excluir"));
		
		switch (opcao) {
//		case 1: cadastrar();			
//				break;
//		case 2: consultar();			
//				break;
//		case 3: alterar();			
//				break;
//		case 4: deletar();			
//				break;
		}
		
		System.out.println();
		
	}
	
//	public static void cadastrar() {
//		
//		try {
//			String nome = JOptionPane.showInputDialog("Digite o nome do Aluno: ");
//			String telefone = JOptionPane.showInputDialog("Digite o telefone do Aluno: ");
//			String matricula = JOptionPane.showInputDialog("Digite a matrícula do Aluno: ");
//			
//			Address address = new Address();
//			
//			Connection conn = getConnection();
//			PreparedStatement statement = conn.prepareStatement("INSERT INTO tbaluno " +
//					"(nome,telefone,matricula) VALUES ('"+nome+"','"+telefone+"',"+matricula+");");
//			
//			statement.execute();
//			JOptionPane.showMessageDialog(null,"Aluno Cadastrado com Sucesso!");
//			consultar();
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//	}
//	
//	public static void consultar() {
//
//		try {
//			
//			PreparedStatement statement = getConnection().prepareStatement("SELECT * FROM tbaluno");
//			ResultSet rs = statement.executeQuery();
//			
//			String resultado = "";
//			
//			while (rs.next()) {
//				resultado += "Nome: " + rs.getString("nome") +", Telefone: " + rs.getString("telefone") + ", Matrícula: " + rs.getInt("matricula") + "\n";
//				resultado += "----------------------------------------------------------------------------------------------\n";
//			}
//			
//			JOptionPane.showMessageDialog(null, resultado);
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//	}
//	
//	public static void alterar() {
//		
//		try {
//			
//			String nome = JOptionPane.showInputDialog("Digite o nome do Aluno: ");
//			String telefone = JOptionPane.showInputDialog("Digite o telefone do Aluno: ");
//			String matricula = JOptionPane.showInputDialog("Digite a matrícula do Aluno: ");
//			
//			Connection conn = getConnection();
//			PreparedStatement statement = conn.prepareStatement("UPDATE tbaluno SET nome = '"+nome+"', telefone = '"+telefone+"'" +
//					" WHERE matricula = "+matricula);
//			
//			statement.execute();
//			JOptionPane.showMessageDialog(null, "Aluno Alterado com Sucesso!");
//			consultar();
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//	}
//
//	public static void deletar() {
//		
//		try {
//			String matricula = JOptionPane.showInputDialog("Digite a matrícula do Aluno para ser excluído: ");
//			
//			Connection conn = getConnection();
//			PreparedStatement statement = conn.prepareStatement("DELETE FROM tbaluno WHERE matricula = " + matricula);
//			
//			statement.execute();
//			JOptionPane.showMessageDialog(null, "Aluno Excluído com Sucesso!");
//			consultar();
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//	}
//
//	
//	public static Connection getConnection() throws Exception {
//		
//		Class.forName("org.postgresql.Driver");   
//        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","fatec");
//        
//	}

}
