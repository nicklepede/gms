package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.zdc;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class MatchPasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zdc();
    public final List a;
    public final boolean b;

    public MatchPasswordResult(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.e(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
