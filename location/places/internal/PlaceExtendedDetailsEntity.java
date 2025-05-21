package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cagx;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PlaceExtendedDetailsEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cagx();
    public final List a;
    public final String b;
    public final Uri c;
    public final float d;
    public final int e;

    public PlaceExtendedDetailsEntity(List list, String str, Uri uri, float f, int i) {
        this.a = DesugarCollections.unmodifiableList(list);
        this.b = str;
        this.c = uri;
        this.d = f;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.E(parcel, 1, list);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.l(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}
