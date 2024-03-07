package com.nabin.basket.di;

import com.nabin.basket.data.data_source.OrderDeliveryDatabase;
import com.nabin.basket.domain.repository.DBRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideDBRepositoryFactory implements Factory<DBRepository> {
  private final Provider<OrderDeliveryDatabase> dbProvider;

  public AppModule_ProvideDBRepositoryFactory(Provider<OrderDeliveryDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public DBRepository get() {
    return provideDBRepository(dbProvider.get());
  }

  public static AppModule_ProvideDBRepositoryFactory create(
      Provider<OrderDeliveryDatabase> dbProvider) {
    return new AppModule_ProvideDBRepositoryFactory(dbProvider);
  }

  public static DBRepository provideDBRepository(OrderDeliveryDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideDBRepository(db));
  }
}
