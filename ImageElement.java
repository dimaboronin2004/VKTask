public class ImageElement implements MarkdownElement {
    private String imageUrl;
    
    public ImageElement(String markdownImage) {
        // Извлечение URL из ![alt](url)
    }
    
    public View createView(Context context) {
        ImageView imageView = new ImageView(context);
        new DownloadImageTask(imageView).execute(imageUrl);
        return imageView;
    }
    
    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView imageView;
        
        public DownloadImageTask(ImageView imageView) {
            this.imageView = imageView;
        }
        
        protected Bitmap doInBackground(String... urls) {
            // Загрузка изображения по URL
        }
        
        protected void onPostExecute(Bitmap result) {
            imageView.setImageBitmap(result);
        }
    }
}
