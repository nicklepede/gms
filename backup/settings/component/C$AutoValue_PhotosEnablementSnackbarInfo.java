package com.google.android.gms.backup.settings.component;

import android.app.PendingIntent;
import android.content.Intent;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* renamed from: com.google.android.gms.backup.settings.component.$AutoValue_PhotosEnablementSnackbarInfo, reason: invalid class name */
/* loaded from: classes3.dex */
abstract class C$AutoValue_PhotosEnablementSnackbarInfo extends PhotosEnablementSnackbarInfo {
    public final boolean a;
    public final Intent b;
    public final PendingIntent c;
    public final String d;

    public C$AutoValue_PhotosEnablementSnackbarInfo(boolean z, Intent intent, PendingIntent pendingIntent, String str) {
        this.a = z;
        this.b = intent;
        this.c = pendingIntent;
        this.d = str;
    }

    @Override // com.google.android.gms.backup.settings.component.PhotosEnablementSnackbarInfo
    public final PendingIntent a() {
        return this.c;
    }

    @Override // com.google.android.gms.backup.settings.component.PhotosEnablementSnackbarInfo
    public final Intent b() {
        return this.b;
    }

    @Override // com.google.android.gms.backup.settings.component.PhotosEnablementSnackbarInfo
    public final String c() {
        return this.d;
    }

    @Override // com.google.android.gms.backup.settings.component.PhotosEnablementSnackbarInfo
    public final boolean d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        Intent intent;
        PendingIntent pendingIntent;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PhotosEnablementSnackbarInfo) {
            PhotosEnablementSnackbarInfo photosEnablementSnackbarInfo = (PhotosEnablementSnackbarInfo) obj;
            if (this.a == photosEnablementSnackbarInfo.d() && ((intent = this.b) != null ? intent.equals(photosEnablementSnackbarInfo.b()) : photosEnablementSnackbarInfo.b() == null) && ((pendingIntent = this.c) != null ? pendingIntent.equals(photosEnablementSnackbarInfo.a()) : photosEnablementSnackbarInfo.a() == null) && ((str = this.d) != null ? str.equals(photosEnablementSnackbarInfo.c()) : photosEnablementSnackbarInfo.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.b;
        int hashCode = (intent == null ? 0 : intent.hashCode()) ^ (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003);
        PendingIntent pendingIntent = this.c;
        int hashCode2 = ((hashCode * 1000003) ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        String str = this.d;
        return hashCode2 ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        PendingIntent pendingIntent = this.c;
        return "PhotosEnablementSnackbarInfo{enablementSuccessful=" + this.a + ", alleyOopIntent=" + String.valueOf(this.b) + ", settingsIntent=" + String.valueOf(pendingIntent) + ", accountName=" + this.d + "}";
    }
}
