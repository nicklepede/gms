package com.google.android.gms.mdocstore.types;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cdfm;
import defpackage.eiig;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class CryptoSchemeId extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cdfm();
    public final String a;

    public CryptoSchemeId(String str) {
        eiig.y(str, "id is null");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CryptoSchemeId) {
            return arwb.b(this.a, ((CryptoSchemeId) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("id", this.a, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.c(parcel, a);
    }
}
