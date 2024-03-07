package com.nabin.basket.data.local;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class Preference_Factory implements Factory<Preference> {
  private final Provider<Context> contextProvider;

  public Preference_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public Preference get() {
    return newInstance(contextProvider.get());
  }

  public static Preference_Factory create(Provider<Context> contextProvider) {
    return new Preference_Factory(contextProvider);
  }

  public static Preference newInstance(Context context) {
    return new Preference(context);
  }
}
