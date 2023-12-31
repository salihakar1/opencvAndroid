package com.salih.cvtest;

/**
 * Created by Salih AKAR 14:33 10.07.2023
 */
public class Test {
}

//class MatchingDemo {
//    public void run(String inFile, String templateFile, String outFile, int match_method) {
//        System.out.println("\nRunning Template Matching");
//
//        Mat img = Highgui.imread(inFile);
//        Mat templ = Highgui.imread(templateFile);
//
//        // / Create the result matrix
//        int result_cols = img.cols() - templ.cols() + 1;
//        int result_rows = img.rows() - templ.rows() + 1;
//        Mat result = new Mat(result_rows, result_cols, CvType.CV_32FC1);
//
//        // / Do the Matching and Normalize
//        Imgproc.matchTemplate(img, templ, result, match_method);
//        Core.normalize(result, result, 0, 1, Core.NORM_MINMAX, -1, new Mat());
//
//        // / Localizing the best match with minMaxLoc
//        MinMaxLocResult mmr = Core.minMaxLoc(result);
//
//        Point matchLoc;
//        if (match_method == Imgproc.TM_SQDIFF || match_method == Imgproc.TM_SQDIFF_NORMED) {
//            matchLoc = mmr.minLoc;
//        } else {
//            matchLoc = mmr.maxLoc;
//        }
//
//        // / Show me what you got
//        Core.rectangle(img, matchLoc, new Point(matchLoc.x + templ.cols(),
//                matchLoc.y + templ.rows()), new Scalar(0, 255, 0));
//
//        // Save the visualized detection.
//        System.out.println("Writing "+ outFile);
//        Highgui.imwrite(outFile, img);
//
//    }
//}
//
//public class TemplateMatching {
//    public static void main(String[] args) {
//        System.loadLibrary("opencv_java246");
//        new MatchingDemo().run(args[0], args[1], args[2], Imgproc.TM_CCOEFF);
//    }
//}

/**
 *
 */


