package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.ccpo;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PlaceExtendedDetailsEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccpo();
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
        int a = atzr.a(parcel);
        atzr.E(parcel, 1, list);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.l(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}
