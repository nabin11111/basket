package com.nabin.basket.service;

import com.nabin.basket.data.local.Preference;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class NotificationServiceExtension_MembersInjector implements MembersInjector<NotificationServiceExtension> {
  private final Provider<Preference> preferenceProvider;

  public NotificationServiceExtension_MembersInjector(Provider<Preference> preferenceProvider) {
    this.preferenceProvider = preferenceProvider;
  }

  public static MembersInjector<NotificationServiceExtension> create(
      Provider<Preference> preferenceProvider) {
    return new NotificationServiceExtension_MembersInjector(preferenceProvider);
  }

  @Override
  public void injectMembers(NotificationServiceExtension instance) {
    injectPreference(instance, preferenceProvider.get());
  }

  @InjectedFieldSignature("com.nabin.basket.service.NotificationServiceExtension.preference")
  public static void injectPreference(NotificationServiceExtension instance,
      Preference preference) {
    instance.preference = preference;
  }
}
