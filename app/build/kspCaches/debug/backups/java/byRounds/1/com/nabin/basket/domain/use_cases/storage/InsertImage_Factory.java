package com.nabin.basket.domain.use_cases.storage;

import com.nabin.basket.domain.repository.StorageRepository;
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
public final class InsertImage_Factory implements Factory<InsertImage> {
  private final Provider<StorageRepository> repositoryProvider;

  public InsertImage_Factory(Provider<StorageRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public InsertImage get() {
    return newInstance(repositoryProvider.get());
  }

  public static InsertImage_Factory create(Provider<StorageRepository> repositoryProvider) {
    return new InsertImage_Factory(repositoryProvider);
  }

  public static InsertImage newInstance(StorageRepository repository) {
    return new InsertImage(repository);
  }
}
