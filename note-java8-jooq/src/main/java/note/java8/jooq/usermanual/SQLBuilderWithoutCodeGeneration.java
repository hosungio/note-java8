package note.java8.jooq.usermanual;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.table;

import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Query;
import org.jooq.impl.DSL;

/**
 * https://www.jooq.org/doc/3.14/manual/getting-started/use-cases/jooq-as-a-sql-builder-without-codegeneration/
 * 
 * @author hslee
 *
 */
public class SQLBuilderWithoutCodeGeneration {
	
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/testdb";
		String username = "tester";
		String password = "test";
		DSLContext ctx = DSL.using(url, username, password);
		
		Query query = ctx.select(field("BOOK.TITLE"))
				.from(table("BOOK"));
		String sql = query.getSQL();
		System.out.println("sql: " + sql);
		List<Object> bindValues = query.getBindValues();
		bindValues.forEach(value -> {
			System.out.println(value);
		});
	}
}
