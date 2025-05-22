package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.dkeg;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SemanticLocationEventRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkeg();
    public final String a;
    public final int b;
    public final EstimationOptions c;
    public final int d;

    public SemanticLocationEventRequest(String str, int i, EstimationOptions estimationOptions, int i2) {
        this.a = str;
        this.b = i;
        this.c = estimationOptions;
        this.d = i2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("requestId", this.a, arrayList);
        atyp.b("priority", Integer.valueOf(this.b), arrayList);
        atyp.b("eventTypes", Integer.valueOf(this.d), arrayList);
        atyp.b("options", this.c, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.o(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}
