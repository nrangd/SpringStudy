package com.kd.springrest.dto;

import java.util.Date;

import lombok.Data;

@Data
public class BoardDTO {
	Integer board_id;
    String board_title;
    String board_writer;
    String board_writer_ip_addr;
    String board_password;
    String board_content;
    Date board_write_date;
    Integer board_view_count;
    Integer board_pos_count;
    Integer board_neg_count;
}
