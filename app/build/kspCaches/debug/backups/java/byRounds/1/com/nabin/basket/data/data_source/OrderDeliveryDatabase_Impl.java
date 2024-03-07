package com.nabin.basket.data.data_source;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class OrderDeliveryDatabase_Impl extends OrderDeliveryDatabase {
  private volatile AllFoodsDao _allFoodsDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `AllFoods` (`foodId` TEXT NOT NULL, `foodType` TEXT NOT NULL, `foodFamily` TEXT NOT NULL, `foodName` TEXT NOT NULL, `foodDetails` TEXT NOT NULL, `foodPrice` TEXT NOT NULL, `foodDiscount` TEXT NOT NULL, `foodNewPrice` INTEGER NOT NULL, `isSelected` INTEGER NOT NULL, `foodRating` REAL NOT NULL, `newFoodRating` REAL NOT NULL, `quantity` INTEGER NOT NULL, `date` TEXT NOT NULL, `faceImgName` TEXT NOT NULL, `faceImgUrl` TEXT NOT NULL, `faceImgPath` TEXT NOT NULL, `supportImgName2` TEXT NOT NULL, `supportImgUrl2` TEXT NOT NULL, `supportImgPath2` TEXT NOT NULL, `supportImgName3` TEXT NOT NULL, `supportImgUrl3` TEXT NOT NULL, `supportImgPath3` TEXT NOT NULL, `supportImgName4` TEXT NOT NULL, `supportImgUrl4` TEXT NOT NULL, `supportImgPath4` TEXT NOT NULL, PRIMARY KEY(`foodId`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `CheckoutFoods` (`foodId` TEXT NOT NULL, `foodType` TEXT NOT NULL, `foodFamily` TEXT NOT NULL, `foodName` TEXT NOT NULL, `foodDetails` TEXT NOT NULL, `foodPrice` TEXT NOT NULL, `foodDiscount` TEXT NOT NULL, `foodNewPrice` INTEGER NOT NULL, `isSelected` INTEGER NOT NULL, `foodRating` REAL NOT NULL, `newFoodRating` REAL NOT NULL, `quantity` INTEGER NOT NULL, `date` TEXT NOT NULL, `faceImgName` TEXT NOT NULL, `faceImgUrl` TEXT NOT NULL, PRIMARY KEY(`foodId`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `SetOneSignalId` (`id` TEXT NOT NULL, `branch` TEXT NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd2547406a6ec6c5815dc0fcbb95a787d')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `AllFoods`");
        db.execSQL("DROP TABLE IF EXISTS `CheckoutFoods`");
        db.execSQL("DROP TABLE IF EXISTS `SetOneSignalId`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsAllFoods = new HashMap<String, TableInfo.Column>(25);
        _columnsAllFoods.put("foodId", new TableInfo.Column("foodId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("foodType", new TableInfo.Column("foodType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("foodFamily", new TableInfo.Column("foodFamily", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("foodName", new TableInfo.Column("foodName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("foodDetails", new TableInfo.Column("foodDetails", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("foodPrice", new TableInfo.Column("foodPrice", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("foodDiscount", new TableInfo.Column("foodDiscount", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("foodNewPrice", new TableInfo.Column("foodNewPrice", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("isSelected", new TableInfo.Column("isSelected", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("foodRating", new TableInfo.Column("foodRating", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("newFoodRating", new TableInfo.Column("newFoodRating", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("quantity", new TableInfo.Column("quantity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("faceImgName", new TableInfo.Column("faceImgName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("faceImgUrl", new TableInfo.Column("faceImgUrl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("faceImgPath", new TableInfo.Column("faceImgPath", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("supportImgName2", new TableInfo.Column("supportImgName2", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("supportImgUrl2", new TableInfo.Column("supportImgUrl2", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("supportImgPath2", new TableInfo.Column("supportImgPath2", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("supportImgName3", new TableInfo.Column("supportImgName3", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("supportImgUrl3", new TableInfo.Column("supportImgUrl3", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("supportImgPath3", new TableInfo.Column("supportImgPath3", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("supportImgName4", new TableInfo.Column("supportImgName4", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("supportImgUrl4", new TableInfo.Column("supportImgUrl4", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAllFoods.put("supportImgPath4", new TableInfo.Column("supportImgPath4", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAllFoods = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAllFoods = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAllFoods = new TableInfo("AllFoods", _columnsAllFoods, _foreignKeysAllFoods, _indicesAllFoods);
        final TableInfo _existingAllFoods = TableInfo.read(db, "AllFoods");
        if (!_infoAllFoods.equals(_existingAllFoods)) {
          return new RoomOpenHelper.ValidationResult(false, "AllFoods(com.nabin.basket.domain.model.AllFoods).\n"
                  + " Expected:\n" + _infoAllFoods + "\n"
                  + " Found:\n" + _existingAllFoods);
        }
        final HashMap<String, TableInfo.Column> _columnsCheckoutFoods = new HashMap<String, TableInfo.Column>(15);
        _columnsCheckoutFoods.put("foodId", new TableInfo.Column("foodId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCheckoutFoods.put("foodType", new TableInfo.Column("foodType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCheckoutFoods.put("foodFamily", new TableInfo.Column("foodFamily", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCheckoutFoods.put("foodName", new TableInfo.Column("foodName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCheckoutFoods.put("foodDetails", new TableInfo.Column("foodDetails", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCheckoutFoods.put("foodPrice", new TableInfo.Column("foodPrice", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCheckoutFoods.put("foodDiscount", new TableInfo.Column("foodDiscount", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCheckoutFoods.put("foodNewPrice", new TableInfo.Column("foodNewPrice", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCheckoutFoods.put("isSelected", new TableInfo.Column("isSelected", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCheckoutFoods.put("foodRating", new TableInfo.Column("foodRating", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCheckoutFoods.put("newFoodRating", new TableInfo.Column("newFoodRating", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCheckoutFoods.put("quantity", new TableInfo.Column("quantity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCheckoutFoods.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCheckoutFoods.put("faceImgName", new TableInfo.Column("faceImgName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCheckoutFoods.put("faceImgUrl", new TableInfo.Column("faceImgUrl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCheckoutFoods = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCheckoutFoods = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCheckoutFoods = new TableInfo("CheckoutFoods", _columnsCheckoutFoods, _foreignKeysCheckoutFoods, _indicesCheckoutFoods);
        final TableInfo _existingCheckoutFoods = TableInfo.read(db, "CheckoutFoods");
        if (!_infoCheckoutFoods.equals(_existingCheckoutFoods)) {
          return new RoomOpenHelper.ValidationResult(false, "CheckoutFoods(com.nabin.basket.domain.model.CheckoutFoods).\n"
                  + " Expected:\n" + _infoCheckoutFoods + "\n"
                  + " Found:\n" + _existingCheckoutFoods);
        }
        final HashMap<String, TableInfo.Column> _columnsSetOneSignalId = new HashMap<String, TableInfo.Column>(2);
        _columnsSetOneSignalId.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSetOneSignalId.put("branch", new TableInfo.Column("branch", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSetOneSignalId = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSetOneSignalId = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSetOneSignalId = new TableInfo("SetOneSignalId", _columnsSetOneSignalId, _foreignKeysSetOneSignalId, _indicesSetOneSignalId);
        final TableInfo _existingSetOneSignalId = TableInfo.read(db, "SetOneSignalId");
        if (!_infoSetOneSignalId.equals(_existingSetOneSignalId)) {
          return new RoomOpenHelper.ValidationResult(false, "SetOneSignalId(com.nabin.basket.domain.model.SetOneSignalId).\n"
                  + " Expected:\n" + _infoSetOneSignalId + "\n"
                  + " Found:\n" + _existingSetOneSignalId);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "d2547406a6ec6c5815dc0fcbb95a787d", "cb6ccd92b4377cfa2db77358afd12502");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "AllFoods","CheckoutFoods","SetOneSignalId");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `AllFoods`");
      _db.execSQL("DELETE FROM `CheckoutFoods`");
      _db.execSQL("DELETE FROM `SetOneSignalId`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(AllFoodsDao.class, AllFoodsDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public AllFoodsDao getAllFoodsDao() {
    if (_allFoodsDao != null) {
      return _allFoodsDao;
    } else {
      synchronized(this) {
        if(_allFoodsDao == null) {
          _allFoodsDao = new AllFoodsDao_Impl(this);
        }
        return _allFoodsDao;
      }
    }
  }
}
