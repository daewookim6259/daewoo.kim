package com.elevenst.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.AbstractList;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

import com.elevenst.domain.*;
@SpringBootApplication
@Configuration
@Service
@Component
@RestController
@RequestMapping("/dbManage")
@PropertySource("classpath:/application.yml")
public class dbManageController{
    @Autowired
    private DataSource datasource;
    @GetMapping(path = "test")
    public String connectTest() throws SQLException {

        return datasource.getConnection().toString();
    }
    @GetMapping(path = "create")
    public String createTable() throws SQLException {

        String strReturn = "";

        if (datasource == null)
        {
            return "DataSource is null";
        }

        try(Connection connection = datasource.getConnection()){

            if (connection == null)
            {
                return "connection is null";
            }

            System.out.println(connection.getMetaData().getURL());
            System.out.println(connection.getMetaData().getUserName());

            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE JTFSFCK1_TEMP( DATE_RUN   VARCHAR(24)  " +
                         "                          , TIME_RUN   VARCHAR(18)  " +
                         "                          , ID_SYSTEM  VARCHAR(3)   " +
                         "                          , ID_CU      VARCHAR(6)   " +
                         "                          , ID_PTY     VARCHAR(3)   " +
                         "                          , ID_TERM    VARCHAR(6)   " +
                         "                          , ID_TRAN    VARCHAR(6)   " +
                         "                          , DATA_DCS   VARCHAR(222) " +
                         "                          , IP         VARCHAR(60)  " +
                         "                          , ID_VERSION VARCHAR(15)) ";
            statement.executeUpdate(sql);

            String sql2 = "";

            sql2 = "Insert into JTFSFCK1_TEMP  values ('20220728','102320',null,null,null,null,'06','4519034013685483215001','P10.44.10.67',null)         ";  statement.execute(sql2);
            sql2 = "Insert into JTFSFCK1_TEMP  values ('20220728','102319',null,null,null,null,'01','45190325369200083000CA01R','P10.44.10.37',null)      ";  statement.execute(sql2);
            sql2 = "Insert into JTFSFCK1_TEMP  values ('20220728','102322',null,null,null,null,'10','451801993694201012000002500000','P10.44.10.109',null)";  statement.execute(sql2);
            sql2 = "Insert into JTFSFCK1_TEMP  values ('20220728','102313',null,null,null,null,'07','4519034045200055','P10.44.10.67',null)               ";  statement.execute(sql2);
            sql2 = "Insert into JTFSFCK1_TEMP  values ('20220728','102251',null,null,null,null,'06','4520005109231632902500','P10.44.7.21',null)          ";  statement.execute(sql2);
            sql2 = "Insert into JTFSFCK1_TEMP  values ('20220728','102224',null,null,null,null,'01','45190169369310910200WM02R','P10.44.10.100',null)     ";  statement.execute(sql2);
            sql2 = "Insert into JTFSFCK1_TEMP  values ('20220728','102218',null,null,null,null,'06','4519016913693109902001','P10.44.10.100',null)        ";  statement.execute(sql2);
            sql2 = "Insert into JTFSFCK1_TEMP  values ('20220728','102207',null,null,null,null,'09','451902423686814005500000100000','P10.44.10.53',null) ";  statement.execute(sql2);
            sql2 = "Insert into JTFSFCK1_TEMP  values ('20220728','102009',null,null,null,null,'06','4519023513692415304001','P10.44.10.83',null)         ";  statement.execute(sql2);
            sql2 = "Insert into JTFSFCK1_TEMP  values ('20220728','102002',null,null,null,null,'01','45190060923012590850BM01R','P10.44.10.47',null)      ";  statement.execute(sql2);
            sql2 = "Insert into JTFSFCK1_TEMP  values ('20220728','102029',null,null,null,null,'01','45190235369241540400VM12R','P10.44.10.83',null)      ";  statement.execute(sql2);
            sql2 = "Insert into JTFSFCK1_TEMP  values ('20220728','102000',null,null,null,null,'09','451800969231029621500000100000','P10.44.10.62',null) ";  statement.execute(sql2);
            sql2 = "Insert into JTFSFCK1_TEMP  values ('20220728','102000',null,null,null,null,'23','452100659230867610000000110','P10.44.10.95',null)    ";  statement.execute(sql2);
            sql2 = "Insert into JTFSFCK1_TEMP  values ('20220728','102204',null,null,null,null,'23','451801993695464510000002509','P10.44.10.109',null)   ";  statement.execute(sql2);
            sql2 = "Insert into JTFSFCK1_TEMP  values ('20220728','101944',null,null,null,null,'23','451903353691634117000000110','P10.44.10.140',null)   ";  statement.execute(sql2);
            sql2 = "Insert into JTFSFCK1_TEMP  values ('20220728','101943',null,null,null,null,'02','4519023245200050','P10.44.10.65',null)               ";  statement.execute(sql2);
            sql2 = "Insert into JTFSFCK1_TEMP  values ('20220728','101927',null,null,null,null,'01','45190232368693223800BR01R','P10.44.10.65',null)      ";  statement.execute(sql2);
            sql2 = "Insert into JTFSFCK1_TEMP  values ('20220728','101919',null,null,null,null,'23','452100659231437610500001209','P10.44.10.95',null)    ";  statement.execute(sql2);
            sql2 = "Insert into JTFSFCK1_TEMP  values ('20220728','101918',null,null,null,null,'06','4519023213686932137001','P10.44.10.65',null)         ";  statement.execute(sql2);
            sql2 = "Insert into JTFSFCK1_TEMP  values ('20220728','101907',null,null,null,null,'07','4519023245200050','P10.44.10.65',null)               ";  statement.execute(sql2);

        } catch (Exception e){

            System.out.println(e);

            strReturn = e.toString();
        }

        return "".equals(strReturn) ? "Success!!!!" : strReturn;
    }

    @GetMapping(path = "insert/{data}")
    public String insertData(@PathVariable String data) throws SQLException
    {
        return data;
    }

    @GetMapping(path = "select/{data}")
    public String selectData(@PathVariable String data) throws SQLException
    {
        String strReturn = "";

        try(Connection connection = datasource.getConnection()){

            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM JTFSFCK1_TEMP ";

            ResultSet rs = statement.executeQuery(sql);

            List<DataObjJTFSFCK1> ListDataObj = new ArrayList<DataObjJTFSFCK1>();

            DataObjJTFSFCK1 NewObj = new DataObjJTFSFCK1();

            List<String> QueryResult;

            while (rs.next()) {

                NewObj = new DataObjJTFSFCK1();

                QueryResult = new ArrayList<String>();

                QueryResult.add(rs.getString(1));
                QueryResult.add(rs.getString(2));
                QueryResult.add(rs.getString(3));
                QueryResult.add(rs.getString(4));
                QueryResult.add(rs.getString(5));
                QueryResult.add(rs.getString(6));
                QueryResult.add(rs.getString(7));
                QueryResult.add(rs.getString(8));
                QueryResult.add(rs.getString(9));
                QueryResult.add(rs.getString(10));

                NewObj.setDataObj(QueryResult);

                //strReturn += rs.getString(1) + " " +
                //             rs.getString(2) + " " +
                //             rs.getString(7) + " " +
                //             rs.getString(8) + " " +
                //             rs.getString(9) + System.lineSeparator();

                ListDataObj.add(NewObj);
            }

            strReturn = ListDataObj.toString();

        } catch (Exception e){

            System.out.println(e);

            strReturn = e.toString();
        }
        return strReturn;
    }
}
