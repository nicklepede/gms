package com.google.android.gms.locationsharing.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cdah;
import defpackage.cdaj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocationSharingSettings extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cdaj();
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
        List list2 = this.c;
        cdah cdahVar = cdah.a;
        Collections.sort(list2, cdahVar);
        Collections.sort(this.b, cdahVar);
        this.e = 0;
        this.d = false;
        this.f = false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.a;
        int a = atzr.a(parcel);
        atzr.z(parcel, 1, bool);
        atzr.y(parcel, 2, this.b, false);
        atzr.y(parcel, 3, this.c, false);
        atzr.z(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.z(parcel, 6, this.f);
        atzr.z(parcel, 7, this.g);
        atzr.c(parcel, a);
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
