package com.nabin.basket.domain.use_cases.realtime;

import com.nabin.basket.domain.repository.RealtimeRepository;
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
public final class Insert_Factory implements Factory<Insert> {
  private final Provider<RealtimeRepository> realtimeRepositoryProvider;

  public Insert_Factory(Provider<RealtimeRepository> realtimeRepositoryProvider) {
    this.realtimeRepositoryProvider = realtimeRepositoryProvider;
  }

  @Override
  public Insert get() {
    return newInstance(realtimeRepositoryProvider.get());
  }

  public static Insert_Factory create(Provider<RealtimeRepository> realtimeRepositoryProvider) {
    return new Insert_Factory(realtimeRepositoryProvider);
  }

  public static Insert newInstance(RealtimeRepository realtimeRepository) {
    return new Insert(realtimeRepository);
  }
}
