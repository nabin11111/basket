package com.nabin.basket.presentation.admin.history;

import com.nabin.basket.domain.use_cases.firestore.FirestoreUseCases;
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
public final class AdminHistoryViewModel_Factory implements Factory<AdminHistoryViewModel> {
  private final Provider<FirestoreUseCases> firestoreUseCasesProvider;

  public AdminHistoryViewModel_Factory(Provider<FirestoreUseCases> firestoreUseCasesProvider) {
    this.firestoreUseCasesProvider = firestoreUseCasesProvider;
  }

  @Override
  public AdminHistoryViewModel get() {
    return newInstance(firestoreUseCasesProvider.get());
  }

  public static AdminHistoryViewModel_Factory create(
      Provider<FirestoreUseCases> firestoreUseCasesProvider) {
    return new AdminHistoryViewModel_Factory(firestoreUseCasesProvider);
  }

  public static AdminHistoryViewModel newInstance(FirestoreUseCases firestoreUseCases) {
    return new AdminHistoryViewModel(firestoreUseCases);
  }
}
