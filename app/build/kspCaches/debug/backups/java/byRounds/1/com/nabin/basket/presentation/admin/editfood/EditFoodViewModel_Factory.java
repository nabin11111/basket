package com.nabin.basket.presentation.admin.editfood;

import com.nabin.basket.domain.use_cases.db.DBUseCases;
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
public final class EditFoodViewModel_Factory implements Factory<EditFoodViewModel> {
  private final Provider<FirestoreUseCases> firestoreUseCasesProvider;

  private final Provider<DBUseCases> dbUseCasesProvider;

  private final Provider<FirestorageUseCases> storageUseCasesProvider;

  public EditFoodViewModel_Factory(Provider<FirestoreUseCases> firestoreUseCasesProvider,
      Provider<DBUseCases> dbUseCasesProvider,
      Provider<FirestorageUseCases> storageUseCasesProvider) {
    this.firestoreUseCasesProvider = firestoreUseCasesProvider;
    this.dbUseCasesProvider = dbUseCasesProvider;
    this.storageUseCasesProvider = storageUseCasesProvider;
  }

  @Override
  public EditFoodViewModel get() {
    return newInstance(firestoreUseCasesProvider.get(), dbUseCasesProvider.get(), storageUseCasesProvider.get());
  }

  public static EditFoodViewModel_Factory create(
      Provider<FirestoreUseCases> firestoreUseCasesProvider,
      Provider<DBUseCases> dbUseCasesProvider,
      Provider<FirestorageUseCases> storageUseCasesProvider) {
    return new EditFoodViewModel_Factory(firestoreUseCasesProvider, dbUseCasesProvider, storageUseCasesProvider);
  }

  public static EditFoodViewModel newInstance(FirestoreUseCases firestoreUseCases,
      DBUseCases dbUseCases, FirestorageUseCases storageUseCases) {
    return new EditFoodViewModel(firestoreUseCases, dbUseCases, storageUseCases);
  }
}
