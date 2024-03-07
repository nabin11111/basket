package com.nabin.basket.presentation.admin.food.addfood;

import com.nabin.basket.domain.use_cases.firestore.FirestoreUseCases;
import com.nabin.basket.domain.use_cases.storage.FirestorageUseCases;
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
public final class AddFoodViewModel_Factory implements Factory<AddFoodViewModel> {
  private final Provider<FirestoreUseCases> firestoreUseCasesProvider;

  private final Provider<FirestorageUseCases> storageUseCasesProvider;

  public AddFoodViewModel_Factory(Provider<FirestoreUseCases> firestoreUseCasesProvider,
      Provider<FirestorageUseCases> storageUseCasesProvider) {
    this.firestoreUseCasesProvider = firestoreUseCasesProvider;
    this.storageUseCasesProvider = storageUseCasesProvider;
  }

  @Override
  public AddFoodViewModel get() {
    return newInstance(firestoreUseCasesProvider.get(), storageUseCasesProvider.get());
  }

  public static AddFoodViewModel_Factory create(
      Provider<FirestoreUseCases> firestoreUseCasesProvider,
      Provider<FirestorageUseCases> storageUseCasesProvider) {
    return new AddFoodViewModel_Factory(firestoreUseCasesProvider, storageUseCasesProvider);
  }

  public static AddFoodViewModel newInstance(FirestoreUseCases firestoreUseCases,
      FirestorageUseCases storageUseCases) {
    return new AddFoodViewModel(firestoreUseCases, storageUseCases);
  }
}
