public class TableElement implements MarkdownElement {
    private List<List<String>> rows;
    
    public TableElement(String markdownTable) {
        // Парсинг Markdown таблицы
    }
    
    public View createView(Context context) {
        TableLayout table = new TableLayout(context);
        
        for (List<String> row : rows) {
            TableRow tableRow = new TableRow(context);
            
            for (String cell : row) {
                TextView cellView = new TextView(context);
                cellView.setText(cell);
                tableRow.addView(cellView);
            }
            
            table.addView(tableRow);
        }
        
        return table;
    }
}
