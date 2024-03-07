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
public final class GetOffer_Factory implements Factory<GetOffer> {
  private final Provider<FirestoreRepository> repositoryProvider;

  public GetOffer_Factory(Provider<FirestoreRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetOffer get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetOffer_Factory create(Provider<FirestoreRepository> repositoryProvider) {
    return new GetOffer_Factory(repositoryProvider);
  }

  public static GetOffer newInstance(FirestoreRepository repository) {
    return new GetOffer(repository);
  }
}
