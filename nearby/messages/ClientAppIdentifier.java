package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import defpackage.arxc;
import defpackage.cjyr;
import defpackage.cjzy;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ClientAppIdentifier extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjyr();
    public static final ClientAppIdentifier a = new ClientAppIdentifier(new ClientAppContext("com.google.android.gms", "0p:com.google.android.gms"), "com.google.android.gms");
    public final ClientAppContext b;
    public final String c;
    public int d;

    public ClientAppIdentifier(ClientAppContext clientAppContext, String str, int i) {
        this.b = clientAppContext;
        this.c = str;
        this.d = i;
    }

    private static boolean g(String str, String str2) {
        return TextUtils.isEmpty(str) ? TextUtils.isEmpty(str2) : str.equals(str2);
    }

    public final String a() {
        return e() ? this.b.c : this.b.b;
    }

    public final String b() {
        return e() ? "com.google.android.gms" : this.b.b;
    }

    public final boolean c(int i) {
        return (i & this.d) != 0;
    }

    public final boolean d() {
        return e() ? cjzy.b(this.b.c) : cjzy.b(this.c);
    }

    public final boolean e() {
        return !TextUtils.isEmpty(this.b.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientAppIdentifier)) {
            return false;
        }
        ClientAppContext clientAppContext = this.b;
        String str = clientAppContext.b;
        ClientAppContext clientAppContext2 = ((ClientAppIdentifier) obj).b;
        return g(str, clientAppContext2.b) && g(clientAppContext.c, clientAppContext2.c) && clientAppContext.d == clientAppContext2.d && clientAppContext.e == clientAppContext2.e;
    }

    public final boolean f() {
        String str;
        ClientAppContext clientAppContext = this.b;
        if (clientAppContext == null || (str = clientAppContext.c) == null) {
            return false;
        }
        return str.equals("0p:discoverer");
    }

    public final int hashCode() {
        ClientAppContext clientAppContext = this.b;
        return Arrays.hashCode(new Object[]{clientAppContext.b, clientAppContext.c, Boolean.valueOf(clientAppContext.d), Integer.valueOf(clientAppContext.e)});
    }

    public final String toString() {
        if (!e()) {
            return this.b.b;
        }
        ClientAppContext clientAppContext = this.b;
        return clientAppContext.b + "#" + clientAppContext.c + "#" + clientAppContext.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = arxc.a(parcel);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.o(parcel, 4, this.d);
        arxc.c(parcel, a2);
    }

    public ClientAppIdentifier(ClientAppContext clientAppContext, String str) {
        this(clientAppContext, str, 0);
    }
}
