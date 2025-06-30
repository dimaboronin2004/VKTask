public class MarkdownRenderer {
    public void render(Context context, LinearLayout container, List<MarkdownElement> elements) {
        for (MarkdownElement element : elements) {
            if (element instanceof HeaderElement) {
                TextView header = new TextView(context);
                header.setText(((HeaderElement)element).getText());
                header.setTextSize(TypedValue.COMPLEX_UNIT_SP, 
                    24 - ((HeaderElement)element).getLevel() * 2);
                container.addView(header);
            }
            // Аналогично для других типов элементов
        }
    }
}
