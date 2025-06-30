public class LoadDocumentActivity extends AppCompatActivity {
    private EditText urlInput;
    private Button loadButton;
    private Button filePickerButton;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);
        
        urlInput = findViewById(R.id.url_input);
        loadButton = findViewById(R.id.load_button);
        filePickerButton = findViewById(R.id.file_picker_button);
        
        loadButton.setOnClickListener(v -> {
            String url = urlInput.getText().toString();
            new DownloadTask().execute(url);
        });
        
        filePickerButton.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.setType("*/*");
            startActivityForResult(intent, FILE_PICK_REQUEST);
        });
    }
    
    private class DownloadTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... urls) {
            // Реализация загрузки файла по URL
        }
        
        @Override
        protected void onPostExecute(String result) {
            // Обработка загруженного документа
        }
    }
}
