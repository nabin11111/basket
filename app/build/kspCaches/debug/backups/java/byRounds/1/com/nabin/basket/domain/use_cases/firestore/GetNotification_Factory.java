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
public final class GetNotification_Factory implements Factory<GetNotification> {
  private final Provider<FirestoreRepository> repositoryProvider;

  public GetNotification_Factory(Provider<FirestoreRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetNotification get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetNotification_Factory create(Provider<FirestoreRepository> repositoryProvider) {
    return new GetNotification_Factory(repositoryProvider);
  }

  public static GetNotification newInstance(FirestoreRepository repository) {
    return new GetNotification(repository);
  }
}
