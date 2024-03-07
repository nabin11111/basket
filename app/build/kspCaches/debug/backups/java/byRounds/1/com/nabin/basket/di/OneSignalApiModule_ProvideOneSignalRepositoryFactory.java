package com.nabin.basket.di;

import com.nabin.basket.data.repositoryImpl.OneSignalRepositoryImpl;
import com.nabin.basket.domain.repository.OneSignalRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class OneSignalApiModule_ProvideOneSignalRepositoryFactory implements Factory<OneSignalRepositoryImpl> {
  private final Provider<OneSignalRepository> repositoryProvider;

  public OneSignalApiModule_ProvideOneSignalRepositoryFactory(
      Provider<OneSignalRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public OneSignalRepositoryImpl get() {
    return provideOneSignalRepository(repositoryProvider.get());
  }

  public static OneSignalApiModule_ProvideOneSignalRepositoryFactory create(
      Provider<OneSignalRepository> repositoryProvider) {
    return new OneSignalApiModule_ProvideOneSignalRepositoryFactory(repositoryProvider);
  }

  public static OneSignalRepositoryImpl provideOneSignalRepository(OneSignalRepository repository) {
    return Preconditions.checkNotNullFromProvides(OneSignalApiModule.INSTANCE.provideOneSignalRepository(repository));
  }
}
