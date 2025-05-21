package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dhtb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SemanticLocationUpdateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhtb();
    public final String a;
    public final int b;
    public final EstimationOptions c;

    public SemanticLocationUpdateRequest(String str, int i, EstimationOptions estimationOptions) {
        this.a = str;
        this.b = i;
        this.c = estimationOptions;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }
}
