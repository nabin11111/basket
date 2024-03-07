package com.nabin.basket.domain.use_cases.db;

import com.nabin.basket.domain.repository.DBRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class InsertAllCheckoutFoodList_Factory implements Factory<InsertAllCheckoutFoodList> {
  private final Provider<DBRepository> dbRepositoryProvider;

  public InsertAllCheckoutFoodList_Factory(Provider<DBRepository> dbRepositoryProvider) {
    this.dbRepositoryProvider = dbRepositoryProvider;
  }

  @Override
  public InsertAllCheckoutFoodList get() {
    return newInstance(dbRepositoryProvider.get());
  }

  public static InsertAllCheckoutFoodList_Factory create(
      Provider<DBRepository> dbRepositoryProvider) {
    return new InsertAllCheckoutFoodList_Factory(dbRepositoryProvider);
  }

  public static InsertAllCheckoutFoodList newInstance(DBRepository dbRepository) {
    return new InsertAllCheckoutFoodList(dbRepository);
  }
}
