package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.asnj;
import defpackage.bbtk;
import defpackage.feay;
import defpackage.ffum;
import defpackage.ffur;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class HmacSecretExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbtk();
    public static final ffur a = new ffum(1);
    public static final ffur b = new ffum(2);
    public static final ffur c = new ffum(3);
    public static final ffur d = new ffum(4);
    public final feay e;
    public final feay f;
    public final feay g;
    public final int h;

    public HmacSecretExtension(feay feayVar, feay feayVar2, feay feayVar3, int i) {
        this.e = feayVar;
        this.f = feayVar2;
        this.g = feayVar3;
        this.h = i;
    }

    public final byte[] a() {
        feay feayVar = this.e;
        if (feayVar == null) {
            return null;
        }
        return feayVar.M();
    }

    public final byte[] b() {
        feay feayVar = this.g;
        if (feayVar == null) {
            return null;
        }
        return feayVar.M();
    }

    public final byte[] c() {
        feay feayVar = this.f;
        if (feayVar == null) {
            return null;
        }
        return feayVar.M();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HmacSecretExtension)) {
            return false;
        }
        HmacSecretExtension hmacSecretExtension = (HmacSecretExtension) obj;
        return arwb.b(this.e, hmacSecretExtension.e) && arwb.b(this.f, hmacSecretExtension.f) && arwb.b(this.g, hmacSecretExtension.g) && this.h == hmacSecretExtension.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.f, this.g, Integer.valueOf(this.h)});
    }

    public final String toString() {
        return "HmacSecretExtension{coseKeyAgreement=" + asnj.c(a()) + ", saltEnc=" + asnj.c(c()) + ", saltAuth=" + asnj.c(b()) + ", getPinUvAuthProtocol=" + this.h + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = arxc.a(parcel);
        arxc.i(parcel, 1, a(), false);
        arxc.i(parcel, 2, c(), false);
        arxc.i(parcel, 3, b(), false);
        arxc.o(parcel, 4, this.h);
        arxc.c(parcel, a2);
    }
}
