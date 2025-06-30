public class MarkdownParser {
    public List<MarkdownElement> parse(String markdownText) {
        List<MarkdownElement> elements = new ArrayList<>();
        String[] lines = markdownText.split("\n");
        
        for (String line : lines) {
            if (line.startsWith("# ")) {
                elements.add(new HeaderElement(line.substring(2).trim(), 1));
            } 
            // Аналогично для других уровней заголовков
            else if (line.startsWith("**") && line.endsWith("**")) {
                elements.add(new BoldTextElement(line.substring(2, line.length()-2)));
            }
            // Обработка других элементов Markdown
        }
        
        return elements;
    }
}
