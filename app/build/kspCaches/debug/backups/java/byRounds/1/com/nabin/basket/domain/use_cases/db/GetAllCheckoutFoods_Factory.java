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
public final class GetAllCheckoutFoods_Factory implements Factory<GetAllCheckoutFoods> {
  private final Provider<DBRepository> dbRepositoryProvider;

  public GetAllCheckoutFoods_Factory(Provider<DBRepository> dbRepositoryProvider) {
    this.dbRepositoryProvider = dbRepositoryProvider;
  }

  @Override
  public GetAllCheckoutFoods get() {
    return newInstance(dbRepositoryProvider.get());
  }

  public static GetAllCheckoutFoods_Factory create(Provider<DBRepository> dbRepositoryProvider) {
    return new GetAllCheckoutFoods_Factory(dbRepositoryProvider);
  }

  public static GetAllCheckoutFoods newInstance(DBRepository dbRepository) {
    return new GetAllCheckoutFoods(dbRepository);
  }
}
