package com.google.android.gms.notifications.registration.operations;

import android.content.Intent;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class NotificationsRegistrationDebugSettingsOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        Intent intent = new Intent("com.google.android.gms.notifications.registration.NOTIFICATIONS_REGISTRATION_DEBUG_ACTIVITY");
        intent.setPackage("com.google.android.gms");
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 2, "Notifications Registration", aojj.CHIME_NOTIFICATIONS_DEBUG_ITEM, asew.DEFAULT_NOTIFICATIONS);
        googleSettingsItem.g = true;
        return googleSettingsItem;
    }
}
