package com.kjh.exam.exam2.repository;

import com.kjh.exam.exam2.container.ContainerComponent;
import com.kjh.exam.exam2.dto.Board;
import com.kjh.mysqliutil.MysqlUtil;
import com.kjh.mysqliutil.SecSql;

public class BoardRepository implements ContainerComponent {
	public void init() {

	}

	public Board getBoardById(int id) {
		SecSql sql = new SecSql();
		sql.append("SELECT B.*");
		sql.append("FROM board AS B");
		sql.append("WHERE B.id = ?", id);

		return MysqlUtil.selectRow(sql, Board.class);
	}

}
