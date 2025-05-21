package com.google.android.gms.kids;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.boss;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class EnsureSupervisionSetupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new boss();
    public int a;

    private EnsureSupervisionSetupResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EnsureSupervisionSetupResponse) {
            return arwb.b(Integer.valueOf(this.a), Integer.valueOf(((EnsureSupervisionSetupResponse) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.c(parcel, a);
    }

    public EnsureSupervisionSetupResponse(int i) {
        this.a = i;
    }
}
