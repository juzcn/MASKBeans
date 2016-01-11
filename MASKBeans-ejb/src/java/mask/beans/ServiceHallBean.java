/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mask.beans;

import mask.examples.serviceHall.ServiceH;
import mask.examples.serviceHall.ServiceHallBeanRemote;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Singleton;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author zj
 */
@ApplicationScoped
@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
@TransactionManagement(TransactionManagementType.BEAN)
public class ServiceHallBean extends ServiceH implements ServiceHallBeanRemote {

}
