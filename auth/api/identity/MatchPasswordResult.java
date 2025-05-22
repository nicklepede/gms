package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abcx;
import defpackage.atzr;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class MatchPasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abcx();
    public final List a;
    public final boolean b;

    public MatchPasswordResult(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.e(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
