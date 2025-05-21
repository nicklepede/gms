package com.google.android.gms.nearby.presence.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.PresenceIdentity;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cknq;
import defpackage.feay;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class BroadcastCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cknq();
    public final byte[] a;
    public final PresenceIdentity b;
    public final IdentityToken c;
    public final long d;
    public final long e;
    public Set f = new HashSet();
    public final SecureRandom g = new SecureRandom();

    public BroadcastCredential(byte[] bArr, PresenceIdentity presenceIdentity, IdentityToken identityToken, long j, long j2) {
        this.a = bArr;
        this.b = presenceIdentity;
        this.c = identityToken;
        this.d = j;
        this.e = j2;
    }

    public final byte[] a() {
        return this.c.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BroadcastCredential) {
            BroadcastCredential broadcastCredential = (BroadcastCredential) obj;
            if (Arrays.equals(this.a, broadcastCredential.a) && arwb.b(this.b, broadcastCredential.b) && this.c.equals(broadcastCredential.c) && this.d == broadcastCredential.d && this.e == broadcastCredential.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e)});
    }

    public final String toString() {
        return String.format("BroadcastCredential: keySeed: %s", feay.w(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.q(parcel, 4, this.d);
        arxc.q(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}
