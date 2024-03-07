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
public final class AddOffer_Factory implements Factory<AddOffer> {
  private final Provider<FirestoreRepository> repositoryProvider;

  public AddOffer_Factory(Provider<FirestoreRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public AddOffer get() {
    return newInstance(repositoryProvider.get());
  }

  public static AddOffer_Factory create(Provider<FirestoreRepository> repositoryProvider) {
    return new AddOffer_Factory(repositoryProvider);
  }

  public static AddOffer newInstance(FirestoreRepository repository) {
    return new AddOffer(repository);
  }
}
