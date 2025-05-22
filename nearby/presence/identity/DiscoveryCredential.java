package com.google.android.gms.nearby.presence.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.PresenceIdentity;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cmvy;
import defpackage.fgpr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class DiscoveryCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmvy();
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
            if (Arrays.equals(this.a, discoveryCredential.a) && atyq.b(this.b, discoveryCredential.b) && this.c.equals(discoveryCredential.c) && this.d.equals(discoveryCredential.d) && this.e == discoveryCredential.e && this.f == discoveryCredential.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c, this.d, Long.valueOf(this.e), Long.valueOf(this.f)});
    }

    public final String toString() {
        return String.format("DiscoveryCredential: keySeed: %s", fgpr.w(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.q(parcel, 5, this.e);
        atzr.q(parcel, 6, this.f);
        atzr.c(parcel, a);
    }
}
