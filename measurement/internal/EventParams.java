package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cfrl;
import defpackage.cfrm;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class EventParams extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator CREATOR = new cfrm();
    public final Bundle a;

    public EventParams(Bundle bundle) {
        this.a = bundle;
    }

    public final Bundle a() {
        return new Bundle(this.a);
    }

    public final Long b(String str) {
        return Long.valueOf(this.a.getLong(str));
    }

    public final Object c(String str) {
        return this.a.get(str);
    }

    public final String d(String str) {
        return this.a.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new cfrl(this);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.g(parcel, 2, a(), false);
        atzr.c(parcel, a);
    }
}
