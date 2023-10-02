//package q065;
//
//import java.util.logging.Logger;
//
//import static java.util.logging.Level.WARNING;
//import static java.util.Objects.isNull;
//
//public class Knock065 {
//    private final Activity activity;
//    private final SQLiteDatabase sdb;
//    private final DBOpenHelper helper;
//    private static final Logger logger = Logger.getLogger("Knock065");
//
//    public Knock065(Activity activity) {
//        this.activity = activity;
//    }
//
//    public void insertSpotData(List<Model> models) {
//        if (isNull(models) || models.isEmpty()) return;
//
//        try (
//                helper = new DBOpenHelper(activity.getApplicationContext(), "foo.db", null, Constants.DB_VERSION);
//                sdb = helper.getWritableDatabase()
//        ) {
//            for (Model model : models) {
//                ContentValues values = new ContentValues();
//                synchronized (values) {
//                    values.put("id", model.getID());
//                    values.put("name", model.getName());
//                    values.put("title", model.getTitle());
//                    values.put("Yomigana", model.getYomigana());
//                    try {
//                        if (sdb.insert("map_table", "null", values) == -1) {
//                            throw new Exception("Insert error");
//                        }
//                    } catch (Exception e) {
//                        logger.log(WARNING, e.getMessage(), e);
//                    }
//                }
//            }
//        }
//    }
//}
