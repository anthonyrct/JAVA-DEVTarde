package Model;

public class Vendas {

    //Atributos
    private String dataVenda;
    private String cliente;
    private String quantVendi;
    private String codProd;
    private String valorCompra;
    
    //Cosntrutor
    public Vendas(String dataVenda, String cliente, String quantVendi, String codProd, String valorCompra) {
        this.dataVenda = dataVenda;
        this.cliente = cliente;
        this.quantVendi = quantVendi;
        this.codProd = codProd;
        this.valorCompra = valorCompra;
    }

    //Criação Getters and Setters

    public String getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public String getQuantVendi() {
        return quantVendi;
    }
    public void setQuantVendi(String quantVendi) {
        this.quantVendi = quantVendi;
    }
    public String getCodProd() {
        return codProd;
    }
    public void setCodProd(String codProd) {
        this.codProd = codProd;
    }
    public String getValorCompra() {
        return valorCompra;
    }
    public void setValorCompra(String valorCompra) {
        this.valorCompra = valorCompra;
    }
    
}
