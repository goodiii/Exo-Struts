/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import com.myapp.struts.connect.ConnectSQL;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


/**
 *
 * @author Thomas
 */
public class Connect extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws SQLException
             {

        ConnectSQL connectSQL = (ConnectSQL) form;
   //     boolean test = connectSQL.OnorOff();
        System.out.print(connectSQL.getCon());
   //     if (connectSQL.OnorOff() == false) {
   //         connectSQL.close();
   //         return mapping.findForward("Connect");

   //     } else {
   //         ConnectSQL.connexion();
            return mapping.findForward("Connect");
        }
    }
//}
