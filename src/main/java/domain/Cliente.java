package domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author JONATAN
 */
@Entity
@NamedQueries({
    @NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c"),
    @NamedQuery(name="Cliente.findByIdCliente", query="SELECT c FROM Cliente c WHERE c.idCliente=:idCliente"),
    @NamedQuery(name="Cliente.findByNombre", query="SELECT c FROM Cliente c WHERE c.nombre=:nombre"),
    @NamedQuery(name="Cliente.findByApellido", query="SELECT c FROM Cliente c WHERE c.apellido=:apellido"),
    @NamedQuery(name="Cliente.findByEmail", query="SELECT c FROM Cliente c WHERE c.email=:email"),
    @NamedQuery(name="Cliente.findByTelefono", query="SELECT c FROM Cliente c WHERE c.telefono=:telefono"),
    @NamedQuery(name="Cliente.findBySaldo", query="SELECT c FROM Cliente c WHERE c.saldo=:saldo")})


@Table(name="cliente")
public class Cliente implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_cliente")
    private int idCliente;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private double saldo;
    
    public Cliente(){
        
    }
    
    public Cliente(int idCliente){
        this.idCliente=idCliente;
    }
    public Cliente(String nombre,String apellido,String email,String telefono,double saldo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.telefono=telefono;
        this.saldo=saldo;
    }
    public Cliente(int idCliente, String nombre, String apellido, String email, String telefono, double saldo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + ", saldo=" + saldo + '}';
    }
    
    
    
    
}
