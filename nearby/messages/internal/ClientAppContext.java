package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.ckdu;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ClientAppContext extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ckdu();
    final int a;
    public final String b;
    public final String c;
    public final boolean d;

    @Deprecated
    public final int e;
    public final String f;

    public ClientAppContext(int i, String str, String str2, boolean z, int i2, String str3) {
        this.a = i;
        arwm.s(str);
        this.b = str;
        if (str2 != null && !str2.isEmpty() && !str2.startsWith("0p:")) {
            Log.w("NearbyMessages", String.format(Locale.US, "ClientAppContext: 0P identifier(%s) without 0P prefix(%s)", str2, "0p:"));
            str2 = "0p:".concat(str2);
        }
        this.c = str2;
        this.d = z;
        this.e = i2;
        this.f = str3;
    }

    public static int a(int i, ClientAppContext clientAppContext) {
        return i == 0 ? clientAppContext.e : i;
    }

    static final ClientAppContext b(ClientAppContext clientAppContext, String str, String str2, boolean z) {
        if (clientAppContext != null) {
            return clientAppContext;
        }
        if (str == null && str2 == null) {
            return null;
        }
        return new ClientAppContext(str, str2, z, 0);
    }

    private static boolean c(String str, String str2) {
        return TextUtils.isEmpty(str) ? TextUtils.isEmpty(str2) : str.equals(str2);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientAppContext)) {
            return false;
        }
        ClientAppContext clientAppContext = (ClientAppContext) obj;
        return c(this.b, clientAppContext.b) && c(this.c, clientAppContext.c) && this.d == clientAppContext.d && c(this.f, clientAppContext.f) && this.e == clientAppContext.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Boolean.valueOf(this.d), this.f, Integer.valueOf(this.e)});
    }

    public final String toString() {
        return String.format(Locale.US, "{realClientPackageName: %s, zeroPartyIdentifier: %s, useRealClientApiKey: %b, apiKey: %s, callingContext: %d}", this.b, this.c, Boolean.valueOf(this.d), this.f, Integer.valueOf(this.e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.e(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.v(parcel, 6, this.f, false);
        arxc.c(parcel, a);
    }

    public ClientAppContext(String str) {
        this(str, null);
    }

    public ClientAppContext(String str, String str2) {
        this(str, str2, false, 0);
    }

    public ClientAppContext(String str, String str2, boolean z, int i) {
        this(1, str, str2, z, i, null);
    }
}
