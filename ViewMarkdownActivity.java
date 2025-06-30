public class ViewMarkdownActivity extends AppCompatActivity {
    private LinearLayout markdownContainer;
    private MarkdownParser parser;
    private MarkdownRenderer renderer;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        
        markdownContainer = findViewById(R.id.markdown_container);
        parser = new MarkdownParser();
        renderer = new MarkdownRenderer();
        
        String markdownText = getIntent().getStringExtra("MARKDOWN_TEXT");
        List<MarkdownElement> elements = parser.parse(markdownText);
        renderer.render(this, markdownContainer, elements);
    }
}
