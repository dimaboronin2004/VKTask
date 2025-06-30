public class MarkdownParserTest {
    private MarkdownParser parser;
    
    @Before
    public void setUp() {
        parser = new MarkdownParser();
    }
    
    @Test
    public void testHeader1Parsing() {
        String markdown = "# Заголовок";
        List<MarkdownElement> elements = parser.parse(markdown);
        
        assertEquals(1, elements.size());
        assertTrue(elements.get(0) instanceof HeaderElement);
        assertEquals("Заголовок", ((HeaderElement)elements.get(0)).getText());
        assertEquals(1, ((HeaderElement)elements.get(0)).getLevel());
    }
    
    @Test
    public void testBoldTextParsing() {
        String markdown = "**жирный текст**";
        List<MarkdownElement> elements = parser.parse(markdown);
        
        assertEquals(1, elements.size());
        assertTrue(elements.get(0) instanceof BoldTextElement);
        assertEquals("жирный текст", ((BoldTextElement)elements.get(0)).getText());
    }
    
}
