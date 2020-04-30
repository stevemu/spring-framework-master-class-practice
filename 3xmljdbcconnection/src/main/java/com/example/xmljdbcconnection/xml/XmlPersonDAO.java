package com.example.xmljdbcconnection.xml;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class XmlPersonDAO {
//    @Autowired
    private XmlJdbcConnection xmlJdbcConnection;

    public XmlJdbcConnection getXmlJdbcConnection() {
        return xmlJdbcConnection;
    }

    public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }
}
