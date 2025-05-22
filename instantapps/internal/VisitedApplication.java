package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bqob;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class VisitedApplication extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bqob();
    final BitmapTeleporter a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ContentRating f;
    private final ArrayList g;

    public VisitedApplication(BitmapTeleporter bitmapTeleporter, String str, String str2, String str3, String str4, Collection collection, ContentRating contentRating) {
        this.a = bitmapTeleporter;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        ArrayList arrayList = new ArrayList(collection == null ? 0 : collection.size());
        this.g = arrayList;
        if (collection != null) {
            arrayList.addAll(collection);
        }
        this.f = contentRating;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, this.a, i, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.v(parcel, 5, this.d, false);
        atzr.v(parcel, 6, this.e, false);
        atzr.x(parcel, 7, DesugarCollections.unmodifiableList(this.g), false);
        atzr.t(parcel, 8, this.f, i, false);
        atzr.c(parcel, a);
    }
}
