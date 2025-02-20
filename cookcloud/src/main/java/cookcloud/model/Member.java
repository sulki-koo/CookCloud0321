package cookcloud.model;

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

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String mem_id;

	@Column
	private String mem_password;

	@Column
	private String mem_name;

	@Column
	private String mem_nickname;

	@Column
	private String mem_email;

	@Column
	private String mem_phone;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime mem_insert_at;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime mem_delete_at;

	@Column
	private Long mem_report_count;

	@Column
	private Long role_code;

	@Column
	private Long mem_status_code;

}
