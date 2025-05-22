package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.dbqx;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SemanticLocationEventRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbqx();
    public final float a;
    public final int b;
    public final int c;
    public final float d;
    public final long e;

    public SemanticLocationEventRequest(float f, int i, int i2, float f2, long j) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = f2;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        return obj instanceof SemanticLocationEventRequest;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return atyp.a(new ArrayList(), this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int a = atzr.a(parcel);
        atzr.l(parcel, 1, f);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.l(parcel, 4, this.d);
        atzr.q(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}
