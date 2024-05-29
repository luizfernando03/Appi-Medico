package med.voll.api.medico;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import med.voll.api.endereco.Endereco;
import org.springframework.data.annotation.Id;

@Table(name = "medicos")
@Entity(name = "Medico")
public class Medico {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private  String nome;
    private  String email;
    private  String crm;
    private Esspecialidade esspecialidade;

    private Endereco enderco;

}
