package com.nabin.basket.presentation.admin.dashboard.map;

import com.nabin.basket.domain.use_cases.firestore.FirestoreUseCases;
import com.nabin.basket.domain.use_cases.realtime.RealtimeUseCases;
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
public final class AdminMapViewModel_Factory implements Factory<AdminMapViewModel> {
  private final Provider<FirestoreUseCases> firestoreUseCasesProvider;

  private final Provider<RealtimeUseCases> realtimeUseCasesProvider;

  public AdminMapViewModel_Factory(Provider<FirestoreUseCases> firestoreUseCasesProvider,
      Provider<RealtimeUseCases> realtimeUseCasesProvider) {
    this.firestoreUseCasesProvider = firestoreUseCasesProvider;
    this.realtimeUseCasesProvider = realtimeUseCasesProvider;
  }

  @Override
  public AdminMapViewModel get() {
    return newInstance(firestoreUseCasesProvider.get(), realtimeUseCasesProvider.get());
  }

  public static AdminMapViewModel_Factory create(
      Provider<FirestoreUseCases> firestoreUseCasesProvider,
      Provider<RealtimeUseCases> realtimeUseCasesProvider) {
    return new AdminMapViewModel_Factory(firestoreUseCasesProvider, realtimeUseCasesProvider);
  }

  public static AdminMapViewModel newInstance(FirestoreUseCases firestoreUseCases,
      RealtimeUseCases realtimeUseCases) {
    return new AdminMapViewModel(firestoreUseCases, realtimeUseCases);
  }
}
