package br.eti.gadelha.persistence.model.ben10;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import br.eti.gadelha.persistence.model.GenericEntity;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author	Marcelo Ribeiro Gadelha
 * @mail	marcelo.gadelha@marinha.mil.br
 * @link	www.gadelha.eti.br
 **/

@Audited @AuditTable(value = "fabricante_auditoria")
@Entity @Table
@AllArgsConstructor @NoArgsConstructor @Data @EqualsAndHashCode(callSuper = false)
public class Planeta extends GenericEntity {

	@NotNull(message = "{name.not.null}") @NotBlank(message = "{name.not.blank}") @Column(unique = true) /*@UniqueElements(message = "{name.not.unique}")*/
	private String nome;
}