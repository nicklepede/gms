package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bdvs;
import defpackage.fgpr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AuthenticationExtensionsDevicePublicKeyOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bdvs();
    private final fgpr a;
    private final fgpr b;

    public AuthenticationExtensionsDevicePublicKeyOutputs(byte[] bArr, byte[] bArr2) {
        fgpr w = bArr == null ? null : fgpr.w(bArr);
        fgpr w2 = bArr2 != null ? fgpr.w(bArr2) : null;
        this.a = w;
        this.b = w2;
    }

    public final byte[] a() {
        fgpr fgprVar = this.b;
        if (fgprVar == null) {
            return null;
        }
        return fgprVar.M();
    }

    public final byte[] b() {
        fgpr fgprVar = this.a;
        if (fgprVar == null) {
            return null;
        }
        return fgprVar.M();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsDevicePublicKeyOutputs)) {
            return false;
        }
        AuthenticationExtensionsDevicePublicKeyOutputs authenticationExtensionsDevicePublicKeyOutputs = (AuthenticationExtensionsDevicePublicKeyOutputs) obj;
        return atyq.b(this.a, authenticationExtensionsDevicePublicKeyOutputs.a) && atyq.b(this.b, authenticationExtensionsDevicePublicKeyOutputs.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, b(), false);
        atzr.i(parcel, 2, a(), false);
        atzr.c(parcel, a);
    }
}
