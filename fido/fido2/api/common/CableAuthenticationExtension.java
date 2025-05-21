package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bbsv;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class CableAuthenticationExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbsv();
    public final List a;

    public CableAuthenticationExtension(List list) {
        arwm.s(list);
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CableAuthenticationExtension)) {
            return false;
        }
        List list = this.a;
        List list2 = ((CableAuthenticationExtension) obj).a;
        return list.containsAll(list2) && list2.containsAll(list);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.c(parcel, a);
    }
}
