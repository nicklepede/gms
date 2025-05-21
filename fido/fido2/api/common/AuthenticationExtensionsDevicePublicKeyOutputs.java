package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bbsb;
import defpackage.feay;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AuthenticationExtensionsDevicePublicKeyOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbsb();
    private final feay a;
    private final feay b;

    public AuthenticationExtensionsDevicePublicKeyOutputs(byte[] bArr, byte[] bArr2) {
        feay w = bArr == null ? null : feay.w(bArr);
        feay w2 = bArr2 != null ? feay.w(bArr2) : null;
        this.a = w;
        this.b = w2;
    }

    public final byte[] a() {
        feay feayVar = this.b;
        if (feayVar == null) {
            return null;
        }
        return feayVar.M();
    }

    public final byte[] b() {
        feay feayVar = this.a;
        if (feayVar == null) {
            return null;
        }
        return feayVar.M();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsDevicePublicKeyOutputs)) {
            return false;
        }
        AuthenticationExtensionsDevicePublicKeyOutputs authenticationExtensionsDevicePublicKeyOutputs = (AuthenticationExtensionsDevicePublicKeyOutputs) obj;
        return arwb.b(this.a, authenticationExtensionsDevicePublicKeyOutputs.a) && arwb.b(this.b, authenticationExtensionsDevicePublicKeyOutputs.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, b(), false);
        arxc.i(parcel, 2, a(), false);
        arxc.c(parcel, a);
    }
}
