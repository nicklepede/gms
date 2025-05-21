package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dkgr;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AppRecommendationsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkgr();
    public final int a;
    public final List b;
    public final WebIconParcelable c;

    public AppRecommendationsResponse(int i, List list, WebIconParcelable webIconParcelable) {
        this.a = i;
        this.b = list;
        this.c = webIconParcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.y(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }
}
