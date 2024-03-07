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
public final class GetFoodOrders_Factory implements Factory<GetFoodOrders> {
  private final Provider<FirestoreRepository> repositoryProvider;

  public GetFoodOrders_Factory(Provider<FirestoreRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetFoodOrders get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetFoodOrders_Factory create(Provider<FirestoreRepository> repositoryProvider) {
    return new GetFoodOrders_Factory(repositoryProvider);
  }

  public static GetFoodOrders newInstance(FirestoreRepository repository) {
    return new GetFoodOrders(repository);
  }
}
