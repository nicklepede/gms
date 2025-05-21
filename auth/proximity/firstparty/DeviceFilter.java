package com.google.android.gms.auth.proximity.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acma;
import defpackage.arxc;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DeviceFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acma();
    final Boolean a;
    final Boolean b;
    final Boolean c;
    final List d;
    final Boolean e;
    final Boolean f;
    final List g;
    final List h;

    public DeviceFilter(Boolean bool, Boolean bool2, Boolean bool3, List list, Boolean bool4, Boolean bool5, List list2, List list3) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = list;
        this.e = bool4;
        this.f = bool5;
        this.g = list2;
        this.h = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DeviceFilter deviceFilter = (DeviceFilter) obj;
            Boolean bool = this.a;
            if (bool == null ? deviceFilter.a != null : !bool.equals(deviceFilter.a)) {
                return false;
            }
            Boolean bool2 = this.b;
            if (bool2 == null ? deviceFilter.b != null : !bool2.equals(deviceFilter.b)) {
                return false;
            }
            Boolean bool3 = this.c;
            if (bool3 == null ? deviceFilter.c != null : !bool3.equals(deviceFilter.c)) {
                return false;
            }
            Boolean bool4 = this.e;
            if (bool4 == null ? deviceFilter.e != null : !bool4.equals(deviceFilter.e)) {
                return false;
            }
            Boolean bool5 = this.f;
            if (bool5 == null ? deviceFilter.f != null : !bool5.equals(deviceFilter.f)) {
                return false;
            }
            if (!this.d.equals(deviceFilter.d)) {
                return false;
            }
            List list = this.h;
            List list2 = deviceFilter.h;
            if (list.size() == list2.size() && list.containsAll(list2)) {
                List list3 = this.g;
                List list4 = deviceFilter.g;
                if (list3.size() == list4.size() && list3.containsAll(list4)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.z(parcel, 1, this.a);
        arxc.z(parcel, 2, this.b);
        arxc.z(parcel, 3, this.c);
        arxc.x(parcel, 4, this.d, false);
        arxc.z(parcel, 5, this.e);
        arxc.z(parcel, 6, this.f);
        arxc.x(parcel, 7, this.g, false);
        arxc.x(parcel, 8, this.h, false);
        arxc.c(parcel, a);
    }
}
