package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.feay;
import defpackage.zat;
import defpackage.zau;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class RegisteredCredentialData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zau();
    public final String a;
    public final feay b;
    public final boolean c;

    public RegisteredCredentialData(String str, feay feayVar, boolean z) {
        arwm.t(str, "storage ID shouldn't be null");
        this.a = str;
        this.b = feayVar;
        this.c = z;
    }

    public static zat a() {
        zat zatVar = new zat();
        zatVar.c(false);
        return zatVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisteredCredentialData)) {
            return false;
        }
        RegisteredCredentialData registeredCredentialData = (RegisteredCredentialData) obj;
        return this.c == registeredCredentialData.c && Objects.equals(this.a, registeredCredentialData.a) && Objects.equals(this.b, registeredCredentialData.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.c), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        feay feayVar = this.b;
        arxc.i(parcel, 2, feayVar == null ? null : feayVar.M(), false);
        arxc.e(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
