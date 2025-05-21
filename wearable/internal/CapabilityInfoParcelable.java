package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.djjm;
import defpackage.dkhf;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CapabilityInfoParcelable extends AbstractSafeParcelable implements djjm {
    public static final Parcelable.Creator CREATOR = new dkhf();
    public final String a;
    public final List b;
    private final Object c = new Object();
    private Set d = null;

    public CapabilityInfoParcelable(String str, List list) {
        this.a = str;
        this.b = list;
        arwm.s(str);
        arwm.s(list);
    }

    @Override // defpackage.djjm
    public final String a() {
        return this.a;
    }

    @Override // defpackage.djjm
    public final Set b() {
        Set set;
        synchronized (this.c) {
            if (this.d == null) {
                this.d = new HashSet(this.b);
            }
            set = this.d;
        }
        return set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CapabilityInfoParcelable capabilityInfoParcelable = (CapabilityInfoParcelable) obj;
        String str = this.a;
        if (str == null ? capabilityInfoParcelable.a != null : !str.equals(capabilityInfoParcelable.a)) {
            return false;
        }
        List list = this.b;
        return list == null ? capabilityInfoParcelable.b == null : list.equals(capabilityInfoParcelable.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        List list = this.b;
        return ((hashCode + 31) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "CapabilityInfo{" + this.a + ", " + String.valueOf(this.b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.y(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }
}
