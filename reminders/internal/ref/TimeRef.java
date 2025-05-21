package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.Time;
import com.google.android.gms.reminders.model.TimeEntity;
import defpackage.cxeb;
import defpackage.cxex;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class TimeRef extends cxeb implements Time {
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

    @Override // defpackage.arnw
    public final boolean equals(Object obj) {
        if (!(obj instanceof Time)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return TimeEntity.e(this, (Time) obj);
    }

    @Override // defpackage.arnw
    public final int hashCode() {
        return TimeEntity.b(this);
    }

    @Override // defpackage.arnw, defpackage.arod
    public final /* synthetic */ Object l() {
        return new TimeEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxex.a(new TimeEntity(this), parcel);
    }
}
