package modelo.umpramuitos;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Date data;

    // LAZY é o valor padrão de fetch quando '...ToMany' -> Lazy
    @OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY)
    private List<ItemPedido> itens;

    public Pedido() {
        this(new Date());
    }
    public Pedido(Date data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }
}
