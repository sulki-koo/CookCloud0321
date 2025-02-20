package cookcloud.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ATTACHMENT")
public class Attachment implements Serializable{

	private static final long serialVersionUID = 165398361059033L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ATTACH_ID")
	private Long attachId;

	@Column(name="ATTACH_UPLOAD_NAME", columnDefinition = "NVARCHAR2(100)")
	private String attachUploadName;

	@Column(name="ATTACH_SERVER_NAME", columnDefinition = "NVARCHAR2(200)")
	private String attachServerName;

	@Column(name="ATTACH_SIZE")
	private Long attachSize;

	@Column(name="ATTACH_ORDER")
	private Long attachOrder;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ATTACH_INSERT_AT")
	private LocalDateTime attachInsertAt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ATTACH_DELETE_AT")
	private LocalDateTime attachDeleteAt;

	@Column(name="ATTACH_IS_DELETED", columnDefinition = "CHAR(1)")
	private String attachIsDeleted;

	@Column(name="ATTACH_TYPE_CODE")
	private Long attachTypeCode;

	@Column(name="RECIPE_ID")
	private Long recipeId;

}
