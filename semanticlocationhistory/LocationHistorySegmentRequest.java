package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dcmv;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class LocationHistorySegmentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dcmv();
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
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.e(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
