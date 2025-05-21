package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dacn;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class LocationHistorySegmentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dacn();
    public final List a;
    public final FieldMask b;
    public final boolean c;

    public LocationHistorySegmentRequest(List list, FieldMask fieldMask, boolean z) {
        this.a = list;
        this.b = fieldMask;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.e(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
