package com.google.android.gms.nearby.presence.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.PresenceIdentity;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cknt;
import defpackage.feay;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class DiscoveryCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cknt();
    public final byte[] a;
    public final PresenceIdentity b;
    public final IdentityTokenTag c;
    public final EncryptedIdentityMetadata d;
    public final long e;
    public final long f;

    public DiscoveryCredential(byte[] bArr, PresenceIdentity presenceIdentity, IdentityTokenTag identityTokenTag, EncryptedIdentityMetadata encryptedIdentityMetadata, long j, long j2) {
        this.a = bArr;
        this.b = presenceIdentity;
        this.c = identityTokenTag;
        this.d = encryptedIdentityMetadata;
        this.e = j;
        this.f = j2;
    }

    public final byte[] a(int i) {
        return i == 1 ? this.d.a : this.d.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DiscoveryCredential) {
            DiscoveryCredential discoveryCredential = (DiscoveryCredential) obj;
            if (Arrays.equals(this.a, discoveryCredential.a) && arwb.b(this.b, discoveryCredential.b) && this.c.equals(discoveryCredential.c) && this.d.equals(discoveryCredential.d) && this.e == discoveryCredential.e && this.f == discoveryCredential.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c, this.d, Long.valueOf(this.e), Long.valueOf(this.f)});
    }

    public final String toString() {
        return String.format("DiscoveryCredential: keySeed: %s", feay.w(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.q(parcel, 5, this.e);
        arxc.q(parcel, 6, this.f);
        arxc.c(parcel, a);
    }
}
