# MIB
Min projektet där filerna delas





 String a=AnvändarNamn.getText();
        String b=Lössenord.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mibdb","root","Marmih21.");
            Statement st=con.createStatement();
            String q="Select * from Agent";
            ResultSet rs=st.executeQuery(q);
            while(rs.next())
            {
                String usernamn=rs.getString("Namn");
                String pass=rs.getString("Losenord");
                
                if(a.equals(usernamn) && pass.equals(b))
                {
                    new FortsättningsFönster().setVisible(true);
                }
            }
        }
        
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"error");
        }
