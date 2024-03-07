package com.nabin.basket.di;

import com.nabin.basket.domain.repository.DBRepository;
import com.nabin.basket.domain.use_cases.db.DBUseCases;
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
public final class AppModule_ProvdeOrderDeliveryUseCasesFactory implements Factory<DBUseCases> {
  private final Provider<DBRepository> repositoryProvider;

  public AppModule_ProvdeOrderDeliveryUseCasesFactory(Provider<DBRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public DBUseCases get() {
    return provdeOrderDeliveryUseCases(repositoryProvider.get());
  }

  public static AppModule_ProvdeOrderDeliveryUseCasesFactory create(
      Provider<DBRepository> repositoryProvider) {
    return new AppModule_ProvdeOrderDeliveryUseCasesFactory(repositoryProvider);
  }

  public static DBUseCases provdeOrderDeliveryUseCases(DBRepository repository) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provdeOrderDeliveryUseCases(repository));
  }
}
