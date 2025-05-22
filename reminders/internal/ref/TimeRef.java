package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.Time;
import com.google.android.gms.reminders.model.TimeEntity;
import defpackage.cznx;
import defpackage.czot;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class TimeRef extends cznx implements Time {
    public TimeRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    public static boolean e(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.f(G(str, "hour"), i, i2) && dataHolder.f(G(str, "minute"), i, i2) && dataHolder.f(G(str, "second"), i, i2);
    }

    @Override // com.google.android.gms.reminders.model.Time
    public final Integer a() {
        return n(p("hour"));
    }

    @Override // com.google.android.gms.reminders.model.Time
    public final Integer c() {
        return n(p("minute"));
    }

    @Override // com.google.android.gms.reminders.model.Time
    public final Integer d() {
        return n(p("second"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.atql
    public final boolean equals(Object obj) {
        if (!(obj instanceof Time)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return TimeEntity.e(this, (Time) obj);
    }

    @Override // defpackage.atql
    public final int hashCode() {
        return TimeEntity.b(this);
    }

    @Override // defpackage.atql, defpackage.atqs
    public final /* synthetic */ Object l() {
        return new TimeEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czot.a(new TimeEntity(this), parcel);
    }
}
