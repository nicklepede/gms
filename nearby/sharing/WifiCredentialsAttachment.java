package com.google.android.gms.nearby.sharing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cokn;
import defpackage.coko;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class WifiCredentialsAttachment extends Attachment {
    public static final Parcelable.Creator CREATOR = new coko();
    public final String a;
    public final int b;
    public final Bundle c;
    public final String d;
    public final boolean e;
    public final long f;

    public WifiCredentialsAttachment(String str, int i, Bundle bundle, String str2, boolean z, long j) {
        this.a = str;
        this.b = i;
        this.c = bundle;
        this.d = str2;
        this.e = z;
        this.f = j;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final int a() {
        return this.b;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final long b() {
        return this.f;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final long c() {
        return 0L;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final Bundle d() {
        return this.c;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final cokn f() {
        cokn coknVar = new cokn(this.a);
        coknVar.a = this.f;
        coknVar.d = this.e;
        coknVar.c = this.d;
        coknVar.b = this.b;
        return coknVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WifiCredentialsAttachment) {
            WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) obj;
            if (atyq.b(this.a, wifiCredentialsAttachment.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(wifiCredentialsAttachment.b)) && atyq.b(Long.valueOf(this.f), Long.valueOf(wifiCredentialsAttachment.f)) && atyq.b(this.d, wifiCredentialsAttachment.d) && atyq.b(Boolean.valueOf(this.e), Boolean.valueOf(wifiCredentialsAttachment.e))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.nearby.sharing.Attachment
    public final int h() {
        return 4;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Long.valueOf(this.f)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        Long valueOf = Long.valueOf(this.f);
        String str = this.a;
        int i = this.b;
        return String.format(locale, "WifiCredentialsAttachment<id: %s, ssid: %s, security type: %s>", valueOf, str, i != 1 ? i != 2 ? i != 3 ? i != 4 ? String.format(Locale.US, "[%d] UNKNOWN_SECURITY_TYPE", Integer.valueOf(i)) : "SAE" : "WEP" : "WPA_PSK" : "OPEN");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.b);
        atzr.g(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.e(parcel, 5, this.e);
        atzr.q(parcel, 6, this.f);
        atzr.c(parcel, a);
    }
}
