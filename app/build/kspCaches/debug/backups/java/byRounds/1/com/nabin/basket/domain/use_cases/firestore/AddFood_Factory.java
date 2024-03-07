package com.nabin.basket.domain.use_cases.firestore;

import com.nabin.basket.domain.repository.FirestoreRepository;
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
public final class AddFood_Factory implements Factory<AddFood> {
  private final Provider<FirestoreRepository> repositoryProvider;

  public AddFood_Factory(Provider<FirestoreRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public AddFood get() {
    return newInstance(repositoryProvider.get());
  }

  public static AddFood_Factory create(Provider<FirestoreRepository> repositoryProvider) {
    return new AddFood_Factory(repositoryProvider);
  }

  public static AddFood newInstance(FirestoreRepository repository) {
    return new AddFood(repository);
  }
}
