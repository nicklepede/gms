package com.google.android.gms.notifications.registration.operations;

import android.content.Intent;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class NotificationsRegistrationDebugSettingsOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        Intent intent = new Intent("com.google.android.gms.notifications.registration.NOTIFICATIONS_REGISTRATION_DEBUG_ACTIVITY");
        intent.setPackage("com.google.android.gms");
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 2, "Notifications Registration", aqlc.CHIME_NOTIFICATIONS_DEBUG_ITEM, auiq.DEFAULT_NOTIFICATIONS);
        googleSettingsItem.g = true;
        return googleSettingsItem;
    }
}
