public class EditMarkdownActivity extends AppCompatActivity {
    private EditText markdownEditText;
    private Button saveButton;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        
        markdownEditText = findViewById(R.id.markdown_edit);
        saveButton = findViewById(R.id.save_button);
        
        String initialText = getIntent().getStringExtra("MARKDOWN_TEXT");
        markdownEditText.setText(initialText);
        
        saveButton.setOnClickListener(v -> {
            String editedText = markdownEditText.getText().toString();
            Intent resultIntent = new Intent();
            resultIntent.putExtra("EDITED_TEXT", editedText);
            setResult(RESULT_OK, resultIntent);
            finish();
        });
    }
}
