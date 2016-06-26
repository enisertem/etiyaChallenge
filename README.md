# etiyaChallenge
Jboss WildFly 10 ve Java 1.8 kullanilarak hazirlanmistir.
Java EE 7 kullanilmistir.
onyuzler JSP de implemente edilmistir.

Servlet ve Jsp kullanarak MVC ye yakin bir kodlama yapmaya calistim.
Hibernate ve EJB kullandim.
Servlet 3.1 kullandim Webservlet anatosyonu ile Servletlari dinamik olarak tanimladim.
Database bagimliligi yok Jboss Wildfly icinde varsayilan olarak gelen h2 db ve persistence xml de datasource ayari ; 

   <jta-data-source>java:jboss/datasources/ExampleDS</jta-data-source>  <-- wildfly da varsayilan olarak tanimlidir
   
olarak tanimlanmistir.

Eger degistirilmek istenirse application servera datasource tanimlanmasi yeterli olacaktir.

Wildfly 10 ayari yapildiktn sonra run diyerek herhangi bir ayara gerek olmaksizin proje run edilebilir.

java ee apisi application server tarafindan saglandigi icin asagidaki sekilde tanimlamak yeterli oldu...

   <dependency>
            <groupId>javax</groupId>
            <artifactId>javaee-api</artifactId>
            <version>7.0</version>
            <scope>provided</scope>
   </dependency>
        
       
