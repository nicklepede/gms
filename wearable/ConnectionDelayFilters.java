package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.djju;
import defpackage.eiib;
import defpackage.eiic;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class ConnectionDelayFilters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new djju();
    public final List a;

    public ConnectionDelayFilters(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ConnectionDelayFilters) {
            return Objects.equals(this.a, ((ConnectionDelayFilters) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        eiib b = eiic.b(this);
        b.b("dataItemFilters", this.a);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.c(parcel, a);
    }
}
