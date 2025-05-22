package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dmsk;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AppRecommendationsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dmsk();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.y(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }
}
