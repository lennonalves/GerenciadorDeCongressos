/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServidorDeChat;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lennonalves
 */
public class Clientes {
    
    public static Clientes instancia;
    
    protected Clientes(){}
    
    public static Clientes getInstancia() {
        if (instancia == null)
            instancia = new Clientes();
        return instancia;
    }
    
    private String clienteatual, hostId, hostName, hostAddress, hostPort;
    
    private ArrayList<String> clientesName = new ArrayList<String> ();
    private ArrayList<String> clientesAddress = new ArrayList<String> ();
    private ArrayList<String> clientesPort = new ArrayList<String> ();
    
    public DefaultTableModel dtm = new DefaultTableModel();

    public String getClienteatual() {
        return clienteatual;
    }

    public void setClienteatual(String clienteatual) {
        this.clienteatual = clienteatual;
    }

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostAddress() {
        return hostAddress;
    }

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    public String getHostPort() {
        return hostPort;
    }

    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }

    public ArrayList<String> getClientesName() {
        return clientesName;
    }

    public void setClientesName(ArrayList<String> clientesName) {
        this.clientesName = clientesName;
    }

    public ArrayList<String> getClientesAddress() {
        return clientesAddress;
    }

    public void setClientesAddress(ArrayList<String> clientesAddress) {
        this.clientesAddress = clientesAddress;
    }

    public ArrayList<String> getClientesPort() {
        return clientesPort;
    }

    public void setClientesPort(ArrayList<String> clientesPort) {
        this.clientesPort = clientesPort;
    }

    public DefaultTableModel getDtm() {
        return dtm;
    }

    public void setDtm(DefaultTableModel dtm) {
        this.dtm = dtm;
    }
    
}
