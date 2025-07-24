public class MainActivity extends AppCompatActivity {
    private GLSurfaceView glSurfaceView;
    private RubiksCubeRenderer renderer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        glSurfaceView = findViewById(R.id.glSurfaceView);
        glSurfaceView.setEGLContextClientVersion(2); // Use OpenGL ES 2.0
        renderer = new RubiksCubeRenderer();
        glSurfaceView.setRenderer(renderer);
        // Detect swipe gestures to rotate the cube
        glSurfaceView.setOnTouchListener((v, event) -> {
            // TODO: Process touch/swipe to trigger cube rotations (U, D, L, R, F, B)
            return true;
        });
    }
}
