import java.util.ArrayList;
import java.util.List;

public class TypeTable extends Table {
    private List<Table> tables;

    private Table[] vipTables;

    private Table[] regularTables;

    public TypeTable(String tableNumber, String typeTable) {
        super(tableNumber, typeTable);
    }

    // กำหนดโต๊ะของแต่ละประเภทเมื่อสร้างอ็อบเจ็กต์
    public void Typetable() {
        this.tables = new ArrayList<>();
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public Table[] getVipTables() {
        return vipTables;
    }

    public void setVipTables(Table[] vipTables) {
        this.vipTables = vipTables;
    }

    public Table[] getRegularTables() {
        return regularTables;
    }

    public void setRegularTables(Table[] regularTables) {
        this.regularTables = regularTables;
    }

    // เมธอดเพื่อเพิ่มโต๊ะลงในประเภท
    public void addTable(Table table) {
        tables.add(table);
    }

    // เมธอดเพื่อแสดงข้อมูลการจองทั้งหมดในโต๊ะทุกโต๊ะของประเภท
    public void displayTablesBookings() {
        for (Table table : tables) {
            table.displayBookings();
        }
    }
}

