package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="hnl_perf_item_dim")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class  Item_Dim {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer wm_item_number;
	@NonNull
	@Column(length=12)
	private Integer wm_upc_nbr;
	@NonNull
	private Integer acct_dept_nbr;
	@NonNull
	private String omni_catgr_desc;
	@NonNull
	private String omni_dept_nbr;
	@NonNull
	private String op_compn_cd;
	@NonNull
	private String delta_flag;
	

}
