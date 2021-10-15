package note.java8.jooq;

import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Meta;
import org.jooq.Table;
import org.jooq.impl.DSL;

public class HelloJooq {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/testdb";
		String username = "tester";
		String password = "test";
		DSLContext ctx = DSL.using(url, username, password);
		
		Meta meta = ctx.meta();
		List<Table<?>> tables = meta.getTables();
		System.out.println("table count: " + tables.size());
		meta.getTables().forEach(table -> {
			System.out.println("  " + table);
		});
	}
}
