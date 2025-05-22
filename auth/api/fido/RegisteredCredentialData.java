package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abak;
import defpackage.abal;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.fgpr;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class RegisteredCredentialData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abal();
    public final String a;
    public final fgpr b;
    public final boolean c;

    public RegisteredCredentialData(String str, fgpr fgprVar, boolean z) {
        atzb.t(str, "storage ID shouldn't be null");
        this.a = str;
        this.b = fgprVar;
        this.c = z;
    }

    public static abak a() {
        abak abakVar = new abak();
        abakVar.c(false);
        return abakVar;
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        fgpr fgprVar = this.b;
        atzr.i(parcel, 2, fgprVar == null ? null : fgprVar.M(), false);
        atzr.e(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
