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
@Table(name = "MEMBER")
public class Member implements Serializable{

	private static final long serialVersionUID = 958674608281975L;

	@Id
	@Column(name="MEM_ID", columnDefinition = "VARCHAR2(20)")
	private String memId;

	@Column(name="MEM_PASSWORD",columnDefinition = "VARCHAR2(30)")
	private String memPassword;

	@Column(name="MEM_NAME", columnDefinition = "NVARCHAR2(50)")
	private String memName;

	@Column(name="MEM_NICKNAME", columnDefinition = "NVARCHAR2(10)")
	private String memNickname;

	@Column(name="MEM_EMAIL", columnDefinition = "VARCHAR2(50)")
	private String memEmail;

	@Column(name="MEM_PHONE", columnDefinition = "VARCHAR2(20)")
	private String memPhone;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MEM_INSERT_AT")
	private LocalDateTime memInsertAt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MEM_DELETE_AT")
	private LocalDateTime memDeleteAt;

	@Column(name="MEM_REPORT_COUNT")
	private Long memReportCount;

	@Column(name="ROLE_CODE")
	private Long roleCode;
	
	@Column(name="MEM_STATUS_CODE")
	private Long memStatusCode;

}