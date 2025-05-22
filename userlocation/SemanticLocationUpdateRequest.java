package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkej;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SemanticLocationUpdateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkej();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }
}
