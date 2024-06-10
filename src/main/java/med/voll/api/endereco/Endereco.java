package med.voll.api.endereco;


import ch.qos.logback.core.model.processor.TimestampModelHandler;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.awt.font.TextHitInfo;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairrro;
    private String cep;
    private String numero;
    private String complemento;
    private String cicade;
    private String uf;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairrro = dados.bairro();
        this.uf = dados.uf();
        this.cicade = dados.cidade();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }
}
