package net.daum.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class TestBoardVO {
	
	private int bno;
	private String bname;
	private String btitle;
	private String bcont;
	private int bhit;
	private Date bdate;
	
}
