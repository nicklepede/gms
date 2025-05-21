package com.google.android.gms.nearby.sharing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmcf;
import defpackage.cmcg;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class WifiCredentialsAttachment extends Attachment {
    public static final Parcelable.Creator CREATOR = new cmcg();
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
    public final cmcf f() {
        cmcf cmcfVar = new cmcf(this.a);
        cmcfVar.a = this.f;
        cmcfVar.d = this.e;
        cmcfVar.c = this.d;
        cmcfVar.b = this.b;
        return cmcfVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WifiCredentialsAttachment) {
            WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) obj;
            if (arwb.b(this.a, wifiCredentialsAttachment.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(wifiCredentialsAttachment.b)) && arwb.b(Long.valueOf(this.f), Long.valueOf(wifiCredentialsAttachment.f)) && arwb.b(this.d, wifiCredentialsAttachment.d) && arwb.b(Boolean.valueOf(this.e), Boolean.valueOf(wifiCredentialsAttachment.e))) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.b);
        arxc.g(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.e(parcel, 5, this.e);
        arxc.q(parcel, 6, this.f);
        arxc.c(parcel, a);
    }
}
