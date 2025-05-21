package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.dhsy;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SemanticLocationEventRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhsy();
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
        arwa.b("requestId", this.a, arrayList);
        arwa.b("priority", Integer.valueOf(this.b), arrayList);
        arwa.b("eventTypes", Integer.valueOf(this.d), arrayList);
        arwa.b("options", this.c, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.o(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
