package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.aurd;
import defpackage.bdxb;
import defpackage.fgpr;
import defpackage.fijk;
import defpackage.fijp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class HmacSecretExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bdxb();
    public static final fijp a = new fijk(1);
    public static final fijp b = new fijk(2);
    public static final fijp c = new fijk(3);
    public static final fijp d = new fijk(4);
    public final fgpr e;
    public final fgpr f;
    public final fgpr g;
    public final int h;

    public HmacSecretExtension(fgpr fgprVar, fgpr fgprVar2, fgpr fgprVar3, int i) {
        this.e = fgprVar;
        this.f = fgprVar2;
        this.g = fgprVar3;
        this.h = i;
    }

    public final byte[] a() {
        fgpr fgprVar = this.e;
        if (fgprVar == null) {
            return null;
        }
        return fgprVar.M();
    }

    public final byte[] b() {
        fgpr fgprVar = this.g;
        if (fgprVar == null) {
            return null;
        }
        return fgprVar.M();
    }

    public final byte[] c() {
        fgpr fgprVar = this.f;
        if (fgprVar == null) {
            return null;
        }
        return fgprVar.M();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HmacSecretExtension)) {
            return false;
        }
        HmacSecretExtension hmacSecretExtension = (HmacSecretExtension) obj;
        return atyq.b(this.e, hmacSecretExtension.e) && atyq.b(this.f, hmacSecretExtension.f) && atyq.b(this.g, hmacSecretExtension.g) && this.h == hmacSecretExtension.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.f, this.g, Integer.valueOf(this.h)});
    }

    public final String toString() {
        return "HmacSecretExtension{coseKeyAgreement=" + aurd.c(a()) + ", saltEnc=" + aurd.c(c()) + ", saltAuth=" + aurd.c(b()) + ", getPinUvAuthProtocol=" + this.h + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = atzr.a(parcel);
        atzr.i(parcel, 1, a(), false);
        atzr.i(parcel, 2, c(), false);
        atzr.i(parcel, 3, b(), false);
        atzr.o(parcel, 4, this.h);
        atzr.c(parcel, a2);
    }
}
