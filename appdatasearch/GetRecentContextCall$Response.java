package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atzr;
import defpackage.vnh;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GetRecentContextCall$Response extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new vnh();
    public Status a;
    public List b;

    @Deprecated
    public String[] c;

    public GetRecentContextCall$Response() {
    }

    @Override // defpackage.atau
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.y(parcel, 2, this.b, false);
        atzr.w(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    public GetRecentContextCall$Response(Status status, List list, String[] strArr) {
        this.a = status;
        this.b = list;
        this.c = strArr;
    }
}