//    private Mat mRgba;
//    private Mat mGray;
//    private File mCascadeFile;
//    private CascadeClassifier mJavaDetectorBanana;
//    boolean check = false;
//
//    private int mDetectorType = JAVA_DETECTOR;
//    private String[] mDetectorName;
//
//    private float mRelativeBananaSize = 0.2f;
//    private int mAbsoluteBananaSize = 0;
//
//    private CameraBridgeViewBase mOpenCvCameraView;
//
//    public Button mSpeechButton;
//    public TextView checkResults;
//
//    double xCenter = -1;
//    double yCenter = -1;
//
//    private BaseLoaderCallback mLoaderCallback = new BaseLoaderCallback(this) {
//        @Override
//        public void onManagerConnected(int status) {
//            switch (status) {
//                case LoaderCallbackInterface.SUCCESS: {
//                    Log.i(TAG, "OpenCV Loaded Successfully");
//
//                    try {
//                        InputStream is = getResources().openRawResource(R.raw.banana4th);
//                        File cascadeDir = getDir("cascade", Context.MODE_PRIVATE);
//                        mCascadeFile = new File(cascadeDir, "banana4th.xml");
//                        FileOutputStream os = new FileOutputStream(mCascadeFile);
//
//                        byte[] buffer = new byte[4096];
//                        int bytesRead;
//                        while ((bytesRead = is.read(buffer)) != -1) {
//                            os.write(buffer, 0, bytesRead);
//                        }
//                        is.close();
//                        os.close();
//
//                        mJavaDetectorBanana = new CascadeClassifier(mCascadeFile.getAbsolutePath());
//                        if (mJavaDetectorBanana.empty()) {
//                            Log.e(TAG, "Failed to load cascade classifier");
//                            mJavaDetectorBanana = null;
//                        } else
//                            Log.i(TAG, "Loaded cascade classifier from " + mCascadeFile.getAbsolutePath());
//
//                        cascadeDir.delete();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                        Log.e(TAG, "Failed to load cascade. Exception thrown: " + e);
//                    }
//                    mOpenCvCameraView.enableFpsMeter();
//                    mOpenCvCameraView.setCameraIndex(0);
//                    mOpenCvCameraView.enableView();
//                }
//                break;
//                default: {
//                    super.onManagerConnected(status);
//                }
//                break;
//            }
//        }
//    };
//
//    public MainActivity() {
//        mDetectorName = new String[2];
//        mDetectorName[JAVA_DETECTOR] = "Java";
//        Log.i(TAG, "Instantiated new" + this.getClass());
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        Log.i(TAG, "Called onCreate");
//        super.onCreate(savedInstanceState);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
//
//        setContentView(R.layout.activity_main);
//
//        mOpenCvCameraView = (CameraBridgeViewBase) findViewById(R.id.fd_activity_surface_view);
//        mOpenCvCameraView.setCvCameraViewListener(this);
//        mSpeechButton = (Button) findViewById(R.id.ttsBtn);
//        checkResults = (TextView) findViewById(R.id.checkResultTB);
//
//        Button backButton = (Button) findViewById(R.id.backBtn);
//
//        backButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent UIActivity = new Intent(MainActivity.this, UiActivity.class);
//                startActivity(UIActivity);
//            }
//        });
//    }
//
//    @Override
//    public void onPause() {
//        super.onPause();
//        if (mOpenCvCameraView != null)
//            mOpenCvCameraView.disableView();
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        if (!OpenCVLoader.initDebug()) {
//            Log.d(TAG, "Internal OpenCV library not found. Using OpenCV Manager for initialization");
//            OpenCVLoader.initAsync(OpenCVLoader.OPENCV_VERSION_3_3_0, this, mLoaderCallback);
//        } else {
//            Log.d(TAG, "OpenCV library found inside package. Using it!");
//            mLoaderCallback.onManagerConnected(LoaderCallbackInterface.SUCCESS);
//        }
//    }
//
//    public void onDestroy() {
//        super.onDestroy();
//        mOpenCvCameraView.disableView();
//    }
//
//    public void onCameraViewStarted(int width, int height) {
//        mGray = new Mat();
//        mRgba = new Mat();
//    }
//
//    public void onCameraViewStopped() {
//        mGray.release();
//        mRgba.release();
//    }

//    public Mat onCameraFrame(CvCameraViewFrame inputFrame) {
//
//        mRgba = inputFrame.rgba();
//        mGray = inputFrame.gray();
//
//        if (mAbsoluteBananaSize == 0) {
//            int height = mGray.rows();
//            if (Math.round(height * mRelativeBananaSize) > 0) {
//                mAbsoluteBananaSize = Math.round(height * mRelativeBananaSize);
//            }
//        }
//
//        MatOfRect bananas = new MatOfRect();
//
//        if (mDetectorType == JAVA_DETECTOR) {
//            if (mJavaDetectorBanana != null) {
//                mJavaDetectorBanana.detectMultiScale(mGray, bananas, 1.1, 2, 2, //TODO: objdetect.CV_HAAR_SCALE_IMAGE)
//                        new Size(mAbsoluteBananaSize, mAbsoluteBananaSize), new Size());
//            }
//        } else {
//            Log.e(TAG, "Detection method is not selected!");
//        }
//
//        Rect[] bananasArray = bananas.toArray();
//        for (int i = 0; i < bananasArray.length; i++) {
//            Imgproc.rectangle(mRgba, bananasArray[i].tl(), bananasArray[i].br(), BANANA_RECT_COLOR, 3);
//            xCenter = (bananasArray[i].x + bananasArray[i].width + bananasArray[i].x) / 2;
//            yCenter = (bananasArray[i].y + bananasArray[i].height + bananasArray[i].y) / 2;
//        }
//        return mRgba;
//    }


/**
 * 2
 */

//    private static final String TAG = "OCVSample::Activity";
//    private int w, h;
//    private CameraBridgeViewBase mOpenCvCameraView;
//
//
//    static {
//        if (!OpenCVLoader.initDebug())
//            Log.d("ERROR", "Unable to load OpenCV");
//        else
//            Log.d("SUCCESS", "OpenCV loaded");
//    }
//
//    private BaseLoaderCallback mLoaderCallback = new BaseLoaderCallback(this) {
//        @Override
//        public void onManagerConnected(int status) {
//            switch (status) {
//                case LoaderCallbackInterface.SUCCESS: {
//                    Log.i(TAG, "OpenCV loaded successfully");
//                    mOpenCvCameraView.enableView();
//                    try {
//                        initializeOpenCVDependencies();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//                break;
//                default: {
//                    super.onManagerConnected(status);
//                }
//                break;
//            }
//        }
//    };
//
//    private void initializeOpenCVDependencies() throws IOException {
//        mOpenCvCameraView.enableView();
//        detector = FeatureDetector.create(FeatureDetector.ORB);
//        descriptor = DescriptorExtractor.create(DescriptorExtractor.ORB);
//        matcher = DescriptorMatcher.create(DescriptorMatcher.BRUTEFORCE_HAMMING);
//        img1 = new Mat();
//        AssetManager assetManager = getAssets();
//        InputStream istr = assetManager.open("a.jpeg");
//        Bitmap bitmap = BitmapFactory.decodeStream(istr);
//        Utils.bitmapToMat(bitmap, img1);
//        Imgproc.cvtColor(img1, img1, Imgproc.COLOR_RGB2GRAY);
//        img1.convertTo(img1, 0); //converting the image to match with the type of the cameras image
//        descriptors1 = new Mat();
//        keypoints1 = new MatOfKeyPoint();
//        detector.detect(img1, keypoints1);
//        descriptor.compute(img1, keypoints1, descriptors1);
//
//    }
//
//
//    public MainActivity() {
//
//        Log.i(TAG, "Instantiated new " + this.getClass());
//    }
//
//    /**
//     * Called when the activity is first created.
//     */
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//
//        Log.i(TAG, "called onCreate");
//        super.onCreate(savedInstanceState);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
//        setContentView(R.layout.layout);
//        mOpenCvCameraView = (CameraBridgeViewBase) findViewById(R.id.tutorial1_activity_java_surface_view);
//        mOpenCvCameraView.setVisibility(SurfaceView.VISIBLE);
//        mOpenCvCameraView.setCvCameraViewListener(this);
//        tvName = (TextView) findViewById(R.id.text1);
//
//    }
//
//    @Override
//    public void onPause() {
//        super.onPause();
//        if (mOpenCvCameraView != null)
//            mOpenCvCameraView.disableView();
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        if (!OpenCVLoader.initDebug()) {
//            Log.d(TAG, "Internal OpenCV library not found. Using OpenCV Manager for initialization");
//            OpenCVLoader.initAsync(OpenCVLoader.OPENCV_VERSION_3_0_0, this, mLoaderCallback);
//        } else {
//            Log.d(TAG, "OpenCV library found inside package. Using it!");
//            mLoaderCallback.onManagerConnected(LoaderCallbackInterface.SUCCESS);
//        }
//    }
//
//    public void onDestroy() {
//        super.onDestroy();
//        if (mOpenCvCameraView != null)
//            mOpenCvCameraView.disableView();
//    }
//
//    public void onCameraViewStarted(int width, int height) {
//        w = width;
//        h = height;
//    }
//
//    public void onCameraViewStopped() {
//    }
//
//
//    TextView tvName;
//    Scalar RED = new Scalar(255, 0, 0);
//    Scalar GREEN = new Scalar(0, 255, 0);
//    FeatureDetector detector;
//    DescriptorExtractor descriptor;
//    DescriptorMatcher matcher;
//    Mat descriptors2, descriptors1;
//    Mat img1;
//    MatOfKeyPoint keypoints1, keypoints2;
//
//
//    //            descriptors1 = new Mat();
////        keypoints1 = new MatOfKeyPoint();
////        detector.detect(img1, keypoints1);
////        descriptor.compute(img1, keypoints1, descriptors1);
//    public Mat recognize(Mat aInputFrame) {
//
//        Imgproc.cvtColor(aInputFrame, aInputFrame, Imgproc.COLOR_RGB2GRAY);
//        descriptors2 = new Mat();
//        keypoints2 = new MatOfKeyPoint();
//        detector.detect(aInputFrame, keypoints2);
//        descriptor.compute(aInputFrame, keypoints2, descriptors2);
//
//        // Matching
//        MatOfDMatch matches = new MatOfDMatch();
//        if (img1.type() == aInputFrame.type()) {
//            matcher.match(descriptors1, descriptors2, matches);
//        } else {
//            return aInputFrame;
//        }
//        List<DMatch> matchesList = matches.toList();
//
//        Double max_dist = 0.0;
//        Double min_dist = 100.0;
//
//        for (int i = 0; i < matchesList.size(); i++) {
//            Double dist = (double) matchesList.get(i).distance;
//            if (dist < min_dist)
//                min_dist = dist;
//            if (dist > max_dist)
//                max_dist = dist;
//        }
//
//        LinkedList<DMatch> good_matches = new LinkedList<DMatch>();
//        for (int i = 0; i < matchesList.size(); i++) {
//            if (matchesList.get(i).distance <= (1.5 * min_dist))
//                good_matches.addLast(matchesList.get(i));
//        }
//
//        MatOfDMatch goodMatches = new MatOfDMatch();
//        goodMatches.fromList(good_matches);
//        Mat outputImg = new Mat();
//        MatOfByte drawnMatches = new MatOfByte();
//        if (aInputFrame.empty() || aInputFrame.cols() < 1 || aInputFrame.rows() < 1) {
//            return aInputFrame;
//        }
//        Features2d.drawMatches(img1, keypoints1, aInputFrame, keypoints2, goodMatches, outputImg, GREEN, RED, drawnMatches, Features2d.NOT_DRAW_SINGLE_POINTS);
//        Imgproc.resize(outputImg, outputImg, aInputFrame.size());
//
//        return outputImg;
//    }
//
//    public Mat onCameraFrame(CvCameraViewFrame inputFrame) {
//        return recognize(inputFrame.rgba());
//
//    }
//}
//}
