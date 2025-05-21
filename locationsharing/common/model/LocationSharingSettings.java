package com.google.android.gms.locationsharing.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.carr;
import defpackage.cart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocationSharingSettings extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cart();
    public final Boolean a;
    public final List b;
    public final List c;
    public Boolean d;
    public int e;
    public final Boolean f;
    public final Boolean g;

    public LocationSharingSettings(boolean z, List list, boolean z2) {
        this.a = Boolean.valueOf(z);
        this.g = Boolean.valueOf(z2);
        this.c = new ArrayList();
        this.b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LocationShare locationShare = (LocationShare) it.next();
            if (locationShare.a.c()) {
                this.c.add(locationShare);
            } else {
                this.b.add(locationShare);
            }
        }
        Collections.sort(this.c, carr.a);
        Collections.sort(this.b, carr.a);
        this.e = 0;
        this.d = false;
        this.f = false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.a;
        int a = arxc.a(parcel);
        arxc.z(parcel, 1, bool);
        arxc.y(parcel, 2, this.b, false);
        arxc.y(parcel, 3, this.c, false);
        arxc.z(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.z(parcel, 6, this.f);
        arxc.z(parcel, 7, this.g);
        arxc.c(parcel, a);
    }

    public LocationSharingSettings(boolean z, List list, List list2, boolean z2, int i, boolean z3, boolean z4) {
        this.a = Boolean.valueOf(z);
        this.b = list;
        this.c = list2;
        this.e = i;
        this.g = Boolean.valueOf(z4);
        this.d = Boolean.valueOf(z2);
        this.f = Boolean.valueOf(z3);
    }
}
