package com.nabin.basket.di;

import com.nabin.basket.domain.repository.FirestoreRepository;
import com.nabin.basket.domain.use_cases.firestore.FirestoreUseCases;
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
public final class FirebaseModule_ProvideFirestoreUseCasesFactory implements Factory<FirestoreUseCases> {
  private final Provider<FirestoreRepository> repositoryProvider;

  public FirebaseModule_ProvideFirestoreUseCasesFactory(
      Provider<FirestoreRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public FirestoreUseCases get() {
    return provideFirestoreUseCases(repositoryProvider.get());
  }

  public static FirebaseModule_ProvideFirestoreUseCasesFactory create(
      Provider<FirestoreRepository> repositoryProvider) {
    return new FirebaseModule_ProvideFirestoreUseCasesFactory(repositoryProvider);
  }

  public static FirestoreUseCases provideFirestoreUseCases(FirestoreRepository repository) {
    return Preconditions.checkNotNullFromProvides(FirebaseModule.INSTANCE.provideFirestoreUseCases(repository));
  }
}
